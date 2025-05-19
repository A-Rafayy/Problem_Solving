/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package an.i.pkgfor.an.eye;
import java.util.Hashtable;
import java.util.Scanner;
/**
 *
 * @author arafay
 */
public class AnIForAnEye {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hashtable<String, String> ht = new Hashtable<String, String>();
        
        ht.put("at", "@");
        ht.put("and", "&");
        ht.put("one", "1");
        ht.put("won", "1");
        ht.put("two", "2");
        ht.put("to", "2");
        ht.put("too", "2");
        ht.put("for", "4");
        ht.put("four", "4");
        ht.put("bee", "b");
        ht.put("be", "b");
        ht.put("bea", "b");
        ht.put("see", "c");
        ht.put("eye", "i");
        ht.put("oh", "o");
        ht.put("owe", "o");
        ht.put("are", "r");
        ht.put("you", "u");
        ht.put("why", "y");
        ht.put("At", "@");
        ht.put("And", "&");
        ht.put("One", "1");
        ht.put("Won", "1");
        ht.put("Two", "2");
        ht.put("To", "2");
        ht.put("Too", "2");
        ht.put("For", "4");
        ht.put("Four", "4");
        ht.put("Bee", "b");
        ht.put("Be", "b");
        ht.put("Bea", "b");
        ht.put("See", "c");
        ht.put("Eye", "i");
        ht.put("Oh", "o");
        ht.put("Owe", "o");
        ht.put("Are", "r");
        ht.put("You", "u");
        ht.put("Why", "y");
        
        
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        String[] sentences = new String[lines+1];
        String[] results = new String[lines+1];
        int i = 0;
        
        while(i < (lines+1)){
            sentences[i] = sc.nextLine();
            i++;
        }
        
        for(int j = 1; j < sentences.length; j++){
            String[] words;
            words = sentences[j].split(" ");
            for (int k = 1; k < words.length; k++) {
                if (ht.containsKey(words[k])) {
                    results[j] += ht.get(words[k]);
                }
                else{
                    String a = words[k].charAt(0)+"";
                     for(int m = 1; m < words[k].length(); m++){
                        a += words[k].charAt(m);
                        if(ht.containsKey(a)){
                            results[j] += ht.get(a);
                        }
                        else{
                            results[j] += a;
                        }
                    }
               }
                
            }
            if(j > 0){
                System.out.println(results[j]);
            }
            
        }
    }
    
}
