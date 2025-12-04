/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadenaFinal = "";
        int valor = 0;
        for (int i = 1; i <= 10; i++) { // i es variable INDEPENDIENTE
            
            cadenaFinal = String.format("%s%d", 
                    cadenaFinal,i);
        }
        // System.out.printf("%d", i);
        // valor = 10;
        for (int i = 1; i < 11; i++) {
            cadenaFinal = String.format("%s%d", 
                    cadenaFinal,i);
        }
        
        System.out.printf("%s", cadenaFinal);

    }

}
