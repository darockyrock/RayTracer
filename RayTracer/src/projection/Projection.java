package projection;

import Utility.Point2D;
import Utility.Ray;

public abstract class Projection {
    public abstract Ray createRay(Point2D point);
}
