package utils;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double dollarConverter(double dollarValue, double valueInDollars) {
		double valueInReal = dollarValue * valueInDollars;
		return valueInReal += valueInReal * IOF;
	}
}
