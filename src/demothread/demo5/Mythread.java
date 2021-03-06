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
public class Mythread implements Runnable {

    private Thread theThread = null;
    private int TheID = 0;
    private onChange theDelegate;
    private int theInitValue = 0;
    private int theEndValue = 0;

    public Mythread(int newID, onChange delegate) {
        TheID = newID;
        theDelegate = delegate;
        theThread = new Thread(this);
    }

    public Thread start(int iniVal, int endVal) {
        theInitValue = iniVal;
        theEndValue = endVal;
        theThread.start();
        return theThread;
    }

    @Override
    public void run() {
        int theCounter = theInitValue - 1;
        long ini = 0;
        long end = 0;
        ini = System.currentTimeMillis();
        for (int i = theCounter; i < theEndValue; i++) {
            theCounter++;
            //System.out.println("Task " + TheID + " = " + theCounter);
            if (theCounter % 10_000==0) {
                theDelegate.show(theCounter);
            }
        }
        end = System.currentTimeMillis();
        long dif = end - ini;
        System.out.println("Total TIme " + (dif / 1000f) + " Sec");
    }

    public interface onChange {

        public abstract void show(int value);
    }
}
