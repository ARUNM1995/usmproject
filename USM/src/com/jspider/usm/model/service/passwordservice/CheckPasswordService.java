package com.jspider.usm.model.service.passwordservice;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.jspider.usm.dto.RegisterDto;
import com.jspider.usm.model.dao.passworddao.CheckPasswordDao;

@Service
public class CheckPasswordService {

	@Autowired
	JavaMailSender mailSender;
	@Autowired
	private CheckPasswordDao checkPasswordDao;
	
	public CheckPasswordService() {
		// TODO Auto-generated constructor stub
	}
	
public RegisterDto checkPwd(String email){
	return checkPasswordDao.checkPwd(email);
	}

public boolean updatePwwd(String userName){
	System.out.println(userName+"======== in service");
	String newpassword=UUID.randomUUID().toString();
	System.out.println(newpassword);
	int id=checkPasswordDao.updatePwwd(newpassword, userName);
	
	if(id!=0){
		System.out.println("started sending mainl");
		SimpleMailMessage mailMessage=new SimpleMailMessage();
		mailMessage.setTo("arunkumar.nhce@gmail.com");
		mailMessage.setFrom("arunkumar.nhce@gmail.com");
		mailMessage.setSubject("New generated password ");
		mailMessage.setText("Hi user, /n This is new password generated. "
				+ "Please use the same for next login"+newpassword);
		mailSender.send(mailMessage);
		
	
		return true;
		}
		else{
		return false;
		}
}
}



































