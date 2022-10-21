package com.example.final_project_demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import java.io.IOException;
import java.io.File;



public class HelloController {

    @FXML
    private TextField mytextfield;

    @FXML
    private ImageView imgviewID;

    final FileChooser fc =new FileChooser();
    private String urlpath;
    private String outputpath="";
    private String outputfilename="";
    private String outputformat;
    private String finalfilename;
    private String text="";



    // Create hanndleAlert base class and derived class to handle Alert problems
    @FXML
    public void handle_image_path(ActionEvent event) {
            handdleAlert al=new handdleAlertMessage_one();
            al.show(urlpath);
    }

    //set and add new information
    @FXML
    protected void addinfo(ActionEvent event) {
        text=mytextfield.getText();
        handdleAlert al=new handdleAlertMessage_two();
        al.show();
    }


    //core class of handle img
    @FXML
    protected void handleimg(ActionEvent event) {
        // initiate the Strings to ""
        urlpath="";
        outputformat="";
        outputpath="";
        outputfilename="";

        fc.setTitle("my file chooser");
        //initiate the path to user.home
        fc.setInitialDirectory(new File(System.getProperty("user.home")));
        fc.getExtensionFilters().clear();
        //filters to choose the file formats
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image Files","*.png","*.jpg","*.jpeg","*.gif","*.BMP"));


        File file =fc.showOpenDialog(null);
        // if file isn't null, save the url path
        if(file!=null){
        imgviewID.setImage(new Image(file.toURI().toString()));
        urlpath=file.toURI().toString();

        //split the url path to remove " : "
        String[] arrOfStr_1 = urlpath.split(":", 2);
        urlpath=arrOfStr_1[1];

        // split the url of filename
        String[] arrOfStr_2 = urlpath.split("/");

        int l=arrOfStr_2.length;
        outputfilename=arrOfStr_2[l-1];


        for(int i=0;i<l-1;i++){
            outputpath+=arrOfStr_2[i];
            outputpath+="/";
        }
        finalfilename=arrOfStr_2[l-1];
        }
        else{
            System.out.println("Choose Again");
            handdleAlert al=new handdleAlertMessage_three();
            al.show();
        }

    }

    // to convert to different file types
    @FXML
    protected void handleConvert_png(ActionEvent event) {
            outputformat = ".png";
            convert("png");
        }
    @FXML
    protected void handleConvert_jpg(ActionEvent event) {
        outputformat = ".jpg";
        convert("jpg");
    }
    @FXML
    protected void handleConvert_gif(ActionEvent event) {
        outputformat = ".gif";
        convert("gif");
    }
    @FXML
    protected void handleConvert_bmp(ActionEvent event) {
        outputformat = ".BMP";
        convert("BMP");
    }

    private void convert(String s) {

        //set alert if url not exist
        if (urlpath == null || urlpath.equals("")) {
            handdleAlert al = new handdleAlertMessage_six();
            al.show();
            al.print();
        } else{
            String[] arrOfStr_3 = finalfilename.split("\\.");

        // new information to be new file name
        if (text.equals("")) {
            outputfilename = arrOfStr_3[0] + outputformat;
        } else {
            outputfilename = text + outputformat;
        }

        // if the file type is the same, get alert
        if (arrOfStr_3[1].equals(s)) {
            handdleAlert al = new handdleAlertMessage_five();
            al.show();
            al.print();
        } else {
            // use factory pattern to create new image convert class

            Imageconvert_factory img_fact = new Imageconvert_factory();
            Imageconvert_factorypattern ic = img_fact.getImageconvert();
            String inputImage = urlpath;
            String outputImage = outputpath + outputfilename;
            String formatName = s.toUpperCase();


            //an unable convert exception
            try {
                boolean result = ic.convertFormat(inputImage,
                        outputImage, formatName);
                if (result) {
                    handdleAlert al = new handdleAlertMessage_four();
                    al.show(outputpath);
                    System.out.println(al.getMessage());
                } else {
                    System.out.println("Could not convert image.");
                }
            } catch (IOException ex) {
                System.out.println("Error during converting image.");
                ex.printStackTrace();
            }
        }
    }
    }
}












