/**
  * A class for sub pixel accuracy.
  */
public final class SubPixelUtil
{
  //! 2^log2SubPixelSize is the number of subpixels in each direction of a pixel. 
  public static int log2SubPixelSize = 4;
  
  //!  the number of subpixels in each direction of a pixel. Remeber 1 << x computes 2^x.
  public static int subPixelSize = 1 << log2SubPixelSize;
  
  //!  Half a subpixel. Let's us find the center of pixel.
  public static int halfSubPixelSize = subPixelSize >> 1;
  
  //! Convert from a regular (coarse) pixel to the CENTER a subpixel
  public static int toSubPixel(int regularPixel)
  {
    // TODO Implement me
    return 0;
  }

  //! Convert from a sub pixel to a regular (coarse) pixel. 
  public static int toRegularPixel(int subPixel)
  {
        // TODO Implement me
        return 0;
  }
  
  //! Convert from a regular (coarse) pixel to the CENTER a subpixel
  //! For 2D pixels. Provided for convenience.
  public static Int2 toSubPixel(Int2 regularPixel)
  {
    return new Int2(toSubPixel(regularPixel.x), toSubPixel(regularPixel.y));  
  }
  
  //! Convert from a sub pixel to a regular (coarse) pixel.
  //! For 2D pixels. Provided for convenience.
  public static Int2 toRegularPixel(Int2 subPixel)
  {
    return new Int2(toRegularPixel(subPixel.x), toRegularPixel(subPixel.y));
  }
   
}
