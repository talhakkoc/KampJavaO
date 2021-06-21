package eticaret.business.abstracts;

import eticaret.entities.concretes.Person;

public interface EmailValidateService {

	boolean isValid(Person person,String email);
}
