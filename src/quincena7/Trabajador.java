/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quincena7;

/**
 *
 * @author Ruben
 * @version 1.1
 */

/**
 * Aqui tendremos los parametros y metodos para los trabajadores
 * 
 */

    public class Trabajador extends Persona {
    
    //Variable que guardara el numero de la seguridad social
    private String SegSocial;

    //Getter
    
    /**
     * Nos muestra por pantalla el numero de seguridad social
     * @return this.SegSocial. Devuelve el valor de Seguridad Social
     */
    public String getSegsocial() {
        return this.SegSocial;
    }
    
    //Setter
    
    /**
     * Nos permite adjuntar un numero de seguridad social a la persona
     * @param nuevaSeg.
     */
    
    public void setSeg(String nuevaSeg){
        
        this.SegSocial = nuevaSeg;
    }
    
    // Metodo constructor de trabajador
    
    /**
     * Crearemos un "objeto" trabajador que además tendrá herencia de la clase persona
     * @param nombre Este parametro contiene el nombre del trabajador
     * @param apellidos Este parametro contiene los apellidos del trabajador
     * @param dni Este parametro contiene el dni del trabajador
     * @param edad Este parametro contiene la edad del trabajador
     * @param segSocial Este parametro contiene el numero de la Seguridad Social del trabajador
     */
    
    public Trabajador(String nombre, String apellidos, String dni, int edad, String segSocial) {
       super(nombre, apellidos, dni, edad);
         this.SegSocial = segSocial;
    }

}

