/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dato1=0;
        int dato2=0;
        int op=0;
        int resultado=0;
        Scanner guardar = new Scanner(System.in);
                
                System.out.println("----------------------------------------------------");
                System.out.println("Bienvenidos al programa de una calculadora");
                System.out.println("----------------------------------------------------");
                System.out.println("1.Sumar"+","+"2.Resta"+","+"3.Multiplicacion"+","+"4.Division");
                    op=guardar.nextInt();
                System.out.println("-------------------------------------------------------");
         
               switch(op){
                   case 1: 
                       System.out.println("ingrese un numero");
                       dato1=guardar.nextInt();
                       System.out.println("ingrese un numero");
                       dato2=guardar.nextInt();
                       resultado = (dato1+dato2);
                       System.out.println("El resultado es:"+ resultado);
                       break;
                   case 2: 
                       System.out.println("ingrese un numero");
                       dato1=guardar.nextInt();
                       System.out.println("ingrese un numero");
                       dato2=guardar.nextInt();
                       resultado = (dato1-dato2);
                       System.out.println("El resultado es:"+ resultado);
                       break;
                   case 3: 
                       System.out.println("ingrese un numero");
                       dato1=guardar.nextInt();
                       System.out.println("ingrese un numero");
                       dato2=guardar.nextInt();
                       resultado = (dato1*dato2);
                       System.out.println("El resultado es:"+ resultado);
                       break;
                   case 4:
                       System.out.println("ingrese un numero");
                       dato1=guardar.nextInt();
                       System.out.println("ingrese un numero");
                       dato2=guardar.nextInt();
                       resultado = (dato1/dato2);
                       System.out.println("El resultado es:"+ resultado);
                       break;
                    
                   default: System.out.println("No ingreso de forma correcta!!!!");
                       
               }
               
               
    }
    
}
