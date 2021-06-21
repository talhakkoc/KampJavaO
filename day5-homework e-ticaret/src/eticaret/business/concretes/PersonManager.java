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
			System.out.println("Olmad� sisteme ekleyemedik .\n Parolan�z "
					+ "6 karakterden fazla olmal� . \n Ad ve Soyad�n�z 2 harften " + "fazla olmal�");
			return;
		}else if(emailValidateService.isValid(person, person.getEmail())==true) {
			personDao.add(person);
			googleSignService.signToService(person.getFirstName(),person.getPassword());
		}
		


	}

}
