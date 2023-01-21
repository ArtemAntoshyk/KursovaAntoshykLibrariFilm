package com.example.kursovaantoshyklibrarifilm;

import java.sql.Date;

public class DesignationOfFields {

        String name_film;
        String year_prodaction;
        String country;
        String actors;

        String film_maker;

        String yearBirthday;

        int id;


        public String getName_film() {
            return name_film;
        }

        public void setName_film(String name_film) {
            this.name_film = name_film;
        }

        public String getYear_prodaction() {
            return year_prodaction;
        }

        public void setYear_prodaction(String year_prodaction) {
            this.year_prodaction = year_prodaction;
        }

        public String getCountry() {
            return country;
        }

        public String getYearBirthday(){return yearBirthday; }

        public void setYearBirthday(Date date){this.yearBirthday = yearBirthday;}

        public void setCountry(String country) {
            this.country = country;
        }

        public String getActors() {
            return actors;
        }

        public void setActors(String actors) {
            this.actors = actors;
        }

        public String getFilm_maker() {
            return film_maker;
        }

        public void setFilm_maker(String film_maker) {
            this.film_maker = film_maker;
        }



        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
}