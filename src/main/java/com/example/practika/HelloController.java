package com.example.practika;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.time.LocalTime;

public class HelloController {
    @FXML
    private Label t1;
    @FXML
    private Label t2;
    @FXML
    private Label t3;
    @FXML
    private Label t4;
    @FXML
    private Label t5;
    @FXML
    private Label t6;
    @FXML
    private Label t7;
    @FXML
    private Label t8;
    @FXML
    private Label t9;
    @FXML
    private Label t10;


    @FXML
    protected void onHelloButtonClick() {
        t1.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void time() {
        LocalTime localTime = LocalTime.now();
        String str = String.valueOf(localTime);
        t1.setText(str);
    }
    @FXML
    protected void time2() {
        LocalTime localTime = LocalTime.now();
        String str = String.valueOf(localTime);
        t2.setText(str);
    }
    @FXML
    protected void time3() {
        LocalTime localTime = LocalTime.now();
        String str = String.valueOf(localTime);
        t3.setText(str);
    }
    @FXML
    protected void time4() {
        LocalTime localTime = LocalTime.now();
        String str = String.valueOf(localTime);
        t4.setText(str);
    }
    @FXML
    protected void time5() {
        LocalTime localTime = LocalTime.now();
        String str = String.valueOf(localTime);
        t5.setText(str);
    }
    @FXML
    protected void time6() {
        LocalTime localTime = LocalTime.now();
        String str = String.valueOf(localTime);
        t6.setText(str);
    }
    @FXML
    protected void time7() {
        LocalTime localTime = LocalTime.now();
        String str = String.valueOf(localTime);
        t7.setText(str);
    }
    @FXML
    protected void time8() {
        LocalTime localTime = LocalTime.now();
        String str = String.valueOf(localTime);
        t8.setText(str);
    }
    @FXML
    protected void time9() {
        LocalTime localTime = LocalTime.now();
        String str = String.valueOf(localTime);
        t9.setText(str);
    }
    @FXML
    protected void time10() {
        LocalTime localTime = LocalTime.now();
        String str = String.valueOf(localTime);
        t10.setText(str);
    }
}