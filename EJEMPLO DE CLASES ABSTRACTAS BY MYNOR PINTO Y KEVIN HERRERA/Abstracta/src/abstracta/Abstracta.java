/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracta;
    import java.util.Scanner;

import java.io.IOException;

/**
 *
 * @author KEVUDA
 */

public class Abstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado=new Scanner(System.in);
        Planta planta = new Planta();
        Carnivoro carnivoro = new Carnivoro();
        Herbivoro herbivoro = new Herbivoro();
        Humanos humanos = new Humanos();
        int Op=1; 
        while(Op!=0)
        {
        System.out.println("Elige un ser vivo que come");
        System.out.println("1. Plantas ");
        System.out.println("2. Animal");
        System.out.println("3. Humanos ");
        System.out.println("0. Salir de la aplicacion");
        Op=teclado.nextInt();
        switch(Op)
        {
            case 1:
                    planta.comer();
                    break;
            case 2:
                
                System.out.println("Elige un animal Segun su alimentacion ");
                System.out.println("1. Carnivoro");
                System.out.println("2. Herbivoros");
                Op=teclado.nextInt();
                switch(Op)
                {
                    case 1:
                        carnivoro.comer();
                        break;
                    case 2:
                       herbivoro.comer();
                       break;
                }   
            case 3:
                    humanos.comer();
                    break;
            case 0:
                System.out.println("Saliendo del sistema...");
                Thread.sleep(2000);
                System.exit(0);
                break;
                
            default:
                   System.out.println("Opcion Incorrecta");
                   
        }
                
       
        
    } 
    }
    
}
