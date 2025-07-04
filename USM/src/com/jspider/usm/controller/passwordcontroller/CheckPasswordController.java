package com.jspider.usm.controller.passwordcontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jspider.usm.dto.RegisterDto;
import com.jspider.usm.model.service.passwordservice.CheckPasswordService;
@Controller
@RequestMapping("/")
public class CheckPasswordController {
@Autowired
private CheckPasswordService checkPasswordService;
	
	public CheckPasswordController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/forgot.do")
	public ModelAndView checkPwd(HttpServletRequest req){
		String email=req.getParameter("email");
		RegisterDto fromDb=checkPasswordService.checkPwd(email);
		if(fromDb!=null){
			System.out.println(fromDb.getEmail());
			checkPasswordService.updatePwwd(fromDb.getEmail());
			return new ModelAndView("/login.jsp","key","allow user to chnage passowrd ");
		}else{
			return new ModelAndView("/login.jsp","key","invlaid username");
		}
	}
}







=====================================================================