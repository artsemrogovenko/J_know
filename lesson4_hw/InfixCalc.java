/**
Реализовать алгоритм перевода из инфиксной записи в постфиксную для арифметического выражения.
http://primat.org/news/obratnaja_polskaja_zapis/2016-04-09-1181 */
package lesson4_hw;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class InfixCalc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение. пример 1+2*3 или 1+(5 - 2)\nтолько для односимвольных чисел");
        String in = sc.nextLine().replaceAll(" ", "");
        sc.close();

        String coding = toPosfix(in);
        System.out.println(coding);
        calcPostfix(coding);      
    }

    private static String toPosfix(String input) {
        int count = 0;
        StringBuilder coder = new StringBuilder();
        ArrayDeque<Character> operation = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {

            Character c = input.charAt(i);

            if (c == ')') {
                count--;
                for (Character ch : operation) {
                    coder.append(ch); // добавляю арифмет элементы
                    System.out.println(coder);
                }
                operation.clear();
                continue;
            }

            if (c == '(') {
                count++;
                continue;
            }

            if (Character.isDigit(c)) { // если цифра
                coder.append(c);

                if (count == 0 & !operation.isEmpty()) {
                    coder.append(operation.removeFirst());
                }
            } else { // если знак
                operation.add(c);

                if (count > 0) { // цикл если скобки были
                    for (int j = 0; j < count; j++) {
                        operation.offerLast(operation.getFirst());
                        operation.pop();
                    }
                }
            }
        }
        return coder.toString();
    }

    private static void calcPostfix(String formula) {
        Stack<Integer> st = new Stack<>();
        int result = 0;

        for (int i = 0; i < formula.length(); i++) {
            Character c = formula.charAt(i);

            if (Character.isDigit(formula.charAt(i))) {
                st.push(Character.getNumericValue(c));
            } else {
                int b = st.pop();
                int a = st.pop();
                System.out.printf("%d %c %d = ", a, c, b);
                switch (c) {
                    case '^':
                        result = a ^ b;
                        break;
                    case '*':
                        result = a * b;
                        break;
                    case '-':
                        result = a - b;
                        break;
                    case '+':
                        result = a + b;
                        break;
                    case '/':
                        result = a / b;
                        break;
                }
                System.out.println(result);
                st.push(result);
            }

        }

    }

}
