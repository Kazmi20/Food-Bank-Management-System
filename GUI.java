

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author MD
 * @version 1.8
 */
public class GUI extends javax.swing.JFrame {

    int members;
    int TFemale;
    int TMale;
    int TChildenU8;
    int TChildrenO8;
    Client[] member;
    ArrayList<Food> f ;
    Hamper H;
    ArrayList<Hamper> c;
    ArrayList<Food> lists;
    Request testRequest ;
    orderform n;

    public Client[] getMembers() {
        return member;
    }

    public int getmembers() {
        return this.members;
    }

    public int getTotalFemale() {
        return this.TFemale;
    }

    public int getTMale() {
        return this.TMale;
    }

    public int getTChildenU8() {
        return this.TChildenU8;
    }

    public int getTChildenO8() {
        return this.TChildrenO8;
    }

    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Member = new javax.swing.JLabel();
        F = new javax.swing.JLabel();
        M = new javax.swing.JLabel();
        CU8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CO8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        output = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(30, 31, 38));
        jPanel1.setForeground(new java.awt.Color(153, 255, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME TO GROUP 37 FOOD BANK");

        jButton1.setBackground(new java.awt.Color(77, 100, 141));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Start");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    try {
                        jButton1ActionPerformed(evt);
                    } catch (InvalidInventoryException | HamperException e) {
                        output.setText("Failed to make hamper");
                        e.printStackTrace();
                    }
                } catch (SQLException e) {
                    
                    output.setText("Failed to make hamper ");
                } catch (IOException e) {
                   
                    output.setText("Failed to make hamper");
                }
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("MEMBERS");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Adult FEMALE");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Adult Male");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("CHILDEN UNDER 8");

        Member.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Member.setForeground(new java.awt.Color(255, 255, 255));
        Member.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Member.setText("-----");

        F.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        F.setForeground(new java.awt.Color(255, 255, 255));
        F.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        F.setText("-----");

        M.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        M.setForeground(new java.awt.Color(255, 255, 255));
        M.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        M.setText("-----");

        CU8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CU8.setForeground(new java.awt.Color(255, 255, 255));
        CU8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CU8.setText("-----");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("CHILDEN OVER  8");

        CO8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CO8.setForeground(new java.awt.Color(255, 255, 255));
        CO8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CO8.setText("-----");

        jButton2.setBackground(new java.awt.Color(77, 100, 141));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Print Hamper");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    try {
                        jButton2ActionPerformed(evt);
                    } catch (InvalidInventoryException | HamperException e) {
                        output.setText("Failed to make hamper ");
                        e.printStackTrace();
                    }
                } catch (SQLException | IOException e) {
                    output.setText("Failed to make hamper as Sql Server not responding or IO connection failed");

                }
            }
        });

        output.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(76, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(CO8))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(jLabel3))
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel4))
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(94, 94, 94)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(M)
                                                                        .addComponent(F)
                                                                        .addComponent(Member)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(94, 94, 94)
                                                                .addComponent(CU8)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 114,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 114,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(output, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 82,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap()));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(55, 55, 55)
                                                .addComponent(jLabel2)
                                                .addGap(41, 41, 41)
                                                .addComponent(jLabel3)
                                                .addGap(47, 47, 47)
                                                .addComponent(jLabel4))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(119, 119, 119)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Member)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(34, 34, 34)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(F)
                                                                .addGap(47, 47, 47)
                                                                .addComponent(M))
                                                        .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(CU8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52,
                                        Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CO8)
                                        .addComponent(jLabel10)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(140, 140, 140)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));

        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, IOException, InvalidInventoryException, HamperException   {
        members = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Total number of family members"));
        Member.setText(String.valueOf(members));
        member = new Client[members];
        int indexOfArray = 0;
        TFemale = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Total number of Female"));
        F.setText(String.valueOf(TFemale));
        for (int i = 0; i < TFemale; i++) {
            Client female = new Client("FEMALE");
            member[indexOfArray] = female;
            indexOfArray++;
        }
try{
        TMale = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Total number of Male"));
        M.setText(String.valueOf(TMale));
        for (int i = 0; i < TMale; i++) {
            Client male = new Client("MALE");
            member[indexOfArray] = male;
            indexOfArray++;
        }
        TChildenU8 = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter  Total number  of Childen Under 8"));
        CU8.setText(String.valueOf(TChildenU8));
        for (int i = 0; i < TChildenU8; i++) {
            Client chilU8 = new Client("CHILDU8");
            member[indexOfArray] = chilU8;
            indexOfArray++;
        }

        TChildrenO8 = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Total  number of Children Over 8"));
        CO8.setText(String.valueOf(TChildrenO8));
        for (int i = 0; i < TChildrenO8; i++) {
            Client chilO8 = new Client("CHILDO8");
            member[indexOfArray] = chilO8;
            indexOfArray++;
        }

        Request testRequest = new Request(getMembers());
        ArrayList<Food> lists = testRequest.getItems().MakeList();
        ArrayList<Hamper> c = testRequest.getItems().possibleHampers(lists);
        testRequest.getItems().bestHamper(c);
        Hamper H = testRequest.getItems().getBestHamper();
        ArrayList<Food> f = H.getFood();
        testRequest.getItems().delete(H);
        if (f != null) {
            output.setText("Form Printed");
             n = new orderform(testRequest);
            
        } else {
            output.setText("Failed!!!");
        }

        

    }
    catch(  HamperException  e){
        output.setText("Failed H ");
        n = null;
    }

    catch( InvalidInventoryException e){
        output.setText("Failed I ");
        n = null;
    }




 catch(Exception e){
    output.setText("Try again!!!"); 
    Member.setText("Invaid Family MEMBER. Try again....");
    F.setText("Invaid Family MEMBER. Try again....");
    M.setText("Invaid Family MEMBER. Try again....");
    CO8.setText("Invaid Family MEMBER. Try again....");
    CU8.setText("Invaid Family MEMBER. Try again....");


    }
}

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt1)
            throws SQLException, IOException, InvalidInventoryException, HamperException {
         n.printOrderForm();
       
        
        member = null;
        testRequest = null;
        lists = null;
        c = null;
        H = null;
        f = null;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        GUI X = new GUI();
        X.setVisible(true);

    }

    // Variables declaration - do not modify
    private javax.swing.JLabel CO8;
    private javax.swing.JLabel CU8;
    private javax.swing.JLabel F;
    private javax.swing.JLabel M;
    private javax.swing.JLabel Member;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel output;
    // End of variables declaration
}
// End of variables declaration
