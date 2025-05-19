/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spellingbee;

import java.util.Scanner;

/**
 *
 * @author arafay
 */
public class SpellingBee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String letters = sc.next();
        String center = letters.charAt(0)+"";
        String l1 = letters.charAt(1)+"";
        String l2 = letters.charAt(2)+"";
        String l3 = letters.charAt(3)+"";
        String l4 = letters.charAt(4)+"";
        String l5 = letters.charAt(5)+"";
        String l6 = letters.charAt(6)+"";
        int n = sc.nextInt();
        String[] dict = new String[n];
        int count = 0;
        boolean isCenterUsed = false;
//        ArrayList<String> wordList = new ArrayList<String>();
        for(int i = 0; i < n; i++){
            String word = sc.next();
            String l = "";
            for(int j = 0; j < word.length(); j++){
                l = word.charAt(j)+"";
                if(l.equals(center)){
                    count++;
                    isCenterUsed = true;
                }
                else if(l.equals(l1) || l.equals(l2) || l.equals(l3) || l.equals(l4) || l.equals(l5) || l.equals(l6)){
                    count++;
                }
            }
            if(isCenterUsed && count >= 4){
                System.out.println(word);
                isCenterUsed = false;
                count = 0;
                l = "";
            }
            isCenterUsed = false;
            count = 0;
            l = "";
        }
    }   
}
