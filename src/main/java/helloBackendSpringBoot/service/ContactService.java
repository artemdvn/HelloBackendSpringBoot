package helloBackendSpringBoot.service;

import java.util.List;

import helloBackendSpringBoot.domain.Contact;

public interface ContactService {
	
	public List<Contact> getFilteredContacts(String regex);

}
