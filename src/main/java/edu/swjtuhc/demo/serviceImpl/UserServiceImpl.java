package edu.swjtuhc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.UserMapper;
import edu.swjtuhc.demo.model.Brecord;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.model.Yanzheng;
import edu.swjtuhc.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserMapper userMapper;

	@Override
	public int register(SysUser user) {
		// TODO Auto-generated method stub
		
		SysUser user0 =userMapper.selectUserByUsername(user.getUsername());
		int i = 1;
		if(user0==null) {
			i = userMapper.insertUser(user);
		}else {
			i = 2;
		}
		return i;
	}

	@Override
	public int login(SysUser user) {
		// TODO Auto-generated method stub
		
		SysUser user1 = userMapper.selectUserByUsername(user.getUsername());
		int i = 1;
		if(user1!=null) {
			i = userMapper.checkPassword(user);
		}else {
			i = 2;
		}
		return i;
	}
	

	
	
		@Override
		public int findPassword(Yanzheng find) {
			// TODO Auto-generated method stub
			
			
			return 0;
		}

		@Override
		public int brecord(Brecord student) {
			// TODO Auto-generated method stub
		
			Brecord studentnum0 = userMapper.selectstudentByStudentnum(student.getStudentnum());
			int i = 1;
			if(studentnum0!=null) {
				i = userMapper.selsetbrecordByStudentnum(student);
			}else {
				i = 2;
			}
			return i;
		}

	}
