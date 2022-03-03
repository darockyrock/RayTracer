package main;

import Utility.Color;
import Utility.Image;
import Utility.Point3D;
import Utility.Ray;
import Utility.Vector3D;
import geometry.Sphere;
import scene.World;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Driver {

    public static World world;
    public static Image image;
    public static Tracer tracer;

    public static void main(String[] args) throws IOException {
        long start = System.nanoTime();

        world = new World(1600,900,1.0);
        image = new Image("Image.png");
        tracer = new Tracer();

        Sphere sphere = new Sphere(new Point3D(0.0,0.0,0.0), 60.0, new Color(1.0F,0.0F,0.0F));

        for(int y = 0; y < world.viewPlane.height; y++){
            for(int x = 0; x < world.viewPlane.width; x++){
                tracer.trace(x,y);
            }
        }

        image.write("PNG");

        long end = System.nanoTime();
        System.out.println((end-start)/1000000000.0F);
    }
}
