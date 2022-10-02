
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
public class AA_Ejercicios_Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
//        System.out.print("Introduce una nota: ");
//        int nota=Integer.parseInt(teclado.nextLine());
//        
//        if (nota >= 5){
//            System.out.println("Has aprobado!!!");
//        }
//        else
//            System.out.println("Lo siento. Has suspendio."); 
//        
//        System.out.println("FIN");
        
//        String fruta="naranja";
//        
//        if (!fruta.equals("naranja")){
//            System.out.println("La fruta no es una naranja");
//        }
//        
//        int numero=6;
//        if (numero!=5){
//            System.out.println("El numero es distinto de 5");
//        }
//        else{
//            System.out.println("El numero es 5");
//        }    

          //Indicar si un numero esta entre 1 y 100
//          int numero=200;
//          
//          if (numero>=1 && numero<=100){
//            System.out.println("El numero esta enter 1 y 100");
//          }
//          else{
//              System.out.println("El numero no esta entre 1 y 100");  
//          }

          //USO DEL SWITCH
          //Dado un numero de mes, decir el nombre
          System.out.print("Dime el numero de mes: ");
          int mes=Integer.parseInt(teclado.nextLine());
          
          switch (mes){
              case 1: System.out.print("El mes 1 es ");
                      System.out.println("ENERO");
                      break;
              case 2: System.out.println("FEBRERO");
                      break;
              case 3: System.out.println("MARZO");
                      break;
              case 4: System.out.println("ABRIL");
                      break;
              case 5: System.out.println("MAYO");
                      break;
              case 6: System.out.println("JUNIO");
                      break;
              case 7: System.out.println("JULIO");
                      break;
              case 8: System.out.println("AGOSTO");
                      break;
              case 9: System.out.println("SEPTIEMBRE");
                      break;
              case 10: System.out.println("OCTUBRE");
                      break;
              case 11: System.out.println("NOVIEMBRE");
                      break;
              case 12: System.out.println("DICIEMBRE");
                      break;
              default:
                      System.out.println("ERROR: mes incorrecto");
                      break;
          }
          
            switch (mes){
              case 1: 
              case 3: 
              case 5: 
              case 7: 
              case 8: 
              case 10: 
              case 12:
                      System.out.println("31 días");
                      break;
              case 4: 
              case 6: 
              case 9: 
              case 11: 
                      System.out.println("30 días");
                      break;
              case 2:
                      System.out.println("28 dias");
                      break;
              default:
                      System.out.println("ERROR: mes incorrecto");
                      break;
          }
          
          
        
          
          
          
          
        
        
        
        
        
    }
    
}
