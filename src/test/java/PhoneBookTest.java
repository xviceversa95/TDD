import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {

    @Test
    public void testAddContact() {
        PhoneBook testBook = new PhoneBook();
        int expected = 1;
        assertEquals(expected, testBook.add("Anna", 555555));
    }
}
