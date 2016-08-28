/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.IO;

import java.io.File;
import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;

/**
 *
 * @author Ameni
 */
public class fileWriter {
    public void saveFile(Mat file){
    //imwrite( "../../images/Gray_Image.jpg",gray_image);
        System.out.println(file);
    Highgui.imwrite("..\\imageprocessing\\src\\picture\\output.png",file);
    System.out.println("Output Created :"+new File("..\\imageprocessing\\src\\picture\\output.png").isFile());
    }
}
