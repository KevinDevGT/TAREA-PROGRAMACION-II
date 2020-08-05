/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejeinterface;

import javax.swing.JOptionPane;

/**
 *
 * @author zeus
 */
public class Empleado extends Persona implements Enfermo{
   
    double sueldo;
    String telefono, direccion;
    public  Empleado (String nom, int ed, double suel, String tel, String dir){
        super(nom, ed);
        this.direccion=dir;
        this.sueldo=suel;
        this.telefono=tel;

}

  
    @Override
    public void verDatos(){
    
        JOptionPane.showMessageDialog(null, "Nombre:"+nombre+"\nEdad:"+ edad + "\nSueldo:Q"+sueldo
        +"\nTrabaja en:"+ direccion, "Datos del Empleado", JOptionPane.INFORMATION_MESSAGE);
    
    }
    @Override
    public void tos(){
    JOptionPane.showMessageDialog(null, "Hola, estoy enfermos de Tos :(");
        
    }
    @Override
    public void covid19(){
    
    JOptionPane.showMessageDialog(null,"Hola, lo siento tengo Covid-19 :(");
    }
    
       @Override
    public void accidente(){
    
    JOptionPane.showMessageDialog(null,"Hola, lo siento tuve un accidente :(");
    }
    
}
