package com.oops3;

public class Employees {

	private int eid;
	private String ename;
	public Employees(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	
	@Override
	public String toString() {
		return "Employees [eid=" + eid + ", ename=" + ename + "]";
	}

	public static void swap(Employees e1,Employees e2) {
		int temp=e1.getEid();
		e1.eid=e2.getEid();
		e2.eid=temp;
		String st=e1.getEname();
		e1.ename=e2.getEname();
		e2.ename=st;
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
}
