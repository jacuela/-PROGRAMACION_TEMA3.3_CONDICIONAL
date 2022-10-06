
import java.time.LocalTime;
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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada=new Scanner (System.in);
        
        System.out.print("Que hora es: ");
 //       int hora=Integer.parseInt(entrada.nextLine());
        
        LocalTime horaLocal=LocalTime.now();
        int hora=horaLocal.getHour();


        //******** USANDO IF *********************
        System.out.println("Son las "+hora);
        
        if (hora>=6 && hora <12){
          //  System.out.println("Son las "+hora);
            System.out.println("BUENOS DIAS!!. ARRIBA CAMPEON!!");
        }
        else if (hora>=12 && hora <21){
         //   System.out.println("Son las "+hora);
            System.out.println("BUENOS TARDES.");
         
        }
        else if (hora>=21 && hora <=23){
          //  System.out.println("Son las "+hora);
            System.out.println("BUENAS NOCHES.ZZZZZZ.");
        }
        else if (hora>=0 && hora <6){
          //  System.out.println("Son las "+hora);
            System.out.println("BUENAS NOCHES.ZZZZZZ.");
        } 
        
        //Usando una condicion múltiple para la noche
        //if ((hora>=21 && hora <=23) || (hora>=0 && hora <6))
        
        else {
            System.out.println("ERROR:Hora incorrecta"); 
        }
       

        
        
        
        
    }
    
}
