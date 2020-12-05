import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String computer = "Computer";
		String desk = "Office Desk";
		
		char gender = 'F';
		
		int age = 30;
		int code = 5290;

		double priceOfComputer = 2100.0;
		double priceOfDesk = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", computer, priceOfComputer);
		System.out.printf("%s, which price is $ %.2f%n", desk, priceOfDesk);
		
		System.out.println("");
		
		System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
		
		System.out.println("");
		
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rounded (three decimal places): %.3f%n", measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: ", measure);
		
	}

}
