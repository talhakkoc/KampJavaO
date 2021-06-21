package eticaret.dataAccess.concretes;

import eticaret.dataAccess.abstracts.PersonDao;
import eticaret.entities.concretes.Person;

public class HibernatePersonDao implements PersonDao {

	@Override
	public void add(Person person) {
		System.out.println(person.getFirstName() + " Hibernate ile eklendi.");
	}

}
