package com.jspider.usm.model.service.registerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.usm.dto.RegisterDto;
import com.jspider.usm.model.dao.registerdao.RegisterDao;

@Service
public class RegisterService {

	@Autowired
	private RegisterDao registerDao;

	public RegisterService() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	
	public void register(RegisterDto dto){
		registerDao.register(dto);
	}
}
