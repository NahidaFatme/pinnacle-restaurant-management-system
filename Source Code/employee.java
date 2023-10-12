/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pinnacle.cafe;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.*;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author hp
 */
public class employee extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public employee() {
        initComponents();
        /**
         * try{ Class.forName("com.mysql.cj.jdbc.Driver");
         * cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pinnacle?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
         * st=(Statement) cn.createStatement();
         * JOptionPane.showMessageDialog(null, "connected"); }
         * catch(HeadlessException | ClassNotFoundException | SQLException e) {
         * JOptionPane.showMessageDialog(null, "Not connected"); }
         */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jbtnexit = new javax.swing.JButton();
        jbtnupdate = new javax.swing.JButton();
        jbtnreset = new javax.swing.JButton();
        jbtndelete = new javax.swing.JButton();
        jbtnadd1 = new javax.swing.JButton();
        jBtnshwlst = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jlname = new javax.swing.JLabel();
        jTextName = new javax.swing.JTextField();
        jlid = new javax.swing.JLabel();
        jTextID = new javax.swing.JTextField();
        jldesignation = new javax.swing.JLabel();
        jTextDesignation = new javax.swing.JTextField();
        jlnumber = new javax.swing.JLabel();
        jTextNumber = new javax.swing.JTextField();
        jlemail = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jlsalary = new javax.swing.JLabel();
        jTextSalary = new javax.swing.JTextField();
        jljoiningdate = new javax.swing.JLabel();
        jTextJoiningDate = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(99, 112, 248));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnexit.setBackground(new java.awt.Color(255, 255, 255));
        jbtnexit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnexit.setForeground(new java.awt.Color(99, 112, 248));
        jbtnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        jbtnexit.setText("Exit");
        jbtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnexitActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 140, 50));

        jbtnupdate.setBackground(new java.awt.Color(255, 255, 255));
        jbtnupdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnupdate.setForeground(new java.awt.Color(99, 112, 248));
        jbtnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update icon.png"))); // NOI18N
        jbtnupdate.setText("Update");
        jbtnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnupdateActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 140, 50));

        jbtnreset.setBackground(new java.awt.Color(255, 255, 255));
        jbtnreset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnreset.setForeground(new java.awt.Color(99, 112, 248));
        jbtnreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/undo.png"))); // NOI18N
        jbtnreset.setText("Reset");
        jbtnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnresetActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 140, 50));

        jbtndelete.setBackground(new java.awt.Color(255, 255, 255));
        jbtndelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtndelete.setForeground(new java.awt.Color(99, 112, 248));
        jbtndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete_16x16.gif"))); // NOI18N
        jbtndelete.setText("Delete");
        jbtndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndeleteActionPerformed(evt);
            }
        });
        jPanel2.add(jbtndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 140, 50));

        jbtnadd1.setBackground(new java.awt.Color(255, 255, 255));
        jbtnadd1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnadd1.setForeground(new java.awt.Color(99, 112, 248));
        jbtnadd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Save-icon.png"))); // NOI18N
        jbtnadd1.setText("ADD");
        jbtnadd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnadd1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnadd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 140, 50));

        jBtnshwlst.setBackground(new java.awt.Color(255, 255, 255));
        jBtnshwlst.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBtnshwlst.setForeground(new java.awt.Color(99, 112, 248));
        jBtnshwlst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/list.png"))); // NOI18N
        jBtnshwlst.setText("Show list");
        jBtnshwlst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnshwlstActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnshwlst, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, 50));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(99, 112, 248));
        jButton1.setText("Update payment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 140, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, 200, 610));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(99, 112, 248), 5, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 8, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, 180, 350));

        jlname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlname.setText("Name:");
        jPanel3.add(jlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jTextName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel3.add(jTextName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 520, -1));

        jlid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlid.setText("ID:");
        jPanel3.add(jlid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jTextID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel3.add(jTextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 520, -1));

        jldesignation.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jldesignation.setText("Designation:");
        jPanel3.add(jldesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jTextDesignation.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel3.add(jTextDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 520, -1));

        jlnumber.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlnumber.setText("Number:");
        jPanel3.add(jlnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jTextNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel3.add(jTextNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 430, -1));

        jlemail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlemail.setText("Email:");
        jPanel3.add(jlemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jTextEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailActionPerformed(evt);
            }
        });
        jPanel3.add(jTextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 520, -1));

        jlsalary.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlsalary.setText("Salary:");
        jPanel3.add(jlsalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jTextSalary.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel3.add(jTextSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 520, -1));

        jljoiningdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jljoiningdate.setText("Joining date:");
        jPanel3.add(jljoiningdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jTextJoiningDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextJoiningDate.setText("yy-mm-dd");
        jTextJoiningDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextJoiningDateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextJoiningDateFocusLost(evt);
            }
        });
        jPanel3.add(jTextJoiningDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 520, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setText("+880");
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 80, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 730, 340));

        jPanel5.setBackground(new java.awt.Color(99, 112, 248));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee List");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 250, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu.png"))); // NOI18N
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 20, 30, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 30, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 70));

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.orange, null, null));
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Designation", "Number", "Email", "Salary", "Joining date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 730, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void jbtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnexitActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Are you sure?", "MySQL connector",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }


    }//GEN-LAST:event_jbtnexitActionPerformed

    private void jbtnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnupdateActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to update?","Update Record",JOptionPane.YES_NO_OPTION);
        if(x==0){
        try {
             
            if(jTextID.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please enter ID to update");
                con.close();
           }
            else{
                
            
            String sql = "UPDATE employee_list SET Name=?, Designation=?, Number=?, Email=?, Salary=?, Joining_date=? WHERE ID= ?";

            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pinnacle", "root", "");
            pst = (PreparedStatement) con.prepareStatement(sql);

            pst.setString(1, jTextName.getText());
            pst.setString(2, jTextDesignation.getText());
            pst.setString(3, jTextNumber.getText());
            pst.setString(4, jTextEmail.getText());
            pst.setString(5, jTextSalary.getText());
            pst.setString(6, jTextJoiningDate.getText());
            pst.setString(7, jTextID.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated succesfully");
            }

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        showTableData();
        }
    }//GEN-LAST:event_jbtnupdateActionPerformed

    private void jbtnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnresetActionPerformed
        jTextID.setText("");
        jTextName.setText("");
        jTextDesignation.setText("");
        jTextNumber.setText("");
        jTextEmail.setText("");
        jTextSalary.setText("");
        jTextJoiningDate.setText("");


    }//GEN-LAST:event_jbtnresetActionPerformed

    private void jbtndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndeleteActionPerformed
        
        int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?","Update Record",JOptionPane.YES_NO_OPTION);
        if(x==0){
try {
    
           if(jTextID.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please enter ID to delete");
                con.close();
            }
           
           else{
            String sql = "DELETE FROM employee_list WHERE ID = ?";
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pinnacle", "root", "");
            
            //con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pinnacle", "root", "");
            pst = (PreparedStatement) con.prepareStatement(sql);
            pst.setString(1, jTextID.getText());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted succesfully");
           }

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        showTableData();

  }


    }//GEN-LAST:event_jbtndeleteActionPerformed

    private void jTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmailActionPerformed

    private void jbtnadd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnadd1ActionPerformed
        
        int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to add record?","Update Record",JOptionPane.YES_NO_OPTION);
        if(x==0){

        try {
            
            if(jTextID.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please enter ID and other fields");
                con.close();
           } 
            else{
                
            String sql = "INSERT INTO employee_list"
                    + "(ID, Name, Designation, Number, Email, Salary, Joining_date)"
                    + "VALUES (?,?,?,?,?,?,?)";

            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pinnacle", "root", "");
            pst = (PreparedStatement) con.prepareStatement(sql);
            //pst.setString(1, jTextID.getText());
            pst.setString(1, jTextID.getText());
            pst.setString(2, jTextName.getText());
            pst.setString(3, jTextDesignation.getText());
            pst.setString(4, jTextNumber.getText());
            pst.setString(5, jTextEmail.getText());
            pst.setString(6, jTextSalary.getText());
            pst.setString(7, jTextJoiningDate.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Added succesfully");
            }

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        showTableData();
        }
    }//GEN-LAST:event_jbtnadd1ActionPerformed

    private void jBtnshwlstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnshwlstActionPerformed
        showTableData();
    }//GEN-LAST:event_jBtnshwlstActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pay jf2= new pay();
        jf2.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here: remove button code
        dispose();
        dashboard dd = new dashboard();
        dd.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jTextJoiningDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextJoiningDateFocusGained
        // TODO add your handling code here:
        if(jTextJoiningDate.getText().equals("yy-mm-dd"))
       {
           jTextJoiningDate.setText("");
           jTextJoiningDate.setForeground(new Color(0,0,0));
       }
    }//GEN-LAST:event_jTextJoiningDateFocusGained

    private void jTextJoiningDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextJoiningDateFocusLost
        // TODO add your handling code here:
        if(jTextJoiningDate.getText().equals(""))
       {
           jTextJoiningDate.setText("yy-mm-dd");
           jTextJoiningDate.setForeground(new Color(0,0,0));
       }
    }//GEN-LAST:event_jTextJoiningDateFocusLost

    private void showTableData() {

        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pinnacle", "root", "");
            String sql = "SELECT * FROM Employee_list";
            pst = (PreparedStatement) con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

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
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new employee().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnshwlst;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextDesignation;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextJoiningDate;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextNumber;
    private javax.swing.JTextField jTextSalary;
    private javax.swing.JButton jbtnadd1;
    private javax.swing.JButton jbtndelete;
    private javax.swing.JButton jbtnexit;
    private javax.swing.JButton jbtnreset;
    private javax.swing.JButton jbtnupdate;
    private javax.swing.JLabel jldesignation;
    private javax.swing.JLabel jlemail;
    private javax.swing.JLabel jlid;
    private javax.swing.JLabel jljoiningdate;
    private javax.swing.JLabel jlname;
    private javax.swing.JLabel jlnumber;
    private javax.swing.JLabel jlsalary;
    // End of variables declaration//GEN-END:variables

}