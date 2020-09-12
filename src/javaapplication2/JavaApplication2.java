/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

         Scanner sc= new Scanner(System.in);
       boolean end = false;
       Matematica matematica = new Matematica();
       while(true)
       {
            String a=sc.nextLine();
            System.out.println(a);
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
                    break;

                }
                case "4":
                {
                    while (true){
                        System.out.println("Ingrese un número: ");
                        String  num = sc.nextLine();

                        try {
                            int n = Integer.parseInt(num);
                            if (n > 0){
                                matematica.factorial(n);
                            }else {
                                System.out.println("Debe ingresar un número positivo");
                            }
                        }catch (Exception e){
                            System.out.println("Ingrese un número válido (entero positivo)");
                        }
                        break;
                    }

                }
                default:
                {
                    end=true;
                }
             }
    }
    }       
}
    
