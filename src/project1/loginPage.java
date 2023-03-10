/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import dataaccessobjects.Userdao;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author TOMMOGO
 */
public class loginPage extends javax.swing.JFrame {
    //String EmailPattern="[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$\n" + "^[0-9]*$";

    /**
     * Creates new form loginPage
     */
    public loginPage() {
        initComponents();
        btnlogin.setEnabled(false);
    }
    public void clear(){
        txtemail.setText("");
        txtpass.setText("");
        btnlogin.setEnabled(true);
    }
    public void validateFields(){
        String Email=txtemail.getText();
        String password=txtpass.getText();
        if(!Email.equals("")&& !password.equals("")){
            btnlogin.setEnabled(true);
        }
        else{
            btnlogin.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        btnfgpass = new javax.swing.JButton();
        btnsu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        checkboxPass = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/background.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/small-page-background.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/order5.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.orange);
        setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Email");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(223, 18, 18));
        jLabel3.setText("Login");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemailKeyReleased(evt);
            }
        });
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 270, -1));

        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpassKeyReleased(evt);
            }
        });
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 280, -1));

        btnlogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(0, 0, 0));
        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/save.png"))); // NOI18N
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 279, -1, -1));

        btnclear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnclear.setForeground(new java.awt.Color(0, 0, 0));
        btnclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/clear.png"))); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        btnexit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnexit.setForeground(new java.awt.Color(0, 0, 0));
        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/exit.png"))); // NOI18N
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        getContentPane().add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, -1));

        btnfgpass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnfgpass.setForeground(new java.awt.Color(0, 0, 0));
        btnfgpass.setText("Forgot Password");
        btnfgpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfgpassActionPerformed(evt);
            }
        });
        getContentPane().add(btnfgpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 364, -1, -1));

        btnsu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsu.setForeground(new java.awt.Color(0, 0, 0));
        btnsu.setText("Sign Up");
        btnsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuActionPerformed(evt);
            }
        });
        getContentPane().add(btnsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 40, 30));

        checkboxPass.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        checkboxPass.setText("Show Password");
        checkboxPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxPassActionPerformed(evt);
            }
        });
        getContentPane().add(checkboxPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/order5.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 760, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
        String Email=txtemail.getText();
        String Password=txtpass.getText();
        User  user=null;
        user= Userdao.Login(Email, Password);
        if(user==null)
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:blue\">Incorrect Password or Username</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        else{
            if(user.getStatus().equals("false")){
                ImageIcon icon= new ImageIcon("srs/popupicon/wait.png");
                JOptionPane.showMessageDialog(null, "<html><b>Wait for Admin Approval</b></html>","Message",JOptionPane.INFORMATION_MESSAGE,icon);
                clear();
            }
            if (user.getStatus().equals("true")){
                setVisible(false);
                new HomePage(Email).setVisible(true);
            }
            //connection();
        
        }
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
int y=JOptionPane.showConfirmDialog(null,"Confirm you want to exit!!?","Thank you",JOptionPane.YES_NO_OPTION);
if(y==0)
{
    System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btnexitActionPerformed
    }
    private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyReleased
validateFields();
    }//GEN-LAST:event_txtemailKeyReleased

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnclearActionPerformed

    private void txtpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtpassKeyReleased

    private void btnsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new signuppage().setVisible(true);
    }//GEN-LAST:event_btnsuActionPerformed

    private void btnfgpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfgpassActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ForgotPassword().setVisible(true);
    }//GEN-LAST:event_btnfgpassActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void checkboxPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxPassActionPerformed
        // TODO add your handling code here:
        if(checkboxPass.isSelected()){
            txtpass.setEchoChar((char)0);
            
        }
        else{
            txtpass.setEchoChar(('*'));}
    }//GEN-LAST:event_checkboxPassActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new loginPage().setVisible(true);
        });
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
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnfgpass;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnsu;
    private javax.swing.JCheckBox checkboxPass;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables

}
