/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_clases_objetos_2;

import java.util.Scanner;

/**
 *
 * @author Bryan Rivera Villaseñor
 */
public class EVA1_4_CLASES_OBJETOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciar la clase persona--> new
        //1.- los objetos son indentificadores (variables)
        int iVal;//declara
        Persona bPersona1; //declaracion
        //instanciar = asignar un valor (memoria) -->new
        iVal = 10;
        bPersona1 = new Persona();//el objeto existe
        //capturar el nombre
        System.out.println("Introduce tu nombre: ");
        Scanner bCap = new Scanner (System.in);
        bPersona1.Nombre = bCap.nextLine();
        
        Persona bPersona2 = new Persona();
        System.out.println("Introduce tu apellido: ");
        bPersona2.Apellido = bCap.nextLine();
        
        Persona bPersona3 = new Persona();
        System.out.println("Introduce tu RFC: ");
        bPersona3.RFC = bCap.nextLine();
        
        Persona bPersona4 = new Persona();
        System.out.println("Introduce tu genero: ");
        bPersona4.Genero = bCap.nextLine();
        
        Persona bPersona5 = new Persona();
        System.out.println("Introduce tu estado civil: ");
        bPersona5.EstadoCivil = bCap.nextLine();
        
        Persona bPersona6 = new Persona();
        System.out.println("Introduce tu ciudad: ");
        bPersona6.Ciudad = bCap.nextLine();
        
        Persona bPersona7 = new Persona();
        System.out.println("Introduce tu edad: ");
        bPersona7.edad = bCap.nextInt();
        
        Persona bPersona8 = new Persona();
        System.out.println("Introduce el numero de estado de nacimiento: ");
        bPersona8.EstadoNaci = bCap.nextInt();
        
        
        System.out.println("Tu nombre completo es: " +bPersona1.Nombre+ " " +bPersona2.Apellido+ "");
        System.out.println("Tu RFC es: " +bPersona3.RFC);
        System.out.println("Tu genero es: " +bPersona4.Genero);
        System.out.println("Tu estado civil es: " +bPersona5.EstadoCivil);
        System.out.println("Tu ciudad es: " +bPersona6.Ciudad);
        System.out.println("Tu edad es: " +bPersona7.edad);
        System.out.println("El numero de estado de nacimiento es: " +bPersona8.EstadoNaci);
    }
    
}
class Persona{
    //atributos de la clase
    //determinar el estado del objeto
    String Nombre, Apellido, RFC, Genero, Ciudad, EstadoCivil;
    int edad, EstadoNaci;
    //comportamineto de la clase
    //metodos y/o funcion
    //nivel de acceso || valor de retorno || nombre (argumento)
    public void imprimeNombreCompleto(){
        System.out.println(Nombre+ " " +Apellido);
    }
}
