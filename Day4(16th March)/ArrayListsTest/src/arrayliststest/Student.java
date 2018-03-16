/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayliststest;

/**
 *
 * @author macstudent
 */
public class Student {
    
    int rollNo;
    String Name;
    Double Percentage;
    
    
   Student(){
        this.rollNo = 0;
        this.Name = "";
        this.Percentage = 0.0;
    }

    Student(int rollNo, String Name, Double Percentage) {
        this.rollNo = rollNo;
        this.Name = Name;
        this.Percentage = Percentage;
    }
   
    void setrollNo(int rollNo){
        this.rollNo = rollNo;
    }
    
    int rollNo(){
        return this.rollNo;
    }
    
    void setName(String Name){
        this.Name = Name;
    }
    
    String Name(){
        return this.Name;
    }
    
    void setPercent(double percent){
        this.Percentage = percent;
    }
    
    Double getPercent(){
        return this.Percentage;
    }
   
    void displayInfo(){
        System.out.println("Roll No : " + this.rollNo + "\n Name : " + this.Name + "\n Percentage : " + this.Percentage);
    }
    
    
}
