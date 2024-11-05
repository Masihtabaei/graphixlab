/**
 * A class that represents 4D vectors with floating-point components.
 */
public final class Float4
{
  /** x component of the vector. */
  public float x;

  /** y component of the vector. */
  public float y;

  /** z component of the vector. */
  public float z;

  /** w component of the vector. */
  public float w;

  /**
   * Creates a 4D zero vector.   
   */
  public Float4()
  {
    x = 0;
    y = 0;
    z = 0;
    w = 0;
  }
  
  /**
   * Creates a 4D vector.
   * @param x_ The first component of 4D vector.
   * @param y_ The second component of 4D vector.
   * @param z_ The third component of 4D vector.
   * @param w_ The forth component of 4D vector.
   */
  public Float4(float x_, float y_, float z_, float w_)
  {
    x = x_;
    y = y_;
    z = z_;
    w = w_;
  }

  /** Returns a Float3 vector containing only the x, y, and z component of this vector.
   * @return Float3 [x, y, z]^T.
   */
  public Float3 xyz()
  {
    return new Float3(x, y, z);
  }

  /**
   * Computes and returns the dot product (inner product, scalar product) between this vector and the vector given in rhs.
   * This method does not modify any members.
   * @param rhs The rhs of the dot product
   * @return float The value of the dot product.
   */
  public float dot(Float4 rhs)
  {
    return (
      (xyz().dot(rhs.xyz())) + (w * rhs.w)
    );
  }

  /**
   * Returns true, if all components of this and rhs differ by less than 1e-6f.
   */
  boolean equals(Float4 rhs)
  {
    return Math.abs(this.x - rhs.x) < 1e-6 && Math.abs(this.y - rhs.y) < 1e-6 && Math.abs(this.z - rhs.z) < 1e-6;
  }

  /**
   * Prints the vector the console and starts a new line.
   */
  void println()
  {
    System.out.println(x + "\t" + y + "\t" + z + "\t" + w);
  }
}
