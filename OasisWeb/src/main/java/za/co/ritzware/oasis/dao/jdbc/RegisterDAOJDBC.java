package za.co.ritzware.oasis.dao.jdbc;

import java.sql.ResultSet;
import java.util.List;
 
import za.co.ritzware.oasis.dao.RegisterDAO;
import za.co.ritzware.oasis.model.RegistrationBean;
import za.co.ritzware.oasis.utils.DatabaseUtilities;
import za.co.ritzware.oasis.utils.GenericUtilities;

public class RegisterDAOJDBC implements RegisterDAO {
	private static String SAVE_QUERY="INSERT INTO application(firstname,lastname,natid,gender,dob,maritalstatus,cellnumber,email,occupation,companyname,income,empperiod,workphone,incometaxnumber,methodofcontact,typeofplace,lengthofstay,refnumber)";
	/* (non-Javadoc)
	 * @see za.co.ritzware.oasis.dao.jdbc.RegisterDAO#save(za.co.ritzware.oasis.model.RegistrationBean)
	 */
	@Override
	public String save(RegistrationBean application) {
		String refNum=GenericUtilities.generateUniqueRefNumber();
		SAVE_QUERY = SAVE_QUERY + " VALUES (";
		
		SAVE_QUERY = SAVE_QUERY + "'"+ application.getFirstName()+"','"+ application.getLastName()+"','"
				+ application.getId()+"','"+ application.getGender()+"','"+ application.getDateOfBirth()+"','"
				+application.getMaritalStatus()+"','"+ application.getCellNumber()+"','"+application.getEmail()+"','"
				+application.getOccupation()+"','"+application.getCompanyName()+"',"+application.getMonthlyIncome()+",'"
				+ application.getEmploymentPeriod()+"','"+ application.getWorkPhone()+"','"+application.getIncomeTaxNumber()+"','"
				+ application.getMethodOfContact()+"','"+ application.getTypeOfPlace()+"','"+application.getLengthOfStay()+ "','"+ refNum +"')";
		ResultSet rs= DatabaseUtilities.executeQuery(SAVE_QUERY);
	     if(rs!=null) {
	    	  //TODO
	     }
		 return refNum;
	}
	
	/* (non-Javadoc)
	 * @see za.co.ritzware.oasis.dao.jdbc.RegisterDAO#update(za.co.ritzware.oasis.model.RegistrationBean)
	 */
	@Override
	public String update(RegistrationBean application) {
		String refNum="";
		
		 return refNum;
	}
	
	/* (non-Javadoc)
	 * @see za.co.ritzware.oasis.dao.jdbc.RegisterDAO#delete(java.lang.String)
	 */
	@Override
	public boolean delete(String id) {
		return false;
	}
	
	/* (non-Javadoc)
	 * @see za.co.ritzware.oasis.dao.jdbc.RegisterDAO#findByID(java.lang.String)
	 */
	@Override
	public RegistrationBean findByID(String id) {
		return null;
	}
	
	/* (non-Javadoc)
	 * @see za.co.ritzware.oasis.dao.jdbc.RegisterDAO#findAll()
	 */
	@Override
	public List<RegistrationBean> findAll(){
		return null;
	}
	
	/* (non-Javadoc)
	 * @see za.co.ritzware.oasis.dao.jdbc.RegisterDAO#findAllBySearchParameter(java.lang.String, java.lang.String)
	 */
	@Override
	public List<RegistrationBean> findAllBySearchParameter(String parameterKey, String parameterValue){
		return null;
	}
}
