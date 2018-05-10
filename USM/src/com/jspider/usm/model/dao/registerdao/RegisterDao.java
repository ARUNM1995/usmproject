package com.jspider.usm.model.dao.registerdao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspider.usm.dto.RegisterDto;

@Repository
public class RegisterDao {

	@Autowired
	private SessionFactory factory;
	
	public RegisterDao() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	
	
	public void register(RegisterDto dto){
		Session session= factory.openSession();
		Transaction transaction=session.beginTransaction();
		try{
			session.save(dto);
			transaction.commit();
		}catch(HibernateException he){
			he.printStackTrace();
		}finally {
			session.close();
		}
	}
}
