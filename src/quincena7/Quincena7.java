/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quincena7;

import java.util.Scanner;

/**
 *@version 3.1
 * @author Ruben
 */

/**
 * Este será el proyecto principal donde iremos añadiendo las diferentes clases
 * creadas para componer el proyecto final.
 * 
 */

public class Quincena7 { // Clase principal, donde contiene todo el codigo para funcionar correctamente.

  public static void main(String[] args) {
      
     /**
     *
     * @param args. En estos argumentos, declararemos los datos de las personas
     * 
     */
      
       //Establecemos las clases para las personas 1 y 2
        Persona persona1;
        Persona persona2;
        
       // Añadimos los teclados
        Scanner teclado = new Scanner(System.in); 
        Scanner tec = new Scanner(System.in); 
        
        //Declaramos la variable anyo
        int anyo;      
        //Establecemos el año actual, mediante una pregunta al usuario
        System.out.println("Introduce el año actual: ");
        anyo = teclado.nextInt();     
        //Declaramos las variables para los distintos resultados que obtendremos
        int resultado1, resultado2, resultado3;         
       //* Creamos el constructor de la primera persona *//
   
        persona1 = new Persona("Pepa", "Garcia Navarro", "44879652L", 21);
        
        resultado1 = persona1.dameAnyoNacimiento(anyo);
        
        //Mostraremos en pantalla la ejecución del constructor 
        
        System.out.println("La persona " + persona1.getNombre() + " " + persona1.getApellidos() + ", con DNI " + persona1.getDni() + " ha nacido en el año " + resultado1);
        
        
       /* Creamos el constructor de la segunda persona */
        
        persona2 = new Persona("Lumilda Maria", "Perez Gimenez", "21979552WL", 42);
        
        resultado2 = persona2.dameAnyoNacimiento(anyo);
        
        
        //Mostraremos en pantalla la ejecución del constructor 
         System.out.println("La persona " + persona2.getNombre() + " " + persona2.getApellidos() + ", con DNI " + persona2.getDni() + " ha nacido en el año " + resultado2);
         
         
         /* Crearemos el constructor de la tercera persona y sus respectivas variables */
         
        // Declaramos las variables de la tercera persona, esta persona deberá introducir sus datos mediante teclado.
        String nombre, apellidos, dni, segSocial;
        int edad;
         
        //Declaramos los distintos Scanners donde se deberá introducir la información del usuario
        
        //Scanner para el nombre
         System.out.println("Introduce tu nombre: ");
            nombre = tec.nextLine();
            
        //Scanner para apellidos 
         System.out.println("Introduce tus apellidos: ");
        apellidos = tec.nextLine();
        
         //Scanner para el DNI
         System.out.println("Introduce tu DNI: ");
         dni = tec.nextLine();
         
         //Scanner para el nº de Seguridad Social
        System.out.println("Introduce tu número de Seguridad Social: ");
        segSocial = tec.nextLine();
        
         // Scanner para su edad
         System.out.println("Introduce tu edad: ");
        edad = tec.nextInt();


        //Creamos el constructor de la tercera persona, con las variables anteriormente creadas
        Trabajador persona3;{
        persona3 = new Trabajador(nombre,apellidos,dni,edad,segSocial);
         
         // Obtendremos el año de nacimiento
         resultado3= persona3.dameAnyoNacimiento(anyo);}
         
         // Y aqui mostraremos los resultados en pantalla una vez introducidos todos los datos
         
         System.out.println("La persona " + persona3.getNombre()+ " " + persona3.getApellidos()+ ", con DNI " + persona3.getDni() + " y Nº de Seguridad Social: " + persona3.getSegsocial() + ", ha nacido en el año :" + resultado3);
         
         
        
    }
    
}
