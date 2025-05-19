/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ninepacks;

import java.util.Scanner;

/**
 *
 * @author arafa
 */
public class NinePacks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int[] h = new int[H];
        for(int i = 0; i < H; i++){
            h[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        int[] b = new int[B];
        for(int i = 0; i < B; i++){
            b[i] = sc.nextInt();
        }
        
    }
    
}
