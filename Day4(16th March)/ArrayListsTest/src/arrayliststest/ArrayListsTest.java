/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayliststest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author macstudent
 */
public class ArrayListsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Books book1 = new Books(1,"THe Sky",3);
        Books book2 = new Books(2,"Necklace",3);
        Books book3 = new Books(3,"Milk",2);
        Books book4 = new Books(4,"Journey",3);
        Books book5 = new Books(5,"Wonderer",4);
        
        ArrayList<Books> library = new ArrayList<Books>();
        
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);
        
        System.out.println("No. of Books: " + library.size());
        
        
        
        library.add(2,new Books(10,"Pacific Rim", 4));
        
        Collections.sort(library,new bookTitleComparator());
        for (Books bk: library){
            bk.displayInfo();
        }
        
        
        
        
        // =============== Student ==================
        
        Student student1 = new Student(1, "Shaishav", 50.6);
        Student student2 = new Student(2, "Sunny", 50.6);
        Student student3 = new Student(3, "ABC", 50.6);
        Student student4 = new Student(4, "DEF", 50.6);
        Student student5 = new Student(5, "HIJ", 50.6);
        
        ArrayList<Student> data = new ArrayList<Student>();
        
        data.add(student1);
        data.add(student2);
        data.add(student3);
        data.add(student4);
        data.add(student5);
        
        System.out.println("Students Record: " + data.size());
        
        data.forEach(st -> {st.displayInfo();}
        );
    }
    
}
