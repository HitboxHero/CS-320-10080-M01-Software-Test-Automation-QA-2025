package contact;


/*
 * Alex Kastigar
 * CS-320 Software Test, Automation QA
 * March 17, 2025
 */

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private final Map<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Duplicate contact ID");
        }
        contacts.put(contact.getContactId(), contact);
    }

    public void deleteContact(String contactId) {
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact not found");
        }
        contacts.remove(contactId);
    }

    public void updateFirstName(String contactId, String newFirstName) {
        Contact contact = getContact(contactId);
        contact.setFirstName(newFirstName);
    }

    public void updateLastName(String contactId, String newLastName) {
        Contact contact = getContact(contactId);
        contact.setLastName(newLastName);
    }

    public void updatePhone(String contactId, String newPhone) {
        Contact contact = getContact(contactId);
        contact.setPhone(newPhone);
    }

    public void updateAddress(String contactId, String newAddress) {
        Contact contact = getContact(contactId);
        contact.setAddress(newAddress);
    }

    private Contact getContact(String contactId) {
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact not found");
        }
        return contacts.get(contactId);
    }
}
