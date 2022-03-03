package geometry;

import Utility.Color;
import Utility.Normal;
import Utility.Point3D;
import Utility.Ray;

public class Plane {
    Point3D point;
    Normal normal;
    Color color;

    public Plane(Point3D point, Normal normal, Color color){
        this.point = new Point3D();
        this.normal = new Normal(normal);
        this.color = new Color(color);
    }

    public double hit(Ray ray){
        double t = point.sub(ray.origin).dot(normal)/ray.direction.dot(normal);

        if (t > 10E-9){
            return t;
        }
        return 0.0;
    }
}
