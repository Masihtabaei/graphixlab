public static SimpleMeshModelIO model; //<>// //<>//

void setup()
{
  size(512, 512);

  try
  {
    String path = sketchPath("../../data/lion.smm");
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
  // Aufgabe 1
  //mat4 toWindow = new mat4();
  //toWindow.setWindowTransform((float)width, (float)height);

  // Aufgabe 4a
  //mat4 translate = new mat4();
  //translate.setTranslate(0.5f*sin(millis()/1000.0f), 0.5f*cos(millis()/2000.0f), 0.0f);

  // Aufgabe 4b
  //mat4 rotate = new mat4();
  //rotate.setRotateZ(millis()/1000.0f);

  // Aufgabe 2
  // Aufgabe 3

  updatePixels();
}
