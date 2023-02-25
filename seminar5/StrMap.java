/**
 * Даны 2 строки, написать метод, который вернет true, если эти строки являются
 * изоморфными и false, если нет. Строки изоморфны, если одну букву в первом
 * слове можно заменить на некоторую букву во втором слове, при этом
 * повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
 * порядка следования. (Например, add - egg изоморфны)
 * буква может не меняться, а остаться такой же. (Например, note - code)
 */
import java.util.HashMap;
import java.util.Map;

public class StrMap {
    public static void main(String[] args) {
        String a = "add";
        String b = "egg";
        System.out.println(compareIsomorph(a, b));
    }

    private static boolean compareIsomorph(String a, String b) {
        Map<Character, Character> dict = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {

            if (dict.containsKey(a.charAt(i))) {
                if (dict.get(a.charAt(i)) != b.charAt(i)) { // если такого ключа нет
                    dict.put(a.charAt(i), b.charAt(i)); // добавление соответствия 
                }
            } else
                return false;
        }
        return true;

    }

}