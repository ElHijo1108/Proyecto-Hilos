/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread.demo2;

import demothread.demo2.MyThread;

/**
 *
 * @author elhij
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyThread t1=new MyThread(1);
        MyThread t2=new MyThread(2);
        MyThread t3=new MyThread(3);
        t1.start();
        t2.start();  
        t3.start();  
    }
    
}
