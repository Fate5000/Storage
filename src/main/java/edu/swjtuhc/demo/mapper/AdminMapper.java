package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Admin;
import edu.swjtuhc.demo.model.SysUser;

@Mapper
public interface AdminMapper {
	
	public Admin selectAdminByAccountnum(String accountnum);
	
	public SysUser selectUserByUsername(String username);
	
	public int deleteuser(SysUser user);
	
	public int updatepassword(SysUser password);
	
}
