package com.tns.daytwo;




public class RCB_Teams {
private String name;
private int age;

private String getName() {
return name;
}
private int getAge() {
return age;
}

public  void setName(String name) {
	this.name=name;
}
public void setAge(int age) {
	this.age = age;
}
public static void main(String[] args) {
	RCB_Teams obj = new RCB_Teams();
	obj.setName("kohli");
	obj.setAge(35);
	
	System.out.println(obj.getName());
	System.out.println(obj.getAge());
}
}
