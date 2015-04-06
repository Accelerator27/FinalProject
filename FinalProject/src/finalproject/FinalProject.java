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
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Jewish Cunt
 */
public class FinalProject extends Application {

    Second S = new Second();

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(12);
        /*BorderPane pane = new BorderPane();
         VBox box=new VBox();
         box.setPadding(new Insets(80,50,50,160));
         box.setSpacing(30);
         VBox box2=new VBox();
         box.setPadding(new Insets(300,300,300,360));
         box.setSpacing(30);*/
        Button addBtn = new Button();
        Button editBtn = new Button();
        Button deleteBtn = new Button();
        Button exitBtn = new Button();
        Button btn2 = new Button();
        addBtn.setText("Add");
        editBtn.setText("Edit");
        deleteBtn.setText("Delete");
        exitBtn.setText("Exit");
        HBox hbButtons = new HBox();
        hbButtons.setSpacing(10);
        /*pane.setLeft(addBtn);
         pane.setRight(deleteBtn);
         box.getChildren().add(addBtn);
         box2.getChildren().add(deleteBtn);
         Scene scene1=new Scene(box,300,250);
         scene1.setFill(null);
         pane.setLeft(exitBtn);*/
        addBtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                S.Add();
                //btn2.setText("Hey");
                //pane.setRight(btn2);
            }
        });
        editBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                S.Edit();
            }
        });
        deleteBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                S.Delete();
            }
        });
        exitBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
      //  Scene scene = new Scene(pane, 600, 500);

        primaryStage.setTitle("Hello World!");
        //primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
