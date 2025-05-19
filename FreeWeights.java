/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package freeweights;

import java.util.Scanner;

/**
 *
 * @author arafa
 */
public class FreeWeights {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("Start");
        Scanner sc = new Scanner(System.in);
        int pairs = Integer.parseInt(sc.nextLine());
        
        int[] row1 = new int[pairs*2];
        int[] row2 = new int[pairs*2];
        
        String[] line1 = sc.nextLine().split(" ");
        String[] line2 = sc.nextLine().split(" ");
        for(int j = 0; j < pairs; j++){
            row1[j] = Integer.parseInt(line1[j]);
            row2[j] = Integer.parseInt(line2[j]);
        }
//        System.out.print("I am the answer ");
//        for(int i = 0; i < pairs; i++){
//            System.out.print(row2[i] + " ");
//        }

        int maxWeight = 0;
        int indexOfMaxWeight = 0;
        
        for(int i = 0; i < row1.length; i++){
            if(row1[i] > maxWeight){
                maxWeight = row1[i];
                indexOfMaxWeight = i;
            }
            if(row2[i] > maxWeight){
                maxWeight = row2[i];
                indexOfMaxWeight = i;
            }
        }
        System.out.print("Maximum Weight = " + maxWeight);
    }
    
}
