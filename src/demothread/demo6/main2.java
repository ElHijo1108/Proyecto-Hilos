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
public class main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        final int Max_Tasks=4;
        long ini=0;
        long end=0;
        long dif=0;
        
        MyTask[] tasks=new MyTask[Max_Tasks];
        
        for (int i = 0; i < tasks.length; i++) {
            tasks[i]=new MyTask(i+1);
        }
        ini=System.currentTimeMillis();   
        for (MyTask task:tasks) {
            task.start();
        }
        
        for (MyTask task:tasks) {
            
            try {
                task.getTheThread().join();
            } catch (InterruptedException e) {
            }
            
        }
        end=System.currentTimeMillis();
        dif=(end-ini);
        System.out.println("#Threads="+tasks.length );
        System.out.println("TimeLapse "+(dif/1000f)+" Seconds");
    } 
}
