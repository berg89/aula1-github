package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import entities.enums.StatusPedido;

public class Secao9
{

	public static void main(String[] args) throws ParseException
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.nextLine());
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.nextLine());
		System.out.print("How many items to this order? ");
		int numItems = sc.nextInt();

		Cliente cliente = new Cliente(clientName, email, birthDate);
		Pedido pedido = new Pedido(new Date(), status);
		pedido.setCliente(cliente);
		for(int i = 1; i <= numItems; i++)
		{
			sc.nextLine();
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			Produto produto = new Produto(productName, productPrice);
			ItemPedido item = new ItemPedido(quantity, produto.getPrice());
			item.setProduto(produto);
			pedido.addItem(item);
		}
		
		System.out.println();
		System.out.println(pedido);
		
		sc.close();
	}

}
