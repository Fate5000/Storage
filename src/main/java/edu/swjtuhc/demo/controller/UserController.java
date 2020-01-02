package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Brecord;
import edu.swjtuhc.demo.model.Rrecord;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.UserService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping("/register")
	public JSONObject register(@RequestBody SysUser user) {
	JSONObject result = new JSONObject();
	
	int i = userService.register(user);
	result.put("state", i);
	
		return result;
	}
	
	
	@RequestMapping("/login")
	public  JSONObject login(@RequestBody SysUser user) {
		JSONObject result = new JSONObject();
		
		int i = userService.login(user);
		result.put("state", i);
		
		return result;
	}
	
	
	@RequestMapping("/changepassword")
	public JSONObject changepassword(@RequestBody SysUser password) {
		JSONObject result = new JSONObject();
		
		int i = userService.changepassword(password);
		result.put("state", i);
		return result;
	}
	
	@RequestMapping("/brecord")
	public JSONObject brecord(@RequestBody Brecord brecord) {
		JSONObject result = new JSONObject();
		
		result.put("state", userService.selectbrecord(brecord.getUsername()));
		return result;
	}
	@RequestMapping("/rrecord")
	public JSONObject rrecord(@RequestBody Rrecord rrecord) {
		JSONObject result = new JSONObject();
		result.put("state", userService.selectrrecord(rrecord.getUsername()));
		return result;
	}
	
	@RequestMapping("/forgetpassword")
	public JSONObject forgetpassword(@RequestBody SysUser user) {
		JSONObject result = new JSONObject();
		SysUser u1 = userService.cxpassword(user.getUsername());
		if (u1==null) {
			result.put("state", "用户不存在");
		}else {
			if(u1.getPhonenum()==user.getPhonenum()) {
				result.put("state", u1.getPassword());
			}else {
				result.put("state", "电话号码错误");
			}
		}
		return result;
	}
}
