package lesson1_hw;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите числовое выражение ");
        String str = sc.nextLine();
        sc.close();
        str = str.replaceAll(" ", "");

        //String str = "5+4";
        System.out.println(str);
        char operation = '0';
        char[] symbols = { '*', '-', '+', '/' };

        for (int a = 0; a < symbols.length; a++) {
            char temp = symbols[a];
            for (int j = 0; j < str.length(); j++) {
                if (temp == str.charAt(j) & temp != str.charAt(0)) {
                    operation = temp;
                    a = symbols.length;
                    break;
                }
            }
        }
       // System.out.println(operation);

        String sep = "\\" + Character.toString(operation); // нужно использовать разделители для арифметических знаков
        //System.out.println(sep);
        double result = 0;
        String[] formula = str.split(sep);
        double a = Integer.parseInt(formula[0]);
        double b = Integer.parseInt(formula[1]);

        switch (operation) {
            case '*': result = a * b;
                break;
            case '-': result = a - b;
                break;
            case '+': result = a + b;
                break;
            case '/': result = a / b;
                break;
        }
        System.out.println("результат = "+result);
        // System.out.println(Arrays.toString(formula)); 
    }
}