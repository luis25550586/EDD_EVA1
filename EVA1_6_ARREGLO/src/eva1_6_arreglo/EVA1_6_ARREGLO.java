/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_arreglo;

/**
 *
 * @author Luis
 */
public class EVA1_6_ARREGLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] datos = new int [100000000];
        System.out.println(datos);
        for(int i = 0; i < datos.length; i++){
            datos[i] = (int)(Math.random() * 100);
        }
    }
    
}
