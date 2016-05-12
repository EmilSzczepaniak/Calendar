import javax.swing.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Emil on 11.05.2016.
 */
public class Application {
    public static void main(String[] args) throws IOException {
        GUI gui = new GUI();
        gui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gui.setVisible(true);

        Connection connection = null;



        try{
            connection = DBConnect.getConnection();
            if(connection !=null);
            System.out.println("Connection established!");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(connection != null)
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }

        }

    }
}

