/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maximumsubarrays;

import java.util.Scanner;

/**
 *
 * @author arafa
 */
public class MaximumSubarrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        int[] Ksubarrays = new int[k];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + array[i];
            if(sum < 0){
                sum = 0;
            }
            else{
                if(sum > maxSum){
                    maxSum = sum;
                    System.out.println(maxSum);
                }
            }
        }
        System.out.println(maxSum);
    } 
}
