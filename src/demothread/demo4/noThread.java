/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread.demo4;

import java.awt.Label;
import javax.swing.JLabel;

/**
 *
 * @author elhij
 */
public class noThread {
     private int theCounter=0;
    private int TheID=0;
    //private JLabel labOutput=null;
    private OnChange theDelegate=null;

    public noThread(int newID, OnChange newDelegate) {
        TheID=newID;
        theDelegate=newDelegate;
        //labOutput=labNew;
    }
    public void start(){
        run();
    }
    public void run(){
        for (int i = 0; i < 20_000_000; i++) {
            theCounter++;
            //labOutput.setText(String.valueOf(theCounter));
            if(theDelegate!=null){
                theDelegate.show(theCounter);
            }
        }
    }
    public interface OnChange {

        public abstract void show(int value);
    }
    
    
    
}
