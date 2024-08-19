import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {

    private HashMap<String, List<String>> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        if (!contacts.containsKey(name)) {
            contacts.put(name, new ArrayList<>());
        }
        contacts.get(name).add(phoneNumber);
    }

    public void get(String name) {
        if(!contacts.containsKey(name)){
            System.out.println("Такого человека нет в списке контактов");
        }
        else System.out.println("Телефоны для " + name + ": " + contacts.get(name));
    }
}
