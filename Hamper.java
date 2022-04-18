package edu.ucalgary.ensf409;
import java.util.ArrayList;

public class Hamper {
    /**
     * @author Syed Kazmi
     * @version 1.3
     */

    // change String to Food type.

    ArrayList<Food> foods;
    int sumOfDifferences = 0;


    //Constructor
    /**
     * 
     * @param idArr
     * @param sum
     */
    public Hamper(ArrayList<Food> idArr , int sum) {
        foods=idArr;
        sumOfDifferences=sum;
    }

   //getter methods

    public ArrayList<Food> getFood(){
        return foods;
    }

    public int getSumOfDifferences(){
        return sumOfDifferences;
    }

    //setter methods
    public void setSumOfDifferences(int sum){
        this.sumOfDifferences=sum;
    }

    public void setFood(ArrayList<Food> id){
        this.foods=id;
    }

    
}
