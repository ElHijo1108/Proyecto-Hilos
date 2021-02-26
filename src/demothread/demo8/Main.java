/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread.demo8;

import demothread.demo8.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author elhij
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Adder adder=new Adder();
        Remover remover1=new Remover();
        Remover remover2=new Remover();
        adder.start(list, 1);
        remover1.start(list, 1);
        remover2.start(list, 1);
    }
    
}
