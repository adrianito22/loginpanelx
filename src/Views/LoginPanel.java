/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserRecord;

import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginPanel extends JPanel {

    private JPanel panel1;
    private JButton button6;
    private JTextField USERTextField;
    private JPasswordField dfdfhgdPasswordField;

    public LoginPanel() {
        ///initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents

   /*
    private void initComponents() {

        jPanel1 = new JPanel();
        //jPanel1.setSize(500,500);
        jLabel1 = new JLabel();
        email_field = new JTextField();
        password_field = new JPasswordField();
        jButton1 = new JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());
        jPanel1.setSize(500,500);
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("Login");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 30, 230, 60);

        email_field.setBackground(new java.awt.Color(255, 255, 255));
        email_field.setForeground(new java.awt.Color(0, 0, 0));
        email_field.setText("Email");
        email_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_fieldActionPerformed(evt);
            }
        });
        jPanel1.add(email_field);
        email_field.setBounds(130, 160, 370, 40);

        password_field.setBackground(new java.awt.Color(255, 255, 255));
        password_field.setForeground(new java.awt.Color(0, 0, 0));
        password_field.setText("jPasswordField1");
        password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_fieldActionPerformed(evt);
            }
        });
        jPanel1.add(password_field);
        password_field.setBounds(130, 210, 370, 40);

        jButton1.setBackground(new java.awt.Color(65, 80, 148));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(220, 270, 180, 30);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
*/
    private void password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_fieldActionPerformed

    private void email_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_fieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        getDataByEmail();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void getDataByEmail() {
        try {


            UserRecord userRecord = FirebaseAuth.getInstance().getUserByEmail(email_field.getText());
            var email = userRecord.getEmail();
            var name = userRecord.getDisplayName();
            var phone = userRecord.getPhoneNumber();
            var photoUrl = userRecord.getPhotoUrl();
            var uid = userRecord.getUid();

            var password = "holamundo222"; //STORE PASSWORD IN DATABSE

            System.out.println(email);
            System.out.println(phone);
            System.out.println(photoUrl);
            System.out.println(uid);

            if (password.equals(password_field.getText())) {
                JOptionPane.showMessageDialog(null, "Hello " + email);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Credentials");
            }

        } catch (FirebaseAuthException ex) {
            JOptionPane.showMessageDialog(null, "Invalid Credentials");
        }
    }







    private void recoverUserData(String uid) {
        try {
            UserRecord userRecord = FirebaseAuth.getInstance().getUser(uid);
            System.out.println("Successfully fetched user data: " + userRecord.getUid());
        } catch (FirebaseAuthException ex) {
            Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTextField email_field;
    private JButton jButton1;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private JPasswordField password_field;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
    // End of variables declaration//GEN-END:variables


}
