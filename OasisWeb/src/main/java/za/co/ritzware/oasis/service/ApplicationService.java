package za.co.ritzware.oasis.service;

import za.co.ritzware.oasis.dao.ApplyDAO;
import za.co.ritzware.oasis.model.Application;

public class ApplicationService {

	public static String apply(Application application) {
		
		if(!hasAppliedBefore(application.getId())) {
			ApplyDAO applicationDAO= new ApplyDAO();
			return applicationDAO.saveApplication(application);
		}
		return null;
	}

	private static boolean hasAppliedBefore(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
