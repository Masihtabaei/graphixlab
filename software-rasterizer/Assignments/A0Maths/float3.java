/** //<>//
 * A class that represents 3D vectors with floating-point components.
 */
public final class float3
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
  boolean equals(float3 rhs)
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
  public float3()
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
  public float3(float x_, float y_, float z_)
  {
    x = x_;
    y = y_;
    z = z_;
  }

  /**
   * Adds two vectors and returns the sum.
   * This method does not modify any members.
   * @param rhs Right-hand side of addition. Left-hand side is this.
   * @return float3 A new vector containing the sum.
   */
  public float3 add(float3 rhs)
  {
    // TODO Implement me!
    return new float3();
  }

  /**
   * Subtracts two vectors and returns the differences.
   * This method does not modify any members.
   * @param rhs Right-hand side of subtraction. Left-hand side is this.
   * @return float3 A new vector containing the difference.
   */
  public float3 sub(float3 rhs)
  {
    // TODO Implement me!
    return new float3();
  }

  /**
   * Computes and returns the dot product (inner product, scalar product) between this vector and the vector given in rhs.
   * This method does not modify any members.
   * @param rhs The rhs of the dot product
   * @return float The value of the dot product.
   */
  public float dot(float3 rhs)
  {
    // TODO Implement me!
    return 1.0f;
  }

  /**
   * Computes the cross product of this vector as left-hand side and rhs as right-hand side.
   * Note that this operation is not commutative.
   * This method does not modify any members.
   * @param rhs Right-hand side of the cross-product.
   * @return float3 The cross product between this x rhs.
   */
  public float3 cross(float3 rhs)
  {
    return new float3();
  }

  /** Normalizes this vector such that it points in the same direction as the original this vector but has Euclidean-length of 1.
   * This method  modifies the member of an object of this class
   */
  public void normalize()
  {
    // TODO Implement me!
  }

  /**
   * Computes and returns this +  beta * b + gamma * c.
   * This function is to compute bary-centric coordinates.
   * This method does not modify any members.
   * @param beta A scalar value.
   * @param gamma A scalar value.
   * @param b A vector value.
   * @param c A vector value.
   * @return float3 this + beta * b + gamma * c.
   */
  public float3 weightedSum(float beta, float gamma, float3 b, float3 c)
  {
    return new float3();
  }
}
