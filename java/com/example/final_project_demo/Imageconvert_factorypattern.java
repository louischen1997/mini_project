package com.example.final_project_demo;

import java.io.IOException;
//interface of factory pattern
public interface Imageconvert_factorypattern {
    // properly throw exceptions
    boolean convertFormat(String inputImagePath,
                          String outputImagePath, String formatName)throws IOException;
}
