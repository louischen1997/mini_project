package com.example.final_project_demo;

import javafx.scene.control.Alert;

// image choose again alert derived class, alert three
public class handdleAlertMessage_three extends handdleAlert{
    public void show(){
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Warning");
        alert.setHeaderText("Choose Again");
        alert.show();
    }
}
