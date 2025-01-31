/** //<>// //<>//
 * A class that represents 3D vectors with floating-point components.
 */
public final class Float3
{
  /** x component of the vector. */
  public float x;

  /** y component of the vector. */
  public float y;

  /** z component of the vector. */
  public float z;

  /**
   * Returns true, if all components of this and rhs differ by less than 1e-6f.
   */
  boolean equals(Float3 rhs)
  {
    return Math.abs(this.x - rhs.x) < 1e-6 && Math.abs(this.y - rhs.y) < 1e-6 && Math.abs(this.z - rhs.z) < 1e-6;
  }

  /**
   * Prints the vector the console and starts a new line.
   */
  void println()
  {
    System.out.println(x + "\t" + y + "\t" + z);
  }

  /**
   * Creates a new vector with all components set to zero.
   */
  public Float3()
  {
    x = 0;
    y = 0;
    z = 0;
  }

  /**
   * Creates a new vector and sets the components according to the provided parameters.
   * @param x_ The first component.
   * @param y_ The second component.
   * @param z_ The third component.
   */
  public Float3(float x_, float y_, float z_)
  {
    x = x_;
    y = y_;
    z = z_;
  }

  /**
   * Adds two vectors and returns the sum.
   * This method does not modify any members.
   * @param rhs Right-hand side of addition. Left-hand side is this.
   * @return Float3 A new vector containing the sum.
   */
  public Float3 add(Float3 rhs)
  {
    return new Float3(
      x + rhs.x,
      y + rhs.y,
      z + rhs.z
    );
  }

  /**
   * Subtracts two vectors and returns the differences.
   * This method does not modify any members.
   * @param rhs Right-hand side of subtraction. Left-hand side is this.
   * @return Float3 A new vector containing the difference.
   */
  public Float3 sub(Float3 rhs)
  {
    return new Float3(
      x - rhs.x,
      y - rhs.y,
      z - rhs.z
    );
  }

  /**
   * Computes and returns the dot product (inner product, scalar product) between this vector and the vector given in rhs.
   * This method does not modify any members.
   * @param rhs The rhs of the dot product
   * @return float The value of the dot product.
   */
  public float dot(Float3 rhs)
  {
    return ((x * rhs.x) + (y * rhs.y) + (z * rhs.z));
  }

  /**
   * Computes the cross product of this vector as left-hand side and rhs as right-hand side.
   * Note that this operation is not commutative.
   * This method does not modify any members.
   * @param rhs Right-hand side of the cross-product.
   * @return Float3 The cross product between this x rhs.
   */
  public Float3 cross(Float3 rhs)
  {
    return new Float3(
      (y * rhs.z) - (z * rhs.y),
      (z * rhs.x) - (x * rhs.z),
      (x * rhs.y) - (y * rhs.x)
    );
  }

  public double length(){
    return Math.sqrt(
      (x * x) + (y * y) + (z * z)
    );
  }
  
  /** Normalizes this vector such that it points in the same direction as the original this vector but has Euclidean-length of 1.
   * This method  modifies the member of an object of this class
   */
  public void normalize()
  {
    float vectorLength = (float) length();
    x /= vectorLength;
    y /= vectorLength;
    z /= vectorLength;
  }

  /**
   * Computes and returns this +  beta * b + gamma * c.
   * This function is to compute bary-centric coordinates.
   * This method does not modify any members.
   * @param beta A scalar value.
   * @param gamma A scalar value.
   * @param b A vector value.
   * @param c A vector value.
   * @return Float3 this + beta * b + gamma * c.
   */
  public Float3 weightedSum(float beta, float gamma, Float3 b, Float3 c)
  {
    return new Float3(
      x + (beta * b.x) + (gamma * c.x),
      y + (beta * b.y) + (gamma * c.y),
      z + (beta * b.z) + (gamma * c.z)
    );
  }
}
