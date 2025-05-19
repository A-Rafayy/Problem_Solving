/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package union.find;

import java.util.Scanner;

/**
 *
 * @author arafa
 */
public class UnionFind {
    int N = 0;
    int Q = 0;
    int[] parent;
    String[] operations;
    
    public UnionFind(int n, int q, String[] ops){
        N = n;
        Q = q;
        parent = new int[N];
        operations = ops;
        
        for(int i = 0; i < operations.length; i++){
            String operator = operations[i].charAt(0)+"";
            int a = operations[i].charAt(1)+0;
            int b = operations[i].charAt(2)+0;
            if(operator.equals("=")){
                join(a, b);
            }
            else if(operator.equals("?")){
                isSameSet(a, b);
            }
        }
    }
    public int find(int i){
        if(i == parent[i]){
            return i;
        }
        else{
            int x = find(parent[i]);
            parent[i] = x;
            return x;
        }
    }
    public void join(int i, int j){
        if(find(i) != find(j)){
            parent[j] = parent[i];
        }
    }
    public void isSameSet(int i, int j){
        if(find(i) == find(j)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        int Q = input.nextInt();
        String[] operations = new String[Q];
        
        for(int i = 0; i < Q; i++){
            operations[i] = input.nextLine();
        }
        
        UnionFind a = new UnionFind(N, Q, operations);
        
    }
    
}
