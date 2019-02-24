/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quincena7;

/**
 *
 * @author Ruben
 * @version 3.1
 */

/**
 * En esta clase será donde declaremos las distintas variables 
 * para obtener los datos de cada persona.
 *
 */ 

public class Persona{
    
    //Variables de la clase Persona
    
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    
    //Declaramos los getter de cada variable
    
 /**
     *Nos mostrará el nombre
     * @return this.nombre Devuelve el nombre
     */
    public String getNombre(){return this.nombre;}
    
    /**
     * Nos mostrará los apellidos
     * @return this.apellidos Devuelve los apellidos
     */
    public String getApellidos(){return this.apellidos;}
    
    /**
     * Nos mostrará el DNI
     * @return this.dni Devuelve el DNI
     */
    public String getDni(){return this.dni;}
    
    /**
     * Nos mostrará la edad
     * @return this.edad Devuelve la edad
     */
    public int getEdad(){return this.edad;}
    

    
    //Declaramos los setter de cada variable
    
    /**
     * Nos permite prediseñar el nombre desde el propio codigo
     * @param nuevoNombre aqui se guardaran el valor del nombre
     */
    
    public void setNombre(String nuevoNombre){
        
        this.nombre = nuevoNombre;   
    }
    
    /**
     * Nos permite prediseñar el apellido desde el propio codigo
     * @param nuevoApellido aqui se guardaran los apellidos
     */
    
    public void setApellidos(String nuevoApellido){
        
        this.apellidos = nuevoApellido;
    }
    
    /**
     * Nos permite prediseñar el DNI desde el propio codigo
     * @param nuevoDni  En este parametro se guardara el valor del DNI
     */
    public void setDni(String nuevoDni){
        
        this.dni = nuevoDni;
        
    }
    
    /**
     * Nos permite prediseñar la edad desde el propio codigo
     * @param nuevaEdad En este parametro se guardara la edad
     */
    
    public void setEdad(int nuevaEdad){
        
        this.edad = nuevaEdad;
    
    }
      
    //Crearemos el Metodo 
    
    /**
     * 
     * @param anyo Aqui se guarda el anyo actual
     * @return Devuelve el anyo de nacimiento
     */
    
    //Declaramos lo siguiente para obtener la edad mediante una resta entre año actual y edad de la persona
    
    public int dameAnyoNacimiento(int anyo){
        
        return (anyo - this.edad);    
    }
     
    //Crearemos el CONSTRUCTOR donde se almacenaran los datos de la persona
    
    /**.
     * @param nuevoNombre .
     * @param nuevoApellido 
     * @param nuevoDni
     * @param nuevaEdad 
     */
    
    public Persona(String nuevoNombre, String nuevoApellido, String nuevoDni, int nuevaEdad)
    {
        this.nombre = nuevoNombre;
        this.apellidos = nuevoApellido;
        this.dni = nuevoDni;
        this.edad = nuevaEdad;
    }
    
  }


    


    


