package eticaret;

import eticaret.business.abstracts.PersonService;
import eticaret.business.concretes.EmailValidateManager;
import eticaret.business.concretes.PersonManager;
import eticaret.core.GoogleSignManagerAdapter;
import eticaret.dataAccess.concretes.HibernatePersonDao;
import eticaret.entities.concretes.Person;

public class Main {

	public static void main(String[] args) {

		PersonService personService = new PersonManager(new HibernatePersonDao(),
				new GoogleSignManagerAdapter(),new EmailValidateManager());
		
		Person person = new Person("talha", "akkoc", "takkoc@gmail.com", "123123");
		
		personService.add(person);
	}
	

}
