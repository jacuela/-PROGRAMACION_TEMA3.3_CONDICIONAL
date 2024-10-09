
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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int dia,mes,year;
        
        System.out.print("Dime una fecha separada por espacios [d m a]:");
        dia=teclado.nextInt();
        mes=teclado.nextInt();
        year=teclado.nextInt();
        
        System.out.println("Fecha a analizar: "+dia+"/"+mes+"/"+year);
        
        //Analizo el año
        if (year >=1900 && year <=2500){
            System.out.println("El año es CORRECTO");
        }
        else{
            System.out.println("ERROR en al año");
        }
        
        //Analizo el mes
        if (mes >=1 && mes <=12){
            System.out.println("El mes es CORRECTO");
        }
        else{
            System.out.println("ERROR en el mes");
        }
        
        //Analizo el dia
        switch(mes){
            case 1,3,5,7,8,10,12:
                //Meses de 31 dias
                
                if (dia >=1 && dia<=31){
                    System.out.println("El dia es CORRECTO");
                }
                else{
                    System.out.println("ERROR en el dia.");
                }
                    
                break;
            case 4,6,9,11:
                //Meses de 30 dias
                if (dia >=1 && dia<=30){
                    System.out.println("El dia es CORRECTO");
                }
                else{
                    System.out.println("ERROR en el dia");
                }
                break;
            case 2:
                //Analizo febrero. Pero primero veo si es bisiesto
                if (Year.of(year).isLeap()){
                    //El año SI es bisiesto 
                    if (dia>=1 && dia<=29){
                        System.out.println("El dia es CORRECTO");
                    }
                    else{
                        System.out.println("ERROR en el dia");
                    }
                
                }
                else{
                   //El año NO es bisiesto     
                   if (dia>=1 && dia<=28){
                        System.out.println("El dia es CORRECTO");
                   }
                   else{
                        System.out.println("ERROR en el dia");
                   }     
                }
                
                break;
            default: 
                System.out.println("ERROR en el mes");
                
        }
        
    }
    
}


//Si el año es bisiesto
              