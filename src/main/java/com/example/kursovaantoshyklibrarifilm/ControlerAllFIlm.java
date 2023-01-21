package com.example.kursovaantoshyklibrarifilm;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ControlerAllFIlm implements Initializable {

    @FXML
    private ImageView actors;

    @FXML
    private ImageView newFilm;

    @FXML
    private ImageView producer;

    @FXML
    protected TextField year;
    @FXML
    private GridPane filmGrid;

    @FXML
    void actorsInfoPage(MouseEvent event) {
         //Initial initial = new Initial("select * from actors where == ", 1, "windows2.fxml");
    }

    @FXML
    void newfilmInfoPage(MouseEvent event) {
        //Initial initial = new Initial("select * from films", 1, "hello-view.fxml");
    }

    @FXML
    void producerInfoPage(MouseEvent event) {
        //Initial initial = new Initial("select * from actors where == ", 1, "windows2.fxml");

    }
    String reuest;
    int id;
    int size = 3;

    String resources;


    private List<DesignationOfFields> films = new SqlRequest().connectionToDB();

    public void initialize(URL location, ResourceBundle resources) {
        try {
            films = new SqlRequest().connectionToDB();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        int colums = 0;
        int row = 1;
        try {
            for (int i = 0; i < films.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource(String.valueOf("cardFilm.fxml")));
                System.out.println();
                VBox box = fxmlLoader.load();
                FirstWindowController filmPageController = fxmlLoader.getController();
                filmPageController.setData(films.get(i));
                if (size == 3) {
                    if (colums == 2) {
                        colums = 0;
                        ++row;
                    }
                } else if (size == 3) {
                    if (colums == 2) {
                        colums = 0;
                        ++row;
                    }
                }
                filmGrid.add(box, colums++, row);
                filmGrid.setPrefWidth(1300);
                GridPane.setMargin(box, new Insets(17));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
