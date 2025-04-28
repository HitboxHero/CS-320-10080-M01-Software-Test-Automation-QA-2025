package contact;


/*
 * Alex Kastigar
 * CS-320 Software Test, Automation QA
 * March 17, 2025
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    public void testCreateValidContact() {
        Contact mario = new Contact("M123", "Mario", "Mario", "1234567890", "Mushroom Kingdom");
        assertEquals("Mario", mario.getFirstName());
        assertEquals("Mario", mario.getLastName());
        assertEquals("1234567890", mario.getPhone());
        assertEquals("Mushroom Kingdom", mario.getAddress());
    }

    @Test
    public void testInvalidPhoneLength() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("L001", "Link", "Hero", "12345", "Hyrule");
        });
    }

    @Test
    public void testNullFirstName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("S001", null, "Aran", "0987654321", "Brinstar");
        });
    }

    @Test
    public void testSetters() {
        Contact cloud = new Contact("C777", "Cloud", "Strife", "1112223333", "Midgar");
        cloud.setFirstName("Zack");
        cloud.setLastName("Fair");
        cloud.setPhone("9998887777");
        cloud.setAddress("Sector 7 Slums");
        assertEquals("Zack", cloud.getFirstName());
        assertEquals("Fair", cloud.getLastName());
        assertEquals("9998887777", cloud.getPhone());
        assertEquals("Sector 7 Slums", cloud.getAddress());
    }
}
