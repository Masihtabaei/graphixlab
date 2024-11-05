public static SimpleMeshModelIO model; 
public static DepthBuffer depthBuffer;
void setup()
{
  size(1024, 512);
  depthBuffer = new DepthBuffer(width, height);
  try
  {
    String path = sketchPath("../../data/bunny.smm");
    model = new SimpleMeshModelIO(path);
  }
  catch(IOException io)
  {
    print("Error loading file.");
  }
}


void draw()
{
  surface.setTitle(str(1000.0f/frameRate) + "ms");
  background(255, 255, 255);
  loadPixels();
  
  // Implement me!
  

  updatePixels();
}
