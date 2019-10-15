public class Parent {

	public static void main(String[] args) {
		
		Methods m = new Methods();
		m.ValidateHeader();
		
		// Checking if $ is in the string
		String str = new String("Payment $100 paid");
		System.out.println(str.indexOf("$"));
		
		// Check if string is a palindrome
		String name = "anna";
		String reversed = "";
		
		for (int i=name.length()-1; i>=0; i--) {
			reversed = reversed + name.charAt(i);
		};
		if (name==reversed) {
			System.out.println("It's a palindrome!");
		} else if (name!=reversed) { 
			System.out.println(reversed);
		};
		
		// Sum numbers from array
		int sum = 0;
		int arr[] = {2, 3, 4, 5, 6};
		for (int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		
		
	}

	
}
