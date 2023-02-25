/** 
  В калькулятор добавьте возможность отменить последнюю операцию
 */
package lesson4_hw;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class CalcStack {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        double result = 0;
        stack.push("0");
        Scanner sc = new Scanner(System.in);
        System.out.print("\tКалькулятор с отменой предыдущего действия\nКоманда revert отменяет последнее действие\n");
        String str = "0";
        String history = null;

        boolean loop = true;
        while (loop) {
            history = Arrays.toString(stack.toArray());
            history = history.replaceAll("[, ]", "");
            System.out.printf("история : %s \nresult = %.2f ", history,result);          
            str = sc.nextLine();
            str = str.replaceAll(" ", "");
            try {
                if (str.equalsIgnoreCase("revert")) {
                    str = stack.pop();
                    result = calculate(str, result, true);
                } else {
                    stack.push(str);
                    result = calculate(str, result, false);
                }
            } catch (Exception e) {
                sc.close();
                loop = false;
                System.out.println("остановлено");
            }

        }

    }
  

    private static Character getOperation(String str) { // какое арифмет действие будет
        char operation = '0';
        char[] symbols = { '*', '-', '+', '/' };

        for (int a = 0; a < symbols.length; a++) {
            char temp = symbols[a];
            for (int j = 0; j < str.length(); j++) {
                if (temp == str.charAt(j)) {
                    operation = temp;
                    a = symbols.length;
                    break;
                }
            }
        }
        return operation;
    }

        private static double calculate(String str, Double lastResult, boolean revert) {
        Character operation = getOperation(str); 
        str = str.replace(String.valueOf(operation), ""); // удалю знак
        double b = Double.valueOf(str); // преобразование в число

        switch (operation) {
            case '*':
                if (revert == true) {
                    lastResult /= b;
                } else {
                    lastResult *= b;
                }
                break;
            case '-':
                if (revert == true) {
                    lastResult += b;
                } else {
                    lastResult -= b;
                }
                break;
            case '+':
                if (revert == true) {
                    lastResult -= b;
                } else {
                    lastResult += b;
                }
                break;
            case '/':
                if (revert == true) {
                    lastResult *= b;
                } else {
                    lastResult /= b;
                }
                break; 
        }
      
        return lastResult;
    }

}
