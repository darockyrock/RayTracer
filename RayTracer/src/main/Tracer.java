package main;

import Utility.*;
import geometry.*;

public class Tracer {
    public void trace(int x, int y){
        Ray ray = new Ray(new Point3D(1.0*(x-Driver.world.viewPlane.width/2), 1.0*(y-Driver.world.viewPlane.height/2+.5), 100), new Vector3D(0.0, 0.0, -1.0));
        double min = Double.MAX_VALUE;
        Color color = Driver.world.background;

        for(int i = 0; i < Driver.world.objects.size(); i++){
            double temp = Driver.world.objects.get(i).hit(ray);
            if (Driver.world.objects.get(i).hit(ray) != 0.0){
                if (temp != 0.0 && temp < min){
                    color = Driver.world.objects.get(i).color;
                    min = temp;
                }
            }
        }
        Driver.image.buffer.setRGB(x,y,color.toInteger());
    }
}
