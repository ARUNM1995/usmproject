package com.jspider.usm.model.dao.logindao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspider.usm.dto.LoginDto;
import com.jspider.usm.dto.RegisterDto;
@Repository
public class LoginDao {

	@Autowired
	private SessionFactory factory;
	
	public LoginDao() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	
public RegisterDto login(LoginDto dto){
		
	Session session=factory.openSession();
	String myQuery=" from RegisterDto where email=:nemail and password=:npwd";
	Query query=session.createQuery(myQuery);
	query.setParameter("nemail", dto.getEmail());
	query.setParameter("npwd", dto.getPassword());
	RegisterDto fromDb=(RegisterDto) query.uniqueResult();
	return fromDb;
	
	
	}
}
