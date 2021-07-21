/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectFrame;

import java.awt.HeadlessException;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;

/**
 *
 * @author ARNAB
 */
public class ViewOwnTeacher extends javax.swing.JFrame {

    /**
     * Creates new form ViewOwnTeacher
     */
    public ViewOwnTeacher() {
        super("Institute of Information Technology, Alumni Association ");
        initComponents();
        try {
            Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/db", "root", "BokhtiarS250@");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from tst where Email = '" + LoginUser.s + "'");
            rs.next();
            fname.setText(rs.getString("Firstname"));
            lname.setText(rs.getString("Lastname"));
            phone.setText(rs.getString("Phone_No"));
            address.setText(rs.getString("Address"));
            dob.setText(rs.getString("Date_of_Birth"));
            gender.setText(rs.getString("Gender"));
            religion.setText(rs.getString("Religion"));
            bg.setText(rs.getString("Blood_Group"));
            skills.setText(rs.getString("Skills"));
            des.setText(rs.getString("Designation"));
            byte[] img = rs.getBytes("Image");
            ImageIcon image = new ImageIcon(img);
            Image im = image.getImage();
            Image myImg = im.getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon newImage = new ImageIcon(myImg);
            photo.setIcon(newImage);

        } catch (HeadlessException | SQLException ex) {
            System.out.println(ex);
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

        skills = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        religion = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        des = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        skills.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        getContentPane().add(skills, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 290, 270, 30));

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("GENDER:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 140, 70, 30));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("FIRST NAME:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, 30));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PHONE NUMBER:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 120, 30));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ADDRESS:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 70, 30));

        dob.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        getContentPane().add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 270, 30));

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("SKILLS:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 290, 60, 30));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LAST NAME:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 90, 30));

        lname.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        getContentPane().add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 270, 30));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" YOUR PHOTO:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 490, 110, 30));

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("RELIGION:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 190, 80, 30));

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("VIEW OWN INFO");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 220, 30));

        bg.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 240, 270, 30));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DATE OF BIRTH: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 120, 30));

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("DESIGNATION:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 340, 110, 30));

        phone.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 270, 30));

        religion.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        getContentPane().add(religion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 190, 270, 30));

        gender.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        gender.setToolTipText("");
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 140, 270, 30));
        getContentPane().add(photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 420, 230, 150));

        fname.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 270, 30));

        address.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 270, 30));

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("BLOOD GROUP: ");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 240, 120, 30));

        des.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        des.setToolTipText("");
        getContentPane().add(des, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 340, 270, 30));

        backbutton.setBackground(new java.awt.Color(204, 204, 255));
        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectFrame/backbutton.png"))); // NOI18N
        backbutton.setBorder(null);
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 60));

        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectFrame/background.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
        UserDashboard u=new UserDashboard();
        this.setVisible(false);
        u.setVisible(true);
    }//GEN-LAST:event_backbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(ViewOwnTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewOwnTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewOwnTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewOwnTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewOwnTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel des;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel fname;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel religion;
    private javax.swing.JLabel skills;
    // End of variables declaration//GEN-END:variables
}
