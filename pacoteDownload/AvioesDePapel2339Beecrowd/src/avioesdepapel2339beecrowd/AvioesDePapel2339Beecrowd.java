/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avioesdepapel2339beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class AvioesDePapel2339Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int C = teclado.nextInt();
        int P = teclado.nextInt();
        int F = teclado.nextInt();
        
        if (C * F <= P) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
    
}
