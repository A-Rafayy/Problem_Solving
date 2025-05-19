/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jugglingpatterns;

import static java.lang.Character.isDigit;
import java.util.PriorityQueue;

/**
 *
 * @author arafa
 */
public class JugglingPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String pattern = "3";
        double balls = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Boolean wrong = false;

        for (int i = 0; i < pattern.length(); i++) {
            int num = Character.getNumericValue(pattern.charAt(i));
            balls = balls + num;
        }
        if (balls % pattern.length() != 0) {
            System.out.println("invalid # of balls");
        } else {
            for (int i = 0; i < (pattern.length() * 100); i++) {
                int num = Character.getNumericValue(pattern.charAt(i%pattern.length()));
                if (num == 0) {
                    if(!pq.isEmpty() && (pq.peek() == i)){
                        wrong = true;
                    }
                }
                else{
                    if(balls > 0 && (pq.isEmpty() || pq.peek() > i)){
                        balls--;
                        pq.add(num+i);
                    }
                    if(!pq.isEmpty()){
                        if(pq.peek() == i){
                            pq.remove();
                            wrong = !pq.isEmpty() && pq.peek() == i;
                        }
                        else{wrong = true;}
                    }
                    pq.add(num+i);
                }
            }
            if(wrong){
                System.out.println("Invalid Pattern");
            }
            else{
                System.out.println("valid with - balls");
            }

        }
    }

}

//if(num % 2 == 0){
//                        if (hand){
//                            right.add(num+i);
//                        }
//                        else{
//                            left.add(num+i);
//                        }
//                        hand = !hand;
//                        balls--;
//                    }
//                    else{
//                        if (hand){
//                            left.add(num+i);
//                        }
//                        else{
//                            right.add(num+i); 
//                        }
//                        hand = !hand;
//                        balls--;
//                    }
