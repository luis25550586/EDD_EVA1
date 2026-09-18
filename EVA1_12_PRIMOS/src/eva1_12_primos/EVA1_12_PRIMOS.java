/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_primos;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class EVA1_12_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 29;

        boolean Primo1 = true;

        if (n < 2) {
            Primo1 = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    Primo1 = false;
                    break;
                }
            }
        }
        boolean Primo2 = true;

        if (n < 2) {
            Primo2 = false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    Primo2 = false;
                    break;
                }
            }
        }
        System.out.println("Resultado 1: " + Primo1);
        System.out.println("Resultado 2: " + Primo2);
    }
}