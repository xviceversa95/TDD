import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {

    @Test
    public void testAddContact() {
        PhoneBook testBook = new PhoneBook();
        int expected = 1;
        assertEquals(expected, testBook.add("Anna", 555555));
    }

    @Test
    public void testFindByNumber() {
        PhoneBook testBook = new PhoneBook();
        testBook.add("Anna", 555555);

        String expected = "Anna";

        assertEquals(expected, testBook.findByNumber(555555));
    }

    @Test
    public void testFindByName() {
        PhoneBook testBook = new PhoneBook();
        testBook.add("Anna", 555555);

        Integer expected = 555555;

        assertEquals(expected, testBook.findByName("Anna"));
    }

    @Test
    public void testPrintAllNames() {
        PhoneBook testBook = new PhoneBook();
        testBook.add("Anna", 555555);
        testBook.add("Vova", 6767677);
        testBook.add("Ivan", 6767345);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        testBook.printAllNames();
        System.setOut(originalOut);
        String output = outContent.toString().trim();

        assertEquals("Anna\r\nIvan\r\nVova", output);
    }
}
