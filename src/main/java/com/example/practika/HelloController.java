package com.example.practika;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;

public class HelloController {

    @FXML
    private boolean a1;
    @FXML
    private boolean a2;
    @FXML
    private boolean a3;
    @FXML
    private boolean a4;
    @FXML
    private boolean a5;
    @FXML
    private boolean a6;
    @FXML
    private boolean a7;
    @FXML
    private boolean a8;
    @FXML
    private boolean a9;
    @FXML
    private boolean a10;
    @FXML
    private CheckBox checkBox1;
    @FXML
    private CheckBox checkBox2;
    @FXML
    private CheckBox checkBox3;
    @FXML
    private CheckBox checkBox4;
    @FXML
    private CheckBox checkBox5;
    @FXML
    private CheckBox checkBox6;
    @FXML
    private CheckBox checkBox7;
    @FXML
    private CheckBox checkBox8;
    @FXML
    private CheckBox checkBox9;
    @FXML
    private CheckBox checkBox10;
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
    protected void D1() throws IOException {
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        t8.setText("");
        t9.setText("");
        t10.setText("");

        text1.setText("");
        text2.setText("");
        text3.setText("");
        text4.setText("");
        text5.setText("");
        text6.setText("");
        text7.setText("");
        text8.setText("");
        text9.setText("");
        text10.setText("");

        checkBox1.setSelected(false);
        checkBox2.setSelected(false);
        checkBox3.setSelected(false);
        checkBox4.setSelected(false);
        checkBox5.setSelected(false);
        checkBox6.setSelected(false);
        checkBox7.setSelected(false);
        checkBox8.setSelected(false);
        checkBox9.setSelected(false);
        checkBox10.setSelected(false);

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
        String text = text1.getText() + checkBox1.isSelected();
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

        text = t1.getText();
        path = Paths.get("text10.txt");
        Files.write(path, text.getBytes());

        text = t2.getText();
        path = Paths.get("text11.txt");
        Files.write(path, text.getBytes());

        text = t3.getText();
        path = Paths.get("text12.txt");
        Files.write(path, text.getBytes());

        text = t4.getText();
        path = Paths.get("text13.txt");
        Files.write(path, text.getBytes());

        text = t5.getText();
        path = Paths.get("text14.txt");
        Files.write(path, text.getBytes());

        text = t6.getText();
        path = Paths.get("text15.txt");
        Files.write(path, text.getBytes());

        text = t7.getText();
        path = Paths.get("text16.txt");
        Files.write(path, text.getBytes());

        text = t8.getText();
        path = Paths.get("text17.txt");
        Files.write(path, text.getBytes());

        text = t9.getText();
        path = Paths.get("text18.txt");
        Files.write(path, text.getBytes());

        text = t10.getText();
        path = Paths.get("text19.txt");
        Files.write(path, text.getBytes());

        a1 = checkBox1.isSelected();
        a2 = checkBox2.isSelected();
        a3 = checkBox3.isSelected();
        a4 = checkBox4.isSelected();
        a5 = checkBox5.isSelected();
        a6 = checkBox6.isSelected();
        a7 = checkBox7.isSelected();
        a8 = checkBox8.isSelected();
        a9 = checkBox9.isSelected();
        a10 = checkBox10.isSelected();


    }

    @FXML
    protected void load() throws IOException {
        Path path = Paths.get("savedText.txt");
        String text = new String(Files.readAllBytes(path));

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

        path = Paths.get("text10.txt");
        text = new String(Files.readAllBytes(path));
        t1.setText(text);
        checkBox1.setSelected(!text.isEmpty());

        path = Paths.get("text11.txt");
        text = new String(Files.readAllBytes(path));
        t2.setText(text);
        checkBox2.setSelected(!text.isEmpty());

        path = Paths.get("text12.txt");
        text = new String(Files.readAllBytes(path));
        t3.setText(text);
        checkBox3.setSelected(!text.isEmpty());

        path = Paths.get("text13.txt");
        text = new String(Files.readAllBytes(path));
        t4.setText(text);
        checkBox4.setSelected(!text.isEmpty());

        path = Paths.get("text14.txt");
        text = new String(Files.readAllBytes(path));
        t5.setText(text);
        checkBox5.setSelected(!text.isEmpty());

        path = Paths.get("text15.txt");
        text = new String(Files.readAllBytes(path));
        t6.setText(text);
        checkBox6.setSelected(!text.isEmpty());

        path = Paths.get("text16.txt");
        text = new String(Files.readAllBytes(path));
        t7.setText(text);
        checkBox7.setSelected(!text.isEmpty());

        path = Paths.get("text17.txt");
        text = new String(Files.readAllBytes(path));
        t8.setText(text);
        checkBox8.setSelected(!text.isEmpty());

        path = Paths.get("text18.txt");
        text = new String(Files.readAllBytes(path));
        t9.setText(text);
        checkBox9.setSelected(!text.isEmpty());

        path = Paths.get("text19.txt");
        text = new String(Files.readAllBytes(path));
        t10.setText(text);
        checkBox10.setSelected(!text.isEmpty());

    }


}