package edu.ucalgary.ensf409;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author MD Shaherier, Jimmy tran
 * @version 1.1
 */

public class orderform {
static private ArrayList<Request> x = new ArrayList<Request>();
private StringBuilder b;

public orderform(Request R){

    x.add(R);


}

/**
 * 
 * @throws IOException
 */

 // This method prints out the hampers in the order form.
public void printOrderForm() throws IOException{
BufferedWriter order = new BufferedWriter(new FileWriter("ORDERFORM.txt"));
order.write("Hamper Order Form" + "\n" );
order.append("Original Request"+"\n" );
for(int i = 0; i < x.size(); i++){
b = new StringBuilder();
int s = i+1;
b.append("Hamper " + s+ ": ");
if(x.get(i).getTotalMale() != 0){
b.append(x.get(i).getTotalMale() + " Adult Male,");
}
if(x.get(i).getTotalFemale() != 0){
    b.append(x.get(i).getTotalFemale() + " Adult Female,");
    }
if(x.get(i).getTotalChildO8() != 0){
    b.append(x.get(i).getTotalChildO8() + " Children over 8,");
    }
if(x.get(i).getTotalChildU8() != 0){
    b.append(x.get(i).getTotalChildU8() + " Children under 8,");
    }


b.append("\n ------------------------------------------------- \n \n");
order.append(b.toString());
b = null;
}

b = new StringBuilder();

for(int i=0; i<x.size(); i++){
int s = i+1;
b.append("Hamper "+ s +" Items:\n");
b.append("--------------------------------------------------- " + "\n");
if(x.get(i).getItems().getBestHamper()!= null){
for(int j=0; j<x.get(i).getItems().getBestHamper().getFood().size(); j++){
  b.append( x.get(i).getItems().getBestHamper().getFood().get(j).getID() + " " + x.get(i).getItems().getBestHamper().getFood().get(j).getNAME()+ "\n");


}
}
else{
b.append("Sorry Not able to fulfil requiremetents ");



}

}
order.append(b.toString());
order.close();




}

// public static void main(String[] args) throws SQLException, IOException, InvalidInventoryException, HamperException {
//   String client1 ="CHILDU8";
//     String client2= "FEMALE";
//     String client3= "CHILDU8";
//     // String client4= "CHILDO8";
//      Client oneClient = new Client(client1);
//         Client secondClient= new Client(client2);
//         Client thirdClient=new Client (client3);
//         // Client fourthClient= new Client(client4);
//         Client[] clientArray={oneClient  , secondClient, thirdClient};

//         Request testRequest = new Request(clientArray);
//         ArrayList<Food> lists=testRequest.getItems().MakeList();
//        ArrayList<Hamper> c=testRequest.getItems().possibleHampers(lists);
//        testRequest.getItems().bestHamper(c);
//        Hamper H = testRequest.getItems().getBestHamper();
//         ArrayList<Food> f= H.getFood();

//    orderform n = new orderform(testRequest);
//    n.printOrderForm();
//    //testRequest.getItems().delete(H);



// }




}
