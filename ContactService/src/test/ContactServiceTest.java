package test;

import org.junit.jupiter.api.*;

import com.ContactService;
import com.Contact;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ContactServiceTest {
	private ContactService ContactService;

	@BeforeEach
	void setUp() {
		ContactService = new ContactService();
	}

	@Test
	void testAddContact() {

		// Test contact
		Contact contact = new Contact("123456", "John", "Doe", "1234567890", "123 Sesame Street");
		ContactService.addContact(contact);

		// Assertion expected from duplicate ID
		assertThrows(IllegalArgumentException.class, () -> {
			ContactService.addContact(contact);			
		});
		
		// Check contact added
		assertEquals(1,ContactService.getContacts().size());
	}
	
	
	@Test 
	void testDeleteContact() {
  
		// Test contact
		Contact contact = new Contact("123456", "John", "Doe", "1234567890", "123 Sesame Street");
		ContactService.addContact(contact);
		
		// Method called correctly
		assertTrue(ContactService.deleteContact("123456"));
		
		// Exception if ID not found
		assertThrows(IllegalArgumentException.class, () -> {
			ContactService.deleteContact("432189");			
		});
		
		// Verify contact is deleted
		assertEquals(0,ContactService.getContacts().size());
	  }
  
	  @Test 
	  void testUpdateContact() { 
		  
		  // Create and add test Contact String
		  Contact contact = new Contact("123456", "John", "Doe", "1234567890", "123 Sesame Street");
		  ContactService.addContact(contact);
		  
		  // Exception if ID not found
		  assertThrows(IllegalArgumentException.class, () -> {
			ContactService.updateContact("123457", "John", "Doe", "1234567890", "123 Sesame Street");		
		  });
		  
		  assertTrue(ContactService.updateContact("123456", "Bill", "Squier", "5678123456", "1800 Pennsylvania Ave"));
		  assertEquals("Bill",contact.getFirst());
		  assertEquals("Squier",contact.getLast());
		  assertEquals("5678123456",contact.getNumber());
		  assertEquals("1800 Pennsylvania Ave",contact.getAddress());
	}
}
