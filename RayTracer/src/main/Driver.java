package main;

import Utility.Color;
import Utility.Point3D;
import Utility.Ray;
import Utility.Vector3D;
import geometry.Sphere;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Driver {
    public static void main(String[] args) throws IOException {
        long start = System.nanoTime();

        Random random = new Random();

        int width = 1600;
        int height = 900;

        File image = new File("Image.png");
        BufferedImage buffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        Sphere sphere = new Sphere(new Point3D(0.0,0.0,0.0), 60.0, new Color(1.0F,0.0F,0.0F));

        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                Color color = new Color(0.0F,0.0F,0.0F);
                for(int row = 0; row < 8; row ++){
                    for(int col = 0; col < 8; col++){
                        Ray ray = new Ray(new Point3D(0.25*(x-width/2+(col+0.5)/8), 0.25*(y-height/2+(row+0.5)/8),100), new Vector3D(0.0,0.0,-1.0));

                        if(sphere.hit(ray) != 0.0){
                            color.add(sphere.color);
                        }
                    }
                }
                color.divide(64);
                buffer.setRGB(x,y,color.toInteger());
            }
        }

        ImageIO.write(buffer, "PNG", image);

        long end = System.nanoTime();
        System.out.println((end-start)/1000000000.0F);
    }
}
