/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package snakesandmasters;

import java.util.Scanner;

/**
 *
 * @author arafa
 */
public class SnakesAndMasters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 0;
        int b = 1;
        int next = 0;
        for (int i = 1; i <= N; ++i) {
            next = a + b;
            a = b;
            b = (int)(next%Math.pow(10, 6));
        }
        int ans = (int)(next%Math.pow(10, 6));
        System.out.println(ans);
    }
    
}
