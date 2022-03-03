package geometry;

import Utility.Color;
import Utility.Ray;

public abstract class GeometricObject {
    public Color color;
    public abstract double hit(Ray ray);
}
