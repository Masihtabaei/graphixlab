public final class TestInt2
{
  private static void compareAndPrint(Int2 result, Int2 desiredResult)
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

  private static void compareAndPrint(int result, int desiredResult)
  {
    if (result == desiredResult)
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
    sub0_test();
    sub1_test();

    dot0_test();
    dot1_test();
    dot2_test();

    cross0_test();
    cross1_test();
    cross2_test();
  }

  private static void sub0_test()
  {
    System.out.print("Test Int2 sub0 ");
    Int2 a = new Int2(1, 2);
    Int2 b = new Int2(-1, -3);
    Int2 result = a.sub(b);
    Int2 desiredResult = new Int2(2, 5);
    compareAndPrint(result, desiredResult);
  }

  private static void sub1_test()
  {
    System.out.print("Test Int2 sub1 ");
    Int2 a = new Int2(1, 2);
    Int2 b = new Int2(-3, 5);
    Int2 result = a.sub(b);
    Int2 desiredResult = new Int2(4, -3);
    compareAndPrint(result, desiredResult);
  }

  private static void dot0_test()
  {
    System.out.print("Test Int2 dot0 ");
    Int2 a = new Int2(1, 2);
    Int2 b = new Int2(-1, -3);
    int result = a.dot(b);
    int desiredResult = -7;
    compareAndPrint(result, desiredResult);
  }

  private static void dot1_test()
  {
    System.out.print("Test Int2 dot1 ");
    Int2 a = new Int2(1, 2);
    Int2 b = new Int2(-3, 5);
    int result = a.dot(b);
    int desiredResult = 7;
    compareAndPrint(result, desiredResult);
  }

  private static void dot2_test()
  {
    System.out.print("Test Int2 dot2 ");
    Int2 a = new Int2(1, 2);
    Int2 b = new Int2(5, -1);
    int result = a.dot(b);
    int desiredResult = 3;
    compareAndPrint(result, desiredResult);
  }

  private static void cross0_test()
  {
    System.out.print("Test Int2 cross0 ");
    Int2 a = new Int2(1, 2);
    Int2 result = a.cross();
    Int2 desiredResult = new Int2(-2, 1);
    compareAndPrint(result, desiredResult);
  }

  private static void cross1_test()
  {
    System.out.print("Test Int2 cross1 ");
    Int2 a = new Int2(1, -2);
    Int2 result = a.cross();
    Int2 desiredResult = new Int2(2, 1);
    compareAndPrint(result, desiredResult);
  }

  private static void cross2_test()
  {
    System.out.print("Test Int2 cross2 ");
    Int2 a = new Int2(-1, 2);
    Int2 result = a.cross();
    Int2 desiredResult = new Int2(-2, -1);
    compareAndPrint(result, desiredResult);
  }
}
