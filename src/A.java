import java.util.ArrayList;
import java.util.HashMap;

public class A {
	public static void main(String[] args) {
		checkEmployee("test32");
		checkEmployee(9);
		
	}
	public static void checkEmployee(Object name) {
		ArrayList<Object>employe= new ArrayList<Object>();
		employe.add("Namrata");
		employe.add("smith");
		employe.add("karl");
		employe.add("Arabinda");			
		for (Object e : employe) {
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
