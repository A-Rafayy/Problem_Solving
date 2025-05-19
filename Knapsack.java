/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package knapsack;

import java.util.Scanner;

/**
 *
 * @author arafa
 */
public class Knapsack {
    
    int maxValue(){
        
        return 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        while(true){
            int C = sc.nextInt();
            int n = sc.nextInt();
            int profit = -1;
            
            int[] values = new int[n+1];
            int[] weights = new int[n+1];
            int[][] K = new int[n+1][C+1];
            values[0] = 0;
            weights[0] = 0;
            int ww = 0;
            
            for(int i = 1; i <= n; i++){
                values[i] = sc.nextInt();
                weights[i] = sc.nextInt();
            }
            for(int i = 0; i <= n; i++){
                for(int w = 0; w <= C; w++){
                    if(i == 0 || w == 0){
                        K[i][w] = 0;
                    }
                    else if(weights[i] <= w){
                        K[i][w] = Math.max(values[i]+K[i-1][w-weights[i]], K[i-1][w]);
                    }
                    else{
                        K[i][w] = K[i-1][w];
                    }
                    ww = w;
                }
            }
            System.out.println(K[n][ww]);
        }
    }
    
}
