package edu.swjtuhc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.AdminMapper;
import edu.swjtuhc.demo.model.Admin;
import edu.swjtuhc.demo.model.Books;
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
		if(admin0!=null) {
			i = adminMapper.checkPassword(admin0);
		}else {
			i = 2;
		}
		return i;
	}

	@Override
	public int addbook(Books book) {
		// TODO Auto-generated method stub
		
		Books book0 = adminMapper.selectBookBybooknumber(book.getBooknumber());
		int i = 1;
		if(book0==null) {
			i = adminMapper.addbook(book);
		}else {
			i = 2;
		}
		return i;
	}
}
