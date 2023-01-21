module com.example.kursovaantoshyklibrarifilm {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.kursovaantoshyklibrarifilm to javafx.fxml;
    exports com.example.kursovaantoshyklibrarifilm;
}