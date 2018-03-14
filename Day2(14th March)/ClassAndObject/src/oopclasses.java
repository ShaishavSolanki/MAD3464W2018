
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class oopclasses {
    
    public static void main(String[] args){
        
        //Creating  a new object of Bank Class
       String name; // Variable to Store value which user will enter in myInput object
       Bank myBank = new Bank();    //Declaring a object named myBank of Bank class
       
       System.out.println("BankID: " + myBank.bankID);
       System.out.println("BankName: " + myBank.bankName);
    
       Bank yourBank = new Bank();
       
       myBank.bankID = 11;
       myBank.bankName = "Scotia";
       
       System.out.println("BankID: " + myBank.bankID);
       System.out.println("BankName: " + myBank.bankName);         
    
       //Accessing th emethod of bank class
       
       myBank.getBankName();
       
       yourBank.setBankName("RBC");
       yourBank.getBankName();
       
       Scanner myInput = new Scanner(System.in);
       
       System.out.println("Enter Bank Name:");
               
       name = myInput.nextLine();
       
       yourBank.setBankName(name);
       yourBank.getBankName();
       
       
       //Creating object of Arithmetic class
       
       Arithmetic opreation1 = new Arithmetic();
       
       //opreation1.addition(1, 2);
       System.out.println("Addition is : " + opreation1.addition(1, 11,2,3,4));
       
       System.out.println("Addition of 3 integer is : " + opreation1.addition(1, 11, 1));
       
       System.out.println("Addition of Float number is : " + opreation1.addition(1.2f, 11.2f));
      
       System.out.println("Multiplication is : " + opreation1.multiplication(4,2,3));
       
       Arithmetic.multiplication(1,5,5); //as method has been declared static it can be called without creating an object or without an object.
             
       Arithmetic.n1 = 10;
      // Arithmetic.n2 = 11;
       
       System.out.println(Arithmetic.n1 + " " + Arithmetic.n2);
               
               
    }
    
}
