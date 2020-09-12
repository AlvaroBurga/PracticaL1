/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Alvaro y marcelo y samuel
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

         Scanner sc = new Scanner(System.in);
       boolean end = false;
       while(true)
       {
           System.out.println("(3) para la serie de Fibonacci ");
           System.out.println("Ingrese su opción del menu : ");
           String a=sc.nextLine();
            switch(a)
            {
                case "1":
                {
                    break;
                }
                case "2":
                {
                    break;
                }
                case "3":
                {
                    while(true){
                        try{
                            System.out.println("Ingrese un numero 'n' para la serie:");
                            String n = sc.nextLine();
                            System.out.println("La serie fibonacci de "+n+" números es:");
                            Matematica m = new Matematica();
                            switch(n)
                            {
                                case "0":
                                {
                                    System.out.println("");
                                    break;
                                }
                                case "1":
                                {
                                    System.out.println(" 0 ");
                                    break;
                                }
                                default:
                                {
                                    int b = Integer.parseInt(n);
                                    m.fibonacci(b);
                                    break;
                                }
                            }
                            break;
                        }catch(NumberFormatException e){
                            System.out.println("Ingrese un número!!");
                        }
                        
                    }
                    
                    
                    System.out.println(" ");
                    break;

                }
                case "4":
                {
                    break;
                }
                default:
                {
                    end=true;
                }
             }
    }
    }       
}
    
