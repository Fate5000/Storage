package edu.swjtuhc.demo.service;

import edu.swjtuhc.demo.model.Admin;
import edu.swjtuhc.demo.model.SysUser;

public interface AdminService {
	
	public int login(Admin admin);
	
	public int deleteuser(SysUser user);
	
	public int updatepassword(SysUser sysuser);
}
