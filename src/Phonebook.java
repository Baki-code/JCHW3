import java.util.HashMap;
import java.util.HashSet;

public class Phonebook {

    HashMap<String, HashSet<Integer>> phonebook;

    public Phonebook() {
        this.phonebook = new HashMap<>();
    }

    void add(String surname, Integer phone){
        HashSet<Integer> names = phonebook.getOrDefault(surname, new HashSet<>());
        names.add(phone);


        phonebook.put(surname,names);

    }
    void get (String surname){
//        System.out.printf("Имя: %s Телефон: %d", surname, phonebook.getOrDefault(surname,new HashSet<>));
        System.out.println("Имя: " + surname + " / Телефон: " + phonebook.getOrDefault(surname, new HashSet<>()));

    }
}
