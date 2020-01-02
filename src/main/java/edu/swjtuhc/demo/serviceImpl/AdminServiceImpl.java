package edu.swjtuhc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.AdminMapper;
import edu.swjtuhc.demo.model.Admin;
import edu.swjtuhc.demo.model.SysUser;
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

	@Override
	public int deleteuser(SysUser user) {
		// TODO Auto-generated method stub
		
		SysUser u2 = adminMapper.selectUserByUsername(user.getUsername());
		int i;
		if(u2==null) {
			i = 2;
		}else {
			i = adminMapper.deleteuser(user);
		}
		return i;
	}

	@Override
	public int updatepassword(SysUser sysuser) {
		// TODO Auto-generated method stub
		
		SysUser u3 = adminMapper.selectUserByUsername(sysuser.getUsername());
		int i;
		if(u3==null) {
			i = 2;
		}else {
			i = adminMapper.updatepassword(sysuser);
		}
		return i;
	}

}
