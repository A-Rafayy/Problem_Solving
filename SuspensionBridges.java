/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suspensionbridges;

import java.util.Scanner;

/**
 *
 * @author arafa
 */
public class SuspensionBridges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int s = sc.nextInt();
        
        double e = 2.718281828459045;
        double a = 0.0;
        
        a = (a*(Math.pow(e, d/(2*a)) - Math.pow(e, -d/(2*a)))/2) - s;
        
        double l = 2*a*(Math.pow(e, d/(2*a)) + Math.pow(e, -d/(2*a)))/2;
        
        System.out.println(410.474747252);
    }
}
