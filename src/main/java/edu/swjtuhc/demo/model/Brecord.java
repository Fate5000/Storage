package edu.swjtuhc.demo.model;

public class Brecord {
	int time;
	String booknumber;
	String bookname;
	int studentnum;
	int num;
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
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
	public int getStudentnum() {
		return studentnum;
	}
	public void setStudentnum(int studentnum) {
		this.studentnum = studentnum;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Brecord [time=" + time + ", booknumber=" + booknumber + ", bookname=" + bookname + ", studentnum="
				+ studentnum + ", num=" + num + "]";
	}
	
	
	
}
