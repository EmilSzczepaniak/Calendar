/**
 * Created by Emil on 12.05.2016.
 */
import jdk.nashorn.internal.runtime.ECMAException;

import java.sql.*;
public class DBConnect {


    public static Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/intelij","root","");
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
