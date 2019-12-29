package edu.swjtuhc.demo.model;

public class Yanzheng {
	String username; 
	int  phonenum; 
	int yzcode; 
	String newpassword;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(int phonenum) {
		this.phonenum = phonenum;
	}
	public int getYzcode() {
		return yzcode;
	}
	public void setYzcode(int yzcode) {
		this.yzcode = yzcode;
	}
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	@Override
	public String toString() {
		return "yanzheng [username=" + username + ", phonenum=" + phonenum + ", yzcode=" + yzcode + ", newpassword="
				+ newpassword + "]";
	}
	
}
