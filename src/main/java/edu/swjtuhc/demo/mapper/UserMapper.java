package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Brecord;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.model.Yanzheng;

@Mapper
public interface UserMapper {
	
	public SysUser selectUserByUsername(String username);
	
	public int insertUser(SysUser user);
	
	public int checkPassword(SysUser user);
	
	public int findPassword(Yanzheng find);
	
	public Brecord selectstudentByStudentnum(int studentnum);
	
	public int selsetbrecordByStudentnum(Brecord student);
}
