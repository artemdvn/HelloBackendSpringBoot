package helloBackendSpringBoot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import helloBackendSpringBoot.domain.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer> {
	
}
