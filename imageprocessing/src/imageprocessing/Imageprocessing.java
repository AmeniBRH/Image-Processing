/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageprocessing;

import file.IO.FileReader;
import file.IO.fileWriter;
import org.opencv.core.Mat;

/**
 *
 * @author Ameni
 */
public class Imageprocessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // file reader
        FileReader reader = new file.IO.FileReader();
        fileWriter writer = new file.IO.fileWriter();
       Mat fileMatrix= reader.getImageMatrice();
       writer.saveFile(fileMatrix);
       
    }
    
}
