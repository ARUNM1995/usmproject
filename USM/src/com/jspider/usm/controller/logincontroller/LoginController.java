package com.jspider.usm.controller.logincontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jspider.usm.dto.LoginDto;
import com.jspider.usm.dto.RegisterDto;
import com.jspider.usm.model.service.loginservice.LoingService;
@Controller
@RequestMapping("/")
public class LoginController
{

	@Autowired
	private LoingService loingService;
	
	public LoginController() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	
	@RequestMapping("/login.do")
	public ModelAndView login(LoginDto dto,HttpServletRequest req){
	RegisterDto fromDb=loingService.login(dto);
	HttpSession hs=req.getSession();
	if(fromDb !=null){
		hs.setAttribute("dto", fromDb);
		return new ModelAndView("/home.jsp","key","Welocme");
	}else{
		return new ModelAndView("/login.jsp","key","Invalid Credentials");
	}
	}
}
