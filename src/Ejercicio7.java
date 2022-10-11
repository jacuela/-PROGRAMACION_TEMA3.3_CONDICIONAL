
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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        double numA,numB;
        int opcion;
                
        System.out.println("      CALCULADORA");
        System.out.println("-------------------------");
        System.out.print("Dime el numero A: ");
        numA=Double.parseDouble(teclado.nextLine());
        System.out.print("Dime el numero B: ");
        numB=Double.parseDouble(teclado.nextLine());
        
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Dime una opcion: ");
        opcion=Integer.parseInt(teclado.nextLine());
        
        switch(opcion){
            case 1:
                   System.out.print("La suma es ");
                   System.out.println(numA+numB);
                   break;
            case 2:
                   double resta=numA-numB;
                   System.out.println("La resta es "+resta);
                   break;
            case 3:
                  double multiplica=numA*numB;
                  System.out.println("La multiplicacion es "+multiplica);
                  break;
            case 4:
                  double divi=numA/numB;
                  System.out.println("La division es "+divi);
                  break;
            case 5:
                 System.out.println("Saliendo.....");
                 break;
            default:     
                 System.out.println("ERROR: opcion no válida"); 
            
        }//fin switch
        
        
        
        
    }
    
}
