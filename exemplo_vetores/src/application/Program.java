package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/* Ex.1
			int n = sc.nextInt();
			double[] vect = new double[n];
			
			double sum = 0;
			for(int i = 0; i < n; i++) {
				vect[i] = sc.nextDouble();
				
				sum += vect[i];
			}
			
			double avg = sum / n;
			
			System.out.printf("AVERAGE HEIGHT: %.2f ", avg);
		*/
		
		// Ex.2
			int q = sc.nextInt();
			Product[] produtos = new Product[q];
			
			for (int i = 0; i < q; i++) {
				sc.nextLine();
				String name = sc.nextLine();
				double price = sc.nextDouble();
				produtos[i] = new Product(name, price);
			}
			
			double avg = average(produtos);
			
			System.out.printf("AVERAGE PRICE: %.2f", avg);
		sc.close();
	}
	
	public static double average(Product[] produtos) {
		double sum = 0;
		for(int i = 0; i < produtos.length; i++) {
			sum += produtos[i].getPrice();
		}
		
		return sum / produtos.length;
	}

}
