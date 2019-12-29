package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Admin;
import edu.swjtuhc.demo.model.Books;

@Mapper
public interface AdminMapper {
	
	public Admin selectAdminByAccountnum(String accountnum);
	
	public int checkPassword(Admin admin);
	
	public Books selectBookBybooknumber(String booknumber);
	
	public int addbook(Books book);
}
