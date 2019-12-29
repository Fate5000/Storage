package edu.swjtuhc.demo.service;

import edu.swjtuhc.demo.model.Books;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.model.Yanzheng;

public interface UserService {
	public int register(SysUser user);
	
	public int login(SysUser user);
	
	public int findPassword(Yanzheng yzcode);
	
	public int addbook(Books book);
}
