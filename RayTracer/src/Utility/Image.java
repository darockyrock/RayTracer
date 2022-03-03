package Utility;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import main.Driver;

import javax.imageio.ImageIO;

public class Image {
    public BufferedImage buffer;
    public File image;

    public Image(String filename){
        image = new File(filename);
        buffer = new BufferedImage(Driver.world.viewPlane.width,Driver.world.viewPlane.height, BufferedImage.TYPE_INT_RGB);
    }

    public void write(String filetype) throws IOException {
        ImageIO.write(buffer, filetype, image);
    }
}
