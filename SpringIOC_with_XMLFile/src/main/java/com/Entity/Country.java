package com.Entity;

public class Country {

	private int cid;
	private String cname;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Country(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Country [cid=" + cid + ", cname=" + cname + "]";
	}
	
	
	
}
