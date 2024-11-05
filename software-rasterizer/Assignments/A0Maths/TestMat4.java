public final class TestMat4
{
  private static void compareAndPrint(float4 result, float4 desiredResult)
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

  private static void compareAndPrint(mat4 result, mat4 desiredResult)
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

    mul_float4_0_test();
    mul_float4_1_test();
    mul_float4_2_test();
    mul_float4_3_test();
    mul_float4_4_test();

    mul_mat4_withZeroMatrixRight_test();
    mul_mat4_withZeroMatrixLeft_test();

    mul_mat4_withIdentityMatrixRight_test();
    mul_mat4_withIdentityMatrixLeft_test();

    mul_mat4_0_test();
  }

  private static void setZero0_test()
  {
    System.out.print("Test mat4 setZero0 ");
    mat4 a = new mat4();
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
    System.out.print("Test mat4 setIdentity0 ");
    mat4 a = new mat4();
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

  private static void mul_float4_0_test()
  {
    System.out.print("Test mat4 mul_float4_0 ");
    mat4 a = new mat4(
      1, 2, 3, 4,
      5, 6, 7, 8,
      9, 10, 11, 12,
      13, 14, 15, 16);
    float4 b = new float4(1, 0, 0, 0);
    float4 c = a.mul(b);

    compareAndPrint(c, new float4(1, 5, 9, 13));
  }

  private static void mul_float4_1_test()
  {
    System.out.print("Test mat4 mul_float4_1 ");
    mat4 a = new mat4(
      1, 2, 3, 4,
      5, 6, 7, 8,
      9, 10, 11, 12,
      13, 14, 15, 16);
    float4 b = new float4(0, 1, 0, 0);
    float4 c = a.mul(b);

    compareAndPrint(c, new float4(2, 6, 10, 14));
  }

  private static void mul_float4_2_test()
  {
    System.out.print("Test mat4 mul_float4_2 ");
    mat4 a = new mat4(
      1, 2, 3, 4,
      5, 6, 7, 8,
      9, 10, 11, 12,
      13, 14, 15, 16);
    float4 b = new float4(0, 0, 1, 0);
    float4 c = a.mul(b);

    compareAndPrint(c, new float4(3, 7, 11, 15));
  }

  private static void mul_float4_3_test()
  {
    System.out.print("Test mat4 mul_float4_3 ");
    mat4 a = new mat4(
      1, 2, 3, 4,
      5, 6, 7, 8,
      9, 10, 11, 12,
      13, 14, 15, 16);
    float4 b = new float4(0, 0, 0, 1);
    float4 c = a.mul(b);

    compareAndPrint(c, new float4(4, 8, 12, 16));
  }

  private static void mul_float4_4_test()
  {
    System.out.print("Test mat4 mul_float4_3 ");
    mat4 a = new mat4(
      1, -2, 3, 4,
      5, 6, 7, 8,
      -9, 10, -11, 12,
      13, 14, 15, -16);
    float4 b = new float4(3, -1, -5, 1);
    float4 c = a.mul(b);
    compareAndPrint(c, new float4(-6, -18, 30, -66));
  }

  private static void mul_mat4_withZeroMatrixRight_test()
  {
    System.out.print("Test mat4 mul_mat4_withZeroMatrixRight ");
    mat4 a = new mat4(
      1, -2, 3, 4,
      5, 6, 7, 8,
      -9, 10, -11, 12,
      13, 14, 15, -16);

    mat4 b = new mat4();
    b.setZero();

    mat4 c = a.mul(b);

    mat4 desiredResult = new mat4();
    desiredResult.setZero();
    compareAndPrint(c, desiredResult);
  }

  private static void mul_mat4_withZeroMatrixLeft_test()
  {
    System.out.print("Test mat4 mul_mat4_withZeroMatrixLeft ");
    mat4 a = new mat4(
      1, -2, 3, 4,
      5, 6, 7, 8,
      -9, 10, -11, 12,
      13, 14, 15, -16);

    mat4 b = new mat4();
    b.setZero();

    mat4 c = b.mul(a);

    mat4 desiredResult = new mat4();
    desiredResult.setZero();
    compareAndPrint(c, desiredResult);
  }

  private static void mul_mat4_withIdentityMatrixRight_test()
  {
    System.out.print("Test mat4 mul_mat4_withIdentityMatrixRight ");
    mat4 a = new mat4(
      1, -2, 3, 4,
      5, 6, 7, 8,
      -9, 10, -11, 12,
      13, 14, 15, -16);

    mat4 b = new mat4();
    b.setIdentity();

    mat4 c = a.mul(b);

    compareAndPrint(c, a);
  }

  private static void mul_mat4_withIdentityMatrixLeft_test()
  {
    System.out.print("Test mat4 mul_mat4_withIdentityMatrixLeft ");
    mat4 a = new mat4(
      1, -2, 3, 4,
      5, 6, 7, 8,
      -9, 10, -11, 12,
      13, 14, 15, -16);

    mat4 b = new mat4();
    b.setIdentity();

    mat4 c = a.mul(b);

    compareAndPrint(c, a);
  }

  private static void mul_mat4_0_test()
  {
    System.out.print("Test mat4 mul_mat4_0 ");
    mat4 a = new mat4(
      1, -2, 3, 4,
      5, 6, 7, 8,
      -9, 10, -11, 12,
      13, 14, 15, -16);

    mat4 b = new mat4(
      -5, -2, 5, 9,
      3, 7, 4, 1,
      7, 3, 7, 8,
      1, -5, 6, 1
      );


    mat4 c = a.mul(b);
    mat4 desiredResult = new mat4(
      14, -27, 42, 35,
      50, 13, 146, 115,
      10, -5, -10, -147,
      66, 197, 130, 235);
    compareAndPrint(c, desiredResult);
  }
}
