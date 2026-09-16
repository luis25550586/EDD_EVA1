/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_4dimenciones;

/**
 *
 * @author Luis
 */
public class EVA1_10_4DIMENCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][][][] arreglo = new int [2][2][2][2];// almacena 16 enteros
        
        for( int i = 0 ; i < arreglo.length; i++){ // PRIMER DIMENCION
            for( int j = 0 ; i < arreglo[i].length; j++){// SEGUNDA 
               for( int k = 0 ; i < arreglo[j].length; k++){// TERCERA 
                    for( int l = 0 ; i < arreglo[k].length; l++){// CUARTA
                        arreglo[i][j][k][l] = (int)(Math.random() * 100);
            
        }
            
        }
    }
    
        }
        for( int i = 0 ; i < arreglo.length; i++){ // PRIMER DIMENCION
            for( int j = 0 ; i < arreglo[i].length; j++){// SEGUNDA 
               for( int k = 0 ; i < arreglo[j].length; k++){// TERCERA 
                    for( int l = 0 ; i < arreglo[k].length; l++){// CUARTA
                        System.out.println("[" + arreglo[i][j][k][l] +"]");
            
        }
            
        }
    }
    
        }
    }
    
}
