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
        
        Faculty i = new Faculty();
        i.readData();
        i.displayData();
       
        
    }
    
}





//class Person implements A{
//    
//    String name;
//    int age;
//
//    @Override
//    public void readData() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void displayData() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    
    
//}

interface Person{
    
    void readData();
    void displayData();
}

abstract class Employee{

    String type;
    int salary;
    
     void read(){
        System.out.println("Enter Type = ");
        Scanner jobType = new Scanner(System.in);
        type = jobType.nextLine();
        
        System.out.println("Enter Salary = ");
        Scanner mySalary = new Scanner(System.in);
        salary = mySalary.nextInt();
     }
     void display(){
         System.out.println("JobType: " + type);
         System.out.println("Salary: " + salary);
     }
    

}

class Faculty extends Employee implements Person{

    String name;
    int age;
    String course;
    
    @Override
    public void readData() {
        
        System.out.println("Enter Name = ");
        Scanner myInput = new Scanner(System.in);
        name = myInput.nextLine();
        
        System.out.println("Enter Age = ");
        Scanner Myage = new Scanner(System.in);
        age = Myage.nextInt();
        
        System.out.println("Enter Course = ");
        Scanner MyCourse = new Scanner(System.in);
        course = MyCourse.nextLine();
        
        super.read();
        
        
    }

    @Override
    public void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        super.display();
        
    }

    
    
}