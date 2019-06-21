package entities;

public class ContaEmpresarial extends Conta
{
	private Double loanLimit;
	
	// Constructors
	public ContaEmpresarial()
	{
		super();
	}

	public ContaEmpresarial(Integer number, String holder, Double balance, Double loanLimit)
	{
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	// Getters and setters
	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	// Methods
	public void loan(Double amount)
	{
		if(amount <= loanLimit)
		{
			balance += amount - 10.0;
		}
	}
	
	@Override
	public final void withdraw(Double amount)
	{
		super.withdraw(amount);
		balance -= 2.0;
	}
}
