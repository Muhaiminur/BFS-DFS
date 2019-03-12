/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfs.dfs;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Muhaiminur
 */
public class DFS {
    int[][]a;
    String[]color;
    DFS(){
        try {
            Scanner abir=new Scanner(new File("Input"));
            int ver=abir.nextInt();
            a=new int[ver][ver];
            color=new String[ver];
            abir.nextInt();
            while(abir.hasNext()){
                int m=abir.nextInt();
                int n=abir.nextInt();
                add(m,n);
            }
            for (int c = 0; c < color.length; c++) {
                color[c]="white";
                
            }
        } catch (Exception e) {
        }
    }
    
    
    
    
    public void add(int c,int d){
        if(c>=0 && d>=0){
            a[c][d]=1;
            a[d][c]=1;
        }
    }
    
    
    public void exchange(int[]a,int c,int d){
        int temp=a[c];
        a[c]=a[d];
        a[d]=temp;
    }
    
    public void PRINT(int[]a){
        System.out.println("==============================================");
        for (int c = 0; c < a.length; c++) {
            System.out.print(a[c]+" ");
            
        }
        System.out.println("");
        System.out.println("==============================================");
    }
    public void printMatrix(){
        for (int c = 0; c < a.length; c++) {
            System.out.print("[");
            System.out.print(" | ");
            for (int d = 0; d < a[c].length; d++) {
                System.out.print(a[c][d]+" | ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
    
}
