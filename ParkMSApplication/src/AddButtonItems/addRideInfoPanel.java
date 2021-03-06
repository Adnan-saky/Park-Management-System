package AddButtonItems;

import Mainpackage.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class addRideInfoPanel extends javax.swing.JFrame {

    /**
     * Creates new form addVisitorInfoPanel
     */
    public addRideInfoPanel() {
        initComponents();
        //setting the login screen in the middle of the screen
        setLocationRelativeTo(null);
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
        rideNameField = new javax.swing.JTextField();
        regionNoField = new javax.swing.JTextField();
        ticketPriceField = new javax.swing.JTextField();
        ageLimitField = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ride's Information");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(105, 64, 175));
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rideNameField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rideNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rideNameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(rideNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 210, 30));

        regionNoField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(regionNoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 210, 30));

        ticketPriceField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(ticketPriceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 210, 30));

        ageLimitField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(ageLimitField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 210, 30));

        confirmButton.setBackground(new java.awt.Color(65, 40, 107));
        confirmButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        confirmButton.setForeground(new java.awt.Color(255, 255, 255));
        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });
        jPanel1.add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        cancelButton.setBackground(new java.awt.Color(65, 40, 107));
        cancelButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        jPanel2.setBackground(new java.awt.Color(49, 30, 81));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 10, 380));

        jPanel3.setBackground(new java.awt.Color(49, 30, 81));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Region No");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, 20));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ride's Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, 20));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Age Limit");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, 20));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ticket Price");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        //will close the additem's window
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        try {
            //write database operation here
            //creating database object
            DatabaseConnection dbc = new DatabaseConnection();

            try {
                //checking if the field's are empty or not
                InvalidInputExceptions iie = new InvalidInputExceptions();
                if (iie.checkIfEmptyField(rideNameField.getText()) == true) {
                    throw new InvalidInputExceptions("Input Ticket Type");
                }
                if (iie.checkIfEmptyField(regionNoField.getText()) == true) {
                    throw new InvalidInputExceptions("Input Ticket Price");
                }
                if (iie.checkIfEmptyField(ticketPriceField.getText()) == true) {
                    throw new InvalidInputExceptions("Input Ticket Price");
                }
                if (iie.checkIfEmptyField(ageLimitField.getText()) == true) {
                    throw new InvalidInputExceptions("Input Ticket Price");
                }

                //inserting values to database
                //  .trim()  is used for removing whitespace in the beginning and the ending of a string
                //  .replaceAll("\\s+","")  is used for removing characters in between whitespace
                String addvisitorinfoquery = "insert into Ride_info (ride_name,region_no,ticket_price,age_limit) values(?,?,?,?)";
                PreparedStatement pst = dbc.preparedStatementQuery(addvisitorinfoquery);
                pst.setString(1, rideNameField.getText().trim());
                pst.setString(2, regionNoField.getText().trim().replaceAll("\\s+", ""));
                pst.setString(3, ticketPriceField.getText().trim().replaceAll("\\s+", ""));
                pst.setString(4, ageLimitField.getText().trim());

                pst.executeUpdate();

                //showing insertion successful
                JOptionPane.showMessageDialog(null, "New Food Information inserted successfully !");

                //after executing database operation, closing the additem's window
                dispose();
            } catch (InvalidInputExceptions e) {
                //catches the user defined input exception
                JOptionPane.showMessageDialog(null, e);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void rideNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rideNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rideNameFieldActionPerformed

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
            java.util.logging.Logger.getLogger(addRideInfoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addRideInfoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addRideInfoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addRideInfoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addRideInfoPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageLimitField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField regionNoField;
    private javax.swing.JTextField rideNameField;
    private javax.swing.JTextField ticketPriceField;
    // End of variables declaration//GEN-END:variables
}
