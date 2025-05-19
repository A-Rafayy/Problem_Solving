/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package theowlandthefox;

import java.util.Scanner;

/**
 *
 * @author arafa
 */
public class TheOwlAndTheFox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int i = 0; i < testCases; i++){
            int number = sc.nextInt();
            if(number % 100000 == 0){
                System.out.println(number-100000);
            }
            else if(number % 10000 == 0){
                System.out.println(number-10000);
            }
            else if(number % 1000 == 0){
                System.out.println(number-1000);
            }
            else if(number % 100 == 0){
                System.out.println(number-100);
            }
            else if(number % 10 == 0){
                System.out.println(number-10);
            }
            else{
                System.out.println(number-1);
            }
        }
    }
    
}
