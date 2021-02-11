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
public class noThread {
    private int theCounter=0;
    private int TheID=0;

    public noThread(int newID) {
        TheID=newID;
    }
    public void start(){
        run();
    }
    public void run(){
        for (int i = 0; i < 100; i++) {
            theCounter++;
            System.out.println("Task "+ TheID+" = "+theCounter);
        }
    }
    
    
    
}
