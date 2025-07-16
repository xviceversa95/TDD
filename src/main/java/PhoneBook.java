import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    // тут будем хранить имена и номера:
    public static Map<String, Integer> phoneBook = new HashMap<>();


    public static int add(String name, Integer number) {
        phoneBook.put(name, number);
        return phoneBook.size();
    }

    public static String findByNumber(Integer number) {
        for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(number)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static Integer findByName(String name) {
        return phoneBook.get(name);
    }

    public static String printAllNames(){
        return null;
    }
}
