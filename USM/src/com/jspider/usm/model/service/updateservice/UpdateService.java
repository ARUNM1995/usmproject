package com.jspider.usm.model.service.updateservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.usm.dto.RegisterDto;
import com.jspider.usm.model.dao.updatedao.UpdateDao;
@Service
public class UpdateService {

	
	@Autowired
	private UpdateDao updateDao;
	public UpdateService() {
		// TODO Auto-generated constructor stub
	}

	public RegisterDto update(RegisterDto dto) {
		return updateDao.update(dto);
	}

}
