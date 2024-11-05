import java.io.*;
/*
 * A class that loads a mesh.
 */
public final class SimpleMeshModelIO
{
  // Lodas the mesh from the provided filename.
  public SimpleMeshModelIO(String filename) throws IOException
  {
    File file = new File(filename);
    byte[] data = new byte[(int) file.length()];
    java.io.FileInputStream fis = new java.io.FileInputStream(file);
    fis.read(data);
    fis.close();

    java.nio.ByteBuffer byteBuffer = java.nio.ByteBuffer.wrap(data);
    byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);

    nTriangles = byteBuffer.getInt();
    int nIndicesPerTriangle = 3;

    indices = toInt3Array(readIntArray(nTriangles * nIndicesPerTriangle, byteBuffer));

    nVertices = byteBuffer.getInt();
    int nComponentsPerPosition = 3;
    positions = toFloat3Array(readFloatArray(nVertices * nComponentsPerPosition, byteBuffer));

    int hasColors = byteBuffer.getInt();
    if (hasColors == 1)
    {
      int nComponentsPerColor = 3;
      colors = toFloat3Array(readFloatArray(nVertices * nComponentsPerColor, byteBuffer));
    }

    int hasNormals = byteBuffer.getInt();
    if (hasNormals == 1)
    {
      int nComponentsPerNormal = 3;
      normals = toFloat3Array(readFloatArray(nVertices * nComponentsPerNormal, byteBuffer));
    }

    int hasTextureCoordinates = byteBuffer.getInt();
    if (hasTextureCoordinates == 1)
    {
      int nComponentsPerTextureCoordinate = 2;

      textureCoordinates = toFloat2Array(readFloatArray(nVertices * nComponentsPerTextureCoordinate, byteBuffer));
    }
  }


  // Triangle indices. A triple of triangles make up a triangle.
  public int3[] indices;

  // 3D Positions. A triple of three floats make up a positions.
  public float3[] positions;

  // 3D Colors. A triple of three floats make up a color.
  public float3[] colors;

  // 3D Normals. A triple of three floats make up a normal.
  public float3[] normals;

  // 2D Texture Coordinates. A tuple of three floats make up a normal.
  public float2[] textureCoordinates;

  // Number of triangles.
  public int nTriangles;

  // Number of triangles.
  public int nVertices;

  private float[] readFloatArray(int nFloats, java.nio.ByteBuffer byteBuffer)
  {
    float[]result = new float[nFloats];

    for (int i = 0; i < nFloats; i++)
    {
      result[i] = byteBuffer.getFloat();
    }
    return result;
  }

  private float3[] toFloat3Array(float[] in)
  {
    float3[] out = new float3[in.length/3];
    int outIdx = 0;
    for (int i = 0; i < in.length; i += 3)
    {
      out[outIdx++] = new float3(in[i], in[i+1], in[i+2]);
    }
    return out;
  }


  private float2[] toFloat2Array(float[] in)
  {
    float2[] out = new float2[in.length/2];
    int outIdx = 0;
    for (int i = 0; i < in.length; i+= 2)
    {
      out[outIdx++] = new float2(in[i], in[i+1]);
    }
    return out;
  }

  private int3[] toInt3Array(int[] in)
  {
    int3[] out = new int3[in.length/3];
    int outIdx = 0;
    for (int i = 0; i < in.length; i += 3)
    {
      out[outIdx++] = new int3(in[i], in[i+1], in[i+2]);
    }
    return out;
  }

  private int[] readIntArray(int nInts, java.nio.ByteBuffer byteBuffer)
  {
    int[]result = new int[nInts];

    for (int i = 0; i < nInts; i++)
    {
      result[i] = byteBuffer.getInt();
    }
    return result;
  }
}
