/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package project;
import java.sql.*;
/**
 *
 * @author HP
 */
public class connectionprovider {
    public static Connection getCon(){
        try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection on=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "belay1999%");
         return on;
        }
       catch(Exception e){
           return null;
       }
    }
}
