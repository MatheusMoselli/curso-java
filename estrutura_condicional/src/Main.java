
public class Main {

	public static void main(String[] args) {
		int x = 5;
		
		// If-Else
		if (x > 5) {
			System.out.println("x > 5");
		}
		
		if (x < 5) {
			System.out.println("x < 5");
		} else {
			System.out.println("x >= 5 || x = 5");
		}
		

		if (x < 5) {
			System.out.println("x < 5");
		} else if (x > 5) {
			System.out.println("x != 5");
		} else {
			System.out.println("x = 5");
		}
		
		
		//  O switch case � igual ao das outras linguagem
		
		
		// Condi��o Tern�ria
		boolean value = true;
		System.out.println(value ? "verdadeiro" : "falso");
	}
}
