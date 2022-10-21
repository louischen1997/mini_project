package com.example.final_project_demo;

import javafx.scene.control.Alert;

// alert for no image to show path and convert, derived class, alert six
public class handdleAlertMessage_six extends handdleAlert{

    public void show(){
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Warning !");
        alert.setHeaderText("You havn't choose an image !");
        alert.show();
    }
    public void print(){
        System.out.println("You havn't choose an image !");
    }
}
