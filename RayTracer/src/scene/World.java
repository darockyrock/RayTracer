package scene;
import geometry.GeometricObject;
import Utility.Color;
import Utility.Point3D;
import geometry.Sphere;
import Utility.Normal;
import geometry.GeometricObject;
import geometry.Plane;

import java.util.ArrayList;

public class World {
    public ViewPlane viewPlane;
    public ArrayList<GeometricObject> objects;
    public Color background;

    public World(int width, int height, double size){
        viewPlane = new ViewPlane(width, height, size);
        background = new Color(0.0F, 0.0F, 0.0F);
        objects = new ArrayList<GeometricObject>();
        objects.add(new Sphere(new Point3D(0.0,0.0,0.0), 50, new Color(1.0F, 0.0F, 0.0F)));
        objects.add(new Sphere(new Point3D(-200.0,0.0,0.0), 50, new Color(0.0F, 1.0F, 0.0F)));
        objects.add(new Sphere(new Point3D(200.0,0.0,0.0), 50, new Color(0.0F, 0.0F, 1.0F)));
        objects.add(new Plane(new Point3D(0.0,0.0,0.0), new Normal(0.0,1.0,0.2), new Color(1.0F,1.0F,0.0F)));
    }
}
