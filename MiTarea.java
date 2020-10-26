/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebastask;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.concurrent.Task;

/**
 *
 * @author FPMananaA
 */
public class MiTarea extends Task{
private int id_hilo;
int i;
    public MiTarea(int id_hilo) {
        this.id_hilo = id_hilo;
    }

    @Override
    protected Object call() throws Exception {
        for ( i=0; i<200; i++)
        {
            try {
                Thread.sleep(100);
                updateMessage("Vamos por el número: "+i);
                System.out.println("HILO: "+id_hilo+" VOY POR EL _"+i);
            } catch (InterruptedException ex) {
                Logger.getLogger(PruebasTask.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
            
           
            
        return "S";
    }
    public  void contar(int id_hilo) 
            
    {
        
    }
}
