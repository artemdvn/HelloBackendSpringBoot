package helloBackendSpringBoot;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.context.junit4.SpringRunner;

import helloBackendSpringBoot.domain.Contact;
import helloBackendSpringBoot.service.ContactService;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations="classpath:test.properties")
@Sql(executionPhase = ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:createTables.sql")
public class HelloBackendSpringBootApplicationTests {
	
	@Autowired
	private ContactService cs;

	@Test
	public void testRegex() {
		
		List<Contact> contacts = cs.getFilteredContacts("^A.*$");
		assertEquals(4, contacts.size());

		contacts = cs.getFilteredContacts("^L.*$");
		assertEquals(3, contacts.size());

		contacts = cs.getFilteredContacts("^.*[aei].*$");
		assertEquals(0, contacts.size());

		contacts = cs.getFilteredContacts("^.*[L].*$");
		assertEquals(3, contacts.size());

	}

}
