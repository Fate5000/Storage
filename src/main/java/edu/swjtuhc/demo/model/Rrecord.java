package edu.swjtuhc.demo.model;

public class Rrecord {
	String booknumber;
	String bookname;
	String username;
	int num;
	public String getBooknumber() {
		return booknumber;
	}
	public void setBooknumber(String booknumber) {
		this.booknumber = booknumber;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Brecord [booknumber=" + booknumber + ", bookname=" + bookname + ", username=" + username + ", num="
				+ num + "]";
	}
	
}
