public class ClientHander extends Thread {
@Override
public void run(){
    GUI X = new GUI();
    X.setVisible(true);

}


public static void main(String[] args) {
    ClientHander x = new ClientHander();
    x.start();
}






    
}
