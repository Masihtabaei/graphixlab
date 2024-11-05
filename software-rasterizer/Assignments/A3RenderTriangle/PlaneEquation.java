/*
 * A class for 2D implicit line equations. (we call those planes :))
 */
public final class PlaneEquation
{
  //! Sets up the plane equation, given two points.
  public PlaneEquation(int2 startPoint_, int2 endPoint_)
  {
     // TODO implement me! 
  }

  //! Evaluates the plane equation at point p
  public int scaledSignedDistance(int2 p)
  {
    // TODO implement me!
    return 0;
  }

  //! Direction of the line.
  public int2 direction;
  
  //! Normal vector of the line (no normalization required).
  public int2 normal;  
  
  //! Scaled signed distance to the origin.
  public int scaledDistanceToOrigin;
}
