/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfs.dfs;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Muhaiminur
 */
public class BFS {
    int[][]a;
    String[]color;
    int[]dis;
    Queue<Integer> q = new LinkedList<>(); 
    BFS(){
        try {
            Scanner abir=new Scanner(new File("Input"));
            int ver=abir.nextInt();
            a=new int[ver][ver];
            dis=new int[ver];
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
    
    
    public void bfs(int s){
        try {
            int i,elem;
            color[s]="grey";
            dis[s]=0;
            q.add(s);
            while(!q.isEmpty()){
                elem=(int)q.remove();
                i=elem;
                for (int c = 0; c < a.length; c++) {
                    if (a[c][elem] == 1 && color[c].equals("white")) {
                        q.add(c);
                        color[c]="grey";
                        dis[c]=dis[elem]+1;
                    }
                    
                }
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



