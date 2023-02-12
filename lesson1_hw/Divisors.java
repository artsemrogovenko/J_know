package lesson1_hw;

import java.util.ArrayList;
import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Вывести все простые числа от 1 до ");
        int n = sc.nextInt();
        sc.close();
        ArrayList<Integer> divisors = new ArrayList<> ();
        for (int i = 2; i <= n; i++) {
            if(n%i==0){
                n=n/i;
                divisors.add (i);
                i=1;
            }
            //System.out.printf("N = %d i = %d\n",n,i);
        }
        System.out.println(divisors); 
    }
}
