package edu.swjtuhc.demo.model;

public class Books {
	String booknumber;
	String bookname;
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
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Books [booknumber=" + booknumber + ", bookname=" + bookname + ", num=" + num + "]";
	}
	
}
