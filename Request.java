
//orederform constructor will have request object.

public class Request {

    // Attributes of Request class
    private int totalCalorie;
    private int totalVeggiesAndFruits;
    private int totalProtein;
    private int totalWholeGrains;
    private int totalOther;
    private int totalMale;
    private int totalFemale;
    private int totalChildO8;
    private int totalChildU8;



    
    
    public Client[] family;
    public Inventory items;

    // Setter methods of of Request class
    public void setTotalCalorie(int totalCalorie) {
        this.totalCalorie = totalCalorie;
    }

    public void setTotalVeggiesAndFruits(int totalVeggiesAndFruits) {
        this.totalVeggiesAndFruits = totalVeggiesAndFruits;
    }

    public void setTotalProtein(int totalProtein) {
        this.totalProtein = totalProtein;
    }

    public void setTotalWholeGrains(int totalWholeGrains) {
        this.totalWholeGrains = totalWholeGrains;
    }

    public void setTotalOther(int totalOther) {
        this.totalOther = totalOther;
    }

    // Getter methods of of Request class
    public int getTotalCalorie() {
        return totalCalorie;
    }
public Inventory getItems(){
    return items;
    
}
    public int getTotalVeggiesAndFruits() {
        return totalVeggiesAndFruits;
    }

    public int getTotalProtein() {
        return totalProtein;
    }

    public int getTotalWholeGrains() {
        return totalWholeGrains;
    }

    public int getTotalOther() {
        return totalOther;
    }

    public int getTotalMale() {
        return totalMale;
    }

    public int getTotalFemale() {
        return totalFemale;
    }

    public int getTotalChildU8() {
        return totalChildU8;
    }

    public int getTotalChildO8(){
        return totalChildO8;
    }



    

    // Utility methods of Request class
    //helper method calcRequirements.

    private void calcRequirements(){
        for(Client x : family){

            totalCalorie=(x.getCalorie()*7)+totalCalorie;
            totalVeggiesAndFruits=(x.getVeggiesAndFruits()*7)+totalVeggiesAndFruits;
            totalProtein=(x.getProtein()*7)+totalProtein;
            totalWholeGrains=(x.getGrains()*7)+totalWholeGrains;
            totalOther=(x.getOthers()*7)+totalOther;

        }


    }

    public void calcFamily(){
        for(Client y: family){

            if(y.x==ClientType.MALE){
                totalMale+=1;
            }
            else if(y.x==ClientType.FEMALE){
                totalFemale+=1;
            }
            else if(y.x==ClientType.CHILDU8){
                totalChildU8+=1;
            }
            else{
                totalChildO8+=1;
            }
        }
    }


// calcRequirements needs to be run before createInventory.
//helper.
    private void createInventory() {
        items=new Inventory(totalWholeGrains,totalVeggiesAndFruits,totalProtein,totalOther,totalCalorie);

    }


    // Constructor of Request class
    public Request(Client[] members) {
        this.family=members;
        calcFamily();
        calcRequirements();
        createInventory();


    }

}
