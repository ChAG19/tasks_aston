import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //1
        String[] words = {
                "aaa", "bbb", "ccc", "ddd", "bbb",
                "xxx", "zzz", "aaa", "sss", "ddd",
                "ccc", "qqq", "www", "eee", "rrr",
                "ccc", "lll", "bbb", "aaa", "aaa"
        };

        HashSet<String> uniqueWords = new HashSet<>();
        HashMap<String, Integer> countWords = new HashMap<>();

        for (String word : words) {
            uniqueWords.add(word);
            if (countWords.containsKey(word)) {
                countWords.put(word, countWords.get(word) + 1);
            } else {
                countWords.put(word, 1);
            }
        }

        System.out.println("Уникальные слова:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
        System.out.println("\nКоличество повторений слов:");
        for (Map.Entry<String, Integer> entry : countWords.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        //2
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "8-123-456-78-90");
        phoneBook.add("Иванов", "8-987-654-32-10");
        phoneBook.add("Петров", "8-111-111-11-11");
        phoneBook.add("Сидоров", "8-999-999-99-99");
        phoneBook.add("Петров", "8-000-000-00-00");


        phoneBook.get("Иванов");
        phoneBook.get("Петров");
        phoneBook.get("Сидоров");
        phoneBook.get("Смирнов");
    }
}
