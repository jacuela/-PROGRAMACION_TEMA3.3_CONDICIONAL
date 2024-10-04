
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
public class Ejercicio3bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada=new Scanner (System.in);
        Double notaEvaluacion, examen1, examen2, examen3;
        String trabajo;
        
        System.out.println("Calcular la nota");
        System.out.println("****************");
        
        System.out.print("Nota del primer examen:");
        examen1=Double.parseDouble(entrada.nextLine());         
        System.out.print("Nota del segundo examen:");
        examen2=Double.parseDouble(entrada.nextLine());         
        System.out.print("Nota del tercer examen:");
        examen3=Double.parseDouble(entrada.nextLine());
        System.out.print("Has entregado el trabajo [S | N]: ");
        trabajo=entrada.nextLine();
        
        
        if (trabajo.equals("S") || trabajo.equals("s") ){
             notaEvaluacion=examen1*0.3+examen2*0.3+examen3*0.4;
        }else{
            notaEvaluacion=4.0;
        }    
    
        //Para evitar la condición doble, puedo usar
        //if (trabajo.equalsIgnoreCase("s")){
        
        
        System.out.println("---------------------------------------");
        System.out.println("La nota de la evaluación es:"+notaEvaluacion);
        
        System.out.print("Tu calificación es: ");
        
        if (notaEvaluacion >=0 && notaEvaluacion<5){
            System.out.println("SUSPENSO");
        } else if (notaEvaluacion>=5 && notaEvaluacion <6){
            System.out.println("SUFICIENTE");
        } else if (notaEvaluacion>=6 && notaEvaluacion <7){
            System.out.println("BIEN");
        } else if (notaEvaluacion>=7 && notaEvaluacion <9){
            System.out.println("NOTABLE");
        } else if (notaEvaluacion>=9 && notaEvaluacion <10){
            System.out.println("SOBRESALIENTE");
        } else if (notaEvaluacion == 10){
            System.out.println("MATRICULA DE HONOR");
        } else {
            System.out.println("ERROR!! - calificacion invalida");
        }
        
        
        
        
        
        
        
        
    
    }
    
}
