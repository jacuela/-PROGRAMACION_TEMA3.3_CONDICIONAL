
import java.time.Year;
import java.time.LocalDate;
import java.time.Month;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class Bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int year=2020;
        
        if (Year.of(year).isLeap()) 
            System.out.println(year+" Año BISIESTO");
        else
            System.out.println(year+" Año NO BISIESTO");
        
        
        LocalDate fechaLD=LocalDate.of(year, 1, 1);
         if (fechaLD.isLeapYear()) 
            System.out.println(year+" Año BISIESTO");
        else
            System.out.println(year+" Año NO BISIESTO");
        
        
    }
    
}
