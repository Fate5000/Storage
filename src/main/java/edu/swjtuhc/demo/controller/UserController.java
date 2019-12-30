package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Brecord;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.model.Yanzheng;
import edu.swjtuhc.demo.service.UserService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping("/register")
	public JSONObject register(SysUser user) {
	JSONObject result = new JSONObject();
	
	int i = userService.register(user);
	result.put("state", i);
	
		return result;
	}
	
	
	@RequestMapping("/login")
	public  JSONObject login(SysUser user) {
		JSONObject result = new JSONObject();
		
		int i = userService.login(user);
		result.put("state", i);
		
		return result;
	}
	
	
	@RequestMapping("/findpassword")
	public  JSONObject findpassword(Yanzheng find) {
		JSONObject result = new JSONObject();
		
		return result;
	}
	
	
	@RequestMapping("/brecord")
	public JSONObject brecord(Brecord student) {
		JSONObject result = new JSONObject();
		
		int i = userService.brecord(student);
		result.put("state", i);
		return  result;
	}
}
