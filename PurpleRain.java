/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package purple.rain;

import java.util.Scanner;

/**
 *
 * @author arafa
 */
public class PurpleRain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        String raindrops = sc.nextLine();
        
        int start_index = -1;
        int end_index = -1;
        int sum = 0;
        int max_sum = 0;
        int min_sum = 0;
        for(int i = 0; i < raindrops.length(); i++){
            String a = raindrops.charAt(i) + "";
            if(a.equals("B")){
                sum += 1;
                if(sum > max_sum){
                    max_sum = sum;
                    end_index = i;
                } 
            }
            else if(a.equals("R")){
                if(sum > max_sum){
                    max_sum = sum;
                    end_index = i;
                }
            }
        }
    }
    
}
