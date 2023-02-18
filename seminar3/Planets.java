/**
 * Заполнить список названиями планет Солнечной системы в произвольном порядке с
 * повторениями.
 * Вывести название каждой планеты и количество его повторений в списке.
 */
import java.util.ArrayList;

public class Planets {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("юпитер");
        planets.add("марс");
        planets.add("венера");
        planets.add("плутон");
        planets.add("нептун");
        planets.add("сатурн");
        planets.add("венера");
        planets.add("сатурн");
        planets.add("меркурий");
        planets.add("земля");

        ArrayList<String> uniquePlanets = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();
        countRepeats(planets,uniquePlanets, count);
        show(uniquePlanets, count);
    }

    static private void countRepeats(ArrayList<String> planets,ArrayList<String> uniquePlanets, ArrayList<Integer> count) {
        for (String name : planets) {
            int pos = uniquePlanets.indexOf(name);
            if (uniquePlanets.indexOf(name)>=0) {
                count.set(pos, count.get(pos) + 1);
            } else {
                uniquePlanets.add(name);
                count.add(1);
            }
        }
    }

    private static void show(ArrayList<String> names, ArrayList<Integer> counts) {
        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%s %d \n", names.get(i), counts.get(i));
        }
    }

}
