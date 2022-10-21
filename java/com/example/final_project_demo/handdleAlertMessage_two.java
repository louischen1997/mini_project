package com.example.final_project_demo;

import javafx.scene.control.Alert;

// add new information alert derived class, alert two
public class handdleAlertMessage_two extends handdleAlert{
    public void show(){
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Successful !");
        alert.setHeaderText("Submitted Successfully !");
        alert.show();
    }
}
