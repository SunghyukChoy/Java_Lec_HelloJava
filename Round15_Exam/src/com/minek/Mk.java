package com.minek;

public class Mk {
	public String name;
	public int age;
	
	public Mk() {
		super();
		// TODO Auto-generated constructor stub
		this.name = "";
		this.age = 0;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Mk [name=" + name + ", age=" + age + "]";
	}
	
	
}
