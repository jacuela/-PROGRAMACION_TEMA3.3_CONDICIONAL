
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
public class Ejercicio0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Indicar si un numero es par o impar
        Scanner entrada = new Scanner(System.in);
        
        boolean esPar;
        
        System.out.print("Dime un numero:");
        int numero=Integer.parseInt(entrada.nextLine());
        
        if (numero % 2 == 0){
            System.out.println("El numero es par.");
            esPar=true;
            
        }
        else{
            System.out.println("El numero es impar.");
            esPar=false;
            
        }
        
        //Usando un booleano. Aquí no es muy eficiente pero nos ayuda
        //a comprender qué es un valor booleano
        if (esPar==true){
            System.out.println("El numero es par(usando booleano");
        }
        else{
            System.out.println("El numero es impar(usando booleano)");
        }
    
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
