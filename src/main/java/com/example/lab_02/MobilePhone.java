package com.example.lab_02;

import javafx.scene.control.Label;
import javafx.scene.image.Image;

import java.util.Arrays;
import java.util.List;

public class MobilePhone {

    private String modelName;

    public MobilePhone(String modelName) {
        setModelName(modelName);
    }

    public static List<String> getValidModelName()
    {
        return Arrays.asList("iPhone 14 Pro Max","Samsung Galaxy A53","Samsung Galaxy S23",
                "iPhone 13","iPhone 14");
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        if(getValidModelName().contains(modelName))
          this.modelName = modelName;
        else
            throw new IllegalArgumentException(modelName + "invalid, must be one of " + getValidModelName());
    }

    public Image getImage()
    {
        String pathName = "images/"+modelName+".png";
        return new Image(MobilePhone.class.getResourceAsStream(pathName));
    }


}
