/*
 * A class holding the clip result.
 */
public final class ClipResult
{
  //* Start point (must be inside of viewport). */
  public int2 a;

  //* End point (must be inside of viewport).*/
  public int2 b;

  //* True, if line is invisible, false if line is visible. point (must be inside of viewport).*/  
  public boolean cull = false;

  /* Intersects the line (a, b) with the vertical line through the paramter x.
   *
   * @param x Defines the vertical line going through x
   * @return int The y value that intersects the line vertical line through x.   
   */
  public final int intersectX(int x)
  {
    // TODO: Implement me!
    return 0;
  }

  /* Intersects the line (a, b) with the horizontal line through the paramter y.
   *
   * @param x Defines a horizontal line going through y.
   * @return int The x value that intersects the  horizontal line through y.   
   */
  public final int intersectY(int y)
  {
    // TODO: Implement me!
    return 0;
  }
}
