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
        System.out.println("WE NOW HAV UR DATA HIHIHIHI");
        braun.setText("You are now signed in");

    }
}