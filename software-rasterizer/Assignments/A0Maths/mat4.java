/**
 * A class that represents 4x4 matrices.
 */
public final class mat4
{
  /** Element at row 0, column 0 */
  public float a00;
  /** Element at row 1, column 0 */
  public float a10;
  /** Element at row 2, column 0 */
  public float a20;
  /** Element at row 3, column 0 */
  public float a30;

  /** Element at row 0, column 1 */
  public float a01;
  /** Element at row 1, column 1 */
  public float a11;
  /** Element at row 2, column 1 */
  public float a21;
  /** Element at row 3, column 1 */
  public float a31;

  /** Element at row 0, column 2 */
  public float a02;
  /** Element at row 1, column 2 */
  public float a12;
  /** Element at row 2, column 2 */
  public float a22;
  /** Element at row 3, column 2 */
  public float a32;

  /** Element at row 0, column 3 */
  public float a03;
  /** Element at row 1, column 3 */
  public float a13;
  /** Element at row 2, column 3 */
  public float a23;
  /** Element at row 3, column 3 */
  public float a33;

  /**
   * Creates a zero matrix.
   */
  public mat4()
  {
    setZero();
  }


  /**
   * Sets the elements of the matrix.
   * @param a00_ Element at row 0, column 0
   * @param a01_ Element at row 0, column 1
   * @param a02_ Element at row 0, column 2
   * @param a03_ Element at row 0, column 3
   * @param a10_ Element at row 1, column 0
   * @param a11_ Element at row 1, column 1
   * @param a12_ Element at row 1, column 2
   * @param a13_ Element at row 1, column 3
   * @param a20_ Element at row 2, column 0
   * @param a21_ Element at row 2, column 1
   * @param a22_ Element at row 2, column 2
   * @param a23_ Element at row 2, column 3
   * @param a30_ Element at row 3, column 0
   * @param a31_ Element at row 3, column 1
   * @param a32_ Element at row 3, column 2
   * @param a33_ Element at row 3. column 3
   */
  public mat4(
    float a00_, float a01_, float a02_, float a03_,
    float a10_, float a11_, float a12_, float a13_,
    float a20_, float a21_, float a22_, float a23_,
    float a30_, float a31_, float a32_, float a33_)
  {
    a00 = a00_;
    a10 = a10_;
    a20 = a20_;
    a30 = a30_;

    a01 = a01_;
    a11 = a11_;
    a21 = a21_;
    a31 = a31_;

    a02 = a02_;
    a12 = a12_;
    a22 = a22_;
    a32 = a32_;

    a03 = a03_;
    a13 = a13_;
    a23 = a23_;
    a33 = a33_;
  }

  /**
   * Returns true, if all components of this and rhs differ by less than 1e-6f.
   */
  boolean equals(mat4 rhs)
  {
    return
      Math.abs(this.a00 - rhs.a00) < 1e-6 &&
      Math.abs(this.a01 - rhs.a01) < 1e-6 &&
      Math.abs(this.a02 - rhs.a02) < 1e-6 &&
      Math.abs(this.a03 - rhs.a03) < 1e-6 &&

      Math.abs(this.a10 - rhs.a10) < 1e-6 &&
      Math.abs(this.a11 - rhs.a11) < 1e-6 &&
      Math.abs(this.a12 - rhs.a12) < 1e-6 &&
      Math.abs(this.a13 - rhs.a13) < 1e-6 &&

      Math.abs(this.a20 - rhs.a20) < 1e-6 &&
      Math.abs(this.a21 - rhs.a21) < 1e-6 &&
      Math.abs(this.a22 - rhs.a22) < 1e-6 &&
      Math.abs(this.a23 - rhs.a23) < 1e-6 &&

      Math.abs(this.a30 - rhs.a30) < 1e-6 &&
      Math.abs(this.a31 - rhs.a31) < 1e-6 &&
      Math.abs(this.a32 - rhs.a32) < 1e-6 &&
      Math.abs(this.a33 - rhs.a33) < 1e-6;
  }

  /**
   * Prints the vector the console and starts a new line.
   */
  void println()
  {
    System.out.println(this.a00 + "\t" + this.a01 + "\t" + this.a02 + "\t" + this.a03);
    System.out.println(this.a10 + "\t" + this.a11 + "\t" + this.a12 + "\t" + this.a13);
    System.out.println(this.a20 + "\t" + this.a21 + "\t" + this.a22 + "\t" + this.a23);
    System.out.println(this.a30 + "\t" + this.a31 + "\t" + this.a32 + "\t" + this.a33);
  }

  /**
   * Sets this matrix to the identity matrix.
   */
  public void setIdentity()
  {
    // TODO Implement me!
  }

  /**
   * Sets this matrix to the zero matrix.
   */
  public void setZero()
  {
    a00 = a11 = a22 = a33 = 0.0f;
    a01 = a10 = a20 = a02 = a12 = a21 = a03 = a30 = a31 = a13 = a23 = a32 = 0.0f;
  }

  /**
   * Computes and returns the matrix-vector multiplication of this * rhs.
   * @param rhs Float4 vector as right-hand side of the product.
   * @return Float4 The matrix-vector product this * rhs.
   */
  public Float4 mul(Float4 rhs)
  {
    // TODO Implement me!
    return new Float4
      (
      );
  }

  /**
   * Computes and returns the matrix-matrix multiplication of this * rhs.
   * @param rhs Right-hand side of matrix-matrix product.
   * @return mat4 The product matrix this * rhs.
   */
  public mat4 mul(mat4 rhs)
  {
    // TODO Implement me!
    return new mat4
      (

      );
  }
}
