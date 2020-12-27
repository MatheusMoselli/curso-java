import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
		
		// while
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}

		System.out.println(soma + "\n");
			
		sc.close();
		
		// for
		for (int index = 0; index < 10; index++) {
			System.out.println(index);
		}
	}

}
