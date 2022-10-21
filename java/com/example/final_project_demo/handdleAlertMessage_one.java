package com.example.final_project_demo;

import javafx.scene.control.Alert;
// show image alert derived class, alert one
public class handdleAlertMessage_one extends handdleAlert{

    public void show(String s){
        if(s==null || s.equals("")){
            s="You havn't select an image";
        }

        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Image path");
        alert.setHeaderText("The current image path is: "+s);
        alert.show();
    }
}
