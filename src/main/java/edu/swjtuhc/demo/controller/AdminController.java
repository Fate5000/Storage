package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Admin;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.AdminService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminService adminService;
	
	
	@RequestMapping("/login")
	public  JSONObject login(@RequestBody Admin admin) {
		JSONObject result = new JSONObject(); 
		
		int i = adminService.login(admin);
		result.put("state", i);
		
		return result;
	}
	
	@RequestMapping("/deleteuser")
	public  JSONObject deleteuser(@RequestBody SysUser user) {
		JSONObject result = new JSONObject();
		
		int i = adminService.deleteuser(user);
		result.put("state", i);
		return result;
	}
	
	@RequestMapping("/updatepassword")
	public  JSONObject updatepassword(@RequestBody SysUser sysuser) {
	JSONObject result = new JSONObject();
	
	int i = adminService.updatepassword(sysuser);
	result.put("state", i);
	return result;
	}
}
