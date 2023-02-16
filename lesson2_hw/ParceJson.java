package lesson2_hw;
public class ParceJson {
    public static void main(String[] args) {       
        // попробовал конструктором
        String str = new ToSQL().readFile("lesson2_hw\\multiString.txt"); // cp1251
        str = str.replaceAll("\\[", "").replaceAll("\\]", "");
        String[] students = str.split(", ");
        String[] keys = { "фамилия", "оценка", "предмет" };
        // System.out.println(str);
        for (int i = 0; i < students.length; i++) {
            showMark((students[i].replaceAll("[\"{,}:]", " ")), keys);
        }
    }

    // переименовывает слово в кавычках,убирая кавычки
    private static StringBuilder rename(StringBuilder line, String oldValue, String newValue) {
        return line.replace(line.indexOf(oldValue) - 1, oldValue.length() + line.indexOf(oldValue) + 1, newValue);
    }

     private static void showMark(String inputStr, String[] keys) {
         StringBuilder show = new StringBuilder();
         show.append(inputStr);

         for (String subline : keys) { // пробегаюсь по каждому ключу и переименовываю
             if (subline.matches("фамилия")) {
                 rename(show, subline, "Cтудент");
             }
             if (subline.matches("оценка")) {
                 rename(show, subline, "получил");
             }
             if (subline.matches("предмет")) {
                 rename(show, subline, "по предмету");
             }
         }
         System.out.println(show.toString().trim().replace("  ", " ") + ".");
     }

}