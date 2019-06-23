package entities;

public class Emp
{
	private String name;
	private Integer hours;
	private Double valuePerHour;
	
	// Constructors
	public Emp() {}

	public Emp(String name, Integer hours, Double valuePerHour)
	{
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	// Getters and setters
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Integer getHours()
	{
		return hours;
	}

	public void setHours(Integer hours)
	{
		this.hours = hours;
	}

	public Double getValuePerHour()
	{
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour)
	{
		this.valuePerHour = valuePerHour;
	}
	
	// Methods
	public Double payment()
	{
		return hours * valuePerHour;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(" - $ ");
		sb.append(String.format("%.2f", payment()));
		
		return sb.toString();
	}
}
