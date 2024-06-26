package com.example.practika;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;

public class HelloController {
    @FXML
    private TextArea text1;
    @FXML
    private TextArea text2;
    @FXML
    private TextArea text3;
    @FXML
    private TextArea text4;
    @FXML
    private TextArea text5;
    @FXML
    private TextArea text6;
    @FXML
    private TextArea text7;
    @FXML
    private TextArea text8;
    @FXML
    private TextArea text9;
    @FXML
    private TextArea text10;
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

    @FXML
    protected void save() throws IOException {
        String text = text1.getText();
        Path path = Paths.get("savedText.txt");
        Files.write(path, text.getBytes());

        text = text2.getText();
        path = Paths.get("text1.txt");
        Files.write(path, text.getBytes());

        text = text3.getText();
        path = Paths.get("text2.txt");
        Files.write(path, text.getBytes());

        text = text4.getText();
        path = Paths.get("text3.txt");
        Files.write(path, text.getBytes());

        text = text5.getText();
        path = Paths.get("text4.txt");
        Files.write(path, text.getBytes());

        text = text6.getText();
        path = Paths.get("text5.txt");
        Files.write(path, text.getBytes());

        text = text7.getText();
        path = Paths.get("text6.txt");
        Files.write(path, text.getBytes());

        text = text8.getText();
        path = Paths.get("text7.txt");
        Files.write(path, text.getBytes());

        text = text9.getText();
        path = Paths.get("text8.txt");
        Files.write(path, text.getBytes());

        text = text10.getText();
        path = Paths.get("text9.txt");
        Files.write(path, text.getBytes());
    }

    @FXML
    protected void load() throws IOException {
        Path path = Paths.get("savedText.txt");
        String text = new String(Files.readAllBytes(path));
        text1.setText(text);

        path = Paths.get("text1.txt");
        text = new String(Files.readAllBytes(path));
        text2.setText(text);

        path = Paths.get("text2.txt");
        text = new String(Files.readAllBytes(path));
        text3.setText(text);

        path = Paths.get("text3.txt");
        text = new String(Files.readAllBytes(path));
        text4.setText(text);

        path = Paths.get("text4.txt");
        text = new String(Files.readAllBytes(path));
        text5.setText(text);

        path = Paths.get("text5.txt");
        text = new String(Files.readAllBytes(path));
        text6.setText(text);

        path = Paths.get("text6.txt");
        text = new String(Files.readAllBytes(path));
        text7.setText(text);

        path = Paths.get("text7.txt");
        text = new String(Files.readAllBytes(path));
        text8.setText(text);

        path = Paths.get("text8.txt");
        text = new String(Files.readAllBytes(path));
        text9.setText(text);

        path = Paths.get("text9.txt");
        text = new String(Files.readAllBytes(path));
        text10.setText(text);
    }


}