
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */


public class Hello {

    public static void main(String[] args){
         int x = 10;
         float percentage;
         char a = 'a';
         
         System.out.println("Value is :" + x);
         
         percentage = 78.22f;
         
         System.out.println("Value of percentage: " + percentage);
         
         
         System.out.println("Vowel is:" + a);
         
         a = 22;
         System.out.println("Changing Vowel:" + a);
         
         //x = 'HEllo';
         System.out.println("Vowel is:" + x  + 12);
         
         System.out.println((12 + 12 + "Test"));
         
         x = 20;
         
         
         
         if(x > 20){
             System.out.println("more than 20");
             
         }else if (x == 20){
             System.out.println("equal t0 20");
             
         }else{
             System.out.println("less than 20");
         }
         switch(25+2){
             case 10:
                 System.out.println("value = 10");
                 break;
             case 20:
                 System.out.println("value = 20");
                 break;
             case 30:
                 System.out.println("value = 30");
                 break;
             default:
                 System.out.println("No matching value");
                 break;
         }
         
         a  = 'a';
         switch(a){
             case ('a'|'e'|'i'|'o'|'u'):
//             case 'e':
//             case 'i':
//             case 'o':
//             case 'u':
                 System.out.println("Its a vowel");
                 break;
             default:
                 System.out.println("Not a vowel");
                 break;
         }
         
         String province = "Alberta";
         switch(province){
             case "Ontario":
                 System.out.println("ON");
                 break;
             case "Alberta":
                 System.out.println("AB");
                 break;
             case "Prince Edward":
                 System.out.println("PE");
                 break;
             default:
                 System.out.println("Not Available");
                 break;
                     
         }
         
         int numbers[] = new int[5];
         int i;
         
         for(i=0;i<numbers.length;i++){
             numbers[i] = (int)(Math.random()*100);
             System.out.println("numbers [" + i + "] = "+numbers[i]);
         }
         
         double pi_value = Math.PI;
         double power = Math.pow(2, 2);
         Math.sqrt(144);
         Math.abs(pi_value);
         
         float grades[][] = new float [3][4];
         for(i=0;i<3;i++){
             for(int j=0;j<4;j++){
                 grades[i][j] = 10.0f;
                 
             }
         }
         int randomno[] = new int[10];
         for(i=0;i<10;i++){
             randomno[i] = (int)(Math.random()*10);
             System.out.println("no" + (i+1) + "=" + randomno[i]);
         }
             Arrays.sort(randomno);
             for(i=0;i<10;i++){
                 System.out.println("no" + (i+1) + "=" + randomno[i]);
             }
             
   
    
    
    int n=5;
             for( i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }    

}
             
}
    
    
    
    
    

         

          
   
    
