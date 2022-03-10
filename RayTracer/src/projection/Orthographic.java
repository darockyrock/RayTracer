package projection;

import Utility.Point2D;
import Utility.Ray;
import main.Driver;

public class Orthographic extends Projection{
    public Ray createRay(Point2D point) {
        Ray ray = new Ray();
        ray.origin.x = Driver.world.viewPlane.size*point.x;
        ray.origin.y = Driver.world.viewPlane.size*point.y;
        ray.origin.z = 100;

        ray.direction.x = 0.0;
        ray.direction.y = 0.0;
        ray.direction.z = -1.0;

        return ray;
    }
}
