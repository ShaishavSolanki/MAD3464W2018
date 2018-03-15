/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classactivity;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class ClassActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Person p1 = new Person();
         p1.readData();
        // p1.displayData();
         
         Faculty f1 = new Faculty();
         f1.readData();
         f1.displayData();
        
    }
    
}

class Person implements A{

     String name;
     int age;
    
    @Override
    public void readData() {
//        Scanner myInput1 = new Scanner(System.in);
//        System.out.println("Enter Name:");
//        name = myInput1.nextLine();
//        System.out.println("Enter Age: ");
//        age = myInput1.nextInt();
    
    }
//    @Override
//    public void displayData() {
//        System.out.println("Name: " + name);
//        System.out.println("Age:" + age);
//    }
    
}



class Faculty extends Person implements B{

    
    String Type;
    int salary;
    String Course = "";
    
    @Override
    public void readData() {
        Scanner myInput = new Scanner(System.in);
        //System.out.println("ENter Name: ");
        System.out.println("Enter Name:");
        name = myInput.nextLine();
        System.out.println("Enter Age: ");
        age = myInput.nextInt();
       
        Scanner type = new Scanner(System.in);
        System.out.println("Enter Type:");
        Type = type.nextLine();
        
        System.out.println("Enter Salary: ");
        salary = myInput.nextInt();
    
        
        Scanner course = new Scanner(System.in);
        System.out.println("Enter Course:");
        Course = course.nextLine();
        
    }

    @Override
    public void displayData() {
       System.out.println("Name: " +name);
       System.out.println("Age: "+age);
       System.out.println("Type of Job: " +Type);
       System.out.println("Salary: " +salary);
       System.out.println("Course: " +Course);
    }
    
    
   
   
}

interface A {
//    String name = "";
//    int age = 1;
    void readData();
    //void displayData();
}

interface B{
//    String type = "FT";
//    int Salary = 141;
    void readData();
    void displayData();
}
