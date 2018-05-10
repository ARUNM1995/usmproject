package com.jspider.usm.model.dao.updatedao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspider.usm.dto.RegisterDto;
@Repository
public class UpdateDao {

	
	@Autowired
	private SessionFactory factory;
	public UpdateDao() {
		// TODO Auto-generated constructor stub
	}

	public RegisterDto update(RegisterDto dto) {

	Session session=factory.openSession();
	Transaction tx= session.beginTransaction();
	try{
		RegisterDto dtoFromDb=(RegisterDto) session.merge(dto);
		tx.commit();
		return dtoFromDb;
	}catch(HibernateException he){
		he.printStackTrace();
	}finally{
		session.close();
	}
		return null;
	}
}
