package za.co.ritzware.oasis.service;

import za.co.ritzware.oasis.dao.RegisterDAO;
import za.co.ritzware.oasis.model.RegistrationBean;

public class RegistrationService {

	public static String apply(RegistrationBean application) {
		
		if(!hasAppliedBefore(application.getId())) {
			RegisterDAO applicationDAO= new RegisterDAO();
			return applicationDAO.saveApplication(application);
		}
		return null;
	}

	private static boolean hasAppliedBefore(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
