package edu.ucalgary.ensf409;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.management.ConstructorParameters;

import java.sql.*;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author Syed Kazmi , MD Shaheriar.
 * @version 1.4
 */

public class Inventory {
    //Variables
    private int famCalorie=0;
    private int famGrain=0;
    private int famProtein=0;
    private int famFruitsAndVeggies=0;
    private int famOther=0;

    private Connection myConnection;
    private int size_of_table;
    private ArrayList<Food> x;
    private Hamper best;


    //helper method.
    /**
     * 
     * @param username
     * @param password
     */
    
    private void makeConnection(String username, String password) {
        try {
            myConnection = DriverManager.getConnection("jdbc:mysql://localhost/food_inventory", username, password);
            System.out.println("Connection Successfull");
        } catch (SQLException e) {
            System.out.println("Connection fail");
            e.printStackTrace();
        }
      

  }
  /**
   * 
   * @return ArrayList<Food>
   * @throws SQLException
   * @throws InvalidInventoryException
   */
  //This meethod creates an Arraylist of Food objects from the available_food table in SQL.
  public ArrayList<Food> MakeList() throws SQLException ,InvalidInventoryException {
      makeConnection("student","ensf");

    Statement line = myConnection.createStatement();
    boolean rs1 = line.execute("use food_inventory");
    String Query = "Select * FROM available_food";
    String Query2 = "SELECT floor(count(ItemID)) as c FROM available_food";

    // choose the grastest total content of food Catogory.
    Statement myStmt = myConnection.createStatement();
    
    ResultSet rs = myStmt.executeQuery(Query);
    Statement myStmt1 = myConnection.createStatement();
    
    ResultSet Count = myStmt1.executeQuery(Query2);
int G;
    while (Count.next()){

       Long g = Count.getLong("c");
G = Math.toIntExact(g);
         setSize_of_table(G);
        }
x = new ArrayList<Food>();
while(rs.next()){
    Food F = new Food(rs.getInt("ItemID"),rs.getString("Name"),rs.getInt("GrainContent"),rs.getInt("FVContent"), rs.getInt("ProContent"), rs.getInt("Other"), rs.getInt("Calories"));

x.add(F);
   F = null;


}
if (!x.isEmpty()){
    return x;

}
else{
    throw new InvalidInventoryException();
}

}

/**
 * 
 * @return int 
 */

//getter method
public int getSize_of_table() {
    return this.size_of_table;
}
/**
 * 
 * @param size_of_table
 */
//setter method
public void setSize_of_table(int  size_of_table) {
    this.size_of_table = size_of_table;
}


//constructor
/**
 * 
 * @param Grain
 * @param FruitsAndVeggies
 * @param Protein
 * @param Other
 * @param Calorie
 */
    public Inventory( int Grain ,int FruitsAndVeggies, int Protein ,  int Other, int Calorie){
        famCalorie=Calorie;
        famGrain=Grain;
        famProtein=Protein;
        famFruitsAndVeggies=FruitsAndVeggies;
        famOther=Other;


    }



    // Change Food to Food.

    /**
     * 
     * @param originalSet
     * @return ArrayList<ArrayList<Food>>
     */
    // This method creats all the possible food combinations from the inventory.
    public ArrayList<ArrayList<Food>> powerSet(ArrayList<Food> originalSet) {
        ArrayList<ArrayList<Food>> sets = new ArrayList<ArrayList<Food>>();
        if (originalSet.isEmpty()) {
            sets.add(new ArrayList<Food>());
            return sets;
        }
        List<Food> list = new ArrayList<Food>(originalSet);
        Food head = list.get(0);
        ArrayList<Food> rest = new ArrayList<Food>(list.subList(1, list.size())); 
        for (ArrayList<Food> set : powerSet(rest)) {
            ArrayList<Food> newSet = new ArrayList<Food>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
        }       
        return sets;
    }

    

    /**
     * 
     * @param items
     * @return ArrayList<Hamper>
     * @throws HamperException
     */
    // This method creats a hamper object for combinations that can satisfy the needs of the clients.
    public ArrayList<Hamper> possibleHampers(ArrayList<Food> items) throws HamperException  {

        ArrayList<Food> z = items;

    

        int cal=0;
        int grain=0;
        int protein=0;
        int FV=0;
        int other=0;
        Food itemID;
        int sumOfDifferences=0;

        ArrayList<ArrayList<Food>> combinations=powerSet(z); //input will come from Shaheriers Arraylist of Foods.


       
        ArrayList<Hamper> possibleHamper = new ArrayList<Hamper>();

        for(ArrayList<Food> x : combinations) {
            ArrayList<Food> ID = new ArrayList<Food>();
            for(int i=0 ; i<x.size() ; i++){
                cal+=x.get(i).getCalories();           // all these methods are from Food object.
                grain+=x.get(i).getGrain();
                protein+=x.get(i).getProtien();
                FV+=x.get(i).getFruit();
                other+=x.get(i).getOther();

                itemID=x.get(i);     // keeping track of the items in hamper.
                ID.add(itemID);
                
            }

            if(cal>=famCalorie && grain>=famGrain && protein>=famProtein && FV>=famFruitsAndVeggies && other>=famOther){
                cal=cal-famCalorie;
                grain=grain-famGrain;
                protein=protein-famProtein;
                FV=FV-famFruitsAndVeggies;
                other=other-famOther;
                sumOfDifferences=grain+protein+FV+other;

                Hamper H= new Hamper(ID,sumOfDifferences);     //creates a hamper object for possible hampers.
                possibleHamper.add(H);                          //puts the created hamper in the Hamper ArrayList to get the best hamper later.

                
            }
            cal=0;
            grain=0;
            protein=0;
            FV=0;
            other=0;
            itemID= null;
            sumOfDifferences=0;

          

        


        }
        if (!possibleHamper.isEmpty()){
            return possibleHamper;

         }
        else{
             throw new HamperException();
        }
        
    }


    /**
     * 
     * @param hampers
     */
    // This method selects the best hamper with the least surplus.
    public void bestHamper(ArrayList<Hamper> hampers){

        
        this.best=hampers.get(0);
        int smallest = best.getSumOfDifferences();
        
    

        for(Hamper h : hampers){

            if(h.getSumOfDifferences()<smallest){
                this.best=h;
                smallest=h.getSumOfDifferences();                
            }
            else{
                continue;
            }

        }
        

    }
    /**
     * 
     * @return Hamper
     */
    // getter method.
    public Hamper getBestHamper(){
return this.best;



    }

    /**
     * 
     * @return ArrayList<Food>
     */
    //getter method.
    public ArrayList<Food> getList(){

        return this.x;
    }




// public static void main(String[] args) throws InvalidInventoryException, HamperException {
//     Inventory object = new Inventory(1257,2871,1189,3539,8856);
//     object.makeConnection("root", "Khansaad@2");
//     try {
//        ArrayList<Food> lists=object.MakeList();
//        ArrayList<Hamper> c=object.possibleHampers(lists);
//        object.bestHamper(c);
//        Hamper H = object.getBestHamper();
//         ArrayList<Food> f= H.getFood();
//         for(Food x: f){
//             System.out.println(x.getNAME() +  " "+ x.getID());
            
//         }

//     } catch (SQLException e) {
//         System.out.println("failed to ");
//         e.printStackTrace();
//     }

// }


/**
 * 
 * @param H
 * @throws SQLException
 */
// This method deletes the items from the SQL once it is used in a hamper.
public void delete(Hamper H) throws SQLException{
    ArrayList<Food> kana = H.getFood();
    int j = kana.size();
    int rs =0;
    makeConnection("student", "ensf");
    for(Food x : kana){
        String query = "DELETE FROM available_food WHERE ItemID = " + x.getID();
        Statement myStmt = myConnection.createStatement();
         rs+= myStmt.executeUpdate(query); 
         
    }
    System.out.println("Number of rows effected:" + rs);

}









    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   

    }
