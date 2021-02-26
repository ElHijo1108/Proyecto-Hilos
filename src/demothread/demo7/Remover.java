/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread.demo7;

import java.util.List;

/**
 *
 * @author elhij
 */
public class Remover implements Runnable{
    private Thread theThread=null;
    private boolean isRunning=true;
    private int theDelay=0;
    private List<Integer> theList=null;
    
    
    
    public Thread start(List<Integer> newList, int newDelay){
        theList=newList;
        theDelay=newDelay;
        theThread=new Thread(this);
        theThread.start();
        return theThread;
    }
    
   public void stop(){
       isRunning=false;
   }
    
    
    @Override
    public void run() {
        isRunning=true;
        while(isRunning){
            if(!theList.isEmpty()){
                theList.remove(theList.size()-1);
            }
            try {
                Thread.sleep(theDelay);
            } catch (InterruptedException ex) {
                //Logger.getLogger(Adder.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
