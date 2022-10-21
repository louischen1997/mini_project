package com.example.final_project_demo;

import javafx.scene.control.Alert;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OverrideConvert implements Imageconvert_factorypattern{
    //override convert format
    @Override
    public boolean convertFormat(String inputImagePath,
                                        String outputImagePath, String formatName) throws IOException {

            FileInputStream inputStream = new FileInputStream(inputImagePath);
            FileOutputStream outputStream = new FileOutputStream(outputImagePath);

            // reads input image from file
            BufferedImage inputImage = ImageIO.read(inputStream);
            BufferedImage newinput = new BufferedImage(inputImage.getWidth(), inputImage.getHeight(), BufferedImage.TYPE_INT_RGB);

            //draw the image to new BufferedImage to handle directly convert problems
            Graphics2D g = newinput.createGraphics();
            g.drawImage(inputImage, 0, 0, null);

            // writes to the output image in specified format
            boolean result = ImageIO.write(newinput, formatName, outputStream);

            // close the streams
            outputStream.close();
            inputStream.close();

            return result;

    }
}
