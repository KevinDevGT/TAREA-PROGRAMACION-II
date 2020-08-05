/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejclaseabstracta;

/**
 *
 * @author zeus
 */

//haciendo la clase abstracta para evitar que sea instanciable
public abstract class Persona {
    
    String nombre;
    int edad;
    public Persona(String nom, int ed){
        this.nombre=nom;
        this.edad=ed;
    }
    //creando el metodo Abstracto 
    abstract public void verDatos();
}
