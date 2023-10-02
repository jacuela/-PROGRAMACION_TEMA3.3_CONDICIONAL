
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
public class EjercicioSwitch2 {

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
            case 1,2,4,5:
                    System.out.println("Hay PROGRAMACION");
                    break;
            case 3,6,7:
                    System.out.println("Hoy no hay. Que pena!!");
                    break;
            default:
                    System.out.println("ERROR: dia incorrecto");
            
        }
        
        
        
        
    }
    
}
