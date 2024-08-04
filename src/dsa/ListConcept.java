package dsa;

import java.util.ArrayList;
import java.util.List;

public class ListConcept {
	public static void main(String[] args) {	
	Object user=	getArrayElement("hello");
	System.out.println(user);
}
	public static Object getArrayElement(Object user) {
		
		List a = new ArrayList();
		a.add("hello");
		a.add("hi");
		a.add("Core java");
		return a.add("Selenium");
		
	}
}