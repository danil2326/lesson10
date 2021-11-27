package Lesson10;



import java.util.*;

public class Lesson10 {
    public static void main(String[] args) {
        firsTask();
        seconTask();

    }


    public static void firsTask() {
        List<String> words = new ArrayList<>();
        words.add("Liverpool");
        words.add("Man utd");
        words.add("Man city");
        words.add("Chelsea");
        words.add("Arsenal");
        words.add("Totenham");
        words.add("Barcelona");
        words.add("Real Madrid");
        words.add("Uventus");
        words.add("Milan");
        words.add("PSG");
        words.add("Bayern");
        words.add("Arsenal");
        words.add("Atletico Madrid");
        words.add("Liverpool");


        Set<String> unique = new HashSet<>(words);
        System.out.println("Уникальные слова: " + unique);
        for (String w : unique) {
            System.out.println("Кол-во повтрорений слова " + w + " :" + Collections.frequency(words, w));
        }

    }
    public static void seconTask() {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov", "ivanov-phone-1");
        phonebook.add("Petrov", "petrov-phone-1");
        phonebook.add("Petrov", "89996669999");
        phonebook.add("Petrov", "Petr3");
        phonebook.add("Petrov", "Petr4");
        phonebook.add("Ivanov", "ivanov-phone-2");
        phonebook.add("Ivanov", "ivanov-phone-3");
        phonebook.add("Ivanov", "ivanov-phone-4");
        phonebook.add("Ivanov", "ivanov-phone-5");
        phonebook.add("XXXX", "XXX-XX-XX");


        System.out.println("phone Ivanov: " + phonebook.get("Ivanov"));
        System.out.println("phone Petrov: " + phonebook.get("Petrov"));
        System.out.println("phone XXX: " + phonebook.get("XXXX"));



    }




}
