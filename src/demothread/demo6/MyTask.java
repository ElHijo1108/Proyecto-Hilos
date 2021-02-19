/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread.demo6;

/**
 *
 * @author elhij
 */
public class MyTask implements Runnable {

    private int theID = 0;
    private Thread theThread = null;
    private long theTimeLapse = -1;

    public MyTask(int newID) {
        theID = newID;
    }

    public Thread start() {
        if (theThread == null) {
            theThread = new Thread(this);
            theThread.start();
        }
        return theThread;
    }

    public int getTheID() {
        return theID;
    }

    public Thread getTheThread() {
        return theThread;
    }

    public long getTheTimeLapse() {
        return theTimeLapse;
    }

    public boolean isPrime(int num) {
        final int UPPER_limit = (num - 1);
        boolean isPrime = false;
        int divCounter = 2;
        if (num > 1) {
            for (int i = 2; i <= UPPER_limit; i++) {
                if (num % i == 0) {
                    divCounter++;
                }
            }
            isPrime=(divCounter==2);
        }

        return isPrime;
    }

    @Override
    public void run() {
        long ini=0;
        long end=0;
        long dif=0;
        
        ini=System.currentTimeMillis();    
        isPrime(2_147_483_629);
        end=System.currentTimeMillis();
        dif=(end-ini);
        
        theTimeLapse=dif;
    }

}
