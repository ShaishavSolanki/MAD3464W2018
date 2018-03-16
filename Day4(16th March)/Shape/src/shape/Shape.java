/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author macstudent
 */
public class Shape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Myshape obj1 = new Myshape(); Object of abstract class cant be created
        
        Circle obj1 = new Circle();
        obj1.draw();
        obj1.display("Its a Circle");
            
        
        
        
    }
    
}

class Circle extends Myshape{

    @Override
    void draw() {
        System.out.println("Drawing Circle");
        super.x = 20;
        super.y = 30;
        System.out.println("x = " + super.x + " y = " + super.y);
    }
    
}

abstract class Rectangle extends Myshape{

    int h;
    abstract void draw();
    

    
}

abstract class Myshape{
     int x;
     int y;
     abstract void draw();
     
     void display(String msg){
         System.out.println(msg);
         
     }
}