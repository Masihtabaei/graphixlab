public final class BlinnPhongLighting
{
  /// Light Position.
  public static float3 lightPosition = new float3(0.0f, 10.0f, 10.0f);
  /// Ambient Color of the scene
  public static float3 ambientColor = new float3(0.0f, 0.0f, 0.0f);
  /// Product of the diffuse material coefficient and light color.
  public static float3 diffuseColor = new float3(1.0f, 1.0f, 0.0f);
  /// Prodoct of the specilar material coefficient and light color.
  public static float3 specularColor = new float3(1.0f, 1.0f, 1.0f);
  /// Specular exponent.
  public static float specularExponent = 64.0f;


  /*
   * Shaders according to the Blinn-Phong light model.
   * Assumes that the viewer is at the origin [0,0,0]
   @ param position 3D position of the points that is lit.
   */
  public static final float3 shade(float3 position, float3 normalVector)
  {
    // TODO Implement me!
    return new float3(0,1,0);
  }
}
