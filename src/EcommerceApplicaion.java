
public class EcommerceApplicaion {
	
	EcommerceApplicaion login() {
		System.out.println("Login");
		return this;
	}

	EcommerceApplicaion addToCart() {
		System.out.println("Add items to cart");
		return this;
	}
	EcommerceApplicaion search(int size,String color) {
		System.out.println("Size of the product :"+size);
		System.out.println("Color of the product "+color);
		return this;
	}
	EcommerceApplicaion buyNow() {
		System.out.println("Size of the product :");
		System.out.println("Color of the product ");
		return this;
	}
	
	
	public static void main(String[] args) {
		EcommerceApplicaion ea = new EcommerceApplicaion();
		ea.login().search(35, "Blue").buyNow();

	}
}
