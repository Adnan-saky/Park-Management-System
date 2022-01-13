package Mainpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {

    //variables initialization
    String url = "jdbc:sqlserver://localhost:1433;databaseName=park_ms";
    String username = "sa";
    String password = "123456";
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;

    public Connection dbConnection() {
        //this method is needed for automatically connect with specified username and password
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }

    public void dbClose() {
        //this method is for closing database
        try {
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Connection dbConnectionWAuth(String username, String password) {
        //this method is needed for connecting database with user input username and password
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }

    public ResultSet resultSetQuery(String queryString) {
        //this method is needed for returning desired Result set for a specific Query
        try {
            //connection with pre inputted username and password
            dbConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(queryString);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return resultSet;
    }

    public PreparedStatement preparedStatementQuery(String queryString) {
        //this method is needed for returning desired Prepared Statement for a specific Query
        try {
            //connection with pre inputted username and password
            dbConnection();
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement(queryString);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return preparedStatement;
    }
}
