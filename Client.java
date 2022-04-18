package edu.ucalgary.ensf409;
import java.sql.SQLException;

public class Client{
    /**
     * @author Alex Burn
     */

     //Variables.
    ClientType x;
    private int calorie;
    private int veggiesAndFruits;
    private int protein;
    private int wholeGrains;
    private int otherGrains;

    public Client(){

    }
    /**
     * 
     * @param member
     * @throws SQLException
     */

     //constructor
    public Client(String member) throws SQLException{
        try{
            if(member.equals("MALE")){
            x = ClientType.MALE;
            this.calorie= x.toCalories();
            this.veggiesAndFruits= x.toFruitAndVeggies();
            this.protein= x.toProtein();
            this.wholeGrains= x.toWholeGrain();
            this.otherGrains= x.toOther();
        }
        if(member.equals("FEMALE")){
            x = ClientType.FEMALE;
            this.calorie= x.toCalories();
            this.veggiesAndFruits= x.toFruitAndVeggies();
            this.protein= x.toProtein();
            this.wholeGrains= x.toWholeGrain();
            this.otherGrains= x.toOther();
        }
        if(member.equals("CHILDU8")){
            x = ClientType.CHILDU8;
            this.calorie= x.toCalories();
            this.veggiesAndFruits= x.toFruitAndVeggies();
            this.protein= x.toProtein();
            this.wholeGrains= x.toWholeGrain();
            this.otherGrains= x.toOther();
        }
        if(member.equals("CHILDO8")){
            x = ClientType.CHILDO8;
            this.calorie= x.toCalories();
            this.veggiesAndFruits= x.toFruitAndVeggies();
            this.protein= x.toProtein();
            this.wholeGrains= x.toWholeGrain();
            this.otherGrains= x.toOther();
        }
        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }
        
    }

    // setter 
    public void setClientType(String memberType) throws SQLException{
        try{
            if(memberType.equals("MALE")){
            x = ClientType.MALE;
            this.calorie= x.toCalories();
            this.veggiesAndFruits= x.toFruitAndVeggies();
            this.protein= x.toProtein();
            this.wholeGrains= x.toWholeGrain();
            this.otherGrains= x.toOther();
        }
        if(memberType.equals("FEMALE")){
            x = ClientType.FEMALE;
            this.calorie= x.toCalories();
            this.veggiesAndFruits= x.toFruitAndVeggies();
            this.protein= x.toProtein();
            this.wholeGrains= x.toWholeGrain();
            this.otherGrains= x.toOther();
        }
        if(memberType.equals("CHILDU8")){
            x = ClientType.CHILDU8;
            this.calorie= x.toCalories();
            this.veggiesAndFruits= x.toFruitAndVeggies();
            this.protein= x.toProtein();
            this.wholeGrains= x.toWholeGrain();
            this.otherGrains= x.toOther();
        }
        if(memberType.equals("CHILDO8")){
            x = ClientType.CHILDO8;
            this.calorie= x.toCalories();
            this.veggiesAndFruits= x.toFruitAndVeggies();
            this.protein= x.toProtein();
            this.wholeGrains= x.toWholeGrain();
            this.otherGrains= x.toOther();
        }
        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }
    }
    // getters
    public int getCalorie(){
        return this.calorie;
    }
    
    public int getProtein(){
        return this.protein;
    }
    public int getVeggiesAndFruits(){
        return this.veggiesAndFruits;
    }

    public int getGrains(){
        return this.wholeGrains;
    }

    public int getOthers(){
        return this.otherGrains;
    }


    public static void main(String args[]) throws SQLException{
        Client test = new Client("MALE");
        System.out.println(test.getGrains());

        System.out.println("Hello.");
    }
}
