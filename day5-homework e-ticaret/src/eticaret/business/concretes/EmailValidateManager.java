package eticaret.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eticaret.business.abstracts.EmailValidateService;
import eticaret.entities.concretes.Person;

public class EmailValidateManager implements EmailValidateService {

	public static final String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

	public static boolean validate(String emailStr) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		return matcher.find();

	}

	@Override
	public boolean isValid(Person person, String email) {
		if (!validate(person.getEmail())) {
			System.out.println("Email adresi uygun degil.Eklenemedi");
			return false;
		}
		
		System.out.println("Email Validation tamamlandý. Dogrulama linki gönderildi.");
		return true;
	}

}
