package lesson1_hw;

import java.util.Arrays;
import java.util.Scanner;


public class FindNumber {
    /*
     * Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть
     * заменены знаком вопроса, например 1? + ?5 = 69. Требуется восстановить
     * выражение до верного равенства. Предложить хотя бы одно решение или сообщить,
     * что его нет.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ввести уравнение например 1? + ?5 = 69 ");
        String str = sc.nextLine();
        sc.close();
        //String str = "?+0 = 69";
        str = str.replaceAll(" ", ""); // уберу пробелы если есть
        String[] formula = str.split("\\+");

        //System.out.println(Arrays.toString(formula));
        String[] res = formula[1].split("\\=");
        formula[1] = res[0];
        //System.out.println(Arrays.toString(formula));
        //System.out.println(Arrays.toString(res));
        System.out.println(str);
        int amount = Integer.parseInt(res[1]);
        // if (res[1].length()> formula[0].length() | res[1].length() >
        // formula[1].length())
        int a = 0;
        int b=0;
        int solution = 0; // количество решений для этого уравнения
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                a = strToNumber(formula[0], i);
                b = strToNumber(formula[1], j); 

                if (a + b == amount ) {
                    solution++;
                    System.out.printf("%d + %d = %d\n", a, b, amount);
                    //System.out.println("Решение есть");
                }               
            }

        }
        if( (a==0|b==0)&  (res[1].length() == formula[0].length() | // если одно из чесел равно нулю
                        res[1].length() == formula[1].length())){
            if (a==0) b=amount;
            else a=amount;
            System.out.printf("%d + %d = %d\n", a, b, amount);
            solution++;         
   
          }
        if (solution == 0) {
            System.out.println("Решений нет");
        }
    }

    public static int strToNumber(String str, int digit) {
        int[] temp = new int[str.length()];
        int questionIndex = str.indexOf('?');
        int value = 0; //
        boolean loop=true;

        while( str.indexOf('0')==0 & loop==true){ // если сгачала строки строит ноль
        if (str.length() > 1 & str.indexOf('0')==0) {
            str= str.substring(1); //обрезаю ноль в начале строки
          }
          else {
            loop=false;
        }
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(str.charAt(i))) {
                temp[i] = Integer.parseInt(String.valueOf(ch));// если элемент является цифрой, записать в temp
            } else {
                temp[i] = digit; // иначе подставить значение со счетчика
            }
        }

        /* ----------------------------------------- */
        if (questionIndex != -1) { // если вопросительный знак встретился
             //System.out.println(Arrays.toString(temp));
            if (str.length() > 1) { // если длинна строки больше одного символа
                
                for (int i = 0; i < temp.length; i++) {// цикл для умножения элемента чтобы записать
                                                       // из массива в одну переменную
                    value += temp[i];
                    value = value * 10;
                }
                value /= 10;
                return value;
            } else { // если длинна строки один символ с вопросом
                return value = temp[0];
            }
        } else { // если строка только из цифр
            value = Integer.parseInt(str);
            return value;
        }
    }
}
