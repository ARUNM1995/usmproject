package com.jspider.usm.model.dao.passworddao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspider.usm.dto.RegisterDto;
@Repository
public class CheckPasswordDao {

	@Autowired
	private SessionFactory factory;
	
	public CheckPasswordDao() {
		// TODO Auto-generated constructor stub
	}
	
public RegisterDto checkPwd(String email){
	Session session=factory.openSession();
	String qry="from RegisterDto where email=:nemail";
	Query query=session.createQuery(qry);
	query.setParameter("nemail", email);
	RegisterDto fromDb=(RegisterDto) query.uniqueResult();
	return fromDb;
	}

public int updatePwwd(String newPwd,String userName ){
	System.out.println("username in dao"+userName);
	Session session=factory.openSession();
	Transaction transaction=session.beginTransaction();
	String Syntax="update RegisterDto  set password=:newpassword where email=:userName";
	Query query=session.createQuery(Syntax);
	query.setParameter("newpassword", newPwd);
	query.setParameter("userName", userName);
	int id=query.executeUpdate();
	System.out.println(id);
	transaction.commit();
	return id;
	
	
	
	
}
}
