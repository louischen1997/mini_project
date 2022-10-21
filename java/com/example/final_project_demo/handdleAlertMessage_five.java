package com.example.final_project_demo;

import javafx.scene.control.Alert;

//convert image to the same format derived class, alert five
public class handdleAlertMessage_five extends handdleAlert{

    public void show(){
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Warning !");
        alert.setHeaderText("You Select The Same Format !");
        alert.show();
    }
    public void print(){
        System.out.println("You Select The Same Format !");
    }
}
