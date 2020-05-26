
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesus
 */
public class Adivinanum {
    public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);

 int a = (int) ((Math.random() * 50)+1); 
 int b; 
 int i; 

 System.out.print("Escribe un número entre 1 y 50: ");
 b = sc.nextInt();

 for (i=0; i<=4; i++) { 

   
    
    if (a == b) {  
      System.out.println("Es ese el numero"); 
      break; } 
      
    
    else if (i == 4) { 
      System.out.println(" El número era el: " + a); 
      break; } 
    
    
    else if (a > b) 
      System.out.println("El número es mayor que " + b);
    else if (a < b)
      System.out.println("El número es menor que " + b);

    
    if (i <=1) { 
     System.out.print("Otro intento: "); 
     b = sc.nextInt(); } 
    else if (i ==2) { 
    int x = (int) (a/10);
    b = sc.nextInt(); } 
   else if (i >= 3) {
   b = sc.nextInt(); }
    }
  }
}
    

