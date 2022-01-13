package QueryInfo;
import MenuItems.*;
import AddButtonItems.addStaffInfoPanel;
import Mainpackage.*;
import SearchButtonItems.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import QueryInfo.*;

class queryStaffInfoModel {

    private int staff_id;

    
    private String staff_name, staff_phone, staff_designation, staff_hiredate, region_no;

    public queryStaffInfoModel(int staff_id, String staff_name, String staff_phone,  String staff_designation, String staff_hiredate, String region_no) {
        this.staff_id = staff_id;
        this.staff_name = staff_name;
        this.staff_phone = staff_phone;
        this.staff_designation = staff_designation;     
        this.staff_hiredate = staff_hiredate;
        this.region_no = region_no;

    }

    public int getStaff_id() {
        return staff_id;
    }

    

    public String getStaff_name() {
        return staff_name;
    }

    public String getStaff_phone() {
        return staff_phone;
    }

    

    
    public String getStaff_designation() {
        return staff_designation;
    }

   
    public String getStaff_hiredate() {
        return staff_hiredate;
    }

    public String getRegion_no() {
        return region_no;
    }

}

public class queryStaffInfoPanel extends javax.swing.JFrame {
  
    private static String queryString;

    public  void setQueryString(String queryString) {
        queryStaffInfoPanel.queryString = queryString;
    }
    
    
   
    private ArrayList<queryStaffInfoModel> queryStaffList(String qString) {
        ArrayList< queryStaffInfoModel> staffList = new ArrayList<>();
        DatabaseConnection dbc = new DatabaseConnection();
        try {

            ResultSet rs = dbc.resultSetQuery(qString);

            queryStaffInfoModel queryStaff;
            while (rs.next()) {
                queryStaff = new queryStaffInfoModel(rs.getInt("staff_id"), rs.getString("staff_name"), rs.getString("staff_phone"), rs.getString("staff_designation"),  rs.getString("staff_hiredate"), rs.getString("region_no"));
                staffList.add(queryStaff);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }

        //closing database
        dbc.dbClose();

        return staffList;
    }
 
     
      private int queryMinSalary() {
        int minSalary = 0;
        DatabaseConnection dbc = new DatabaseConnection();
        String minString="SELECT Distinct staff_salary  FROM Payout_Amount P1 where 3= (SELECT COUNT (Distinct staff_salary ) FROM Payout_Amount P2 where P1.staff_salary>=P2.staff_salary)";
        try {

            ResultSet rs = dbc.resultSetQuery(minString);

       
            while (rs.next()) {
                minSalary = rs.getInt("staff_salary");
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }

        //closing database
        dbc.dbClose();

        return minSalary;
    }
    
    private int queryMaxSalary() {
        int maxSalary = 0;
        DatabaseConnection dbc = new DatabaseConnection();
        String maxString="   SELECT staff_salary FROM (SELECT DISTINCT TOP 1 staff_salary From Payout_Amount ORDER BY staff_salary DESC)RESULT Order By staff_salary ";
             try {

            ResultSet rs = dbc.resultSetQuery(maxString);

       
            while (rs.next()) {
                maxSalary = rs.getInt("staff_salary");
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }

        //closing database
        dbc.dbClose();

        return maxSalary;
    }
    
    private String queryMostEmployee() {
        String mostEmp = "";
        DatabaseConnection dbc = new DatabaseConnection();
        String mostString="SELECT TOP 1 staff_designation FROM Staff_info JOIN Service_Region ON Staff_info.region_no=Service_Region.region_no Group By staff_designation ORDER BY COUNT(*) DESC";
                try {

            ResultSet rs = dbc.resultSetQuery(mostString);

       
            while (rs.next()) {
                mostEmp = rs.getString("staff_designation");
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }

        //closing database
        dbc.dbClose();
        
        return mostEmp;
    }

    private void show_staffInfo(String qString) {
        ArrayList< queryStaffInfoModel> list = queryStaffList(qString);
        DefaultTableModel model = (DefaultTableModel) dataTable.getModel();
        Object[] row = new Object[10];
        
        for (int i = 0; i < list.size(); i++) {

            row[0] = list.get(i).getStaff_id();
            row[1] = list.get(i).getStaff_name();
            row[2] = list.get(i).getStaff_phone();
            row[3] = list.get(i).getStaff_designation();
            row[4] = list.get(i).getStaff_hiredate();
            row[5] = list.get(i).getRegion_no();

            model.addRow(row);
        }
        
        
        minSalary.setText(String.valueOf(queryMinSalary()));
        maxSalary.setText(String.valueOf(queryMaxSalary()));
        maxEmp.setText(queryMostEmployee());
        
    }

    public queryStaffInfoPanel(String queryString) {
        initComponents();
        show_staffInfo(queryString);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        contentPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        tableScrollPanel1 = new javax.swing.JScrollPane();
        dataTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        contentPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tableScrollPanel = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel3 = new javax.swing.JLabel();
        minSalary = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        maxSalary = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        maxEmp = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jPanel5.setBackground(new java.awt.Color(102, 255, 51));
        jPanel5.setMaximumSize(new java.awt.Dimension(530, 500));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        contentPanel1.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel1.setMaximumSize(new java.awt.Dimension(530, 500));
        contentPanel1.setMinimumSize(new java.awt.Dimension(530, 500));
        contentPanel1.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(65, 40, 107));
        jPanel6.setLayout(null);
        contentPanel1.add(jPanel6);
        jPanel6.setBounds(10, 10, 510, 10);

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Staff's Information");
        contentPanel1.add(jLabel2);
        jLabel2.setBounds(10, 30, 510, 30);

        jPanel7.setBackground(new java.awt.Color(65, 40, 107));
        jPanel7.setLayout(null);
        contentPanel1.add(jPanel7);
        jPanel7.setBounds(10, 70, 510, 10);

        jPanel8.setBackground(new java.awt.Color(65, 40, 107));
        jPanel8.setLayout(null);
        contentPanel1.add(jPanel8);
        jPanel8.setBounds(400, 30, 120, 30);

        jPanel9.setBackground(new java.awt.Color(65, 40, 107));
        jPanel9.setLayout(null);
        contentPanel1.add(jPanel9);
        jPanel9.setBounds(10, 30, 120, 30);

        tableScrollPanel1.setBackground(new java.awt.Color(255, 255, 255));
        tableScrollPanel1.setForeground(new java.awt.Color(255, 255, 255));

        dataTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Phone", "Designation", "Hire Date", "Region"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableScrollPanel1.setViewportView(dataTable1);

        contentPanel1.add(tableScrollPanel1);
        tableScrollPanel1.setBounds(10, 90, 510, 130);
        contentPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 120, 510, 100);

        jPanel5.add(contentPanel1, new java.awt.GridBagConstraints());

        setBackground(new java.awt.Color(102, 255, 51));
        setMinimumSize(new java.awt.Dimension(530, 500));
        getContentPane().setLayout(new java.awt.GridBagLayout());

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
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Staff's Information");
        contentPanel.add(jLabel1);
        jLabel1.setBounds(10, 30, 510, 30);

        jPanel2.setBackground(new java.awt.Color(65, 40, 107));
        jPanel2.setLayout(null);
        contentPanel.add(jPanel2);
        jPanel2.setBounds(10, 70, 510, 10);

        jPanel3.setBackground(new java.awt.Color(65, 40, 107));
        jPanel3.setLayout(null);
        contentPanel.add(jPanel3);
        jPanel3.setBounds(400, 30, 120, 30);

        jPanel4.setBackground(new java.awt.Color(65, 40, 107));
        jPanel4.setLayout(null);
        contentPanel.add(jPanel4);
        jPanel4.setBounds(10, 30, 120, 30);

        tableScrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        tableScrollPanel.setForeground(new java.awt.Color(255, 255, 255));

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Phone", "Designation", "Hire Date", "Region"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableScrollPanel.setViewportView(dataTable);

        contentPanel.add(tableScrollPanel);
        tableScrollPanel.setBounds(10, 90, 510, 130);
        contentPanel.add(jScrollPane1);
        jScrollPane1.setBounds(10, 120, 510, 100);

        jLabel3.setText("3rd Minimum Salary :");
        contentPanel.add(jLabel3);
        jLabel3.setBounds(20, 240, 140, 30);

        minSalary.setText("10");
        contentPanel.add(minSalary);
        minSalary.setBounds(190, 240, 140, 30);

        jLabel4.setText("Maximum Salary :");
        contentPanel.add(jLabel4);
        jLabel4.setBounds(20, 280, 120, 16);

        maxSalary.setText("10");
        contentPanel.add(maxSalary);
        maxSalary.setBounds(190, 280, 90, 16);

        jLabel5.setText("Most Employees are :");
        contentPanel.add(jLabel5);
        jLabel5.setBounds(20, 310, 120, 16);

        maxEmp.setText("maxEmp");
        contentPanel.add(maxEmp);
        maxEmp.setBounds(190, 310, 49, 16);

        getContentPane().add(contentPanel, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args) {
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
            java.util.logging.Logger.getLogger(query.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(query.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(query.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(query.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new queryStaffInfoPanel(args).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel contentPanel1;
    private javax.swing.JTable dataTable;
    private javax.swing.JTable dataTable1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel maxEmp;
    private javax.swing.JLabel maxSalary;
    private javax.swing.JLabel minSalary;
    private javax.swing.JScrollPane tableScrollPanel;
    private javax.swing.JScrollPane tableScrollPanel1;
    // End of variables declaration//GEN-END:variables

   
}
