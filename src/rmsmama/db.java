/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmsmama;



import java.sql.*;
/**
 *
 * @author Wang
 */
public class db {
    
    public static Connection mycon(){
        Connection con = null;
        
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/restaurant","root","");
            return con;
        
        }catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
            return null;
        }

    }  
}
