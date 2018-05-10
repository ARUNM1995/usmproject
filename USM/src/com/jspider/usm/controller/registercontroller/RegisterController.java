package com.jspider.usm.controller.registercontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jspider.usm.dto.RegisterDto;
import com.jspider.usm.model.service.registerservice.RegisterService;

@Controller
@RequestMapping("/")
public class RegisterController {

	@Autowired
	private RegisterService registerService;
	public RegisterController() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	 
	@RequestMapping("/register.do")
	public ModelAndView register(RegisterDto dto){
		registerService.register(dto);
		return new ModelAndView("/register.jsp","key","registration sucessfull please login to continue");
	}
}
