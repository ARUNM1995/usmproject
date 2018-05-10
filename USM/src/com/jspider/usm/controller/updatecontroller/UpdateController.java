package com.jspider.usm.controller.updatecontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jspider.usm.dto.RegisterDto;
import com.jspider.usm.model.service.updateservice.UpdateService;
@Controller
@RequestMapping("/")
public class UpdateController {

	@Autowired
	private UpdateService updateService;
	public UpdateController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping("/update.do")
	public ModelAndView update(RegisterDto dto,HttpServletRequest req){
		HttpSession hs=req.getSession(false);
		RegisterDto fromSession=(RegisterDto) hs.getAttribute("dto");
		dto.setId(fromSession.getId());
		RegisterDto dtoFromDb=	updateService.update(dto);
		hs.setAttribute("dto", dtoFromDb);
		return new ModelAndView("/home.jsp","key","Welocme");
	}
}
