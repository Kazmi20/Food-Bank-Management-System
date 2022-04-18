import org.junit.*;
import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Syed Kazmi
 * @version 1.8
 */
public class TestFile {

    //We will be testing methods using a sample inventory with a smaller number of items.

    //The following tests are written for the Client class.

    

    String client1 ="MALE";
    String client2= "FEMALE";
    String client3= "CHILDU8";
    String client4= "CHILDO8";
    
    @Test
    public void testClientConstructorGoodData() throws SQLException {
        Client testClient = new Client(client1);
        assertNotNull("ManageAccess constructor did not create an object when given a valid array of log entries.", testClient);
    }

    
    @Test
    public void testGetVeggie() throws SQLException{
        Client testClient = new Client(client1);
        int found=testClient.getVeggiesAndFruits();
        int expected=700;
        assertEquals("Incorrect Output", expected, found);


    }

    @Test
    public void testGetGrains() throws SQLException{
        Client testClient = new Client(client1);
        int found=testClient.getGrains();
        int expected=400;
        assertEquals("Incorrect Output", expected, found);


    }

    @Test
    public void testGetProtein() throws SQLException{
        Client testClient = new Client(client1);
        int found=testClient.getProtein();
        int expected=650;
        assertEquals("Incorrect Output", expected, found);

    }
    @Test
    public void testGetOther() throws SQLException{
        Client testClient = new Client(client1);
        int found=testClient.getOthers();
        int expected=750;
        assertEquals("Incorrect Output", expected, found);


    }

    @Test
    public void testGetCalories() throws SQLException{
        Client testClient = new Client(client1);
        int found=testClient.getCalorie();
        int expected=2500;
        assertEquals("Incorrect Output", expected, found);

    }


// The following tests are written for the Request file.



    
    @Test
    
    public void testRequestConstructorGoodData() throws SQLException {
        
        Client oneClient = new Client(client1);
        Client secondClient= new Client(client2);
        Client thirdClient=new Client (client3);
        Client fourthClient= new Client(client4);
        Client[] clientArray={oneClient, secondClient, thirdClient,fourthClient};

        Request testRequest = new Request(clientArray);

        assertNotNull("ManageAccess constructor did not create an object when given a valid array of log entries.", testRequest);

    }
    

    @Test
    public void testGetTotalWheat() throws SQLException {

        Client oneClient = new Client(client1);
        Client secondClient= new Client(client2);
        Client thirdClient=new Client (client3);
        Client fourthClient= new Client(client4);
        Client[] clientArray={oneClient, secondClient, thirdClient,fourthClient};

        Request testRequest = new Request(clientArray);
        

       
        
        int foundWholeGrains = testRequest.getTotalWholeGrains();
        int expectedWholeGrains =10332 ;
        assertEquals("Incorrect Output", expectedWholeGrains, foundWholeGrains);
    }


    @Test
    public void testGetTotalVeggiesAndFruits() throws SQLException {

        Client oneClient = new Client(client1);
        Client secondClient= new Client(client2);
        Client thirdClient=new Client (client3);
        Client fourthClient= new Client(client4);
        Client[] clientArray={oneClient, secondClient, thirdClient,fourthClient};

        Request testRequest = new Request(clientArray);
        

       
        
        int foundVeggiesAbdFruits = testRequest.getTotalVeggiesAndFruits();
        int expectedVeggiesAndFruits =17136 ;
        assertEquals("Incorrect Output", expectedVeggiesAndFruits, foundVeggiesAbdFruits);
    }

    @Test
    public void testGetTotalProtein() throws SQLException {

        Client oneClient = new Client(client1);
        Client secondClient= new Client(client2);
        Client thirdClient=new Client (client3);
        Client fourthClient= new Client(client4);
        Client[] clientArray={oneClient, secondClient, thirdClient,fourthClient};

        Request testRequest = new Request(clientArray);
        

       
        
        int foundProtein = testRequest.getTotalProtein();
        int expectedProein =16002 ;
        assertEquals("Incorrect Output", expectedProein, foundProtein);
    }

    @Test
    public void testGetTotalOthers() throws SQLException {

        Client oneClient = new Client(client1);
        Client secondClient= new Client(client2);
        Client thirdClient=new Client (client3);
        Client fourthClient= new Client(client4);
        Client[] clientArray={oneClient, secondClient, thirdClient,fourthClient};

        Request testRequest = new Request(clientArray);
        

       
        
        int foundOther = testRequest.getTotalOther();
        int expectedOther =13230 ;
        assertEquals("Incorrect Output", expectedOther, foundOther);
    }


    @Test
    public void testGetTotalCalories() throws SQLException {

        Client oneClient = new Client(client1);
        Client secondClient= new Client(client2);
        Client thirdClient=new Client (client3);
        Client fourthClient= new Client(client4);
        Client[] clientArray={oneClient, secondClient, thirdClient,fourthClient};

        Request testRequest = new Request(clientArray);
        

       
        
        int foundCalories = testRequest.getTotalCalorie();
        int expectedCalories =56700 ;
        assertEquals("Incorrect Output", expectedCalories, foundCalories);
    }


    
    //The following tests are for the Food class.
    @Test
    public void testFoodConstructorGoodData(){

      
        int ID=4;
        String NAME="Apple, dozen";
        int Grain=0;
        int Fruit=624;
        int Protien=0;
        int Other=0;
        int calories=624;

        Food item= new Food(ID, NAME, Grain,Fruit,Protien,Other,calories);

        assertNotNull("AccessLog constructor did not create an object when given a valid log string.", item);


    }
    @Test
    public void testGetFoodID() {
        int ID=4;
        String NAME="Apple, dozen";
        int Grain=0;
        int Fruit=624;
        int Protien=0;
        int Other=0;
        int calories=624;

        Food item= new Food(ID, NAME, Grain,Fruit,Protien,Other,calories);

        int testID=item.getID();
        int expectedID=4;

        assertEquals("Incorrect Output", expectedID, testID);


    }

    @Test
    public void testGetFoodName() {
        int ID=4;
        String NAME="Apple, dozen";
        int Grain=0;
        int Fruit=624;
        int Protien=0;
        int Other=0;
        int calories=624;

        Food item= new Food(ID, NAME, Grain,Fruit,Protien,Other,calories);

        String testName = item.getNAME();
        String expectedName="Apple, dozen";

        assertEquals("Incorrect Output", expectedName, testName);


    }

    @Test
    public void testGetFoodGrain() {
        int ID=4;
        String NAME="Apple, dozen";
        int Grain=0;
        int Fruit=624;
        int Protien=0;
        int Other=0;
        int calories=624;

        Food item= new Food(ID, NAME, Grain,Fruit,Protien,Other,calories);

        int testGrain = item.getGrain();
        int expectedGrain=0;

        assertEquals("Incorrect Output", expectedGrain, testGrain);



    }


    @Test
    public void testGetFoodFruitsAndVeggies() {
        int ID=4;
        String NAME="Apple, dozen";
        int Grain=0;
        int Fruit=100;
        int Protien=0;
        int Other=0;
        int calories=624;

        Food item= new Food(ID, NAME, Grain,Fruit,Protien,Other,calories);

        int testVeggies = item.getFruit();
        int expectedVeggies=624;

        assertEquals("Incorrect Output", expectedVeggies, testVeggies);



    }

    @Test
    public void testGetFoodProtein() {
        int ID=4;
        String NAME="Apple, dozen";
        int Grain=0;
        int Fruit=624;
        int Protien=0;
        int Other=0;
        int calories=624;

        Food item= new Food(ID, NAME, Grain,Fruit,Protien,Other,calories);

        int testProtein = item.getProtien();
        int expectedProtein=0;

        assertEquals("Incorrect Output", expectedProtein, testProtein);




    }


    @Test
    public void testGetFoodOther() {
        int ID=4;
        String NAME="Apple, dozen";
        int Grain=0;
        int Fruit=624;
        int Protien=0;
        int Other=0;
        int calories=624;

        Food item= new Food(ID, NAME, Grain,Fruit,Protien,Other,calories);

        int testOther = item.getOther();
        int expectedOther=0;

        assertEquals("Incorrect Output", expectedOther, testOther);


    }

    @Test
    public void testGetFoodCalories() {
        int ID=4;
        String NAME="Apple, dozen";
        int Grain=0;
        int Fruit=624;
        int Protien=0;
        int Other=0;
        int calories=624;

        Food item= new Food(ID, NAME, Grain,Fruit,Protien,Other,calories);

        int testCalories= item.getCalories();
        int expectedCalories=624;

        assertEquals("Incorrect Output", expectedCalories, testCalories);


    }








    // The following tests are for the Inventory class.

    @Test
    public void testInventoryConstructorGoodData() {
        int sampleGrains=1257;
        int sampleVeggiesAndFruits=2871;
        int sampleProtein=1189;
        int sampleOther=3539;
        int sampleCalories=8856;

        
        Inventory testHamper =new Inventory(sampleGrains, sampleVeggiesAndFruits,sampleProtein, sampleOther, sampleCalories);

        assertNotNull("AccessLog constructor did not create an object when given a valid log string.", testHamper);

    }


    @Test
    public void testPowerSet(){

        Food item1=new Food(4, "Apple, dozen" , 0, 624, 0, 0, 624);
        Food item2=new Food(8, "Baby Carrots, pound" , 0, 159, 0, 0, 159);
        Food item3=new Food(10, "Orange, dozen" , 0, 524, 0, 0, 524);

        ArrayList<Food> items=new ArrayList<Food>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        int sampleGrains=1257;
        int sampleVeggiesAndFruits=2871;
        int sampleProtein=1189;
        int sampleOther=3539;
        int sampleCalories=8856;

        
        Inventory testHamper =new Inventory(sampleGrains, sampleVeggiesAndFruits,sampleProtein, sampleOther, sampleCalories);

        ArrayList<ArrayList<Food>> testSet = testHamper.powerSet(items);


        assertNotNull("AccessLog constructor did not create an object when given a valid log string.", testSet);



    }



    @Test(expected = HamperException.class)

    public void testPossibleHampers() throws HamperException{

        Food item1=new Food(4, "Apple, dozen" , 0, 624, 0, 0, 624);
        Food item2=new Food(8, "Baby Carrots, pound" , 0, 159, 0, 0, 159);
        Food item3=new Food(10, "Orange, dozen" , 0, 524, 0, 0, 524);

        ArrayList<Food> items=new ArrayList<Food>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        int sampleGrains=1257;
        int sampleVeggiesAndFruits=2871;
        int sampleProtein=1189;
        int sampleOther=3539;
        int sampleCalories=8856;

        
        Inventory testHamper =new Inventory(sampleGrains, sampleVeggiesAndFruits,sampleProtein, sampleOther, sampleCalories);

        ArrayList<Hamper> listOfHamper=testHamper.possibleHampers(items);

        assertNotNull("AccessLog constructor did not create an object when given a valid log string.", listOfHamper);


    }


    @Test

    public void testBestHampers(){
        Food item1=new Food(4, "Apple, dozen" , 0, 100, 0, 0, 624);
        Food item2=new Food(8, "Baby Carrots, pound" , 0, 100, 0, 0, 159);
        Food item3=new Food(10, "Orange, dozen" , 0, 100, 0, 0, 524);

        int sampleGrains=1257;
        int sampleVeggiesAndFruits=2871;
        int sampleProtein=1189;
        int sampleOther=3539;
        int sampleCalories=8856;

        
        Inventory testInventory =new Inventory(sampleGrains, sampleVeggiesAndFruits,sampleProtein, sampleOther, sampleCalories);

        ArrayList<Food> items=new ArrayList<Food>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        int sampleSumOfDifferences=23;

        Hamper testHamper1 =new Hamper(items,sampleSumOfDifferences);

        Food item4=new Food(3, "Apple, dozen" , 0, 100, 0, 0, 624);
        Food item5=new Food(8, "Carrots, pound" , 0, 100, 0, 0, 459);
        Food item6=new Food(10, "Peaches, crate" , 0, 100, 0, 0, 524);

        ArrayList<Food> items2=new ArrayList<Food>();
        items2.add(item4);
        items2.add(item5);
        items2.add(item6);


        int sampleSumOfDifferences2=65;

        Hamper testHamper2 =new Hamper(items2,sampleSumOfDifferences2);

        ArrayList<Hamper> hampers= new ArrayList<Hamper>();
        hampers.add(testHamper1);
        hampers.add(testHamper2);

        testInventory.bestHamper(hampers);

        Hamper testBest = testInventory.getBestHamper();

        assertEquals("Incorrect Output", testHamper1, testBest);


    }



    @Test

    public void testMakeList() throws SQLException, InvalidInventoryException{
        int sampleGrains=1257;
        int sampleVeggiesAndFruits=2871;
        int sampleProtein=1189;
        int sampleOther=3539;
        int sampleCalories=8856;

        
        Inventory testInventory =new Inventory(sampleGrains, sampleVeggiesAndFruits,sampleProtein, sampleOther, sampleCalories);

        ArrayList<Food> listOfFoods=testInventory.MakeList();

        assertNotNull("AccessLog constructor did not create an object when given a valid log string.", listOfFoods);

    }


    @Test
    public void testDelete() throws SQLException, InvalidInventoryException{
        Food item1=new Food(4, "Apple, dozen" , 0, 624, 0, 0, 624);
        Food item2=new Food(8, "Baby Carrots, pound" , 0, 159, 0, 0, 159);
        Food item3=new Food(10, "Orange, dozen" , 0, 524, 0, 0, 524);

        ArrayList<Food> items=new ArrayList<Food>();
        items.add(item1);
        items.add(item2);
        items.add(item3);


        int sampleSumOfDifferences=23;

        Hamper testHamper =new Hamper(items,sampleSumOfDifferences);
        
        int sampleGrains=1257;
        int sampleVeggiesAndFruits=2871;
        int sampleProtein=1189;
        int sampleOther=3539;
        int sampleCalories=8856;

        
        Inventory testInventory =new Inventory(sampleGrains, sampleVeggiesAndFruits,sampleProtein, sampleOther, sampleCalories);

        ArrayList<Food> listOfFoods=testInventory.MakeList();
        testInventory.delete(testHamper);

        ArrayList<Food> testListOfFoods=testInventory.MakeList();

        assertNotEquals("Incorrect Output", listOfFoods, testListOfFoods);



    }
    








    
    
    //the following tests are for Hamper class.

    @Test
    public void testHamperConstructorGoodData() {
        
        Food item1=new Food(4, "Apple, dozen" , 0, 624, 0, 0, 624);
        Food item2=new Food(8, "Baby Carrots, pound" , 0, 159, 0, 0, 159);
        Food item3=new Food(10, "Orange, dozen" , 0, 524, 0, 0, 524);

        ArrayList<Food> items=new ArrayList<Food>();
        items.add(item1);
        items.add(item2);
        items.add(item3);


        int sampleSumOfDifferences=23;

        Hamper testHamper =new Hamper(items,sampleSumOfDifferences);
        assertNotNull("AccessLog constructor did not create an object when given a valid log string.", testHamper);

    }

    @Test
    public void testGetID(){
        Food item1=new Food(4, "Apple, dozen" , 0, 624, 0, 0, 624);
        Food item2=new Food(8, "Baby Carrots, pound" , 0, 159, 0, 0, 159);
        Food item3=new Food(10, "Orange, dozen" , 0, 524, 0, 0, 524);

        ArrayList<Food> items=new ArrayList<Food>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        int sampleSumOfDifferences=23;

        Hamper testHamper =new Hamper(items,sampleSumOfDifferences);
        ArrayList<Food> testID=testHamper.getFood();

        assertEquals("Incorrect Output", items, testID);

    }


    @Test
    public void testGetSumOfDifferences(){
        Food item1=new Food(4, "Apple, dozen" , 0, 624, 0, 0, 624);
        Food item2=new Food(8, "Baby Carrots, pound" , 0, 159, 0, 0, 159);
        Food item3=new Food(10, "Orange, dozen" , 0, 524, 0, 0, 524);

        ArrayList<Food> items=new ArrayList<Food>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        int sampleSumOfDifferences=23;

        Hamper testHamper =new Hamper(items,sampleSumOfDifferences);
        int testSumOfDifferences=testHamper.getSumOfDifferences();

        assertEquals("Incorrect Output", sampleSumOfDifferences, testSumOfDifferences);

    }



    

    







}











    
