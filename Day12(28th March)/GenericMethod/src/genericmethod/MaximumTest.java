/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericmethod;

/**
 *
 * @author macstudent
 */
public class MaximumTest {
    
    
    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        
        T max = x;
        
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
        max = z;
    }
        
        
        return max;
        
    }
    
    public static void main(String[] args) {
        System.out.printf("Max of %d %d and %d is %d \n\n",3,4,5, maximum( 3,4,5));
        
        System.out.printf("Max of %.1f %.1f and %.1f is %.1f \n\n",6.6,4.4,5.5, maximum( 6.6,4.4,5.5));
        
         System.out.printf("Max of %s, %s and %s is %s\n","pear","apple", "orange", maximum("pear", "apple", "orange"));
    }
}
