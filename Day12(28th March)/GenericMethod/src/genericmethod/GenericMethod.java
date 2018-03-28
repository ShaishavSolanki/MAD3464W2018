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
public class GenericMethod {

    //genenric method
    public static <E> void printArray( E[] inputArray){
        
        for(E element : inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Integer[] intArrays = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4};
        Character[] cahrArray = {'H','E','L','L','O'};
        
        System.out.println("Array intehetArray contains: ");
        printArray(intArrays);
        
        System.out.println("\nArray doubleArray Contains: ");
        printArray(doubleArray);
        
        System.out.println("\nArray character array contains: ");
        printArray(cahrArray);
                
    }
    
}
