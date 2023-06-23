package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.Contact;

class ContactTest {

	
	@Test
	void testNewContact() {
		Contact contact = new Contact("123456","John","Doe","1234567890","123 Sesame Street");
		assertEquals("123456",contact.getId());
		assertEquals("John",contact.getFirst());
		assertEquals("Doe",contact.getLast());
		assertEquals("1234567890",contact.getNumber());
		assertEquals("123 Sesame Street",contact.getAddress());	
	}
	
	@Test
	void testNewIDTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678901","John","Doe","1234567890","123 Sesame Street");
		});
	}
	
	@Test
	void testNewFirstTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456","Johnboramous","Doe","1234567890","123 Sesame Street");
		});
	}
	
	
	@Test
	void testNewLastTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456","John","Doeremifasola","1234567890","123 Sesame Street");
		});
	}
	
	@Test
	void testNewPhoneTooShort() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456","John","Doe","12345","123 Sesame Street");
		});
	}
	
	@Test
	void testNewPhoneTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456","John","Doe","1234567890123","123 Sesame Street");
		});
	}
	@Test
	void testNewDescriptionTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456","John","Doe","1234567890","123 Sesame Street 123 Sesame Street 123 Sesame Street 123 Sesame Street 123 Sesame Street 123 Sesame Street");
		});
	}
	
	@Test
	void testSetFirstTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("123456","John","Doe","1234567890","123 Sesame Street");
			contact.setFirst("Botoxinjection");
		});
	}
	
	@Test
	void testSetLastTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("123456","John","Doe","1234567890","123 Sesame Street");
			contact.setLast("Botoxinjection");
		});
	}

	@Test
	void testSetNumberNotEqualToTen() {
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("123456","John","Doe","1234567890","123 Sesame Street");
			contact.setNumber("123");
		});
	}
	@Test
	void testSetAddressTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("123456","John","Doe","1234567890","123 Sesame Street");
			contact.setAddress("Botoxinjectionfiveandninesupersaiyanallthetimeinmylifeofmylimeinthesky");
		});
	}
}

