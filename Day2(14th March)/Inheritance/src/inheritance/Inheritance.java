/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author macstudent
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person one = new Person();
        
        one.display();
        
       
        Person abc = new Person("Shaishav","Solanki",22);
        abc.display();
        
        Person abc1 = new Person(abc);
        abc1.display();

//        Employee e1 = new Employee(141.20);
//        e1.display();
        
        Employee e2 = new Employee();   //object after inherting class employee from 
        e2.display();
        
        
        e2.firstName = "Sunny";
        e2.lastName = "Solanki";
        e2.age = 20;
        e2.salary = 1100.00;
        
        
        e2.display();
        e2.display();
        
        
        //Method Overriding
        Employee e3 = new Employee();
        e3.read();
        e3.display();
    }
    
}
