/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_1_scope;

/**
 *
 * @author Luism
 */
public class EVA1_1_SCOPE {
    public static void main(String[] args) {
        int x = 100;// eXISTE DENTRO DEL BLOQUE MAIN
        for(int i = 0; i < 10;i++){
            System.out.println("i = " + i);
            x++;//VISIBLE DENTRO DEL FOR
        }
        System.out.println("Valor final de la i = " + i);// YA NO EXISTE  
        System.out.println("Valor final de la i = " + x);// TODAVIA EXISTE

}
    }
    public static void OtraFuncion(){
        System.out.println("Valor de x = " + x);// NO EXISTE
}
