/**
 * Написать программу, определяющую правильность расстановки скобок в выражении.
 * Пример 1: a+(d*3) - истина
 * Пример 2: [a+(1*3) - ложь
 * Пример 3: [6+(3*3)] - истина
 * Пример 4: {a}[+]{(d*3)} - истина
 * Пример 5: <{a}+{(d*3)}> - истина
 * Пример 6: {a+]}{(d*3)} - ложь
 */

import java.util.ArrayDeque;
import java.util.Map;

public class StackSc {
    public static void main(String[] args) {
        System.out.println(isValid("a+(d*3)"));
        System.out.println(isValid("[a+(1*3)"));
        System.out.println(isValid("[6+(3*3)] "));
        System.out.println(isValid("{a}[+]{(d*3)}"));
        System.out.println(isValid("<{a}+{(d*3)}>"));
        System.out.println(isValid("{a+]}{(d*3)} "));
    }

    private static boolean isValid(String formula) {
        ArrayDeque<Character> brackets = new ArrayDeque<>();
        Map<Character, Character> bracketDict = Map.of('[', ']', '{', '}', '(', ')');
        for (char c : formula.toCharArray()) {

            if (bracketDict.containsKey(c)) {
                brackets.add(c);
            } 
            else if (bracketDict.containsValue(c)) {
                if (brackets.isEmpty()) {
                    return false;
                }
                char openBracket = brackets.removeLast();
                if (bracketDict.get(openBracket) != c) {
                    return false;
                }
            }
        }
        // if (brackets.isEmpty())
        // return true;
        // else
        // return false;
        return brackets.isEmpty();
    }
}
