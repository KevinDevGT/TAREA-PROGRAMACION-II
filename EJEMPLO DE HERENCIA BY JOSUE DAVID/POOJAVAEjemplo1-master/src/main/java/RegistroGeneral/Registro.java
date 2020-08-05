 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistroGeneral;

/**
 *
 * @author beltetonjosue96
 */
public class Registro extends DatosPersonal {
    private int Correlativo;
    private String Area;
    private int Hora;
    
    public Registro (String Nombre, String Apellido,String Especialidad, int Correlativo, String Area, int Hora){
        super(Nombre,Apellido,Especialidad);
                this.Correlativo = Correlativo;
                this.Area =Area;
                this.Hora = Hora;
    }
    public void procesarDatos(){
        System.out.println
        ("Bienvenido colaborador"+
                "\nCorrelativo: "+Correlativo+
                "\nNombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nEspecialidad: "+getEspecialidad()+
                "\nArea: "+Area+
                "\nHora de ingreso: "+Hora
        );
    }
}
