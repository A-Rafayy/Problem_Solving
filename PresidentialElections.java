/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package presidentialelections;

import java.util.Scanner;

/**
 *
 * @author arafa
 */
public class PresidentialElections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int FDelegates = 0;
        int CDelegates = 0;
        int[] D = new int[S];
        int[] required = new int[S];
        int[] U = new int[S];
        int voters = 0;
        for(int i = 0; i < S; i++){
            int d = sc.nextInt();
            int c = sc.nextInt();
            int f = sc.nextInt();
            int u = sc.nextInt();
            if(c-u > f){
                CDelegates += d;
                D[i] = d;
                required[i] = ((u-f+c)/2)+1;
                U[i] = u;
            }
            else if(c+u > f){
                CDelegates += d;
                D[i] = d;
                required[i] = c+(f-c)+1;
                U[i] = u;
            }
            else if((c+u) < f){
                FDelegates += d;
                D[i] = d;
                required[i] = 0;
            }
//            else{FDelegates += d;}
        }
        
        if(CDelegates > ((CDelegates+FDelegates)/2)+1){
            int r = 0;
            for(int i = 0; i < S; i++){
                r += required[i];
            }
            System.out.println(r);
        }
        else{
            System.out.println("Impossible");
        }
        
        
    }
    
}
