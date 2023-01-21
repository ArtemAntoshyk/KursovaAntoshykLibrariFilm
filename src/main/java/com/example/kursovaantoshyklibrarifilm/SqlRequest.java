package com.example.kursovaantoshyklibrarifilm;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class SqlRequest {
    DesignationOfFields designation;
    List<DesignationOfFields> filmList = new ArrayList<DesignationOfFields>();

    public List<DesignationOfFields> connectionToDB() {

        String url = "jdbc:mysql://localhost:3306/libfilm";
        String username = "root";
        String password = "00001111";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            System.out.println("Error");
        }
        try (Connection conn = DriverManager.getConnection(url, username, password)) {

            PreparedStatement pr = conn.prepareStatement("select *from films where year_prodaction >= \"2020\" ");
            System.out.println("Connection to Store DB succesfull!");
            ResultSet rs = pr.executeQuery();
//            switch (sqlRequest){
//                case "select * from films where year_production >= \"2021\"":
//                case "select * from films":
            while (rs.next()) {//пока у ResultSet есть данные
                designation = new DesignationOfFields();
                designation.setId(rs.getInt(1));
                designation.setName_film(rs.getString(2));
                designation.setActors(rs.getString(4));
                designation.setFilm_maker(rs.getString(5));
                designation.setCountry(rs.getString(6));
                designation.setYear_prodaction(String.valueOf(rs.getDate(3)));
                filmList.add(designation);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return filmList;
    }
}

