package eticaret.business.concretes;

import eticaret.business.abstracts.EmailValidateService;
import eticaret.business.abstracts.PersonService;
import eticaret.core.GoogleSignService;
import eticaret.dataAccess.abstracts.PersonDao;
import eticaret.entities.concretes.Person;

public class PersonManager implements PersonService {
	
	private EmailValidateService emailValidateService;
	private PersonDao personDao;
	private GoogleSignService googleSignService;

	public PersonManager(PersonDao personDao, GoogleSignService googleSignService) {
		super();
		this.personDao = personDao;
		this.googleSignService=googleSignService;
	}
	
	public PersonManager(PersonDao personDao, GoogleSignService googleSignService,EmailValidateService emailValidateService) {
		super();
		this.personDao = personDao;
		this.googleSignService=googleSignService;
		this.emailValidateService=emailValidateService;
	}

	@Override
	public void add(Person person) {
		if (person.getPassword().length() < 6 || person.getFirstName().length() < 2
				|| person.getLastName().length() < 2) {
			System.out.println("Olmadý sisteme ekleyemedik .\n Parolanýz "
					+ "6 karakterden fazla olmalý . \n Ad ve Soyadýnýz 2 harften " + "fazla olmalý");
			return;
		}else if(emailValidateService.isValid(person, person.getEmail())==true) {
			personDao.add(person);
			googleSignService.signToService(person.getFirstName(),person.getPassword());
		}
		


	}

}
