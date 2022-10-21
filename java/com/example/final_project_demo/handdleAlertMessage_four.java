package com.example.final_project_demo;

import javafx.scene.control.Alert;

//downlaod successful alert derived class, get the download path, alert four
public class handdleAlertMessage_four extends handdleAlert{
    public void show(String s){

        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Successful !");
        alert.setHeaderText("You Have Download The New Image ! Check In "+s);
        alert.show();
    }

}
