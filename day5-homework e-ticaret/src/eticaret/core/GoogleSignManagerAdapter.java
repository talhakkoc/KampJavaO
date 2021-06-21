package eticaret.core;

import eticaret.googleSign.GoogleSignManager;

public class GoogleSignManagerAdapter implements GoogleSignService {

	@Override
	public void signToService(String username, String password) {

		GoogleSignManager googleSignManager = new GoogleSignManager();
		googleSignManager.signToSite(username, password);
	}

}
