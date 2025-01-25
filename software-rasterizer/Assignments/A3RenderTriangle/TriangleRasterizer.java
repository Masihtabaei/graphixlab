/**  //<>//
  * A class that contains a method for triangle rasterization.
  */
public final class TriangleRasterizer
{
  /**
    * Rasters a triangle!
    * @param framebuffer Array of pixel of the framebuffer
    * @param w Width in pixels of the framebuffer.
    * @param h Height in pixels of the framebuffer.
    * @param pointA one point of the triangle in sub pixel accuracy 
    * @param pointB another point of the triangle in sub pixel accuracy
    * @param pointC the last point of the triangle in sub pixel accuracy
	@ @param flatColor flat (solid) color of the triangle.
    */
  public static final void drawTriangle(int[] framebuffer, int w, int h, Int2 pointA, Int2 pointB, Int2 pointC, int flatColor)
  {
    // Find bounding box within regular pixel grid.

    // Setup Plane Equation in sub-pixel grid.

    // Test all subpixel centers inside bounding box.

  }
}
