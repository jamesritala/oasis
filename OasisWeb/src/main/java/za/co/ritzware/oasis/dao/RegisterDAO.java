package za.co.ritzware.oasis.dao;

import java.util.List;

import za.co.ritzware.oasis.model.RegistrationBean;

public interface RegisterDAO {

	String save(RegistrationBean application);

	String update(RegistrationBean application);

	boolean delete(String id);

	RegistrationBean findByID(String id);

	List<RegistrationBean> findAll();

	List<RegistrationBean> findAllBySearchParameter(String parameterKey, String parameterValue);

}