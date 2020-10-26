/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebastask;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author FPMananaA
 */
public class PruebasTask  extends Application{
int id_hilo=1;
Label label=new Label();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage ventana) throws Exception {
        
        Button b=new Button("Contar");
        
        VBox v=new VBox(20);
        v.getChildren().add(b);
        v.getChildren().add(label);
        
        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
               //contar();
               MiTarea m=new MiTarea(id_hilo);
               Thread hilo=new Thread(m);
               hilo.setDaemon(true);
               hilo.start();
               id_hilo++;
               label.textProperty().bind(m.messageProperty());
               
            }
        });
        Scene s=new Scene(v, 300, 300);
        ventana.setScene(s);
        ventana.show();
    }
    
}
