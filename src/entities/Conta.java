package entities;

public class Conta 
{
	private Integer number;
	private String holder;
	protected Double balance;
	
	// Constructors
	public Conta() {}

	public Conta(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	// Getters and setters
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	// Methods
	public void deposit(Double amount)
	{
		balance += amount;
	}
		
	public void withdraw(Double amount)
	{
		balance -= amount + 5.0;
	}
}
