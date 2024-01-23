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
        var age = Integer.parseInt(agefield.getText());
        var user = new User(namefield.getText(),age, genderfield.getText());
        braun.setText("You are now signed in");
        genderfield.setText("");
        namefield.setText("");
        agefield.setText("");
        System.out.println(user);
    }
}
