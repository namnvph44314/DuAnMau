/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCHelper;
import java.sql.*;
/**
 *
 * @author DELL
 */
public class getStmt {
    public static PreparedStatement getStmt(String sql, Object...orgs) throws SQLException{
        Connection con=DriverManager.getConnection(dburl,user,pass);
    }
}
