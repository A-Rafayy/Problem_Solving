/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fruitbaskets;

import java.util.Scanner;

/**
 *
 * @author arafa
 */
public class FruitBaskets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        int[] weights = new int[input];
        for(int i = 0; i < input; i++){
            weights[i] = sc.nextInt();
        }
        System.out.print(weights.length);
    }
    
}
