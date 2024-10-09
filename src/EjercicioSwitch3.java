
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
public class EjercicioSwitch3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        String color;
        int edad;
        
        System.out.println("EJERCICIO SEMAFORO");
        System.out.println("------------------");
        
        System.out.print("Color del semaforo:");
        color=teclado.nextLine();
        
        color=color.toLowerCase(); //convierto a minuscula
       
        
        switch(color){
            case "verde":
                        System.out.println("Puedes pasar.");
                        break;
            case "rojo": 
                        System.out.println("STOP!!!!!");
                        break;
            case "ambar":
                        System.out.print("Dime la edad:");
                        edad=Integer.parseInt(teclado.nextLine());
                        if (edad<20){
                            System.out.println("Eres menor. Para!"); 
                        }
                        else{
                            System.out.println("Acelera y pasa!!");
                        }
                        break;
            default:
                        System.out.println("ERROR: color invalido");
             
        }
        
        
        
    }
    
}
