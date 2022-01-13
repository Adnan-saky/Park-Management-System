/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuItems;
import AddButtonItems.addRideInfoPanel;
import Mainpackage.*;
import AddButtonItems.*;
import Mainpackage.*;
import SearchButtonItems.*;
import UpdateButtonItems.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


class RideInfoModel{
    private String ride_name;
    private int ride_id,ride_region,ride_ticket_price,minimum_age;

    public RideInfoModel(int ride_id,String ride_name,  int ride_region, int ride_ticket_price,int minimum_age) {
        this.ride_name = ride_name;
        this.ride_id = ride_id;
        this.ride_region = ride_region;
        this.ride_ticket_price = ride_ticket_price;
        this.minimum_age = minimum_age;
    }

    public String getRide_name() {
        return ride_name;
    }

    public int getRide_id() {
        return ride_id;
    }

    public int getRide_region() {
        return ride_region;
    }

    public int getRide_ticket_price() {
        return ride_ticket_price;
    }

    public int getMinimum_age() {
        return minimum_age;
    }
    
}

/**
 *
 * @author Julfikar
 */
public class rideInfoPanel extends javax.swing.JPanel {

    
    
    //variable declaration of query so that we can use it while passing into a method
    //query string is used in some method in this name: "qString"
    private String queryString = "SELECT * FROM Ride_info";

    //Array List for retrieving info from database
    //qString is the String of Query operation
    private ArrayList<RideInfoModel> RideInfoList(String qString) {
        ArrayList<RideInfoModel> RideList = new ArrayList<>();
        DatabaseConnection dbc = new DatabaseConnection();
        try {

            ResultSet rs = dbc.resultSetQuery(qString);

            RideInfoModel rideInfo;
            while (rs.next()) {
                rideInfo = new RideInfoModel(rs.getInt("ride_id"),rs.getString("ride_name"),rs.getInt("region_no"), rs.getInt("ticket_price"),rs.getInt("age_limit"));
                RideList.add(rideInfo);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }

        //closing database
        dbc.dbClose();

        return RideList;
    }

    //showing values from database to the jtable
    //qString is the String of Query operation
    private void show_RideInfo(String qString) {
        ArrayList<RideInfoModel> list = RideInfoList(qString);
        DefaultTableModel model = (DefaultTableModel) dataTable.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getRide_id();
            row[1] = list.get(i).getRide_name();
            row[2] = list.get(i).getRide_region();
            row[3] = list.get(i).getRide_ticket_price();
            row[4] = list.get(i).getMinimum_age();
            
            model.addRow(row);
        }
    }
    
    /**
     * Creates new form visitorInfoPanel
     */
    public rideInfoPanel() {
        initComponents();
        show_RideInfo(queryString);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tableScrollPanel = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        addButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 255, 51));
        setMaximumSize(new java.awt.Dimension(530, 450));
        setMinimumSize(new java.awt.Dimension(530, 450));
        setPreferredSize(new java.awt.Dimension(530, 450));
        setLayout(new java.awt.GridBagLayout());

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setMaximumSize(new java.awt.Dimension(530, 500));
        contentPanel.setMinimumSize(new java.awt.Dimension(530, 500));
        contentPanel.setPreferredSize(new java.awt.Dimension(530, 500));
        contentPanel.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(65, 40, 107));
        jPanel1.setLayout(null);
        contentPanel.add(jPanel1);
        jPanel1.setBounds(10, 10, 510, 10);

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ride Information");
        contentPanel.add(jLabel1);
        jLabel1.setBounds(10, 30, 510, 30);

        jPanel2.setBackground(new java.awt.Color(65, 40, 107));
        jPanel2.setLayout(null);
        contentPanel.add(jPanel2);
        jPanel2.setBounds(10, 70, 510, 10);

        jPanel3.setBackground(new java.awt.Color(65, 40, 107));
        jPanel3.setLayout(null);
        contentPanel.add(jPanel3);
        jPanel3.setBounds(390, 30, 130, 30);

        jPanel4.setBackground(new java.awt.Color(65, 40, 107));
        jPanel4.setLayout(null);
        contentPanel.add(jPanel4);
        jPanel4.setBounds(10, 30, 130, 30);

        tableScrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        tableScrollPanel.setForeground(new java.awt.Color(255, 255, 255));

        dataTable.setBackground(new java.awt.Color(255, 255, 255));
        dataTable.setForeground(new java.awt.Color(0, 0, 0));
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ride Name", "Region No", "Ticket Price", "Age Limit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableScrollPanel.setViewportView(dataTable);

        contentPanel.add(tableScrollPanel);
        tableScrollPanel.setBounds(10, 90, 510, 300);

        addButton.setBackground(new java.awt.Color(65, 40, 107));
        addButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        contentPanel.add(addButton);
        addButton.setBounds(440, 440, 80, 33);

        addButton1.setBackground(new java.awt.Color(65, 40, 107));
        addButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addButton1.setForeground(new java.awt.Color(255, 255, 255));
        addButton1.setText("Update");
        addButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton1ActionPerformed(evt);
            }
        });
        contentPanel.add(addButton1);
        addButton1.setBounds(310, 440, 110, 33);

        add(contentPanel, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        //This will bring the frame which was implemented for add button into the screen in Nimbus look 
        String[] args = null;
        new addRideInfoPanel().main(args);
    }//GEN-LAST:event_addButtonActionPerformed

    private void addButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton1ActionPerformed
        
        int column = 0;
        int row = dataTable.getSelectedRow();
        String primKey = dataTable.getModel().getValueAt(row, column).toString();
        System.out.println(primKey);
        
        UpdateRideInfoPanel up = new UpdateRideInfoPanel(primKey);
        up.setPrim(primKey);
        System.out.println(primKey);
        
        String[] args = null;
        up.main(args);
    }//GEN-LAST:event_addButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton addButton1;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JTable dataTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane tableScrollPanel;
    // End of variables declaration//GEN-END:variables
}