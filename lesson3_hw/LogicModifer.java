/**(Необязательная задача повышенной сложности)
Даны два ArrayList из целых чисел. Написать функции, которые вычисляют разницу коллекций:
Разность:
A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
B - A = все числа из второй коллекции, которые не содержатся в первой
Симметрическая разность:
A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй, которых нет в первой  */
package lesson3_hw;

import java.util.ArrayList;

public class LogicModifer {
    public static void main(String[] args) {
        int[] arrayFirst = { 14, 0, 9, 3, 15, 18, 7, 4, 12, 2 };
        int[] arraySecond = { 3, 9, 14, 2, 11, 18, 15, 8, 5, 1 };
        ArrayList<Integer> c1 = new ArrayList<>();
        ArrayList<Integer> c2 = new ArrayList<>();

        for (int i = 0; i < arraySecond.length; i++) {
            c1.add(i, arrayFirst[i]);
            c2.add(i, arraySecond[i]);
        }
        System.out.println("A "+c1);
        System.out.println("B "+c2);

        System.out.println("A - B "+diffefence(c1, c2));// A - B
        System.out.println("B - A "+diffefence(c2, c1));// B - A
        symmetricDiff(c1, c2); // A ^ B
    }

    static private ArrayList<Integer> diffefence(ArrayList<Integer> first, ArrayList<Integer> second) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < first.size(); i++) {
            if (!second.contains(first.get(i))) {
                result.add(first.get(i));
            }
        }
        return result;
    }

    static private void symmetricDiff(ArrayList<Integer> first, ArrayList<Integer> second) {
        System.out.print("A ^ B ");
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < first.size(); i++) {
            if (!second.contains(first.get(i))) {
                temp.add(first.get(i));
            }
        }
        for (int i = 0; i < second.size(); i++) {
            if (!first.contains(second.get(i))) {
                temp.add(second.get(i));
            }
        }
        System.out.println(temp);
    }

}
