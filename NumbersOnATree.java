/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numbers.on.a.tree;

import java.util.Scanner;

/**
 *
 * @author arafa
 */
public class NumbersOnATree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String path = "";
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] array = line.split(" ");
        int height = Integer.parseInt(array[0]);
        
        int totalNodes = (int) Math.pow(2, (height+1)) - 1;
        int resultindex = 0;
        
        if(array.length == 1){
            System.out.println(totalNodes);
        }
        else{
            path  = array[1];
            for(int i = 0; i < path.length(); i++){
            String a = path.charAt(i)+"";
            if(a.equals("R")){
                resultindex = (2 * resultindex) + 2;
            }
            if(a.equals("L")){
                resultindex = (2 * resultindex) + 1;
            }
        }
            System.out.println(totalNodes - resultindex);
        }
        
    }
    
}
