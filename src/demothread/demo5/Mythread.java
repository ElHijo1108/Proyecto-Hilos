/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread.demo5;

/**
 *
 * @author elhij
 */
public class Mythread implements Runnable{
    private Thread theThread=null;
    private int theCounter = 0;
    private int TheID = 0;
    private onChange theDelegate;

    public Mythread(int newID, onChange delegate) {
        TheID = newID;
        theDelegate=delegate;
        theThread=new Thread(this);
    }
    
     public Thread start(){
        theThread.start();
        return theThread;
    }
    

    @Override
    public void run() {
        for (int i = 0; i < 20_000_000; i++) {
            theCounter++;
            //System.out.println("Task " + TheID + " = " + theCounter);
            theDelegate.show(theCounter);
            
        }
    }
    
    public interface onChange{
        public abstract void show(int value);
    }
}
