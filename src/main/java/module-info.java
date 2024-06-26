module com.example.practika {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practika to javafx.fxml;
    exports com.example.practika;
}