
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author juanantoniocuelloalarcon
 */
public class Ejercicio9ampliacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        String frase;
        int opcion;
        
        System.out.println("EJERCICIO9 (ampliacion)");
        System.out.println("=======================");
        System.out.println("Dime una frase con mayusculas y minusculas:");
        System.out.print(">");
        frase=teclado.nextLine();
        System.out.println("");
        System.out.println("1. trimear y Pasar a mayusculas");
        System.out.println("2. trimear y Pasar a minusculas");
        System.out.println("3. Salir");
        
        System.out.print("Elige opcion:");
        opcion=Integer.parseInt(teclado.nextLine());
        
        switch (opcion) {
            case 1:
                frase=frase.trim();
                frase=frase.toUpperCase();
                System.out.print("\nLa frase es:");
                System.out.println("\033[34m"+frase+"\033[30m");
                break;
            case 2:
                frase=frase.trim();
                frase=frase.toLowerCase();
                System.out.print("\nLa frase es:");
                System.out.println("\033[34m"+frase+"\033[30m");
                break;
            case 3:
                System.out.println("Bye Bye .......");
                break;
            default:
                System.out.println("\033[31mERROR: opción no válida\033[30m");
        }
        
    
    
    
    
    }
    
}
