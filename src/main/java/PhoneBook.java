import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class PhoneBook {

    // тут будем хранить имена и номера:
    public static Map<String, Integer> phoneBook = new HashMap<>();
    TreeSet<String> names = new TreeSet<>();


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

    public void printAllNames(){
        for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
            names.add(entry.getKey());
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
