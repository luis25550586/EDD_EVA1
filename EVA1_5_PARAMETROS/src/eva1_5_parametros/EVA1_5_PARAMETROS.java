/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_parametros;

/**
 *
 * @author Luis
 */
public class EVA1_5_PARAMETROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // paso por valor 
        int i = 5;
        System.out.println("valor de i - " + i);
        incrementar(i);
        System.out.println("valor de i (despues de incrementar) = " + i);
        Prueba prueba = new Prueba();
        System.out.println("Valor de prueba.y = " + prueba.y);
    }
 public static void incrementar (int valor){// PASO POR EL VALOR (RECIBIDO POR LA COPIA
     valor++;
 }
 
 public static void incrementarOBJ(Pruebaobjeto){
     objeto++;
 }
 class prueba{
     // paso por referencia
     int i = 5; 
 }
}
