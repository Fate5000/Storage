package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Admin;
import edu.swjtuhc.demo.model.Books;
import edu.swjtuhc.demo.service.AdminService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminService adminService;
	
	
	@RequestMapping("/login")
	public  JSONObject login(Admin admin) {
		JSONObject result = new JSONObject(); 
		
		int i = adminService.login(admin);
		result.put("state", i);
		
		return result;
	}
	
	
	@RequestMapping("/addbook")
	public  JSONObject addbook(Books book) {
		JSONObject result = new JSONObject();
		
		int i = adminService.addbook(book);
		result.put("state", 1);
		return null;
	}
}
