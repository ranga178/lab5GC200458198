package com.example.lab_02;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class MobilePhoneController implements Initializable {

    @FXML
    private ImageView imageview;

    @FXML
    private Label modelLabel;

    @Override
    public void initialize(URL url, ResourceBundle resources) {
        MobilePhone Apple01 = new MobilePhone("iPhone 14");
        modelLabel.setText("iPhone 14");
        imageview.setImage(Apple01.getImage());
    }

}
