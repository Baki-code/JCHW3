import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String [] words = {"cab", "boot","tank ","airbag","cab","engine ","cab","clutch ","brakes","windscreen","cab","headlights","accelerator","cab","battery"};

        HashMap<String, Integer> parts = new HashMap<>();
        for (String i : words) {
            parts.put(i, parts.getOrDefault(i,0)+1);
        }
        System.out.println(parts);

        Phonebook phonebook = new Phonebook();

        phonebook.add("Петров", 125646258);
        phonebook.add("Петров", 235467456);
        phonebook.add("Сидоров", 125646258);
        phonebook.add("Иванов", 564951355);
        phonebook.add("Якушев", 648974632);

        phonebook.get("Петров");
        phonebook.get("Якушев");
        phonebook.get("Иванов");
    }
}

