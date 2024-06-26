module com.example.practika {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.prefs;


    opens com.example.practika to javafx.fxml;
    exports com.example.practika;
}