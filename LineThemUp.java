/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linethemup;

import java.util.Scanner;

/**
 *
 * @author arafa
 */
public class LineThemUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int incCount = 0;
        int decCount = 0;
        String order = "";
        String[] names = new String[N];
        for(int i = 0; i < N; i++){
            names[i] = sc.next();
        }
        
        for(int i = 1; i < names.length; i++){
            if(names[i].charAt(0) > names[i-1].charAt(0)){
                incCount++;
            }
            if(names[i].charAt(0) < names[i-1].charAt(0)){
                decCount++;
            }
        }
        if(incCount == names.length-1){
            System.out.println("INCREASING");
        }
        else if(decCount == names.length-1){
            System.out.println("DECREASING");
        }
        else{
            System.out.println("NEITHER");
        }
    }
    
}
