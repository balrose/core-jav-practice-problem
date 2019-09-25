package com.remoteTiger.exercise_java8;

public class Person {
	
private String name ;
private String Lastname;
private int age;
public Person(String name, String lastname, int age) {
	super();
	this.name = name;
	Lastname = lastname;
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastname() {
	return Lastname;
}
public void setLastname(String lastname) {
	Lastname = lastname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Person [name=" + name + ", Lastname=" + Lastname + ", age=" + age + "]";
}

}
