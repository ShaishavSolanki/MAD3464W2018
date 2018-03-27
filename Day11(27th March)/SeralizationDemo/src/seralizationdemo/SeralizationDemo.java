/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seralizationdemo;
import java.io.*;
/**
 *
 * @author macstudent
 */
public class SeralizationDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Employee e = new Employee();
        e.name = "Shaishav";
        e.address = "abc";
        e.SSN = 1234567890;
        e.number = 9008;
      
    
    try{
        FileOutputStream fileOut = new FileOutputStream("employee.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        
        out.writeObject(e);
        fileOut.close();
        
        System.out.println("Serialized data is saved as employee.txt");
        
    }
    catch(IOException i){
        i.printStackTrace();
    }
    
}
}