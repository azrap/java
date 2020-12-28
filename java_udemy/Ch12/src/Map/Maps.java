package Map;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-oriented, platform independent language");
        languages.put("Python", "an interpreted object-oriented, high level language with dynamic symantics");
        languages.put("Javascript", "Frontend functional language");
        System.out.println(languages.get("Java"));

        if (languages.containsKey(("Java"))) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }



        for ( String key: languages.keySet()) {
            System.out.println(key + ":" + languages.get(key));
        }



    }

}
