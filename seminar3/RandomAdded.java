
/** Заполнить список десятью случайными числами. 
 Отсортировать список методом sort() и вывести его на экран.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomAdded {
    public static void main(String[] args) {
        List<Integer> collect = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            collect.add(rand.nextInt(15));
        }
        
        System.out.println(collect);
        collect.sort(new MyComparator());
        System.out.println(collect);
    }

}