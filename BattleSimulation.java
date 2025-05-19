package battlesimulation;

import java.util.Scanner;

/**
 *
 * @author arafa
 */
public class BattleSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String attack = input.nextLine();
        String output = "";
        
        for(int i = 0; i < attack.length(); i++){
            String a = attack.charAt(i)+"";
            
            if(i < (attack.length()-2)){
                String b = attack.charAt(i+1)+"";
                String c = attack.charAt(i+2)+"";
                
                if(!a.equals(b) && !b.equals(c) && !a.equals(c)){
                    output+= "C";
                    i+=2;
                }
                else{
                    switch(a){
                         case "R": output = output + "S"; break;
                         case "B": output = output + "K"; break;
                         case "L": output = output + "H"; break;
                         }
                }
            }
            else{
                    switch(a){
                         case "R": output = output + "S"; break;
                         case "B": output = output + "K"; break;
                         case "L": output = output + "H"; break;
                         }
                }
        }
        System.out.println(output);
    }
    
}
