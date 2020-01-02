package edu.swjtuhc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.AdminMapper;
import edu.swjtuhc.demo.model.Admin;
import edu.swjtuhc.demo.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminMapper adminMapper;

	@Override
	public int login(Admin admin) {
		// TODO Auto-generated method stub
		
		Admin admin0 = adminMapper.selectAdminByAccountnum(admin.getAccountnum());
		int i = 1;
		if(admin0==null) {
			i = 2;
		}else {
			if(admin0.getPhonenum()!=admin.getPhonenum()) {
				i = 3;
			}else {
				if(admin0.getPassword().equals(admin.getPassword())) {
					i = 1;
				}else {
					i = 4;
				}
			}
			
		}
		return i ;
	}

}
