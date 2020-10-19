/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.ImageIcon;
/**
 *

 */
public class CalcSalary extends javax.swing.JFrame {
Connection conn;
PreparedStatement pst;
ResultSet rs;

    /**
     * Creates new form CalcSalary
     */
    public CalcSalary() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
       
        this.setTitle("  EMPLOYEE PAYROLL MANAGEMENT SYSTEM - CALCULATE SALARY");
        ImageIcon img = new ImageIcon("images/logomini.png");
        this.setIconImage(img.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_empid = new javax.swing.JTextField();
        txt_firstname = new javax.swing.JTextField();
        txt_dob = new javax.swing.JTextField();
        txt_salary = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txt_surname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_department = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        r_percentage = new javax.swing.JRadioButton();
        r_amount = new javax.swing.JRadioButton();
        txt_d2 = new javax.swing.JTextField();
        txt_d1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 69, 64));
        jLabel1.setText("EMPLOYEE ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 33));

        txt_search.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        getContentPane().add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 259, 33));

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 69, 64));
        jLabel2.setText("EMPLOYEE ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 106, 22));

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 69, 64));
        jLabel3.setText("FIRSTNAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 106, 22));

        txt_empid.setEditable(false);
        txt_empid.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        getContentPane().add(txt_empid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 113, 30));

        txt_firstname.setEditable(false);
        txt_firstname.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        getContentPane().add(txt_firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 113, 30));

        txt_dob.setEditable(false);
        txt_dob.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        getContentPane().add(txt_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 113, 30));

        txt_salary.setEditable(false);
        txt_salary.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        getContentPane().add(txt_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 113, 30));

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 69, 64));
        jLabel6.setText("DATE OF BIRTH");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 130, 22));

        jLabel7.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 69, 64));
        jLabel7.setText("BASE SALARY");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, 22));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 70));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(238, 69, 64));
        jLabel10.setText("AMOUNT");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 89, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(238, 69, 64));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/update.png"))); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, 170, 60));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_surname.setEditable(false);
        txt_surname.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jPanel3.add(txt_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 113, 30));

        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 69, 64));
        jLabel4.setText("SURNAME");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 92, 22));

        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 69, 64));
        jLabel5.setText("DEPARTMENT");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, 22));

        txt_department.setEditable(false);
        txt_department.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jPanel3.add(txt_department, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 113, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 570, 210));

        jLabel8.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(238, 69, 64));
        jLabel8.setText("UPDATE SALARY BY:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 160, 50));

        r_percentage.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        r_percentage.setForeground(new java.awt.Color(238, 69, 64));
        r_percentage.setText("PERCENTAGE (%)");
        r_percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_percentageActionPerformed(evt);
            }
        });
        jPanel1.add(r_percentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, 30));

        r_amount.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        r_amount.setForeground(new java.awt.Color(238, 69, 64));
        r_amount.setText("AMOUNT");
        r_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_amountActionPerformed(evt);
            }
        });
        jPanel1.add(r_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, 30));

        txt_d2.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jPanel1.add(txt_d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 96, 34));

        txt_d1.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jPanel1.add(txt_d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 96, 34));

        jLabel9.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(238, 69, 64));
        jLabel9.setText("PERCENTAGE");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 116, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 570, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // TODO add your handling code here:
        try{
            
           conn = DriverManager.getConnection("jdbc:mysql://localhost/payroll manager?serverTimezone=UTC","root","");
           String sql = "select * from infoStaff where id=?";
           
           pst = conn.prepareStatement(sql);
           pst.setString(1, txt_search.getText());
           rs=pst.executeQuery();
           
           if(rs.next()){
           String add1 = rs.getString("id");
           txt_empid.setText(add1);
           
           String add2 = rs.getString("first_name");
           txt_firstname.setText(add2);
           
           String add3 = rs.getString("surname");
           txt_surname.setText(add3);
           
           String add4 = rs.getString("Dob");
           txt_dob.setText(add4);
           
           String add5 = rs.getString("Salary");
           txt_salary.setText(add5);
           
           String add6 = rs.getString("Department");
           txt_department.setText(add6);
        
        
           }
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        }
        finally
        {
         try{
        rs.close();
        pst.close();
        }
        catch(Exception e)
        {
            
        JOptionPane.showMessageDialog(null,e);
        
        }
        
        }
        
    }//GEN-LAST:event_txt_searchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
          int salary = Integer.parseInt(txt_salary.getText());
          
      
         
          if(r_percentage.isSelected()==true){
          int getPercentage = Integer.parseInt(txt_d1.getText());
          int calcPercentage = salary/100 * getPercentage +salary;
          String xP = String.valueOf(calcPercentage);
          txt_salary.setText(xP);
          }
          else{
          int getAmt = Integer.parseInt(txt_d2.getText());
          int calcAmount = salary +getAmt;
          String xA = String.valueOf(calcAmount);
          txt_salary.setText(xA);
          }
      
         try{
          conn = DriverManager.getConnection("jdbc:mysql://localhost/payroll manager?serverTimezone=UTC","root","");
             String value1 = txt_empid.getText();
             String value2 = txt_salary.getText();
             
             String sql ="update infostaff set id = '"+value1+"', salary = '"+value2+"' where id = '"+value1+"' ";
             pst = conn.prepareStatement(sql);
             pst.execute();
             JOptionPane.showMessageDialog(null, "Record Updated");
             
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        } finally
        {
         try{
        rs.close();
        pst.close();
        }
        catch(Exception e)
        {
            
        JOptionPane.showMessageDialog(null,e);
        
        }
        
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void r_percentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_percentageActionPerformed
        // TODO add your handling code here:
        r_amount.setSelected(false);
        r_percentage.setSelected(true);
        txt_d1.setEnabled(true);
        txt_d2.setEnabled(false);
        txt_d2.setText("");
        
    }//GEN-LAST:event_r_percentageActionPerformed

    private void r_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_amountActionPerformed
        // TODO add your handling code here:
        r_amount.setSelected(true);
        r_percentage.setSelected(false);
        txt_d1.setEnabled(false);
        txt_d2.setEnabled(true);
        txt_d1.setText("");
    }//GEN-LAST:event_r_amountActionPerformed

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
            java.util.logging.Logger.getLogger(CalcSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcSalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton r_amount;
    private javax.swing.JRadioButton r_percentage;
    private javax.swing.JTextField txt_d1;
    private javax.swing.JTextField txt_d2;
    private javax.swing.JTextField txt_department;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_empid;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_surname;
    // End of variables declaration//GEN-END:variables
}