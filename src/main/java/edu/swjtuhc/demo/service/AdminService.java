package edu.swjtuhc.demo.service;

import edu.swjtuhc.demo.model.Admin;
import edu.swjtuhc.demo.model.Books;

public interface AdminService {
	
	public int login(Admin admin);
	
	public int addbook(Books book);
}
