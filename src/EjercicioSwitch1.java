
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
public class EjercicioSwitch1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int dia;
        
        System.out.println("Dime el dia de la semana:");
        dia=Integer.parseInt(teclado.nextLine());
        
        switch(dia){
            case 1: System.out.println("LUNES");
                    break;
            case 2: System.out.println("MARTES");
                    break;
            case 3: System.out.println("MIERCOLES");
                    break;
            case 4: System.out.println("JUEVES");
                    break;
            case 5: System.out.println("VIERNES");
                    break;
            case 6: System.out.println("SABADO");
                    break;
            case 7: System.out.println("DOMINGO");
                    break;
            default:
                   System.out.println("ERROR: dia incorrecto");
        }
       
        
        
        
        
    }
    
}
