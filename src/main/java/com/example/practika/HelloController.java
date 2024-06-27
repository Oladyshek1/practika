package com.example.practika;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.List;

public class HelloController { 
    public CheckBox[] checkBox;
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

    public TextArea[] text;
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

    private Label[] t;
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
    protected void D1(){
        t = new Label[]{t1, t2, t3, t4, t5, t6, t7, t8, t9, t10};
        text = new TextArea[]{text1, text2, text3, text4, text5, text6, text7, text8, text9, text10};
        checkBox = new CheckBox[]{checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9, checkBox10};
        for (int i = 0; i != 10; i++){
            t[i].setText("");
        }
        for (int i = 0; i != 10; i++){
            text[i].setText("");
        }
        for (int i = 0; i != 10; i++){
            checkBox[i].setSelected(false);;
        }
    }
    @FXML
    protected void time(ActionEvent event) {
        t = new Label[]{t1, t2, t3, t4, t5, t6, t7, t8, t9, t10};
        LocalTime localTime = LocalTime.now();
        String str = String.valueOf(localTime);

        CheckBox source = (CheckBox)event.getSource();
        String string =  source.getText();
        switch (string){
            case ("1"):
                t[0].setText(str);
                break;
            case ("2"):
                t[1].setText(str);
                break;
            case ("3"):
                t[2].setText(str);
                break;
            case ("4"):
                t[3].setText(str);
                break;
            case ("5"):
                t[4].setText(str);
                break;
            case ("6"):
                t[5].setText(str);
                break;
            case ("7"):
                t[6].setText(str);
                break;
            case ("8"):
                t[7].setText(str);
                break;
            case ("9"):
                t[8].setText(str);
                break;
            case ("10"):
                t[9].setText(str);
                break;
        }
    }

    @FXML
    protected void save() throws IOException {
        text = new TextArea[]{text1, text2, text3, text4, text5, text6, text7, text8, text9, text10};
        t = new Label[]{t1, t2, t3, t4, t5, t6, t7, t8, t9, t10};
        StringBuilder content = new StringBuilder();
        for (int i = 0; i != 10; i++){
            content.append(text[i].getText()).append(System.lineSeparator());
            Path path = Paths.get("savedText.txt");
            Files.writeString(path, content.toString());
        }
        for (int i = 0; i != 10; i++){
            content.append(t[i].getText()).append(System.lineSeparator());
            Path path = Paths.get("savedText.txt");
            Files.writeString(path, content.toString());
        }
    }

    @FXML
    protected void load() throws IOException {
        text = new TextArea[]{text1, text2, text3, text4, text5, text6, text7, text8, text9, text10};
        t = new Label[]{t1, t2, t3, t4, t5, t6, t7, t8, t9, t10};
        checkBox = new CheckBox[]{checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9, checkBox10};
        Path path = Paths.get("savedText.txt");
        List<String> lines = Files.readAllLines(path);
        for (int i = 0; i != 10; i++){
            text[i].setText(lines.get(i));
            t[i].setText(lines.get(i + 10));
            if (lines.get(i + 10).equals("") == false){
                checkBox[i].setSelected(true);
            }
        }
    }

}