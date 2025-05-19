/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cudoviste;

import java.util.Scanner;

/**
 *
 * @author arafa
 */
public class Cudoviste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int Rows = sc.nextInt();
        int Cols = sc.nextInt();
        String[][] Map = new String[Rows][Cols];
        int[] Cars = new int[5];
        
        for(int i = 0; i < Cols; i++){
            for(int j = 0; j < Rows; j++){
                 Map[j][i] = sc.next();
            }
        }
        for(int i = 0; i < Rows; i++){
            if(i == Rows-1){
                continue;
            }
            else{
                for(int j = 0; j < Cols; j++){
                    if(j == Cols-1){
                        continue;
                    }
                    else{
                       String a = Map[i][j];
                       String b = Map[i+1][j];
                       String c = Map[i][j+1];
                       String d = Map[i+1][j+1];
                       int count = 0;
                       if(a.equals("#") || b.equals("#") || c.equals("#") || d.equals("#")){
                           continue;
                       }
                       
                       else{
                           if(a.equals("X")){
                               count++;
                           }
                           if(b.equals("X")){
                               count++;
                           }
                           if(c.equals("X")){
                               count++;
                           }
                           if(d.equals("X")){
                               count++;
                           }
                           Cars[count]++;
                       }
                    }
                }
            }
        }
        for(int i = 0; i < Cars.length; i++){
            System.out.println(Cars[i]);
        }
        
    }
    
}
