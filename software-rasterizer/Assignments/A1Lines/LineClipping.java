public final class LineClipping
{
  public static final int left   = 0B1000;
  public static final int right   = 0B0100;
  public static final int top     = 0B0010;
  public static final int bottom = 0B0001;

  public static int outcode(Int2 p, int x_max, int y_max)
  {
    return
      (p.x <  0 ? left   : 0B0000) |
      (p.x >  x_max ? right  : 0B0000) |
      (p.y <  0 ? top    : 0B0000) |
      (p.y >  y_max ? bottom : 0B0000);
  }

  public static final ClipResult clip(Int2 a, Int2 b, int x_max, int y_max)
  {    
    ClipResult result = new ClipResult();
    result.cull = false;
    result.a = new Int2(a.x, a.y);   
    result.b = new Int2(b.x, b.y);
    return result;
  }
}
