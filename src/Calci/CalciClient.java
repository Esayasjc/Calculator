/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calci;

import java.rmi.Naming;
import java.util.Scanner;

/**
 *
 * @author Esayas
 */
public class CalciClient {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            CalciInterface c = (CalciInterface)Naming.lookup("//localhost/Calci");
            System.out.println("*****************************");
            System.out.println("********* CALCULATOR *********");
            System.out.println("*****************************");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            
            int choice = sc.nextInt();
            int x,y;
            
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter x and y");
                    System.out.print("x: ");x = sc.nextInt();
                    System.out.print("y: ");y = sc.nextInt();
                    System.out.println("Sum "+c.add(x,y));
                    break;
                    
                }
                case 2:
                {
                    System.out.println("Enter x and y");
                    System.out.print("x: ");x = sc.nextInt();
                    System.out.print("y: ");y = sc.nextInt();
                    System.out.println("Difference: "+c.sub(x,y));
                    break;
                    
                }
                case 3:
                {
                    System.out.println("Enter x and y");
                    System.out.print("x: ");x = sc.nextInt();
                    System.out.print("y: ");y = sc.nextInt();
                    System.out.println("Product: "+c.mul(x,y));
                    break;
                    
                }
                case 4:
                {
                    System.out.println("Enter x and y");
                    System.out.print("x: ");x = sc.nextInt();
                    System.out.print("y: ");y = sc.nextInt();
                    System.out.println("Quetiont: "+c.div(x,y));
                    break;
                    
                }
                
            }
                
        }catch(Exception e){
        System.out.println("Exception: "+e);
    }
  }
}
