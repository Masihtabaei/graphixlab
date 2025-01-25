public final class LineRasterizer
{
  private static final void drawLine(int[] framebuffer, int w, Int2 b, int col){
    float m = b.y / (float) b.x;
    int y = 0; //<>//
    float rawY = 0.0f;
    for(int x = 0; x <= b.x; x++){
      rawY = m * x;
      y = Math.round(rawY);
      framebuffer[x + y * w] = col;
    }
  }
  
   private static final void compactDrawLine(int[] framebuffer, int w, Int2 b, int col){
    float m = b.y / (float) b.x;
    int y = - (int) m;
    for(int x = 0; x <= b.x; x++){
      y += (int) m;
      framebuffer[x + y * w] = col; //<>//
    }
  }
  
  private static final void drawLine(int[] framebuffer, int w, Int2 a, Int2 b, int col)
  {
    int y = 0;
    int err = 0;
    for (int x = a.x; x <= b.x; x++)
    {
      if (err >= b.x)
      {
        y++;
        err += -2 * b.x;
      }
      err += 2 * b.y;
      framebuffer[y * w + x] = col;
    }
  }
  

  public static final void drawLine(int[] framebuffer, int w, int h, Int2 a, Int2 b, int col)
  {
    ClipResult clip = LineClipping.clip(a, b, w-1, h-1);
    if (clip.cull)
    {
      return;
    }

    compactDrawLine(framebuffer, w, b, col);
  }
}
