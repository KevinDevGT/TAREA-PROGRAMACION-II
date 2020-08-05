/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejclaseabstracta;

import javax.swing.JOptionPane;

/**
 *
 * @author zeus
 */
public class Empleado extends Persona {
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
    
        JOptionPane.showMessageDialog(null, "Nombre:"+nombre+"\nEdad:"+ edad + "\nSueldo:"+sueldo
        +"\nDirección:"+ direccion, "Datos del Empleado", JOptionPane.INFORMATION_MESSAGE);
    
    }
    
}
