package edu.swjtuhc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.swjtuhc.demo.mapper.UserMapper;
import edu.swjtuhc.demo.model.Brecord;
import edu.swjtuhc.demo.model.Rrecord;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserMapper userMapper;

	@Override
	public int register(SysUser user) {
		// TODO Auto-generated method stub
		
		SysUser user0 =userMapper.selectUserByUsername(user.getUsername());
		int i ;
		if(user0==null) {
			i = userMapper.insertUer(user);
		}else {
			i = 2;
		}
		return i;
	}

	@Override
	public int login( SysUser user) {
		// TODO Auto-generated method stub
		
		SysUser user1 = userMapper.selectUserByUsername(user.getUsername());
		int i ;
		if(user1==null) {
			i = 2;
		}else {
			if(user1.getPassword().equals(user.getPassword())) {
				i = 1;
			}else {
				i = 3;
			}
		}
		return i;
	}
	

		@Override
		public int changepassword(SysUser password) {
			// TODO Auto-generated method stub
			
			SysUser xgpassword = userMapper.selectUserByUsername(password.getUsername());
			
			int i;
			if(xgpassword.getPhonenum()==password.getPhonenum()) {
				i = userMapper.updatepassword(password);
			}else {
				i = 2;
			}
			return i;
		}

		@Override
		public Brecord selectbrecord(String username) {
			// TODO Auto-generated method stub
			return userMapper.selectbrecord(username);
		}

		@Override
		public Rrecord selectrrecord(String username) {
			// TODO Auto-generated method stub
			return userMapper.selectrrecord(username);
		}

		@Override
		public int forgetpassword(SysUser user) {
			// TODO Auto-generated method stub
			return userMapper.selectgetpassword(user);
		}

		@Override
		public SysUser cxpassword(String username) {
			// TODO Auto-generated method stub
			return userMapper.selectUserByUsername(username);
		}

		
}