/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread.demo1;

/**
 *
 * @author elhij
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        noThread t1=new noThread(1);
        noThread t2=new noThread(2);
        noThread t3=new noThread(3);
        t1.start();
        t2.start();  
        t3.start();  
    }
    
}
