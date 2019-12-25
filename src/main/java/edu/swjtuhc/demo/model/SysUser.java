package edu.swjtuhc.demo.model;

public class SysUser {
	String username;
	String password;
	String  studentnum;
	String phonenum;
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
	public String getStudentnum() {
		return studentnum;
	}
	public void setStudentnum(String studentnum) {
		this.studentnum = studentnum;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	@Override
	public String toString() {
		return "SysUser [username=" + username + ", password=" + password + ", studentnum=" + studentnum + ", phonenum="
				+ phonenum + "]";
	}
	
}
