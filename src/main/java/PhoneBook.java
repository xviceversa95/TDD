import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    // тут будем хранить имена и номера:
    public static Map<String, Integer> phoneBook = new HashMap<>();


    public static int add(String name, Integer number) {
        phoneBook.put(name, number);
        return phoneBook.size();
    }
}
