/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

/**
 *
 * @author KOKSU
 */





import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;


public class zadanie2 


{
    public static void main(String[] args)
    
    {
    Random losujLiczby = new Random();
    TreeSet<Integer> treeRand = new TreeSet<>(); 
    int k = 5 ;
    int[] a = new int[100];
    for(int i=0; i<100;i++)
    
    {
    
    treeRand.add(losujLiczby.nextInt(k));
 
    }
    
    treeRand.forEach((war) -> {
        System.out.println("Wartosc: "+war);
        });
}
}