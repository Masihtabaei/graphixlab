public final class LineClipping
{
  /*Left out code*/
  public static final int left   = 0B1000;

  /*Right out code*/
  public static final int right   = 0B0100;

  /*Top  out code*/
  public static final int top     = 0B0010;

  /*Bottom  out code*/
  public static final int bottom = 0B0001;

  /*Nothing is outside*/
  public static final int inside = 0B0000;

  /*
   * Computes the outcode for a given point.
   * @param p Point for which we want to compute the outcode
   * @param x_min Values smaller than x_min are outside the left-edge.
   * @param y_min Values smaller than y_min are outside the top-edge.
   * @param x_max Values bigger than x_max are outside the right-edge.
   * @param y_max Values bigger than y_max are outside the bottom-edge.
   * @return The outcode.
   */
  public static int outcode(int2 p, int x_min, int y_min, int x_max, int y_max)
  {
    // TODO: Implement me!
    return inside;
  }

  /* Returns true, in case we have a trivial accept.
   * @param outA outcode of one point.
   * @param outB outcode of another point.
   */
  public static boolean trivialAccept(int outA, int outB)
  {
    // TODO: Implement me!
    return 0;
  }

  /* Returns true, in case we have a trivial reject.
   * @param outA outcode of one point.
   * @param outB outcode of another point.
   */
  public static boolean trivialReject(int outA, int outB)
  {
    // TODO: Implement me!
    return 0;
  }

  /* @return True, if outside left edge, i.e., < x_min */
  public static boolean isLeftOut(int out)
  {
    // TODO: Implement me!
    return 0;
  }

  /* @return True, if outside right edge, i.e., > x_max */
  public static boolean isRightOut(int out)
  {
    // TODO: Implement me!
    return 0;
  }

  /* @return True, if outside top edge, i.e., < y_min */
  public static boolean isTopOut(int out)
  {
    // TODO: Implement me!
    return 0;
  }

  /* @return True, if outside bottom edge, i.e., > y_max */
  public static boolean isBottomOut(int out)
  {
    // TODO: Implement me!
    return 0;
  }

  /**
   * Clips the line (a, b) against the rectangle [x_min .. x_max] x [y_min .. y_max].
   * @param x_min left edge of the rectangle.
   * @param x_max right  edge of the rectangle.
   * @param y_min top edge of the rectangle.
   * @param y_max Bottom edge of the rectangle.
   * @return Information about the clipped line. cull = true, if the line is outside, or a segment of line (a,b) that fits within the screen.    
   */  
  public static final ClipResult clip(int2 a, int2 b, int x_min, int y_min, int x_max, int y_max)
  {
    ClipResult result = new ClipResult();
    result.cull = false;
    result.a = new int2(a.x, a.y);
    result.b = new int2(b.x, b.y);

    // TODO: Implement me!

    return result;
  }
}
