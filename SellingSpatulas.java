/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selling.spatulas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author arafa
 */
public class SellingSpatulas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        
        ArrayList<Integer> a = new ArrayList<Integer>(number);
        ArrayList<Double> p = new ArrayList<Double>(number);
        ArrayList<Double> s = new ArrayList<Double>(number);
        ArrayList<Boolean> b = new ArrayList<Boolean>(number);
        
        for(int i = 0; i < number; i++){
            a.add(sc.nextInt()+1);
            p.add(sc.nextDouble());
            Double justOpen = p.get(i) - 0.08;
            Double max = justOpen;
            Boolean opened = false;
            if(i > 0){
                Double alrdyOpen = s.get(i-1) + p.get(i) - ((a.get(i) - a.get(i-1) + 1)*0.08);
                if(alrdyOpen > max){max = alrdyOpen; opened = true;}
            }
            s.add(max);
            b.add(opened);
//            System.out.println(s.get(i));
        }
        if(Collections.max(s) == 0){
                System.out.println("No Profit");
            }
            else{
//                Double max = Collections.max(s);
//                int index = s.indexOf(max);
                int startIndex = -1;
                int endIndex = -1;
                int count = 0;
                int maxCount = 0;
                for(int i = 0; i < number; i++){
                    if(b.get(i)){
                        endIndex = i;
                        count++;
                    }
                    else{
                        if(count > maxCount){
                            maxCount = count;
                        }
                        startIndex = i;
                        count = 0;
                    }
                }
                Double sum = 0.0;
                for(int i = startIndex; i < endIndex+1; i++){
                    sum += (s.get(i));
                    
                }
                System.out.println(sum + " " + startIndex + " " + endIndex);
            }
    }
    
}
