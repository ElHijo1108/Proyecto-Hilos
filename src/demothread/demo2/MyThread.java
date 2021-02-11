/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread.demo2;

/**
 *
 * @author elhij
 */
public class MyThread extends Thread {

    private int theCounter = 0;
    private int TheID = 0;

    public MyThread(int newID) {
        TheID = newID;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            theCounter++;
            System.out.println("Task " + TheID + " = " + theCounter);
        }
    }

}
