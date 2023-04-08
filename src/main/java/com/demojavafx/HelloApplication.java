package com.demojavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group(); //template
        Scene scene = new Scene(root, 300, 130, Color.WHITE);

        //layout manager
        GridPane gridpane = new GridPane(); //something like spreadsheet (rows/columns)

        Label label = new Label("kontol");
        gridpane.add(label, 0, 0);

        Button button = new Button("Okay");
        gridpane.add(button,1,0);   //coordinate

        root.getChildren().add(gridpane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(); //static method we dont need an object
    }
}