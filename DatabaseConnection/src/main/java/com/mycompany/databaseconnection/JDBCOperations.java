/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.databaseconnection;
import java.sql.*;
/**
 *
 * @author 730142
 */
public class JDBCOperations {
    static Connection conn;
    static PreparedStatement stmnt;
    static ResultSet rs;
    static String USER = "root";
    static String PASS = "";
    
    public static void main(String[] args) {
        connectDB();
        selectDB();
        
        insertDB();
        selectDB();
        
        updateDB();
        selectDB();
        
        deleteDB();
        selectDB();
    }
    
    
    static void connectDB(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/try","root","");
    }
    catch(Exception e){
        e.printStackTrace();
    }
    }
   
    
    static void selectDB(){
        try{
            stmnt = conn.prepareStatement("SELECT * FROM person");
            
            rs = stmnt.executeQuery();
            
            while(rs.next()){
                System.out.println("ID: " +rs.getInt(1) + 
                                      ", FirstName : " + rs.getString("FirstName") + 
                                     ", LastName :" + rs.getString("LastName") +
                                     ", Age : " +rs.getString("Age"));
                
        }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
     static void insertDB(){
         try{
             stmnt = conn.prepareStatement("insert into Person values(?,?,?,?)");
             stmnt.setInt(1,104);
             stmnt.setString(2, "Sunnny");
             stmnt.setString(3, "Solanki");
             stmnt.setInt(4, 22);
             
             
             int i = stmnt.executeUpdate();
             System.out.println(i + "records Inserted");
         }
         catch(SQLException se){
             se.printStackTrace();
         }
     
     }
     
    static void deleteDB(){
         try{
            stmnt = conn.prepareStatement("DELETE FROM Person WHERE Id = ?");
            stmnt.setInt(1, 102);
            
            int nrec = stmnt.executeUpdate();
            System.out.println(nrec + " records inserted");
           
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
        
       
    
    
    static void updateDB(){
         try{
            stmnt = conn.prepareStatement("UPDATE Person SET FirstName = ?, LastName = ?, Age = ? WHERE Id = ?");
            
            stmnt.setString(1, "Sunnnnnyyy");
            stmnt.setString(2, "Solanki");
            stmnt.setInt(3, 22);
            stmnt.setInt(4, 102);
            
            
            int nrec = stmnt.executeUpdate();
            System.out.println(nrec + " records inserted");
           
        }
        catch(SQLException e){
            e.printStackTrace();
        }       
    }
}
