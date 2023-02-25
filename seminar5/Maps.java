import java.util.LinkedHashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, String> passportToName = new LinkedHashMap<> ();
        passportToName.put (123456, "Иванов");
        passportToName.put (321456, "Васильев");
        passportToName.put (234561, "Петрова");
        passportToName.put (234432, "Иванов");
        passportToName.put (654321, "Петрова");
        passportToName.put (345678, "Иванов");
        System.out.println(passportToName);

        for (Map.Entry<Integer, String> entry : passportToName.entrySet())
            if (entry.getValue().equals ("Иванов"))
                System.out.println(entry);
    }
}
