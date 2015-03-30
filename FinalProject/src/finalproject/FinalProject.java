/*
 * Riley Boyd, Chris Hall
 * Final Project for JavaFX
 * *Idea Still Pending*
 * HEIL HITLER
 */
package finalproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Riley Boyd
 */
public class FinalProject extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();
        Button btn = new Button();
        Button btn2 = new Button();
        btn.setText("Say 'Hello World'");
        pane.setLeft(btn);
        btn.setOnAction(new EventHandler<ActionEvent>() {
        
            @Override
            public void handle(ActionEvent event) {
                
                btn2.setText("Hey");
                pane.setRight(btn2);
            }
        });
       
        Scene scene = new Scene(pane, 600, 500);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
