package edu.swjtuhc.demo.service;

import edu.swjtuhc.demo.model.Brecord;
import edu.swjtuhc.demo.model.Rrecord;
import edu.swjtuhc.demo.model.SysUser;

public interface UserService {
	public int register(SysUser user);
	
	public int login(SysUser user);
	
	public int changepassword(SysUser password);
	
	public Brecord selectbrecord(String username);
	
	public Rrecord selectrrecord(String username);
	
	public int forgetpassword(SysUser user);
	
	public SysUser cxpassword(String username);
}
