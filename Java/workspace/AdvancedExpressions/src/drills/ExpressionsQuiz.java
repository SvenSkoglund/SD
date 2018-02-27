package drills;

public class ExpressionsQuiz {

  public static void main(String[] args) {
    easy();
//    harder();
//    hardest();
  }

  public static void easy() {
    int k;

    k = 1;
    k = k + 1;
    System.out.println(k); // Question 0

    k = 1;
    k = ++k;
    System.out.println(k); // Question 1

    k = 1;
    k += ++k;
    System.out.println(k); // Question 2

    k = 1;
    k = (k = 4);
    System.out.println(k); // Question 3
  }

  public static void harder() {
    int k;

    k = 1;
    k = (k = 4) + k;
    System.out.println(k); // Question 4

    k = 1;
    k += (k = 4) + k;
    System.out.println(k); // Question 5

    k = 1;
    k += (k = 4) * k;
    System.out.println(k); // Question 6
  }

  public static void hardest() {
    int k;

    k = 1;
    k += (k = 4) * ++k;
    System.out.println(k); // Question 7

    k = 1;
    k += (k = 4) * (++k + 2);
    System.out.println(k); // Question 8

  }

}
