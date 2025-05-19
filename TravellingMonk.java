/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package travelling.monk;

import java.util.Scanner;
/**
 *
 * @author arafa
 */
public class TravellingMonk {
    double[][] a;
    double[][] d;
    
    public TravellingMonk(){
        
}
    public double getGradient(int x1, int y1, int x2, int y2){
        double m = (y2 - y1)/(x2 - x1);
        return m;
    }
    public boolean intersect(int l1x1, int l1y1, int l1x2,  int l1y2, int l2x1, int l2y1, int l2x2, int l2y2){
        double m1 = getGradient(l1x1, l1y1, l1x2, l1y2);
        double m2 = getGradient(l2x1, l2y1, l2x2, l2y2);
        if(m1 == m2){
            return false;
        }
        else{
            
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("hello");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            String[] array = input.split(" ");
            int[][] a = new int[Integer.parseInt(array[0])][2];
            int[][] d = new int[Integer.parseInt(array[1])][2];
            System.out.println("a = "+ a.length + " d = "+ d.length);
            for(int i = 0; i < a.length; i++){
                String[] q = sc.nextLine().split(" ");
                a[i][0] = Integer.parseInt(q[0]);
                a[i][1] = Integer.parseInt(q[1]);
                System.out.print(a[i][0] + " " + a[i][1]);
            }
            for(int i = 0; i < d.length; i++){
                String[] q = sc.nextLine().split(" ");
                d[i][0] = Integer.parseInt(q[0]);
                d[i][1] = Integer.parseInt(q[1]);
                System.out.print(d[i][0] + " " + d[i][1]);
            }
    }
    
}
