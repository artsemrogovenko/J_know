import java.util.Scanner;

/**
 Дано четное число N (>0) и символы c1 и c2. 
Написать метод, который вернет строку длины N,
которая состоит из чередующихся символов c1 и c2, начиная с c1.
 */
public class BuildString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Размер строки = ");
        int n = sc.nextInt();
        sc.close();
        String a = "a";
        String b = "b";
        String str = createString(a, b, n);
        System.out.println(str);
    }

    private static String createString(String char1, String char2, int length) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                result.append(char1);
            } else
                result.append(char2);
        }
        return result.toString();
    }
}
