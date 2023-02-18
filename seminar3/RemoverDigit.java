
/** Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа. 
Пройти по списку, найти и удалить целые числа. */
import java.util.ArrayList;

public class RemoverDigit {
    public static void main(String[] args) {
        ArrayList<Object> mixed = new ArrayList<>();
        mixed.add(79);
        mixed.add("в");
        mixed.add(5);
        mixed.add(2);
        mixed.add(7);
        mixed.add(4);
        mixed.add("удалить");
        mixed.add(105);
        mixed.add("типа");
        mixed.add(5);
        mixed.add("5235");
        System.out.println(mixed);
        
        for (int i = 0; i < mixed.size(); i++) {
            if(mixed.get(i) instanceof Integer){
                mixed.remove(i);
                i--;// уменьшается размер массива
            }
        }
        System.out.println(mixed);
    }
}
