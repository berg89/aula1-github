package application;

import entities.Conta;
import entities.ContaEmpresarial;
import entities.ContaPoupanca;

public class ProgramConta {

	public static void main(String[] args)
	{
		/*
		Conta conta = new Conta(1001, "Alex", 0.0);
		ContaEmpresarial contaEmpresarial = new ContaEmpresarial(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		Conta conta1 = contaEmpresarial;
		Conta conta2 = new ContaEmpresarial(1003, "Bob", 0.0, 200.0);
		Conta conta3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING
		ContaEmpresarial conta4 = (ContaEmpresarial) conta2;
		conta4.loan(100.0);
		
		// ContaEmpresarial conta5 = (ContaEmpresarial) conta3;
		if(conta3 instanceof ContaEmpresarial)
		{
			ContaEmpresarial conta5 = (ContaEmpresarial) conta3;
			conta5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(conta3 instanceof ContaPoupanca)
		{
			ContaPoupanca conta5 = (ContaPoupanca) conta3;
			conta5.updateBalance();
			System.out.println("Update!");
		}
		*/
		
		Conta conta1 = new Conta(1001, "Alex", 1000.0);
		conta1.withdraw(200.0);
		System.out.println(conta1.getBalance());
		
		Conta conta2 = new ContaPoupanca(1002, "Maria", 1000.0, 0.01);
		conta2.withdraw(200.0);
		System.out.println(conta2.getBalance());
		
		Conta conta3 = new ContaEmpresarial(1003, "Bob", 1000.0, 500.0);
		conta3.withdraw(200.0);
		System.out.println(conta3.getBalance());
	}

}
