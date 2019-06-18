package util;

public class CurrencyConverter
{

	public static double IOF = 0.06;
	
	public static double amountToBePaid(double dollarPrice, double dollarAmount)
	{
		return dollarPrice * dollarAmount * (1.0 + 0.06); 
	}

}
