package test_another;

import javax.xml.soap.Node;

public class LinkedList {
public int data;
public LinkedList next;

public LinkedList (int data,LinkedList next) {

	this.data =data;
	this.next = next;
	}
public String toString() {
	return data +"";
}

public static void main(String[] args) {
	LinkedList front = new LinkedList(25,null);
	System.out.println(front);
	
}
}
