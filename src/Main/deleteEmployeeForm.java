/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import javax.swing.JOptionPane;

/**
 *
 * @author Cyberland Computers
 */
public class deleteEmployeeForm extends javax.swing.JFrame {

    /**
     * Creates new form deleteEmployeeForm
     */
    public deleteEmployeeForm() {
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

        mainPanel = new javax.swing.JPanel();
        centrePanel = new javax.swing.JPanel();
        p2_deleteEmployee = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        txtempid = new javax.swing.JTextField();
        txtempname = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        btndeleteEmployee = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        header2 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mainPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 2, new java.awt.Color(153, 153, 153)));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        centrePanel.setLayout(new java.awt.CardLayout());

        jLabel60.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(153, 153, 153));
        jLabel60.setText("Employee ID:");

        txtempid.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        txtempid.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(153, 153, 153)));
        txtempid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtempidActionPerformed(evt);
            }
        });

        txtempname.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        txtempname.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(153, 153, 153)));
        txtempname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtempnameActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(153, 153, 153));
        jLabel62.setText("Employee Name:");

        btndeleteEmployee.setBackground(new java.awt.Color(255, 102, 204));
        btndeleteEmployee.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btndeleteEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btndeleteEmployee.setText("Delete Employee");
        btndeleteEmployee.setBorderPainted(false);
        btndeleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteEmployeeActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 0, 51));
        jButton5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Go Back");
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p2_deleteEmployeeLayout = new javax.swing.GroupLayout(p2_deleteEmployee);
        p2_deleteEmployee.setLayout(p2_deleteEmployeeLayout);
        p2_deleteEmployeeLayout.setHorizontalGroup(
            p2_deleteEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2_deleteEmployeeLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addGroup(p2_deleteEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtempname, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p2_deleteEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel60)
                        .addComponent(txtempid, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel62))
                    .addGroup(p2_deleteEmployeeLayout.createSequentialGroup()
                        .addGroup(p2_deleteEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btndeleteEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(117, 117, 117)))
                .addContainerGap(251, Short.MAX_VALUE))
        );
        p2_deleteEmployeeLayout.setVerticalGroup(
            p2_deleteEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2_deleteEmployeeLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel60)
                .addGap(18, 18, 18)
                .addComponent(txtempid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtempname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btndeleteEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        centrePanel.add(p2_deleteEmployee, "card7");

        mainPanel.add(centrePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-11, 35, 910, 560));

        header2.setBackground(new java.awt.Color(255, 102, 204));
        header2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        header2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Delete Employee");
        header2.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, -1));

        mainPanel.add(header2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtempidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtempidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtempidActionPerformed

    private void txtempnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtempnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtempnameActionPerformed

    private void btndeleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteEmployeeActionPerformed
        try{
        String name = txtempname.getText();
        int id = Integer.parseInt(txtempid.getText());
        Employee e = new Employee();
        if(e.remEmp(name, id)){
            JOptionPane.showMessageDialog(null, "Removed");
        }else{
            JOptionPane.showMessageDialog(null, "Error");
        }
        Employee.empInUse.setEmpName("");
        Employee.empInUse.setEmpId(0);
        Employee.empInUse.setEmpAccessLevel(0);
        Employee.empInUse.setEmpDesignation("");
        Employee.empInUse.setEmpSalary("");
        Employee.empInUse.setEmpPassword("");
        Employee.empInUse.setEmpContact("");
        dispose();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Empty fields found");
        }
    }//GEN-LAST:event_btndeleteEmployeeActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(deleteEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deleteEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deleteEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deleteEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deleteEmployeeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndeleteEmployee;
    private javax.swing.JPanel centrePanel;
    private javax.swing.JPanel header2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel p2_deleteEmployee;
    private javax.swing.JTextField txtempid;
    private javax.swing.JTextField txtempname;
    // End of variables declaration//GEN-END:variables
}
