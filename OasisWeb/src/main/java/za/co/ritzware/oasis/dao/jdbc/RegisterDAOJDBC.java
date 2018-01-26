package za.co.ritzware.oasis.dao.jdbc;

import java.util.List;
 
import za.co.ritzware.oasis.dao.RegisterDAO;
import za.co.ritzware.oasis.model.RegistrationBean;

public class RegisterDAOJDBC implements RegisterDAO {
	private static String SAVE_QUERY="insert into Application(";
	/* (non-Javadoc)
	 * @see za.co.ritzware.oasis.dao.jdbc.RegisterDAO#save(za.co.ritzware.oasis.model.RegistrationBean)
	 */
	@Override
	public String save(RegistrationBean application) {
		String refNum="";
		
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
