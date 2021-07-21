/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectFrame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ARNAB
 */
public class SearchTeacher extends javax.swing.JFrame {
 String radio;
    /**
     * Creates new form SearchTeacher
     */
    public SearchTeacher() {
        super("Institute of Information Technology, Alumni Association ");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fname = new javax.swing.JRadioButton();
        skills = new javax.swing.JRadioButton();
        skey = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setText("SEARCH  ANY TEACHER ");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("SEARCH KEY: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 130, -1));

        buttonGroup1.add(fname);
        fname.setText("FIRST NAME");
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 120, -1));

        buttonGroup1.add(skills);
        skills.setText("SKILLS");
        skills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skillsActionPerformed(evt);
            }
        });
        getContentPane().add(skills, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 140, -1));

        skey.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        skey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skeyActionPerformed(evt);
            }
        });
        getContentPane().add(skey, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 300, 30));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("SEARCH RESULTS :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        btnsearch.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        btnsearch.setText("SEARCH");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        jScrollPane1.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Email", "First Name", "Last Name", "Phone No", "Address", "Date of Birth", "Gender", "Religion", "Blood Group", "Skills", "Designation"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 1350, 410));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("SEARCH BY :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton1.setText("CLEAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 630, -1, -1));

        backbutton.setBackground(new java.awt.Color(204, 204, 255));
        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectFrame/backbutton.png"))); // NOI18N
        backbutton.setBorder(null);
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 60));

        background.setForeground(new java.awt.Color(204, 255, 204));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectFrame/background.jpg"))); // NOI18N
        background.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void skillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skillsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_skillsActionPerformed

    private void skeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_skeyActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        try{
        Connection con = DriverManager.getConnection(
                       "jdbc:mysql://localhost:3306/db", "root", "BokhtiarS250@");
            Statement st=con.createStatement();
             ResultSet rs;
           if(fname.isSelected())
        {
            radio="`Firstname`";
        }
            if(skills.isSelected())
        {
            radio="`Skills`";
        }
     
         rs=st.executeQuery("SELECT `Email`, `Firstname`, `Lastname`, `Phone_No`, `Address`, `Date_of_Birth`, `Gender`, `Religion`, `Blood_Group`, `Skills`, `Designation` FROM `tst` WHERE "+radio+ "LIKE" +"'%"+skey.getText()+"%'");
     
                    DefaultTableModel tb=(DefaultTableModel)jTable1.getModel();
           while(rs.next())
            {    String email=rs.getString("Email");
                 String Fname=rs.getString("Firstname");
                 String Lname=rs.getString("Lastname");
                 String Phone=rs.getString("Phone_No");
                 String Address=rs.getString("Address");
        
                 String Dob=rs.getString("Date_of_Birth");
                
                 String Gender=rs.getString("Gender");
                 String Religion=rs.getString("Religion");
                 String Blood=rs.getString("Blood_Group");
                 String Skills=rs.getString("Skills");
                 String Designation=rs.getString("Designation");      
//                 byte[] img = rs.getBytes("Image");
//                 ImageIcon image = new ImageIcon(img);
//                Image im = image.getImage();
                //Image myImg = im.getScaledInstance(.getWidth(), .getHeight(), Image.SCALE_SMOOTH);
               // ImageIcon newImage = new ImageIcon(myImg);
//               /.setIcon(newImage);
                // Resize The ImageIcon
                Object[] data={email,Fname,Lname,Phone,Address,Dob,Gender,Religion,Blood,Skills,Designation};
                
                  tb.addRow(data);
                
            }
          
         skey.setText(""); 
           
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SearchStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tb=(DefaultTableModel)jTable1.getModel();
         tb.getDataVector().removeAllElements();
           tb.fireTableDataChanged();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SearchTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnsearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField skey;
    private javax.swing.JRadioButton skills;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
