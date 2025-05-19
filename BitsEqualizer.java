/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bitsequalizer;

/**
 *
 * @author arafa
 */
public class BitsEqualizer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String stringS = "??????";
        String stringT = "001010";
        
        int onesInS = 0;
        int onesInT = 0;
        int maxMoves = 0;
        int minMoves = 0;
        
        char[] s = stringS.toCharArray();
        String[] S = String.valueOf(s).split("");
        char[] t = stringT.toCharArray();
        String[] T = String.valueOf(t).split("");
        
        //Condition 1
        for(int i = 0; i < s.length; i++){
            if(S[i].equals("1")){onesInS++;}
            if(T[i].equals("1")){onesInT++;}
        }
        for(int i = 0; i < S.length; i++){
            if(!S[i].equals(T[i])){
                maxMoves++;
            }
            if(S[i].equals("?")){
                minMoves++;
            }
        }
        if(onesInS > onesInT){
            System.out.println("-1");
        }
        else{
            for(int i = 0; i < S.length; i++){
            if(S[i].equals(T[i])){
                continue;
            }
            else{
                for(int j = i; j < T.length; j++){
                    if(!S[i].equals(T[j])){
                        continue;
                    }
                    else{
                        if(T[j].equals(S[j])){
                            continue;
                        }
                        else{
                            if(S[j].equals(T[i])){
                                String temp = S[i];
                                S[i] = S[j];
                                S[j] = temp;
                                minMoves++;
                            }
                        }
                    }
                }
            }
        }
        }
//        System.out.println(maxMoves);
        System.out.println(minMoves);
//        System.out.println(onesInS);
//        System.out.println(onesInT);
    }
    
}
