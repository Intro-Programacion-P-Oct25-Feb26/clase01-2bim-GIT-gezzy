/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author jdavi
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        int operacion;
        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;
        int suma4 = 0;
        String mensajeFinal = "";
        for (int i = 30; i >= 10; i--) {
            for (int contador = 1; contador <= 4; contador++) {
                operacion = i * contador;
                switch (contador) {
                    case 1:
                        suma1 = suma1 + operacion;
                        break;
                    case 2:
                        suma2 = suma2 + operacion;
                        break;
                    case 3:
                        suma3 = suma3 + operacion;
                        break;
                    case 4:
                        suma4 = suma4 + operacion;
                        break;
                }
                if (contador < 4) {
                    mensajeFinal = String.format("%s%d-",
                            mensajeFinal, operacion);
                } else {
                    mensajeFinal = String.format("%s%d",
                            mensajeFinal, operacion);
                }
            }
            mensajeFinal = String.format("%s\n\n", mensajeFinal);
        }
        mensajeFinal = String.format("%sTotales = %d-%d-%d-%d\n",
                mensajeFinal, suma1, suma2, suma3, suma4);
        System.out.printf("%s\n", mensajeFinal);
    }
}
