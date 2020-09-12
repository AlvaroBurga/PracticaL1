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

       System.out.println("--- Bienvenido ---");
       System.out.println("seleccione la aplicación que desee utilizar:");
       System.out.println("1) Operaciones con numeros");
       System.out.println("2) Jackson (no implementado)");
       System.out.println("Opcion : ");
       int b = Integer.parseInt(sc.nextLine());

       if (b == 1){
           while(true)
           {
               System.out.println("seleccione la operación que desee realizar:");
               System.out.println("1) Verificar si el número es primo");
               System.out.println("2) MCD");
               System.out.println("3) Fibonacci");
               System.out.println("4) Factorial");
               System.out.println("Opcion : ");

               String a=sc.nextLine();
               switch(a)
               {
                   case "1":
                   {
                       System.out.println("Ingrese su numero");
                       String nums = sc.nextLine();
                       try
                       {
                           int num = Integer.parseInt(nums);
                           if(num > 0)
                           {

                               if(Matematica.primo(num)) System.out.println("El numero" + num + "es primo");
                               else System.out.println("El numero " + num + " no es primo");
                           }
                           else
                           {
                               System.out.println("El numero debe ser entero positivo");
                           }

                       }catch(NumberFormatException e)
                       {
                           System.out.println("Debe ingresar un numero entero positivo");
                       }


                       break;
                   }
                   case "2":
                   {
                       System.out.println("Ingrese su primer numero");
                       String nums1 = sc.nextLine();
                       System.out.println("Ingrese su segundo numero");
                       String nums2 = sc.nextLine();
                       try
                       {
                           int num1 = Integer.parseInt(nums1);
                           int num2 = Integer.parseInt(nums2);
                           if(num1 > 0 && num2>0)
                           {

                               System.out.println("El minimo comun divizor"
                                       + " es: " + Matematica.mcd(num1, num2));
                           }
                           else
                           {
                               System.out.println("Los numeros deben ser enteros positivos");
                           }

                       }catch(NumberFormatException e)
                       {
                           System.out.println("Debe ingresar un numeros enteros positivos");
                       }
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
                       break;
                   }
               }
           }
       }

    }       
}
    
