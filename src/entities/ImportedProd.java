package entities;

public class ImportedProd extends Prod
{
	private Double customsFee;
	
	public ImportedProd()
	{
		super();
	}

	public ImportedProd(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee()
	{
		return customsFee;
	}

	public void setCustomsFee(Double customsFee)
	{
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(" $ ");
		sb.append(String.format("%.2f", totalPrice()));
		sb.append("(Customs fee: $ ");
		sb.append(customsFee);
		sb.append(")");
		return  sb.toString();
	}

	public Double totalPrice()
	{
		return price + customsFee;
	}
}
