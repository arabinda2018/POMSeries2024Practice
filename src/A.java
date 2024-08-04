import java.util.ArrayList;
import java.util.HashMap;

public class A {
	public static void main(String[] args) {
		checkEmployee("test32");
		checkEmployee(9);
		
	}
	public static void checkEmployee(Object name) {
		ArrayList<Object>employee= new ArrayList<Object>();
		employee.add("Namrata");
		employee.add("smith");
		employee.add("karl");
		employee.add("Arabinda");	
	
		for (Object e : employee) {
			if(e.equals(name)) {
				System.out.println("Valid employee");
				break;
			}
			else {
				System.out.println("Invalid employee");
				break;				
			}
		}	
		
	}

}
