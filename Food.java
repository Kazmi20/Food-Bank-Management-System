 /**
  *@author MD Shaherier, Syed Kazmi 
  @version 1.3

  */

public class Food {
    // variables
    private int ID;
    private String NAME;
    private int Grain;
    private int Fruit;
    private int Protien;
    private int Other;
    private int calories;


    public int getID() {
        return this.ID;
    }
    public Food(){
        
    }

    public Food(int ID, String NAME, int Grain, int Fruit, int Protien, int Other, int calories) {
        this.ID = ID;
        this.NAME = NAME;
        this.Grain = (int) ((int)Grain*0.01*calories);
        this.Fruit = (int) ((int)Fruit*0.01*calories);
        this.Protien = (int) ((int)Protien *0.01*calories);
        this.Other = (int) ((int)Other*0.01*calories);
        this.calories = calories;
    }
    //getter and setter method
    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return this.NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public int getGrain() {
        return this.Grain;
    }

    public void setGrain(int Grain) {
        this.Grain = Grain;
    }

    public int getFruit() {
        return this.Fruit;
    }

    public void setFruit(int Fruit) {
        this.Fruit = Fruit;
    }

    public int getProtien() {
        return this.Protien;
    }

    public void setProtien(int Protien) {
        this.Protien = Protien;
    }

    public int getOther() {
        return this.Other;
    }

    public void setOther(int Other) {
        this.Other = Other;
    }

    public int getCalories() {
        return this.calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
