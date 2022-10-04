
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juan.antonio
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Programa que indica si el numero es
        //positivo, negativo o 0
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        int numero=Integer.parseInt(teclado.nextLine());
        
        //opcion1: usando tres if
        if (numero>0){
            System.out.println("El numero es POSITIVO");
        }
        if (numero<0){
            System.out.println("El numero es NEGATIVO");
        }
        if (numero==0){
            System.out.println("El numero es CERO");
        }
        
        //opcion2: usando if...else if
        if (numero>0){
            System.out.println("El numero es POSITIVO");
        }
        else if(numero<0){
            System.out.println("El numero es NEGATIVO");
        }
        else{
            System.out.println("El numero es CERO");
        }
        
        
    }
    
}
