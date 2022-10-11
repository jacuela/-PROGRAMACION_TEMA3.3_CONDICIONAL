
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
public class Ejercicio6bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int dia,mes,year;
        
        boolean yearCorrecto;
        boolean mesCorrecto;
        boolean diaCorrecto;
        
        
        System.out.print("Dime una fecha separada por espacios [d m a]:");
        dia=teclado.nextInt();
        mes=teclado.nextInt();
        year=teclado.nextInt();
        
        //Analizo el año
        if (year >=1900 && year <=2500){
            yearCorrecto=true;
        }
        else{
            yearCorrecto=false;
        }
                
        //Analizo el mes
        if (mes >=1 && mes <=12){
            mesCorrecto=true;
        }
        else{
            mesCorrecto=false;
        }
      
        //Analizo el dia
        switch(mes){
            case 1,3,5,7,8,10,12:
                //Meses de 31 dias
                if (dia >=1 && dia<=31){
                    diaCorrecto=true;
                }
                else{
                    diaCorrecto=false;
                }
                                 
                break;
            case 4,6,9,11:
                //Meses de 30 dias
                if (dia >=1 && dia<=30){
                    diaCorrecto=true;
                }
                else{
                    diaCorrecto=false;
                }
                
                break;
            case 2:
                //Analizo febrero
                //Si el año es bisiesto
                if (Year.of(year).isLeap()){
                    if (dia>=1 && dia<=29){ 
                        diaCorrecto=true;
                    }
                    else{
                        diaCorrecto=false;
                    }
                }
                
                //Si no es bisiesto
                else{
                    if (dia>=1 && dia<=28){ 
                        diaCorrecto=true;
                    }
                    else{
                        diaCorrecto=false;
                    }
                }    
                break;
            default:
                diaCorrecto=false;
       }
        
        //Llegado a este punto, tengo tres variables booleanas
        //que me indican si son o no correctos el año, mes u dia
        if (diaCorrecto==true && mesCorrecto==true && yearCorrecto==true)
            System.out.println("\033[32m La fecha es correcta");
        else
           System.out.println("\033[31m La fecha es incorrecta");
            
        
    }
    
}
