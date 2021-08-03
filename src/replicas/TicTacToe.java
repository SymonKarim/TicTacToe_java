
package replicas;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Symon
 */
public class TicTacToe extends javax.swing.JFrame {
     private String startGame = "X";
     private int xCount= 0;
     private int oCount = 0;
    private int x=0;
    private boolean isbtnClicked1 = false;
    private  boolean isbtnClicked2 = false;
    private   boolean isbtnClicked3 = false;
    private   boolean isbtnClicked4 = false;
    private   boolean isbtnClicked5 = false;
    private   boolean isbtnClicked6 = false;
    private   boolean isbtnClicked7 = false;
    private   boolean isbtnClicked8 = false;
    private   boolean isbtnClicked9 = false;
    private boolean isdraw;
     
     
     
     
    private void gameScore(){
        jLabel3.setText(String.valueOf(xCount));
        jLabel5.setText(String.valueOf(oCount));
    }
    private void gameReset(){
             x=0;
            jButton1.setText(null);
            jButton2.setText(null);
            jButton3.setText(null); 
            jButton4.setText(null);
            jButton5.setText(null);  
            jButton6.setText(null); 
            jButton7.setText(null); 
            jButton8.setText(null);  
            jButton9.setText(null);      

            jButton1.setBackground(Color.LIGHT_GRAY);
            jButton2.setBackground(Color.LIGHT_GRAY);
            jButton3.setBackground(Color.LIGHT_GRAY);
            jButton4.setBackground(Color.LIGHT_GRAY);
            jButton5.setBackground(Color.LIGHT_GRAY);
            jButton6.setBackground(Color.LIGHT_GRAY);
            jButton7.setBackground(Color.LIGHT_GRAY);
            jButton8.setBackground(Color.LIGHT_GRAY);
            jButton9.setBackground(Color.LIGHT_GRAY);
            isbtnClicked1 = false;
            isbtnClicked2 = false;
            isbtnClicked3 = false;
            isbtnClicked4 = false;
            isbtnClicked5 = false;
            isbtnClicked6 = false;
            isbtnClicked7 = false;
            isbtnClicked8 = false;
            isbtnClicked9 = false;
    }
    private void draw(){
      if(x==9){
           boolean k = Game();
             if (k == false) {
        JOptionPane.showMessageDialog(this,"Match Drawn!!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
       gameReset();
             }
    }
    }
    private boolean Game(){
     
         String b1 = jButton1.getText();
         String b2 = jButton2.getText();
         String b3 = jButton3.getText();
         String b4 = jButton4.getText();
         String b5 = jButton5.getText();
         String b6 = jButton6.getText();
         String b7 = jButton7.getText();
         String b8 = jButton8.getText();
         String b9 = jButton9.getText();
        
           if(b1=="X" && b2=="X" && b3 == "X"){
               xCount++;   x=0;
               gameScore();
            jButton1.setBackground(Color.ORANGE);
            jButton2.setBackground(Color.ORANGE);
            jButton3.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player X Winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            gameReset();
            return true;
       
         }
         if(b4=="X" && b5=="X" && b6 == "X"){
              xCount++;   x=0;
               gameScore();
             jButton4.setBackground(Color.ORANGE);
            jButton5.setBackground(Color.ORANGE);
            jButton6.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player X Winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            gameReset();
            return true;
              
         }
                if(b7=="X" && b8=="X" && b9 == "X"){
                     xCount++;   x=0;
               gameScore();
              jButton7.setBackground(Color.ORANGE);
            jButton8.setBackground(Color.ORANGE);
            jButton9.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player X Winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            gameReset();
            return true;
              
         }
                if(b1=="X" && b5=="X" && b9 == "X"){
                     xCount++;   x=0;
               gameScore();
             jButton1.setBackground(Color.ORANGE);
            jButton5.setBackground(Color.ORANGE);
            jButton9.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player X Winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            gameReset();
            return true;
              
         }
             if(b3=="X" && b5=="X" && b7 == "X"){
                  xCount++;   x=0;
               gameScore();
             jButton3.setBackground(Color.ORANGE);
            jButton5.setBackground(Color.ORANGE);
            jButton7.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player X Winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            gameReset();
            return true;
            
         }
           if(b1=="X" && b4=="X" && b7 == "X"){
                xCount++;   x=0;
               gameScore();
               jButton1.setBackground(Color.ORANGE);
            jButton4.setBackground(Color.ORANGE);
            jButton7.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player X Winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            gameReset();
            return true;
              
         }
                if(b2=="X" && b5=="X" && b8 == "X"){
                     xCount++;   x=0;
               gameScore();
                    jButton5.setBackground(Color.ORANGE);
            jButton2.setBackground(Color.ORANGE);
            jButton8.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player X Winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            gameReset();
            return true;
             
         }
              if(b3=="X" && b6=="X" && b9 == "X"){
                   xCount++;   x=0;
               gameScore();
            jButton9.setBackground(Color.ORANGE);
            jButton6.setBackground(Color.ORANGE);
            jButton3.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player X Winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            gameReset();
            return true;
             
         }
            if(b1=="O"&& b2=="O" && b3 == "O"){
                 oCount++;   x=0;
                gameScore();
            jButton1.setBackground(Color.GREEN);
            jButton2.setBackground(Color.GREEN);
            jButton3.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,"Player O Winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE ); 
            gameReset();
            return true;
             
         }
       if(b4=="O" && b5=="O" && b6 == "O"){
            oCount++;   x=0;
             gameScore();
            jButton4.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton6.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,"Player O Winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            gameReset();
            return true;
              
         }
        if(b7=="O"&& b8=="O" && b9 == "O"){
              oCount++;   x=0;
             gameScore();
             jButton7.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,"Player O Winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            gameReset();
            return true;
            
           
         }
            if(b1=="O" && b5=="O" && b9 == "O"){
                  oCount++;   x=0;
             gameScore();
            jButton1.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,"Player O Winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            gameReset();
            return true;
            
            
        
         }
           if(b3=="O" && b5=="O" && b7 == "O"){
                 oCount++;   x=0;
                gameScore();
           jButton3.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,"Player O Winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            gameReset();
            return true;
             
         }
         if(b1=="O"&& b4=="O" && b7 =="O"){
               oCount++;
                 x=0;
             gameScore();
            jButton1.setBackground(Color.GREEN);
            jButton4.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,"Player O Winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            gameReset();
            return true;
             
          
         }
               if(b2=="O"&& b5=="O" && b8 == "O"){
                oCount++;
                  x=0;
             gameScore();
            jButton2.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this,"Player O Winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            gameReset();
            return true;
              
            
         }
            if(b3=="O" && b6=="O" && b9 == "O"){
             oCount++;
             gameScore();
             jButton3.setBackground(Color.GREEN);
            jButton6.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
            x=0;
            JOptionPane.showMessageDialog(this,"Player O Winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE );
            gameReset();
            return true;
             
         }
            return false;
          
    }
    
    public TicTacToe() {
        initComponents();
        setSize(1200,600);
       setLocationRelativeTo(null);
         
    }
   
    private void choose_Player(){
        if(startGame.equalsIgnoreCase("X")){
           startGame ="O";
        }
        else{
            startGame ="X";
        }
   }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("tic toc toe");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic tac toe");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        jPanel2.add(jPanel3);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);

        jPanel2.add(jPanel4);

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);

        jPanel2.add(jPanel5);

        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 40)); // NOI18N
        jLabel2.setText("Player X:");
        jPanel6.add(jLabel2);

        jPanel2.add(jPanel6);

        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 96)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("0");
        jPanel7.add(jLabel3);

        jPanel2.add(jPanel7);

        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4);

        jPanel2.add(jPanel8);

        jPanel9.setLayout(new java.awt.GridLayout(1, 0));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5);

        jPanel2.add(jPanel9);

        jPanel10.setLayout(new java.awt.GridLayout(1, 0));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton6);

        jPanel2.add(jPanel10);

        jPanel11.setLayout(new java.awt.GridLayout(1, 0));

        jLabel4.setFont(new java.awt.Font("Algerian", 1, 40)); // NOI18N
        jLabel4.setText("Player O:");
        jPanel11.add(jLabel4);

        jPanel2.add(jPanel11);

        jPanel12.setLayout(new java.awt.GridLayout(1, 0));

        jLabel5.setFont(new java.awt.Font("Algerian", 1, 96)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("0");
        jPanel12.add(jLabel5);

        jPanel2.add(jPanel12);

        jPanel13.setLayout(new java.awt.GridLayout(1, 0));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton7);

        jPanel2.add(jPanel13);

        jPanel14.setLayout(new java.awt.GridLayout(1, 0));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton8);

        jPanel2.add(jPanel14);

        jPanel15.setLayout(new java.awt.GridLayout(1, 0));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton9);

        jPanel2.add(jPanel15);

        jPanel16.setLayout(new java.awt.GridLayout(1, 0));

        jButton10.setFont(new java.awt.Font("Algerian", 1, 56)); // NOI18N
        jButton10.setText("Reset");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton10);

        jPanel2.add(jPanel16);

        jPanel17.setLayout(new java.awt.GridLayout(1, 0));

        jButton11.setFont(new java.awt.Font("Algerian", 1, 56)); // NOI18N
        jButton11.setText("Exit");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton11);

        jPanel2.add(jPanel17);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private JFrame frame;
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Are Sure to delete the Record?","Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        System.exit(0);}
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
            isbtnClicked1 = false;
            isbtnClicked2 = false;
            isbtnClicked3 = false;
            isbtnClicked4 = false;
            isbtnClicked5 = false;
            isbtnClicked6 = false;
            isbtnClicked7 = false;
            isbtnClicked8 = false;
            isbtnClicked9 = false;
            x=0;
            gameReset();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      if( isbtnClicked1 == false){
          isbtnClicked1 = true;
        jButton1.setText(startGame);
         if(startGame.equalsIgnoreCase("X")){
            jButton1.setForeground(Color.BLUE);
        }
        else{
           jButton1.setForeground(Color.RED);
        }
       choose_Player();
      Game();  x++; draw();
     
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          if( isbtnClicked2 == false){
          isbtnClicked2 = true;
          jButton2.setText(startGame);
           if(startGame.equalsIgnoreCase("X")){
           jButton2.setForeground(Color.BLUE);
        }
        else{
          jButton2.setForeground(Color.RED);
        }
     choose_Player();
     Game();
     x++; draw();
          }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
           if( isbtnClicked3 == false){
          isbtnClicked3 = true;  
        jButton3.setText(startGame);
           if(startGame.equalsIgnoreCase("X")){
           jButton3.setForeground(Color.BLUE);
        }
        else{
           jButton3.setForeground(Color.RED);
        }
     choose_Player();   
        x++;
       Game();
       draw();
           }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if( isbtnClicked4 == false){
          isbtnClicked4 = true;
        jButton4.setText(startGame);
         
           if(startGame.equalsIgnoreCase("X")){
           jButton4.setForeground(Color.BLUE);
        }
        else{
          jButton4.setForeground(Color.RED);
        }
     choose_Player(); 
        x++;
        Game();
     draw();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
          if( isbtnClicked5 == false){
          isbtnClicked5 = true;
        jButton5.setText(startGame);

           if(startGame.equalsIgnoreCase("X")){
           jButton5.setForeground(Color.BLUE);
        }
        else{
          jButton5.setForeground(Color.RED);
        }
     choose_Player(); 
      x++;
      Game();
        draw();
          }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if( isbtnClicked6 == false){
          isbtnClicked6 = true;
        jButton6.setText(startGame);
         
           if(startGame.equalsIgnoreCase("X")){
           jButton6.setForeground(Color.BLUE);
        }
        else{
          jButton6.setForeground(Color.RED);
        }
     choose_Player();
      x++;
      Game(); 
         draw();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         if( isbtnClicked7 == false){
          isbtnClicked7 = true;
        jButton7.setText(startGame);
         
           if(startGame.equalsIgnoreCase("X")){
           jButton7.setForeground(Color.BLUE);
        }
        else{
          jButton7.setForeground(Color.RED);
        }
     choose_Player();
      x++;
      Game(); 
       draw();
         }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
           if( isbtnClicked8 == false){
          isbtnClicked8 = true;
        jButton8.setText(startGame);
         
           if(startGame.equalsIgnoreCase("X")){
           jButton8.setForeground(Color.BLUE);
        }
        else{
         jButton8.setForeground(Color.RED);
        }
     choose_Player(); 
     x++;
     Game();      draw();
           }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
           if( isbtnClicked9 == false){
          isbtnClicked9 = true;
        jButton9.setText(startGame);
         
           if(startGame.equalsIgnoreCase("X")){
          jButton9.setForeground(Color.BLUE);
        }
        else{
         jButton9.setForeground(Color.RED);
        }
     choose_Player();  x++; Game(); 
                 draw();
           }
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
