package com.bestgroup.calendar.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.control.Button;
import javafx.scene.text.Text;


public class FailedWritingController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonOk;

    @FXML
    private Text text;

    @FXML
    void initialize() {
        FXMLLoader loader = new FXMLLoader();
        text.setText("Событие не добавлено!\n Введите корректно все данные.");
        buttonOk.setOnMouseClicked((event) -> {
            buttonOk.getScene().getWindow().hide();

        });


    }

}