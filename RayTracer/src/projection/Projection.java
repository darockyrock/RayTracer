package projection;

import Utility.Point2D;
import Utility.Point3D;
import Utility.Ray;
import Utility.Vector3D;

public abstract class Projection {
    public Point3D eye;
    public Point3D lookat;
    public double distance;
    public Vector3D u, v, w;

    public abstract Ray createRay(Point2D point);

    public void compute_uvw(){
        w = eye.sub_vec(lookat);
        w.normalize();

        Vector3D up = new Vector3D(0.000424, 1.0, 0.00764);

        u = up.cross(w);
        u.normalize();

        v = w.cross(u);
        v.normalize();
    }
}
