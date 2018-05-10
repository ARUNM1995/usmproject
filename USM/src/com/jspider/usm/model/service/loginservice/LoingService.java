package com.jspider.usm.model.service.loginservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.usm.dto.LoginDto;
import com.jspider.usm.dto.RegisterDto;
import com.jspider.usm.model.dao.logindao.LoginDao;
@Service
public class LoingService {

	@Autowired
	private LoginDao loginDao;
	public LoingService() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	
	
public RegisterDto login(LoginDto dto){
	return loginDao.login(dto);
	}
}
