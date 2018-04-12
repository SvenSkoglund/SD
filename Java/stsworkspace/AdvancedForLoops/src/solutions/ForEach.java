package solutions;

public class ForEach {

  // Use the code in each "forLoop" method to write a foreach loop
  // in the corresponding "forEachLoop" method. Verify that the loop outputs
  // are the same.
  public static void main(String[] args) {
    forLoop1();
    forEachLoop1();
    forLoop2();
    forEachLoop2();
    forLoop3();
    forEachLoop3();
  }

  static void forLoop1() {
    int[] intArr = { 10, 20, 30, 40 };
    for (int i = 0; i < intArr.length; i++) {
      int num = intArr[i];
      System.out.print(num + " ");
    }
    System.out.println("--end forLoop1");
  }

  static void forEachLoop1() {
    int[] intArr = { 10, 20, 30, 40 };
    for (int num : intArr) {
      System.out.print(num + " ");
    }
    System.out.println("--end forEachLoop1");
  }

  static void forLoop2() {
    String[] strings = new String[4];
    strings[0] = "First";
    strings[1] = "Second";
    strings[2] = "Third";
    strings[3] = "Fourth";
    for (int i = 0; i < strings.length; i++) {
      String s = strings[i];
      System.out.print(s + " ");
    }
    System.out.println("--end forLoop2");
  }

  static void forEachLoop2() {
    String[] strings = new String[4];
    strings[0] = "First";
    strings[1] = "Second";
    strings[2] = "Third";
    strings[3] = "Fourth";
    for (String s : strings) {
      System.out.print(s + " ");
    }
    System.out.println("--end forEachLoop2");
  }

  static void forLoop3() {
    double doubleArr[] = { 1.1, 2.2, 3.3, 4.4 };
    for (int i = 0; i < doubleArr.length; i++) {
      System.out.print(doubleArr[i] + " ");
    }
    System.out.println("--end forLoop3");
  }

  static void forEachLoop3() {
    double doubleArr[] = { 1.1, 2.2, 3.3, 4.4 };
    for (double d : doubleArr) {
      System.out.print(d + " ");
    }
    System.out.println("--end forEachLoop3");
  }
}
