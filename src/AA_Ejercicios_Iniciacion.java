
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
public class AA_Ejercicios_Iniciacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
//        //Ejemplo0 - if
//        System.out.print("Introduce una nota: ");
//        int nota=Integer.parseInt(teclado.nextLine());
//        
//        if (nota >= 5){
//            System.out.println("Has aprobado!!!");
//        }
//        
//        System.out.println("FIN");
//       
//        
//        //Ejemplo1 - if..else
//        System.out.print("Introduce una nota: ");
//        int nota2=Integer.parseInt(teclado.nextLine());
//        
//        if (nota2 >= 5){
//            System.out.println("Has aprobado!!!");
//            System.out.println("Eres un campeon!");
//        }
//        else{
//            System.out.println("Lo siento. Has suspendio.");
//            System.out.println("Hoy no sales.");
//        }
//        System.out.println("FIN");
//        
//        
//        //Ejemplo2 - comparo cadena en positivo
//        String fruta="naranja";
//        
//        if (fruta.equals("naranja")){
//            System.out.println("La fruta es una naranja");
//        }
//        
//        //Ejemplo3 - comparo cadena en negativo
//        String fruta2="limon";
//        if (!fruta2.equals("naranja")){
//            System.out.println("La fruta2 no es una naranja");
//        }
//        
//          
//            
//        //Ejemplo 4 - Indicar si un numero esta entre 1 y 100
//        int numero2=200;
//          
//        if (numero2>=1 && numero2<=100){
//          System.out.println("El numero esta enter 1 y 100");
//        }
//        else{
//            System.out.println("El numero no esta entre 1 y 100");  
//        }
//
//        //Ejemplo - Condicion con OR
//        String nombre="Juan";
//        if (nombre.equals("Juan") || nombre.equals("Juanito")){
//            System.out.println("Puedes entrar. Los juanes son vienbenidos");
//        }
//            
//        else{
//            System.out.println("Tu nombre no me gusta. Bye bye");
//        }
//        
//        
//        //Ejemplo 5 - If..elseif..else
//        int hora;
//        System.out.print("Introduzca una hora (>= 0 y <= 23): ");                                                 
//        hora = Integer.parseInt(teclado.nextLine());
//        
//        
//        if (hora >= 0 && hora < 12) {
//            System.out.println("Buenos días");
//        } else if (hora >= 12 && hora < 21) {
//            System.out.println("Buenas tardes");
//        } else if (hora >= 21 && hora < 24) {
//            System.out.println("Buenas noches");
//        } else {
//            System.out.println("Hora no válida");
//        }
//        System.out.println("Hasta pronto!!!");      
        

        //Ejemplo6 - if..esle anidados
        //Si soy menor de edad, me quedo en casa jugando. Si soy mayor de edad, depende:
        //si tengo dinero salgo de fiesta, sino, me voy a pasear.
        
        System.out.print("Dime la edad:");
        int edad=Integer.parseInt(teclado.nextLine());
        
        System.out.print("¿Tienes dinero [S | N]?:");
        String si_no=teclado.nextLine();
        //Paso a booleano la respueta s_n
        boolean tengo_dinero;
        if (si_no.equals("S")){
            tengo_dinero=true;
        }
        else {
             
            tengo_dinero=false;
        }
        
        
        if (edad<18){
            System.out.println("Me quedo jugando a la play");
        }
        else{
            if (tengo_dinero==true){
                System.out.println("Me voy de fiesta!!");
            }
            else{
                System.out.println("Me voy a pasear (sin €)");
            }
        }
        
        
        


          //USO DEL SWITCH
//          //Dado un numero de mes, decir el nombre
//          System.out.print("Dime el numero de mes: ");
//          int mes=Integer.parseInt(teclado.nextLine());
//          
//          switch (mes){
//              case 1: System.out.print("El mes 1 es ");
//                      System.out.println("ENERO");
//                      break;
//              case 2: System.out.println("FEBRERO");
//                      break;
//              case 3: System.out.println("MARZO");
//                      break;
//              case 4: System.out.println("ABRIL");
//                      break;
//              case 5: System.out.println("MAYO");
//                      break;
//              case 6: System.out.println("JUNIO");
//                      break;
//              case 7: System.out.println("JULIO");
//                      break;
//              case 8: System.out.println("AGOSTO");
//                      break;
//              case 9: System.out.println("SEPTIEMBRE");
//                      break;
//              case 10: System.out.println("OCTUBRE");
//                      break;
//              case 11: System.out.println("NOVIEMBRE");
//                      break;
//              case 12: System.out.println("DICIEMBRE");
//                      break;
//              default:
//                      System.out.println("ERROR: mes incorrecto");
//                      break;
//          }
//          
//            switch (mes){
//              case 1: 
//              case 3: 
//              case 5: 
//              case 7: 
//              case 8: 
//              case 10: 
//              case 12:
//                      System.out.println("31 días");
//                      break;
//              case 4: 
//              case 6: 
//              case 9: 
//              case 11: 
//                      System.out.println("30 días");
//                      break;
//              case 2:
//                      System.out.println("28 dias");
//                      break;
//              default:
//                      System.out.println("ERROR: mes incorrecto");
//                      break;
//          }
//          
          
        
          
          
          
          
        
        
        
        
        
    }
    
}
