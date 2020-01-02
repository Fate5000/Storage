package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Brecord;
import edu.swjtuhc.demo.model.Rrecord;
import edu.swjtuhc.demo.model.SysUser;


@Mapper
public interface UserMapper {
	
	public SysUser selectUserByUsername(String username);
	
	public int insertUer(SysUser user);
	
	public int updatepassword(SysUser password);
	
	public Brecord selectbrecord(String username);
	
	public Rrecord selectrrecord(String username);
	
	public int selectgetpassword(SysUser user);
	
}
