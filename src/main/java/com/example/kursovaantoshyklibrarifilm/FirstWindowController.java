package com.example.kursovaantoshyklibrarifilm;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FirstWindowController {

    @FXML
    private Label name;

    @FXML
    private Label actors;
    @FXML
    private Label film_maker;

    @FXML
    private Label country;

    @FXML
    private Label year;

    @FXML
    private  Label year_birtday;

    public void setData(DesignationOfFields designation){
        System.out.println(designation.getName_film());
        name.setText(designation.getName_film());
        year.setText(designation.getYear_prodaction());
        country.setText(designation.getCountry());
        film_maker.setText(designation.getFilm_maker());
        actors.setText(designation.getActors());
     //   year_birtday.setText(designation.getYearBirthday());

    }

}
