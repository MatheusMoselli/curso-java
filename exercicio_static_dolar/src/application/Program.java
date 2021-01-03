package application;

import java.util.Locale;
import java.util.Scanner;

import utils.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarValue = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double valueInDollars = sc.nextDouble();
		
		double valueInReais = CurrencyConverter.dollarConverter(dollarValue, valueInDollars);
		System.out.print("Amount to be paid in reais: " + String.format("%.2f", valueInReais));
		
		sc.close();
	}
}
