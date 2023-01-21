package com.example.kursovaantoshyklibrarifilm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartingApp extends Application {

    @Override

    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StartingApp.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 940, 560);
        stage.setTitle("Фільми!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}