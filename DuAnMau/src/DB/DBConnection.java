/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.*;

/**
 *
 * @author DELL
 */


public class DBConnection {
    public static final String user="sa";
    public static final String password="123456";
    public static String dbName="QLMHX";
    public static final String hostName="localhost";
    public static final String post="1433";
    
    public Connection getConnection(){
        String url="jdbc:sqlserver://"+hostName+":"+post+";databaseName="+dbName+";encrypt=true;trustservercertificate=true";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        DBConnection dbc=new DBConnection();
        dbc.getConnection();
    }
}
