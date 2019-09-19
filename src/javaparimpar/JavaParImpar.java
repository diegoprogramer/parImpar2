/*
programa que halla si un numero es par o impar
 */
package javaparimpar;

import java.util.Scanner;

/**
 *
 * @author alexander
 */
public class JavaParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num;
        int cont=0;
        String op="s";
        Scanner tec=new Scanner(System.in);
        while (op.equals("s")){
        System.out.println("digite un numero ");
        num=tec.nextDouble();
        
        if(num==0)System.out.println("el numero es neutro");
        else { 
           if (num%2==0) System.out.println("el numero es par");
           else System.out.println("El numero es impar");
           tec.nextLine();
        
        
        }
        System.out.println("Desea continuar s/n " );
        
        op=tec.nextLine();
        
        }
        System.out.println("Saliendo corriendo ok"+op);
        
     
    }
    
}
