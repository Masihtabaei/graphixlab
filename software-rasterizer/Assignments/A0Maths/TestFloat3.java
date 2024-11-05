public final class TestFloat3
{
  private static void compareAndPrint(Float3 result, Float3 desiredResult)
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

  private static void compareAndPrint(float result, float desiredResult)
  {
    if (Math.abs(result - desiredResult) < 1e-6)
    {
      System.out.println("passed");
    } else
    {
      System.out.println("failed");
      System.out.println("Should be: " + desiredResult);
      System.out.println("but is   : " + result);
      System.out.println();
    }
  }

  public static void run()
  {
    add0_test();
    add1_test();
    add2_test();

    sub0_test();
    sub1_test();
    sub2_test();

    dot0_test();
    dot1_test();
    dot2_test();

    cross0_test();
    cross1_test();
    cross2_test();

    normalize0_test();
    normalize1_test();
    normalize2_test();
    normalize3_test();
    normalize4_test();
    normalize5_test();
    normalize6_test();

    weightedSum0_test();
    weightedSum1_test();
    weightedSum2_test();
  }

  private static void add0_test()
  {
    System.out.print("Test Float3 add0 ");
    Float3 a = new Float3(1, 2, 3);
    Float3 b = new Float3(-1, -3, 5);
    Float3 result = a.add(b);
    Float3 desiredResult = new Float3(0, -1, 8);
    compareAndPrint(result, desiredResult);
  }

  private static void add1_test()
  {
    System.out.print("Test Float3 add1 ");
    Float3 a = new Float3(1, 2, 3);
    Float3 b = new Float3(-3, 5, -1);
    Float3 result = a.add(b);
    Float3 desiredResult = new Float3(-2, 7, 2);
    compareAndPrint(result, desiredResult);
  }

  private static void add2_test()
  {
    System.out.print("Test Float3 add2 ");
    Float3 a = new Float3(1, 2, 3);
    Float3 b = new Float3(5, -1, -3);
    Float3 result = a.add(b);
    Float3 desiredResult = new Float3(6, 1, 0);
    compareAndPrint(result, desiredResult);
  }

  private static void sub0_test()
  {
    System.out.print("Test Float3 sub0 ");
    Float3 a = new Float3(1, 2, 3);
    Float3 b = new Float3(-1, -3, 5);
    Float3 result = a.sub(b);
    Float3 desiredResult = new Float3(2, 5, -2);
    compareAndPrint(result, desiredResult);
  }

  private static void sub1_test()
  {
    System.out.print("Test Float3 sub1 ");
    Float3 a = new Float3(1, 2, 3);
    Float3 b = new Float3(-3, 5, -1);
    Float3 result = a.sub(b);
    Float3 desiredResult = new Float3(4, -3, 4);
    compareAndPrint(result, desiredResult);
  }

  private static void sub2_test()
  {
    System.out.print("Test Float3 sub2 ");
    Float3 a = new Float3(1, 2, 3);
    Float3 b = new Float3(5, -1, -3);
    Float3 result = a.sub(b);
    Float3 desiredResult = new Float3(-4, 3, 6);
    compareAndPrint(result, desiredResult);
  }

  private static void dot0_test()
  {
    System.out.print("Test Float3 dot0 ");
    Float3 a = new Float3(1, 2, 3);
    Float3 b = new Float3(-1, -3, 5);
    float result = a.dot(b);
    float desiredResult = 8;
    compareAndPrint(result, desiredResult);
  }

  private static void dot1_test()
  {
    System.out.print("Test Float3 dot1 ");
    Float3 a = new Float3(1, 2, 3);
    Float3 b = new Float3(-3, 5, -1);
    float result = a.dot(b);
    float desiredResult = 4;
    compareAndPrint(result, desiredResult);
  }

  private static void dot2_test()
  {
    System.out.print("Test Float3 dot2 ");
    Float3 a = new Float3(1, 2, 3);
    Float3 b = new Float3(5, -1, -3);
    float result = a.dot(b);
    float desiredResult = -6;
    compareAndPrint(result, desiredResult);
  }

  private static void cross0_test()
  {
    System.out.print("Test Float3 cross0 ");
    Float3 a = new Float3(1, 2, 3);
    Float3 b = new Float3(-1, -3, 5);
    Float3 result = a.cross(b);
    Float3 desiredResult = new Float3(19, -8, -1);
    compareAndPrint(result, desiredResult);
  }

  private static void cross1_test()
  {
    System.out.print("Test Float3 cross1 ");
    Float3 a = new Float3(1, 2, 3);
    Float3 b = new Float3(-3, 5, -1);
    Float3 result = a.cross(b);
    Float3 desiredResult = new Float3(-17, -8, 11);
    compareAndPrint(result, desiredResult);
  }

  private static void cross2_test()
  {
    System.out.print("Test Float3 cross2 ");
    Float3 a = new Float3(1, 2, 3);
    Float3 b = new Float3(5, -1, -3);
    Float3 result = a.cross(b);
    Float3 desiredResult = new Float3(-3, 18, -11);
    compareAndPrint(result, desiredResult);
  }

  private static void normalize0_test()
  {
    System.out.print("Test Float3 normalize0 ");
    Float3 a = new Float3(1, 2, 3);
    a.normalize();
    Float3 desiredResult = new Float3(0.26726124f, 0.5345225f, 0.8017837f);
    compareAndPrint(a, desiredResult);
  }

  private static void normalize1_test()
  {
    System.out.print("Test Float3 normalize1 ");
    Float3 a = new Float3(1, 0, 0);
    a.normalize();
    Float3 desiredResult = new Float3(1, 0, 0);
    compareAndPrint(a, desiredResult);
  }

  private static void normalize2_test()
  {
    System.out.print("Test Float3 normalize2 ");
    Float3 a = new Float3(-1, 0, 0);
    a.normalize();
    Float3 desiredResult = new Float3(-1, 0, 0);
    compareAndPrint(a, desiredResult);
  }

  private static void normalize3_test()
  {
    System.out.print("Test Float3 normalize3 ");
    Float3 a = new Float3(2, 0, 0);
    a.normalize();
    Float3 desiredResult = new Float3(1, 0, 0);
    compareAndPrint(a, desiredResult);
  }

  private static void normalize4_test()
  {
    System.out.print("Test Float3 normalize4 ");
    Float3 a = new Float3(0, 2, 0);
    a.normalize();
    Float3 desiredResult = new Float3(0, 1, 0);
    compareAndPrint(a, desiredResult);
  }

  private static void normalize5_test()
  {
    System.out.print("Test Float3 normalize5 ");
    Float3 a = new Float3(0, -8, 0);
    a.normalize();
    Float3 desiredResult = new Float3(0, -1, 0);
    compareAndPrint(a, desiredResult);
  }

  private static void normalize6_test()
  {
    System.out.print("Test Float3 normalize6 ");
    Float3 a = new Float3(0, 0, -4);
    a.normalize();
    Float3 desiredResult = new Float3(0, 0, -1);
    compareAndPrint(a, desiredResult);
  }

  private static void weightedSum0_test()
  {
    System.out.print("Test Float3 weightedSum0 ");
    Float3 a = new Float3(1, 2, 3);
    Float3 b = new Float3(0, 1, 0);
    Float3 c = new Float3(0, 0, 1);
    float beta = 0.5f;
    float gamma = 0.2f;
    Float3 result = a.weightedSum(beta, gamma, b, c);
    Float3 desiredResult = new Float3(1.0f, 2.5f, 3.2f);
    compareAndPrint(result, desiredResult);
  }

  private static void weightedSum1_test()
  {
    System.out.print("Test Float3 weightedSum1 ");
    Float3 a = new Float3(1, 2, 3);
    Float3 b = new Float3(-1, 1, -1);
    Float3 c = new Float3(2, 2, 7);
    float beta = 0.3f;
    float gamma = 0.4f;
    Float3 result = a.weightedSum(beta, gamma, b, c);
    Float3 desiredResult = new Float3(1.5f, 3.1f, 5.5f);
    compareAndPrint(result, desiredResult);
  }

  private static void weightedSum2_test()
  {
    System.out.print("Test Float3 weightedSum2 ");
    Float3 a = new Float3(-1, -2, -3);
    Float3 b = new Float3(-1, 1, -1);
    Float3 c = new Float3(2, 2, 7);
    float beta = -0.3f;
    float gamma = 0.4f;
    Float3 result = a.weightedSum(beta, gamma, b, c);
    Float3 desiredResult = new Float3(0.1f, -1.5f, 0.1f);
    compareAndPrint(result, desiredResult);
  }
}
