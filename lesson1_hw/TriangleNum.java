package lesson1_hw;

import java.util.Scanner;

public class TriangleNum {
  // 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение
  // чисел от 1 до n)
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Сумма чисел от 1 до ");
    int n = sc.nextInt();
    sc.close();
    String result = "";
    int summ = 0;
    for (int i = 1; i <= n; i++) {
      if (i <= n & i != 1) {
        result += "+";
      }
      result += i;
      summ += i;
      System.out.println(result + "=" + summ);
    }
  }
}
