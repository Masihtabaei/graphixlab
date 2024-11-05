boolean testToColor(float r, float g, float b, int desiredResult) //<>//
{
  int result = MathUtil.toColor(r, g, b);
  if (result == desiredResult)
  {
    return true;
  } else
  {
    System.out.println("Test failed: toColor(" + r + ", " + g + ", " + b + ") == " + String.format("0x%08X", result) + ", but should be" + String.format("0x%08X", desiredResult));
    return false;
  }
}

boolean testWeightSum(float3 a, float3 b, float3 c, float beta, float gamma, float3 desiredResult)
{
  float3 result = a.weightedSum(beta, gamma, b, c);
  if (result.equals(desiredResult))
  {
    return true;
  } else
  {
    System.out.println("Test failed: [" + a.x + ", " + a.y + ", " +  a.z + "].weightedSum(" + beta + ", " + gamma + ", " +
      "[" + b.x + ", " + b.y + ", " +  b.z + "] , "+
      "[" + c.x + ", " + c.y + ", " +  c.z + "] = "+
      "[" + result.x + ", " + result.y + ", " +  result.z + "] != " +
      "[" + desiredResult.x + ", " + desiredResult.y + ", " +  desiredResult.z + "]!");

    return false;
  }
}

void test_MathUtil_toColor()
{
  // black
  testToColor(0, 0, 0, 0xff000000);
  //  blue
  testToColor(0, 0, 1, 0xff0000ff);
  // green
  testToColor(0, 1, 0, 0xff00ff00);
  // red
  testToColor(1, 0, 0, 0xffff0000);
  // halfway blue
  testToColor(0, 0, 0.5f, 0xff000080);
  // halfway green
  testToColor(0, 0.5f, 0, 0xff008000);
  // halfway red
  testToColor(0.5f, 0, 0, 0xff800000);
  // negative channels
  testToColor(0, 0, -0.5, 0xff000000);
  testToColor(0, -0.5, 0, 0xff000000);
  testToColor(-0.5, 0, 0, 0xff000000);
  // positve channels
  testToColor(0, 0, 1.5, 0xff0000ff);
  testToColor(0, 1.5, 0, 0xff00ff00);
  testToColor(1.5, 0, 0, 0xffff0000);
  // mix channels
  testToColor(1, 1, 0, 0xffffff00);
  testToColor(0, 1, 1, 0xff00ffff);
  testToColor(1, 0, 1, 0xffff00ff);
}

void test_float3_weightedSum()
{
  testWeightSum(new float3(1, 0, 0), new float3(0, 1, 0), new float3(0, 0, 1), 0, 0, new float3(1, 0, 0));
  testWeightSum(new float3(1, 0, 0), new float3(0, 1, 0), new float3(0, 0, 1), 1, 0, new float3(0, 1, 0));
  testWeightSum(new float3(1, 0, 0), new float3(0, 1, 0), new float3(0, 0, 1), 0, 1, new float3(0, 0, 1));
  testWeightSum(new float3(1, 0, 0), new float3(0, 1, 0), new float3(0, 0, 1), 0, 0.5, new float3(0.5, 0, 0.5));
  testWeightSum(new float3(1, 0, 0), new float3(0, 1, 0), new float3(0, 0, 1), 0.5, 0.0, new float3(0.5, 0.5, 0.0));
  testWeightSum(new float3(1, 0, 0), new float3(0, 1, 0), new float3(0, 0, 1), 0.5, 0.5, new float3(0.0, 0.5, 0.5));
  testWeightSum(new float3(1, 0, 0), new float3(0, 1, 0), new float3(0, 0, 1), 0.3, 0.5, new float3(0.2, 0.3, 0.5));
}


void setup()
{
  test_MathUtil_toColor();
  test_float3_weightedSum();
  size(512, 512);
}

void draw()
{
  surface.setTitle(str(1000.0f/frameRate) + "ms");
  background(255, 255, 255);
  loadPixels();
  TriangleRasterizer.drawTriangle(pixels, width, height,
    SubPixelUtil.toSubPixel(new int2(width/2, height - 10)),
    SubPixelUtil.toSubPixel(new int2(10, 10)),
    SubPixelUtil.toSubPixel(new int2(width - 10, 30)),
    new float3(0, 0, 1),
    new float3(0.5, 0.5, 0.5),
    new float3(1, 1, 0));
  updatePixels();
}
