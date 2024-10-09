
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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        
        
        String nombre, apellido1, apellido2;
        char inicialN1, inicialN2 = 0, inicialA1, inicialA2;
        boolean nombreCompuesto=false;
        
        
        System.out.println("Mostrar las iniciales del nombre");
        System.out.println("----------------------------------------");

        System.out.print("Introduce el nombre:");
        nombre=entrada.nextLine();
        System.out.print("Introduce el apellido1:");
        apellido1=entrada.nextLine();
        System.out.print("Introduce el apellido2:");
        apellido2=entrada.nextLine();
        
        
        
        //OPCION 1 - sencilla y directa, sin usar booleanos
        
        //Comprobamos si es nombre simple o compuesto
        //Si hay un espacio en el nombre, es compuesto    
        
        int posicionBlanco=nombre.indexOf(' ');
        
        if (posicionBlanco!=-1) {
            inicialN1=nombre.charAt(0);
            //int posicionBlanco=nombre.indexOf(' ');
            inicialN2=nombre.charAt(posicionBlanco+1);
            inicialA1=apellido1.charAt(0);
            inicialA2=apellido2.charAt(0);
        
            System.out.println("Las iniciales del nombre son: "+inicialN1+inicialN2+inicialA1+inicialA2);
       
        }
        else{
            inicialN1=nombre.charAt(0);
            inicialA1=apellido1.charAt(0);
            inicialA2=apellido2.charAt(0);
        
            System.out.println("Las iniciales del nombre son: "+inicialN1+inicialA1+inicialA2);
        }
            
            
         
        
        //OPCION2 - usando booleanos
        
        //Comprobamos si es nombre simple o compuesto
        //Si hay un espacio en el nombre, es compuesto    
//        if (nombre.indexOf(' ')!=-1) {
//            inicialN2=nombre.charAt(nombre.indexOf(' ')+1);
//            nombreCompuesto=true;
//        }
//        else{
//            nombreCompuesto=false;   //no sería necesario pues es false por defecto
//        }    
//        
//        inicialN1=nombre.charAt(0);
//        inicialA1=apellido1.charAt(0);
//        inicialA2=apellido2.charAt(0);
//        
//        
//        if (nombreCompuesto==true)
//            System.out.println("Las iniciales del nombre son: "+inicialN1+inicialN2+inicialA1+inicialA2);
//        else
//            System.out.println("Las iniciales del nombre son: "+inicialN1+inicialA1+inicialA2);
          
      
       
        
        
        
        
        
        
    }
    
}
