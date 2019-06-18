package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido
{
	private Date moment;
	private StatusPedido status;
	
	private Cliente cliente;
	private List<ItemPedido> listaItemPedido;
	
	private SimpleDateFormat sdf1;
	private SimpleDateFormat sdf2;
	
	public Pedido() {}

	public Pedido(Date moment, StatusPedido status)
	{
		this.moment = moment;
		this.status = status;
		this.listaItemPedido = new ArrayList<>();
		this.sdf1 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		this.sdf2 = new SimpleDateFormat("dd/MM/yyyy");
	}

	public Date getMoment()
	{
		return moment;
	}

	public void setMoment(Date moment)
	{
		this.moment = moment;
	}

	public StatusPedido getStatus()
	{
		return status;
	}

	public void setStatus(StatusPedido status)
	{
		this.status = status;
	}

	public List<ItemPedido> getListItemPedido()
	{
		return listaItemPedido;
	}

	public Cliente getCliente()
	{
		return cliente;
	}

	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}
	
	public void addItem(ItemPedido item)
	{
		listaItemPedido.add(item);
	}
	
	public void removeItem(ItemPedido item)
	{
		listaItemPedido.remove(item);
	}
	
	public Double total()
	{
		double total = 0.0;
		
		for(ItemPedido item : listaItemPedido)
		{
			total += item.subTotal();
		}
		
		return total;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: ");
		sb.append(sdf1.format(moment));
		sb.append("\n");
		sb.append("Order status: ");
		sb.append(status.toString());
		sb.append("\n");
		sb.append("Client: ");
		sb.append(cliente.getName());
		sb.append("(");
		sb.append(sdf2.format(cliente.getBirthDate()));
		sb.append(") - ");
		sb.append(cliente.getEmail());
		sb.append("\n");
		sb.append("Order items:\n");
		
		for(ItemPedido item : listaItemPedido)
		{
			Produto prod = item.getProduto();
			sb.append(prod.getName());
			sb.append(", $");
			sb.append(String.format("%.2f", prod.getPrice()));
			sb.append(", Quantity: ");
			sb.append(item.getQuantity());
			sb.append(", Subtotal: $");
			sb.append(String.format("%.2f", item.subTotal()));
			sb.append("\n");
		}
		
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		
		return sb.toString();
	}
}
