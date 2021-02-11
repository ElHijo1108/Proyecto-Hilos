/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread.demo3;

/**
 *
 * @author elhij
 */
public class MyThread  implements Runnable{
    private Thread theThread=null;
    private int theCounter = 0;
    private int TheID = 0;

    public MyThread(int newID) {
        TheID = newID;
        theThread=new Thread(this);
    }
    
    public Thread start(){
        theThread.start();
        return theThread;
    }
    
    
    
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            theCounter++;
            System.out.println("Task " + TheID + " = " + theCounter);
        }
    }

}
