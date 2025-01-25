/*
 * A class for 2D implicit line equations. (we call those planes :))
 */
public final class PlaneEquation
{
  //! Sets up the plane equation, given two points.
  public PlaneEquation(Int2 startPoint_, Int2 endPoint_) {
     direction = endPoint_.sub(startPoint_);
     normal = direction.cross();
     scaledDistanceToOrigin = normal.dot(startPoint_);
  }

  //! Evaluates the plane equation at point p
  public int scaledSignedDistance(Int2 p) {
    return normal.dot(p) - scaledDistanceToOrigin;
  }

  //! Direction of the line.
  public Int2 direction;
  
  //! Normal vector of the line (no normalization required).
  public Int2 normal;  
  
  //! Scaled signed distance to the origin.
  public int scaledDistanceToOrigin;
}
