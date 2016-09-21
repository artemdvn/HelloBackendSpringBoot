package helloBackendSpringBoot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import helloBackendSpringBoot.domain.Contact;
import helloBackendSpringBoot.service.ContactService;

@RestController
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/hello/contacts")
	public List<Contact> getFilteredContacts(@RequestParam(value = "nameFilter") String val) {
		return contactService.getFilteredContacts(val);
	}	

}
