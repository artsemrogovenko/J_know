/** 
Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */
package lesson4_hw;
import java.util.LinkedList;

public class ReverseLinked {
    public static void main(String[] args) {
        LinkedList<String> sample = new LinkedList<>();
        String text = "HeLlO";
        for (int i = 0; i < text.length(); i++) {
            sample.add(i, Character.toString(text.charAt(i)));
        }
        System.out.println(sample);
        int size = sample.size() - 1;
        for (int i = 0; i < size / 2; i++) {
            String temp = sample.get(i);
            sample.set(i, sample.get(size - i));
            //System.out.println(sample);
            sample.set(size - i, temp);
            //System.out.println(sample);
        }
        System.out.println(sample);

    }
}
