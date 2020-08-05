
package javaapplicationejemplo3;
import javax.swing.JOptionPane;

public class JavaApplicationEjemplo3 {

   
    public static void main(String[] args) {
         String marca ;
         int model;
         int carrosVendidos;
         String mes;
         String direccion;
         
        
  
         marca = JOptionPane.showInputDialog(null, "Ingrese la Marca del Vehiculo: ", "Recopilacionn de datos", 2);
         model = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Modelo del Vehiculo: ", "Recopilacionn de datos", 2));
         mes = JOptionPane.showInputDialog(null, "Ingrese el Mes de la venta: ", "Recopilacionn de datos", 2);
         direccion = JOptionPane.showInputDialog(null, "Ingrese la Direccion de la venta del Vehiculo: ", "Recopilacionn de datos", 2);
         carrosVendidos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de Vehiculo vendidos: ", "Recopilacionn de datos", 2));
         
      
         
      Datos datos = new Datos(marca, model, direccion, mes, carrosVendidos);
      Datos datos2 = new Datos("FORD", 2020, "GUATEMALA, GUATEMALA", "AGOSTO", 9);
      datos.verDatos();
      datos2.verDatos();
    }
    
}
