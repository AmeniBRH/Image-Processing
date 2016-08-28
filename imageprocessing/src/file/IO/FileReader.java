/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.IO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;

/**
 *
 * @author Ameni
 */
public class FileReader {
    public Mat getImageMatrice() {   
        String path ="..\\imageprocessing\\src\\picture\\tennis.png";
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat source = Highgui.imread(path, 
        Highgui.CV_LOAD_IMAGE_COLOR);
       // System.out.println("error: " + source);
        return source;     
    }
}
