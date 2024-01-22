package com.pigrat.stoleurdata;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class MainController {
    @FXML
    private TextField namefield;
    @FXML
    private TextField agefield;
    @FXML
    private TextField genderfield;
    @FXML
    private Label braun;

    @FXML
    protected void signin() {
        braun.setText("You are now signed in");
        DataManager.save("Deez nuts");
    }

    @FXML
    protected void test() {
        braun.setText(DataManager.load());
    }
}