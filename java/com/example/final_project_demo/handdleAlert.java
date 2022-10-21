package com.example.final_project_demo;

import javafx.scene.control.Alert;
// base class of alert, methods to be override
public class handdleAlert {
    protected String message="Image converted successfully !";
    public void print(){
        System.out.println(message);
    }
    public void show(){
        System.out.println(message);
    }

    public void show(String s){
        System.out.println(message);
    }

    public String getMessage(){
        return message;
    }
}
