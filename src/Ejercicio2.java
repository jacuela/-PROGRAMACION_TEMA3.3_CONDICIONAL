
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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner (System.in);
        
        String usuario;
        String password;
        
        System.out.println("Pantalla de Login");
        System.out.println("=================");
        System.out.print("Usuario:");
        usuario=entrada.nextLine();
        System.out.print("Password:");
        password=entrada.nextLine();
        
        //OPCION1
        if (usuario.equals("root") && password.equals("toor")){
           
            System.out.println("OP1:Login correcto. Welcome.");
        
        }else{
            System.out.println("OP1:Login incorrecto. Bye...");
            
        }
        
        //OPCION2
        if (usuario.equals("root")){
            //Si llego aquí, el usuario es correcto
            if (password.equals("toor")){
                //Si llego aqui, la contraseña tb es correcta
                System.out.println("OP2:Login correcto. Welcome.");
            }
            else{
                //Usuario correcto PERO contraseña incorrecta
                 System.out.println("OP2:Contraseña erronea. Bye");
            }
        }
        else{
            System.out.println("OP2: usuario incorrecto"); 
        }
        
        
        //OPCION3 - usando booleanos
//        boolean usuarioOK=false;
//        boolean passwordOK;
//        
//        //Primero, relleno las variables booleanas
//        if (usuario.equals("root")){ 
//            usuarioOK=true;
//        }    
//        else{
//            usuarioOK=false;
//        }
//        
//        
//        if (password.equals("toor")){ 
//            passwordOK=true;
//        }
//        else{
//            passwordOK=false;
//        }
//            
//        
//        //Segundo, las analizo
//        if (usuarioOK==true && passwordOK==true){
//            System.out.println("OP3: Login correcto");
//        }
//        else{
//            System.out.println("OP3: ERROR de login");
//
//        }
        
        
        
        
    }
    
}
