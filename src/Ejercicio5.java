
import java.time.Year;
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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        
              
        System.out.print("Dime un año:");
        int year=Integer.parseInt(entrada.nextLine());
        
       
        if (year%4==0  &&  year%100!=0){
              System.out.println("El año SÍ es bisiesto.");
        }
        else if ( year%100==0 && year%400==0 ){
            System.out.println("El año SÍ es bisiesto.");
        }
        else{
            System.out.println("El año NO es bisiesto.");
        }
        
        
         //Usando una condición múltiple
        if ((year%4==0 && year%100!=0) || (year%100==0 && year%400==0)){
            System.out.println("El año SÍ es bisiesto.");
        }
        else{
            System.out.println("El año NO es bisiesto.");
        }
        
        
        //Usando una funcion para saber si un año es bisiesto
        System.out.println("---- usando la funciuon isLeap ----");
        //Year.of(year).isLeap();
        
        if (Year.of(year).isLeap())
            System.out.println("El año "+year+" Sí es bisiesto.");
        else
            System.out.println("El año "+year+" NO es bisiesto.");
     
        
        
    }
    
}
