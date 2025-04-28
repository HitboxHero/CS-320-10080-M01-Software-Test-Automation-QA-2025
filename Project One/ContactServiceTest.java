package contact;

/*
 * Alex Kastigar
 * CS-320 Software Test, Automation QA
 * March 17, 2025
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    private ContactService service;

    @BeforeEach
    public void setUp() {
        service = new ContactService();
    }

    @Test
    public void testAddContact() {
        Contact samus = new Contact("S123", "Samus", "Aran", "1122334455", "Zebes");
        service.addContact(samus);
        assertThrows(IllegalArgumentException.class, () -> service.addContact(samus));
    }

    @Test
    public void testDeleteContact() {
        Contact kirby = new Contact("K321", "Kirby", "Star", "2233445566", "Dream Land");
        service.addContact(kirby);
        service.deleteContact("K321");
        assertThrows(IllegalArgumentException.class, () -> service.deleteContact("K321"));
    }

    @Test
    public void testUpdateFields() {
        Contact fox = new Contact("F999", "Fox", "McCloud", "3344556677", "Lylat System");
        service.addContact(fox);
        service.updateFirstName("F999", "Falco");
        service.updateLastName("F999", "Lombardi");
        service.updatePhone("F999", "7766554433");
        service.updateAddress("F999", "Corneria Base");

        assertEquals("Falco", fox.getFirstName());
        assertEquals("Lombardi", fox.getLastName());
        assertEquals("7766554433", fox.getPhone());
        assertEquals("Corneria Base", fox.getAddress());
    }
}
