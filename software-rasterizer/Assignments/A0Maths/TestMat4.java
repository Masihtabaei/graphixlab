public final class TestMat4
{
  private static void compareAndPrint(Float4 result, Float4 desiredResult)
  {
    if (result.equals(desiredResult))
    {
      System.out.println("passed");
    } else
    {
      System.out.println("failed");
      System.out.print("Should be: ");
      desiredResult.println();
      System.out.print("but is   : ");
      result.println();
      System.out.println();
      System.out.println();
    }
  }

  private static void compareAndPrint(Mat4 result, Mat4 desiredResult)
  {
    if (result.equals(desiredResult))
    {
      System.out.println("passed");
    } else
    {
      System.out.println("failed");
      System.out.println("Should be: ");
      desiredResult.println();
      System.out.println("but is   : ");
      result.println();
      System.out.println();
      System.out.println();
    }
  }

  public static void run()
  {
    setZero0_test();

    setIdentity0_test();

    mul_Float4_0_test();
    mul_Float4_1_test();
    mul_Float4_2_test();
    mul_Float4_3_test();
    mul_Float4_4_test();

    mul_Mat4_withZeroMatrixRight_test();
    mul_Mat4_withZeroMatrixLeft_test();

    mul_Mat4_withIdentityMatrixRight_test();
    mul_Mat4_withIdentityMatrixLeft_test();

    mul_Mat4_0_test();
  }

  private static void setZero0_test()
  {
    System.out.print("Test Mat4 setZero0 ");
    Mat4 a = new Mat4();
    a.setZero();
    if (
      a.a00 == 0 && a.a01 == 0 && a.a02 == 0 && a.a03 == 0 &&
      a.a10 == 0 && a.a11 == 0 && a.a12 == 0 && a.a13 == 0 &&
      a.a20 == 0 && a.a21 == 0 && a.a22 == 0 && a.a23 == 0 &&
      a.a30 == 0 && a.a31 == 0 && a.a32 == 0 && a.a33 == 0)
    {
      System.out.println("passed");
    } else
    {
      System.out.println("failed");
    }
  }


  private static void setIdentity0_test()
  {
    System.out.print("Test Mat4 setIdentity0 ");
    Mat4 a = new Mat4();
    a.setIdentity();
    if (
      a.a00 == 1 && a.a01 == 0 && a.a02 == 0 && a.a03 == 0 &&
      a.a10 == 0 && a.a11 == 1 && a.a12 == 0 && a.a13 == 0 &&
      a.a20 == 0 && a.a21 == 0 && a.a22 == 1 && a.a23 == 0 &&
      a.a30 == 0 && a.a31 == 0 && a.a32 == 0 && a.a33 == 1)
    {
      System.out.println("passed");
    } else
    {
      System.out.println("failed");
    }
  }

  private static void mul_Float4_0_test()
  {
    System.out.print("Test Mat4 mul_Float4_0 ");
    Mat4 a = new Mat4(
      1, 2, 3, 4,
      5, 6, 7, 8,
      9, 10, 11, 12,
      13, 14, 15, 16);
    Float4 b = new Float4(1, 0, 0, 0);
    Float4 c = a.mul(b);

    compareAndPrint(c, new Float4(1, 5, 9, 13));
  }

  private static void mul_Float4_1_test()
  {
    System.out.print("Test Mat4 mul_Float4_1 ");
    Mat4 a = new Mat4(
      1, 2, 3, 4,
      5, 6, 7, 8,
      9, 10, 11, 12,
      13, 14, 15, 16);
    Float4 b = new Float4(0, 1, 0, 0);
    Float4 c = a.mul(b);

    compareAndPrint(c, new Float4(2, 6, 10, 14));
  }

  private static void mul_Float4_2_test()
  {
    System.out.print("Test Mat4 mul_Float4_2 ");
    Mat4 a = new Mat4(
      1, 2, 3, 4,
      5, 6, 7, 8,
      9, 10, 11, 12,
      13, 14, 15, 16);
    Float4 b = new Float4(0, 0, 1, 0);
    Float4 c = a.mul(b);

    compareAndPrint(c, new Float4(3, 7, 11, 15));
  }

  private static void mul_Float4_3_test()
  {
    System.out.print("Test Mat4 mul_Float4_3 ");
    Mat4 a = new Mat4(
      1, 2, 3, 4,
      5, 6, 7, 8,
      9, 10, 11, 12,
      13, 14, 15, 16);
    Float4 b = new Float4(0, 0, 0, 1);
    Float4 c = a.mul(b);

    compareAndPrint(c, new Float4(4, 8, 12, 16));
  }

  private static void mul_Float4_4_test()
  {
    System.out.print("Test Mat4 mul_Float4_3 ");
    Mat4 a = new Mat4(
      1, -2, 3, 4,
      5, 6, 7, 8,
      -9, 10, -11, 12,
      13, 14, 15, -16);
    Float4 b = new Float4(3, -1, -5, 1);
    Float4 c = a.mul(b);
    compareAndPrint(c, new Float4(-6, -18, 30, -66));
  }

  private static void mul_Mat4_withZeroMatrixRight_test()
  {
    System.out.print("Test Mat4 mul_Mat4_withZeroMatrixRight ");
    Mat4 a = new Mat4(
      1, -2, 3, 4,
      5, 6, 7, 8,
      -9, 10, -11, 12,
      13, 14, 15, -16);

    Mat4 b = new Mat4();
    b.setZero();

    Mat4 c = a.mul(b);

    Mat4 desiredResult = new Mat4();
    desiredResult.setZero();
    compareAndPrint(c, desiredResult);
  }

  private static void mul_Mat4_withZeroMatrixLeft_test()
  {
    System.out.print("Test Mat4 mul_Mat4_withZeroMatrixLeft ");
    Mat4 a = new Mat4(
      1, -2, 3, 4,
      5, 6, 7, 8,
      -9, 10, -11, 12,
      13, 14, 15, -16);

    Mat4 b = new Mat4();
    b.setZero();

    Mat4 c = b.mul(a);

    Mat4 desiredResult = new Mat4();
    desiredResult.setZero();
    compareAndPrint(c, desiredResult);
  }

  private static void mul_Mat4_withIdentityMatrixRight_test()
  {
    System.out.print("Test Mat4 mul_Mat4_withIdentityMatrixRight ");
    Mat4 a = new Mat4(
      1, -2, 3, 4,
      5, 6, 7, 8,
      -9, 10, -11, 12,
      13, 14, 15, -16);

    Mat4 b = new Mat4();
    b.setIdentity();

    Mat4 c = a.mul(b);

    compareAndPrint(c, a);
  }

  private static void mul_Mat4_withIdentityMatrixLeft_test()
  {
    System.out.print("Test Mat4 mul_Mat4_withIdentityMatrixLeft ");
    Mat4 a = new Mat4(
      1, -2, 3, 4,
      5, 6, 7, 8,
      -9, 10, -11, 12,
      13, 14, 15, -16);

    Mat4 b = new Mat4();
    b.setIdentity();

    Mat4 c = a.mul(b);

    compareAndPrint(c, a);
  }

  private static void mul_Mat4_0_test()
  {
    System.out.print("Test Mat4 mul_Mat4_0 ");
    Mat4 a = new Mat4(
      1, -2, 3, 4,
      5, 6, 7, 8,
      -9, 10, -11, 12,
      13, 14, 15, -16);

    Mat4 b = new Mat4(
      -5, -2, 5, 9,
      3, 7, 4, 1,
      7, 3, 7, 8,
      1, -5, 6, 1
      );


    Mat4 c = a.mul(b);
    Mat4 desiredResult = new Mat4(
      14, -27, 42, 35,
      50, 13, 146, 115,
      10, -5, -10, -147,
      66, 197, 130, 235);
    compareAndPrint(c, desiredResult);
  }
}
