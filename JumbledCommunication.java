/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jumbledcommunication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author arafa
 */
public class JumbledCommunication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NumberFormatException {
        // TODO code application logic here
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt
        int[] cals = new int[255];
        
        
        for(int i = 0; i < 256; i++){
            int a = i ^ ((i << 1)&255);
            if(a%256 == 58){
                System.out.println(i + " = " + a);
            }
            
        }
    }
    
}
