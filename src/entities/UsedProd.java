package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProd extends Prod
{
	private Date manufactureDate;
	
	public UsedProd()
	{
		super();
	}

	public UsedProd(String name, Double price, Date manufactureDate)
	{
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate()
	{
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate)
	{
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(" (used)");
		sb.append(" $ ");
		sb.append(String.format("%.2f", price));
		sb.append(" (Manufacture date: ");
		sb.append(new SimpleDateFormat("dd/MM/yyyy").format(manufactureDate));
		sb.append(")");
		return sb.toString();
	}
}
