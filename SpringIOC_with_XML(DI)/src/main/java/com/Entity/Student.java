package com.Entity;

public class Student {
	
	private int sid;
	private String sname;
	private int sage;
	
	private Country con;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public Country getCon() {
		return con;
	}

	public void setCon(Country con) {
		this.con = con;
	}

	public Student(int sid, String sname, int sage, Country con) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.con = con;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", con=" + con + "]";
	}
	
	
	
	

}
