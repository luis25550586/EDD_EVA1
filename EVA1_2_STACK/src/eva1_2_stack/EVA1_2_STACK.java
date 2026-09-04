/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_2_stack;

/**
 *
 * @author Luism
 */
public class EVA1_2_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inicia Main");
        A();
        System.out.println("Termina Main");
    }
    public static void A(){
        System.out.println("Inicia A");
        B();
        System.out.println("termina A");
    }
    public static void B(){
        System.out.println("Inicia B");
        int i = 5;
        double d = 5.5;
        System.out.println("Termina B");
    }
}
