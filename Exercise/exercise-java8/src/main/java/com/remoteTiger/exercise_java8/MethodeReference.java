package com.remoteTiger.exercise_java8;

public class MethodeReference {
public static void main(String[] args) {
	Thread t = new Thread(MethodeReference::printMessage);// MethodRefernce ::printMessage===() -> printMessage()
	t.start();
}
public static void printMessage() {
	System.out.println("Hello");
}

}

