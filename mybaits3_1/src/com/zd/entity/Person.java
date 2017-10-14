package com.zd.entity;


public class Person {
	public Person() {
	}

	public Person(int pid, String pname, String psex, int page, int salary,
			String tel) {
		this.pid = pid;
		this.pname = pname;
		this.psex = psex;
		this.page = page;
		this.salary = salary;
		this.tel = tel;
	}

	private int pid;
	private String pname;
	private String psex;
	private int page;
	private int salary;
	private String tel;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPsex() {
		return psex;
	}

	public void setPsex(String psex) {
		this.psex = psex;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", psex=" + psex
				+ ", page=" + page + ", salary=" + salary + ", tel=" + tel
				+ "]";
	}
}