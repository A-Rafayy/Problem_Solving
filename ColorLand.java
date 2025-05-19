/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colorland;

import java.util.Scanner;

/**
 *
 * @author arafa
 */
public class ColorLand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] Squares = new String[n];
        for(int i = 0; i < n; i++){
            Squares[i] = sc.next();
        }
        String last = Squares[n-1];
        int count = 0;
        for(int i = n-2; i >= 0; i--){
            if(Squares[i].equals(last)){
                count++;
            }
        }
        System.out.print(count+1);
    }
    
}
