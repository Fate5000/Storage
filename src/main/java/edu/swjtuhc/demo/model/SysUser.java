package edu.swjtuhc.demo.model;

public class SysUser {
	int uid;
	String username;
	String password;
	int  studentnum;
	int phonenum;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStudentnum() {
		return studentnum;
	}
	public void setStudentnum(int studentnum) {
		this.studentnum = studentnum;
	}
	public int getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(int phonenum) {
		this.phonenum = phonenum;
	}
	@Override
	public String toString() {
		return "SysUser [username=" + username + ", password=" + password + ", studentnum=" + studentnum + ", phonenum="
				+ phonenum + "]";
	}
	
}
