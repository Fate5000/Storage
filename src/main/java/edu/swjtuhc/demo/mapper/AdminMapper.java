package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Admin;

@Mapper
public interface AdminMapper {
	
	public Admin selectAdminByAccountnum(String accountnum);
	
	
}
