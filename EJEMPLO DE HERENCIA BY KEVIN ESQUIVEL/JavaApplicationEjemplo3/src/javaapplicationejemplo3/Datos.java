
package javaapplicationejemplo3;

import javax.swing.JOptionPane;


public class Datos extends Automoviles {
     int carrosVendidos;
     String mes;
     String direccion;
     
     //herecias     
     public Datos(String nm, int mod, String dir,String ms,int car){
         super(nm, mod);
         //nuevas variables de esta clase
         this.carrosVendidos = car;
         this.direccion = dir;
         this.mes = ms;
     }
     
     @Override
      public void verDatos(){
    //Mostramos los datos
  
  JOptionPane.showMessageDialog(null, "Marca: " + marca + "\nModelo: "+ model + 
          "\nDireccion: " + direccion + "\nMes: " + mes,"\nCarros Vendidos: ",JOptionPane.INFORMATION_MESSAGE);
  
    }
      
        
}
