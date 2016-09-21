package helloBackendSpringBoot.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import helloBackendSpringBoot.domain.Contact;
import helloBackendSpringBoot.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
    private ContactRepository contactDAO;
	
	public List<Contact> getFilteredContacts(String regex){
		
		List<Contact> filteredContacts = new ArrayList<Contact>();
		
		Pattern p = getPattern(regex);
		
		Iterator<Contact> contactsIterator = (Iterator<Contact>) contactDAO.findAll().iterator();
		while (contactsIterator.hasNext()) {
			Contact contact = contactsIterator.next();
			String contactName = contact.getName();
			Matcher m = p.matcher(contactName);
			if (!m.matches()) {
				filteredContacts.add(contact);
			}
		}
		return filteredContacts;
	}
	
	private Pattern getPattern(String regex){
		Pattern p = Pattern.compile("");
		try {
			p = Pattern.compile(regex);
		} catch (PatternSyntaxException e) {
			System.err.println(e.getDescription());
		}
		return p;
	}

}
