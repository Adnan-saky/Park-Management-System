package UpdateButtonItems;

import MenuItems.*;
import AddButtonItems.*;
import Mainpackage.*;
import MenuItems.entryTicketInfoPanel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UpdateEntryTicketInfoPanel extends javax.swing.JFrame {

    private static String key;

    public void setPrim(String key) {
        this.key = key;
    }

    /**
     * Creates new form addVisitorInfoPanel
     */
    public UpdateEntryTicketInfoPanel(String key) {

        initComponents();
        //setting the login screen in the middle of the screen
        setLocationRelativeTo(null);
    }

    entryTicketInfoPanel entryticket = new entryTicketInfoPanel();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ticketTypeField = new javax.swing.JTextField();
        TicketPriceField = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Entry Ticket Counter");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(105, 64, 175));
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ticketTypeField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ticketTypeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateticketTypeFieldActionPerformed(evt);
            }
        });
        jPanel1.add(ticketTypeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 210, 30));

        TicketPriceField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TicketPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateTicketPriceActionPerformed(evt);
            }
        });
        jPanel1.add(TicketPriceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 210, 30));

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
        jLabel1.setText(" Update Ticket's Price");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, 20));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Update Ticket Type");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, 20));

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
            //creating database object
            DatabaseConnection dbc = new DatabaseConnection();

            try {
                //checking if the field's are empty or not
                InvalidInputExceptions iie = new InvalidInputExceptions();
                if (iie.checkIfEmptyField(ticketTypeField.getText()) == true) {
                    throw new InvalidInputExceptions("Input Ticket Type");
                }
                if (iie.checkIfEmptyField(TicketPriceField.getText()) == true) {
                    throw new InvalidInputExceptions("Input Ticket Price");
                }

                //inserting values to database
                //  .trim()  is used for removing whitespace in the beginning and the ending of a string
                //  .replaceAll("\\s+","")  is used for removing characters in between whitespace
                //UpdateEntryTicket updatEntryTicket = null ;
                System.out.println(key);
                String queryString = "Update Entry_Ticket_type Set eticket_type=? , eticket_price=? Where eticket_type=" + key + "";

                PreparedStatement pst = dbc.preparedStatementQuery(queryString);
                pst.setString(1, ticketTypeField.getText().trim());
                pst.setString(2, TicketPriceField.getText().trim().replaceAll("\\s+", ""));

                pst.executeUpdate();

                //showing insertion successful
                JOptionPane.showMessageDialog(null, "New Ticket Information Updated successfully !");

                dispose();
            } catch (InvalidInputExceptions e) {
                //catches the user defined input exception
                JOptionPane.showMessageDialog(null, e);

            }
            //write database operation here

            //after executing database operation, closing the additem's window
            dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void UpdateticketTypeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateticketTypeFieldActionPerformed
        // TODO add your handling code here:
        ticketTypeField.setText(entryticket.ticket_price);
    }//GEN-LAST:event_UpdateticketTypeFieldActionPerformed

    private void UpdateTicketPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateTicketPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateTicketPriceActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateEntryTicketInfoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEntryTicketInfoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEntryTicketInfoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEntryTicketInfoPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEntryTicketInfoPanel(key).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField TicketPriceField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField ticketTypeField;
    // End of variables declaration//GEN-END:variables
}
