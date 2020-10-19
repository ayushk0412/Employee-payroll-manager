/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package payroll;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Deduction extends javax.swing.JFrame {
Connection conn;
ResultSet rs;
PreparedStatement pst;
    /**
     * Creates new form Deduction
     */
    public Deduction() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
       
        this.setTitle("  EMPLOYEE PAYROLL MANAGEMENT SYSTEM - SALARY DEDUCTION");
        ImageIcon img = new ImageIcon("images/logomini.png");
        this.setIconImage(img.getImage());
        txt_user.setText(String.valueOf(DisplayUsername.userID).toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        lbl_total1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txt_id = new javax.swing.JTextField();
        txt_firstname = new javax.swing.JTextField();
        txt_surname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_status = new javax.swing.JTextField();
        txt_salary = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_designation = new javax.swing.JTextField();
        txt_search = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_dob = new javax.swing.JTextField();
        txt_dep = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_job = new javax.swing.JTextField();
        txt_doj = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txt_user = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        r_percentage = new javax.swing.JRadioButton();
        r_amount = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        lbl_sal = new javax.swing.JLabel();
        txt_d2 = new javax.swing.JTextField();
        txt_d1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_reason = new javax.swing.JTextField();

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel17.setText("TOTAL DEDUCTION:");

        lbl_total1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl_total1.setText("0.00");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        txt_id.setForeground(new java.awt.Color(238, 69, 64));
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 113, 30));

        txt_firstname.setEditable(false);
        txt_firstname.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        txt_firstname.setForeground(new java.awt.Color(238, 69, 64));
        getContentPane().add(txt_firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 113, 30));

        txt_surname.setEditable(false);
        txt_surname.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        txt_surname.setForeground(new java.awt.Color(238, 69, 64));
        getContentPane().add(txt_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 113, 30));

        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 69, 64));
        jLabel5.setText("DESIGNATION");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 160, 22));

        txt_status.setEditable(false);
        txt_status.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        txt_status.setForeground(new java.awt.Color(238, 69, 64));
        getContentPane().add(txt_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 113, 30));

        txt_salary.setEditable(false);
        txt_salary.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        txt_salary.setForeground(new java.awt.Color(238, 69, 64));
        getContentPane().add(txt_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 113, 30));

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 69, 64));
        jLabel1.setText("EMPLOYEE ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 150, 33));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(238, 69, 64));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/calculate.png"))); // NOI18N
        jButton1.setText("CALCULATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 650, 170, 60));

        txt_designation.setEditable(false);
        txt_designation.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        txt_designation.setForeground(new java.awt.Color(238, 69, 64));
        getContentPane().add(txt_designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 113, 30));

        txt_search.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        txt_search.setForeground(new java.awt.Color(238, 69, 64));
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        getContentPane().add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 259, 33));

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 69, 64));
        jLabel6.setText("STATUS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 110, 22));

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 69, 64));
        jLabel2.setText("EMPLOYEE ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 160, 22));

        jLabel7.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 69, 64));
        jLabel7.setText("BASE SALARY");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 140, 22));

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 69, 64));
        jLabel3.setText("FIRSTNAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 160, 22));

        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 69, 64));
        jLabel4.setText("SURNAME");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 160, 22));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(238, 69, 64));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/clear.png"))); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 650, 150, 60));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(238, 69, 64));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/save.png"))); // NOI18N
        jButton3.setText("SAVE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 650, 150, 60));

        jLabel11.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(238, 69, 64));
        jLabel11.setText("DOB");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 160, 22));

        jLabel12.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(238, 69, 64));
        jLabel12.setText("DEPARTMENT");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 160, 22));

        txt_dob.setEditable(false);
        txt_dob.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        txt_dob.setForeground(new java.awt.Color(238, 69, 64));
        getContentPane().add(txt_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 113, 30));

        txt_dep.setEditable(false);
        txt_dep.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        txt_dep.setForeground(new java.awt.Color(238, 69, 64));
        getContentPane().add(txt_dep, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 110, 30));

        jLabel13.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(238, 69, 64));
        jLabel13.setText("DATE HIRED");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 160, 22));

        txt_job.setEditable(false);
        txt_job.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        txt_job.setForeground(new java.awt.Color(238, 69, 64));
        getContentPane().add(txt_job, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 113, 30));

        txt_doj.setEditable(false);
        txt_doj.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        txt_doj.setForeground(new java.awt.Color(238, 69, 64));
        getContentPane().add(txt_doj, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 113, 30));

        jLabel14.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(238, 69, 64));
        jLabel14.setText("JOB TITLE");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 110, 22));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 798, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 800, 280));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(238, 69, 64));
        jLabel19.setText("LOGGED IN AS: ");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 680, 120, -1));

        txt_user.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        txt_user.setForeground(new java.awt.Color(238, 69, 64));
        txt_user.setText("emp");
        jPanel1.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 680, 80, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(238, 69, 64));
        jLabel8.setText("UPDATE SALARY BY:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 160, -1));

        r_percentage.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        r_percentage.setForeground(new java.awt.Color(238, 69, 64));
        r_percentage.setText("PERCENTAGE (%)");
        r_percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_percentageActionPerformed(evt);
            }
        });
        jPanel4.add(r_percentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        r_amount.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        r_amount.setForeground(new java.awt.Color(238, 69, 64));
        r_amount.setText("AMOUNT");
        r_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_amountActionPerformed(evt);
            }
        });
        jPanel4.add(r_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 100, -1));

        jLabel16.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(238, 69, 64));
        jLabel16.setText("TOTAL DEDUCTION");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 170, -1));

        jLabel18.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(238, 69, 64));
        jLabel18.setText("SALARY AFTER DEDUCTION");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 220, 20));

        lbl_total.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        lbl_total.setForeground(new java.awt.Color(238, 69, 64));
        lbl_total.setText("0.00");
        jPanel4.add(lbl_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 110, -1));

        lbl_sal.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        lbl_sal.setForeground(new java.awt.Color(238, 69, 64));
        lbl_sal.setText("0.00");
        jPanel4.add(lbl_sal, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 110, 20));

        txt_d2.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        txt_d2.setForeground(new java.awt.Color(238, 69, 64));
        jPanel4.add(txt_d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 96, 30));

        txt_d1.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        txt_d1.setForeground(new java.awt.Color(238, 69, 64));
        jPanel4.add(txt_d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 96, 30));

        jLabel10.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(238, 69, 64));
        jLabel10.setText("AMOUNT");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 80, 50));

        jLabel9.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(238, 69, 64));
        jLabel9.setText("PERCENTAGE");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 110, 50));

        jLabel15.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(238, 69, 64));
        jLabel15.setText("REASON");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 89, 33));

        txt_reason.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        txt_reason.setForeground(new java.awt.Color(238, 69, 64));
        txt_reason.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_reasonKeyReleased(evt);
            }
        });
        jPanel4.add(txt_reason, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 391, 33));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 800, 240));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_amountActionPerformed
        // TODO add your handling code here:
        r_amount.setSelected(true);
        r_percentage.setSelected(false);
        txt_d1.setEnabled(false);
        txt_d2.setEnabled(true);
        txt_d1.setText("");
    }//GEN-LAST:event_r_amountActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

       

         int salary = Integer.parseInt(txt_salary.getText());
        
         if(r_percentage.isSelected()== true){
        int percentage = Integer.parseInt(txt_d1.getText());
        //calculate the total hours of overtime
        int total_percentage_deduction = salary /100 * percentage;
        String x = String.valueOf(total_percentage_deduction);
        int sal = salary - total_percentage_deduction;
        lbl_total.setText(x);
        lbl_sal.setText(String.valueOf(sal));
         }
        
        if(r_amount.isSelected()== true){
        int deduction = Integer.parseInt(txt_d2.getText());
        //calculate the total hours of overtime
        int total_amount_deduction =  salary - deduction;
        String s = String.valueOf(total_amount_deduction);
       
        lbl_sal.setText(s);
        lbl_total.setText(String.valueOf(deduction));

}


    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // TODO add your handling code here:
      

  try{
 conn = DriverManager.getConnection("jdbc:mysql://localhost/payroll manager?serverTimezone=UTC","root","");
            String sql ="select * from infostaff where id=? ";

            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_search.getText());
            rs=pst.executeQuery();
if(rs.next()){
            String add1 =rs.getString("id");
            txt_id.setText(add1);

            String add2 =rs.getString("first_name");
            txt_firstname.setText(add2);

            String add3 =rs.getString("surname");
            txt_surname.setText(add3);

            String add4 =rs.getString("Dob");
            txt_dob.setText(add4);

            String add5 =rs.getString("Department");
            txt_dep.setText(add5);

            String add7 =rs.getString("Salary");
            txt_salary.setText(add7);

            String add8 =rs.getString("Status");
            txt_status.setText(add8);

            String add9 =rs.getString("Date_hired");
            txt_doj.setText(add9);

            String add10 =rs.getString("job_title");
            txt_job.setText(add10);

            String add17 =rs.getString("Designation");
            txt_designation.setText(add17);
}
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No Data");
        }
        finally {

            try{

                rs.close();
                pst.close();

            }
            catch(Exception e){

            }
        }

    }//GEN-LAST:event_txt_searchKeyReleased

    private void r_percentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_percentageActionPerformed
        // TODO add your handling code here:
        r_amount.setSelected(false);
        r_percentage.setSelected(true);
        txt_d1.setEnabled(true);
        txt_d2.setEnabled(false);
        txt_d2.setText("");

    }//GEN-LAST:event_r_percentageActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        

        txt_id.setText("");
        txt_firstname.setText("");
        txt_surname.setText("");
        txt_dob.setText("");
        txt_dep.setText("");
        txt_status.setText("");
        txt_salary.setText("");
        txt_designation.setText("");
        txt_job.setText("");
        txt_doj.setText("");
        lbl_total.setText("0.00");
        txt_d1.setText("");
        txt_d2.setText("");
        txt_reason.setText("");
        txt_search.setText("");
        lbl_sal.setText("0.00");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to add record?","Add Record",JOptionPane.YES_NO_OPTION);
        if(p==0){

              String value3 = txt_user.getText();
            try {
 conn = DriverManager.getConnection("jdbc:mysql://localhost/payroll manager?serverTimezone=UTC","root","");
                String sql ="insert into Deduction (firstname,surname,salary,deduction_amount,deduction_reason,emp_id,made_by) values (?,?,?,?,?,?,'"+value3+"')";
                pst=conn.prepareStatement(sql);
                pst.setString(1,txt_firstname.getText());
                pst.setString(2,txt_surname.getText());
                pst.setString(3,txt_salary.getText());
                pst.setString(4,lbl_total.getText());
                pst.setString(5,txt_reason.getText());
                pst.setString(6,txt_id.getText());
  
                pst.execute();
                JOptionPane.showMessageDialog(null,"Data is saved successfully");

            }
            catch (Exception e)

            {
                JOptionPane.showMessageDialog(null,e);
            }
           
         finally {

                try{
                    rs.close();
                    pst.close();

                }
                 catch(Exception e){
                   JOptionPane.showMessageDialog(null,e);
                }
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_reasonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_reasonKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_reasonKeyReleased

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
            java.util.logging.Logger.getLogger(Deduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deduction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_sal;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JLabel lbl_total1;
    private javax.swing.JRadioButton r_amount;
    private javax.swing.JRadioButton r_percentage;
    private javax.swing.JTextField txt_d1;
    private javax.swing.JTextField txt_d2;
    private javax.swing.JTextField txt_dep;
    private javax.swing.JTextField txt_designation;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_doj;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_job;
    private javax.swing.JTextField txt_reason;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_surname;
    private javax.swing.JLabel txt_user;
    // End of variables declaration//GEN-END:variables
}