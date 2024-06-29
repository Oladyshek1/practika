package com.example.practika;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
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
    private TextArea data;
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
    private Label info;

    private int theme = 0;
    private int temp = 0;
    @FXML
    private SplitPane sPane;
    @FXML
    private void initialize() throws IOException {
        load();
    }
    @FXML
    private void sort() throws IOException {
        t = new Label[]{t1, t2, t3, t4, t5, t6, t7, t8, t9, t10};
        text = new TextArea[]{text1, text2, text3, text4, text5, text6, text7, text8, text9, text10};
        checkBox = new CheckBox[]{checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9, checkBox10};
        save();
        D1();

        String[] label = new String[10];
        String[] TextArea = new String[10];
        Path path = Paths.get("savedText.txt");
        List<String> lines = Files.readAllLines(path);

        while (lines.size() < (temp + 2) * 21){
            lines.add("");
        }

        for (int i = 1; i <= 10; i++){
            TextArea[i - 1] = (lines.get(i + temp * 21));
            label[i - 1] = (lines.get(i + 10 + temp * 21));
        }

        Integer[] in = new Integer[label.length];
        for (int i = 0; i < label.length; i++) {
            in[i] = i;
        }

        Arrays.sort(in, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                if (label[i1].isEmpty()) return 1;
                if (label[i2].isEmpty()) return -1;
                return label[i1].compareTo(label[i2]);
            }
        });

        String[] sortedTextArea = new String[TextArea.length];
        for (int i = 0; i < in.length; i++) {
            sortedTextArea[i] = TextArea[in[i]];
        }

        Arrays.sort(label, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.isEmpty()) return 1;
                if (o2.isEmpty()) return -1;
                return o1.compareTo(o2);
            }
        });
        for (int i = 1; i <= 10; i++){
            text[i - 1].setText(sortedTextArea[i - 1]);
            t[i - 1].setText(label[i - 1]);
            if (label[i - 1].equals("") == false){
                checkBox[i - 1].setSelected(true);
            }
        }
        data.setText(lines.get(temp * 21 + 21));
        info.setText(String.valueOf(temp + 1));


    }
    @FXML
    private void setDalee() throws IOException {
        save();
        D1();
        temp += 1;
        load();
        info.setText(String.valueOf(temp + 1));
    }
    @FXML
    private void setNazad() throws IOException {
        if (temp > 0){
            save();
            D1();
            temp -= 1;
            load();
            info.setText(String.valueOf(temp + 1));
        }
    }

    @FXML
    public void switchTheme() {
       Label[] tsa = {t1, t2, t3, t4, t5, t6, t7, t8, t9, t10};
        String imageUrl;
        String tColor;
        String backgroundSize;

        if (theme == 0) {
            theme += 1;
            imageUrl = "https://i.pinimg.com/736x/48/cc/0d/48cc0d3768d22db826e7a6b93acd5674.jpg";
            tColor = "#FFFFFF";
            backgroundSize = "contain";
        } else {
            theme -= 1;
            imageUrl = "https://i.pinimg.com/736x/7b/0a/b2/7b0ab2df5d3418406bbbba45cb2ec6fd.jpg";
            tColor = "#000000";
            backgroundSize = "contain";
        }
        sPane.setStyle("-fx-background-image: url('" + imageUrl + "'); -fx-background-size: " + backgroundSize);
        for (Label t : tsa) {
            t.setStyle("-fx-text-fill: " + tColor);
        }
    }

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
            checkBox[i].setSelected(false);
        }
        data.setText("");
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
        Path path = Paths.get("savedText.txt");
        List<String> lines = Files.readAllLines(path);
        while (lines.size() < (temp + 2) * 21){
            lines.add("");
        }
        Files.write(path, lines);
        for (int i = 1; i <= 10; i++){
            lines.set(i + temp * 21, text[i - 1].getText());
            lines.set( i + 10 + temp * 21, t[i - 1].getText());
        }
        lines.set(temp * 21 + 21, data.getText());
        Files.write(path, lines);
    }

    @FXML
    protected void load() throws IOException {
        text = new TextArea[]{text1, text2, text3, text4, text5, text6, text7, text8, text9, text10};
        t = new Label[]{t1, t2, t3, t4, t5, t6, t7, t8, t9, t10};
        checkBox = new CheckBox[]{checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9, checkBox10};
        Path path = Paths.get("savedText.txt");
        List<String> lines = Files.readAllLines(path);
        while (lines.size() < (temp + 2) * 21){
            lines.add("");
        }
        for (int i = 1; i <= 10; i++){
            text[i - 1].setText(lines.get(i + temp * 21));
            t[i - 1].setText(lines.get(i + 10 + temp * 21));
            if (lines.get(i + 10 + temp * 21).equals("") == false){
                checkBox[i - 1].setSelected(true);
            }
        }
        data.setText(lines.get(temp * 21 + 21));
        info.setText(String.valueOf(temp + 1));
    }

}