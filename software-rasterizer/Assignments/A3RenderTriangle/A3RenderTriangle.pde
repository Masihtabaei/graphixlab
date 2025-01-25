void setup() //<>//
{
  size(512, 512);  
}

void draw()
{
  surface.setTitle(str(1000.0f/frameRate) + "ms");
  background(255, 255, 255);
  loadPixels(); 
  TriangleRasterizer.drawTriangle(pixels, width, height, 
  SubPixelUtil.toSubPixel(new Int2(10, 10)), 
  SubPixelUtil.toSubPixel(new Int2(width/2, height - 10)), 
  SubPixelUtil.toSubPixel(new Int2(width - 10, 30)), #ffff0000);
  updatePixels();
}
