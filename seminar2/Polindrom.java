import java.util.Scanner;

/**
 Напишите метод, который принимает на вход строку (String) и 
определяет является ли строка палиндромом (возвращает boolean значение). 
*/
import java.lang.String;

public class Polindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("введите строку");
        String inp = sc.nextLine();
        sc.close();
        boolean result = true;
        result = isPalindr(inp);
        System.out.println(result);
    }

    private static boolean isPalindr(String str) {
        for (int i = 0, index = 0; index < str.length(); i++, index++) {
            if (index < (str.length() / 2)) {
                if (str.charAt(index) == str.charAt(str.length() - i - 1)) {
                } else
                    return false;
            }
        }
        return true;
    }
}

/*
 * public static void main(String[] args) {
 * Scanner scanner = new Scanner(System.in);
 * System.out.println("Введите строку: ");
 * String str = scanner.nextLine();
 * 
 * System.out.println(isPalindrome(str));
 * 
 * scanner.close();
 * }
 * 
 * private static boolean isPalindrome(String str) {
 * for (int i = 0; i < str.length() - i; i++) {
 * if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
 * return false;
 * }
 * }
 * return true;
 * }
 */