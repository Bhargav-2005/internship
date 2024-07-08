import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class Databaseconnecting extends Library{
    Databaseconnecting(){    
        try{
            String url="jdbc:mysql://localhost:3306/bhargav";
            String user="root";
            String pass="9052749434";
            Connection con=DriverManager.getConnection(url,user,pass);
            if(con!=null) System.out.println("Successfully connected");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select *from biography");
            //
            while(rs.next())
            {
                String s=rs.getString("itemname");
                int n=rs.getInt("price");
                int k=rs.getInt("quantity");
            }
            
            //
            try{
                   System.out.println("YOO!! we got it");
                   st.executeUpdate(comboboxQuery);
            }
             catch(SQLException biography)
            {
                   comboboxQuery="update biography set quantity=(quantity+"+value+") where itemname="+"'"+itemname3+"'";
                   st.executeUpdate(comboboxQuery);
            }
            
            System.out.println(comboboxQuery);
            //st.executeUpdate(comboboxQuery);
           // rs=st.executeQuery("select *from biography");
        } catch(SQLException e)
        {
            System.out.println(e);
        }
    }
}