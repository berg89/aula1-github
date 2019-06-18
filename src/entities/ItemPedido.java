package entities;

public class ItemPedido
{
	private Integer quantity;
	private Double price;
	
	private Produto produto;
	
	public ItemPedido() {}
	
	public ItemPedido(Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getQuantity()
	{
		return quantity;
	}

	public void setQuantity(Integer quantity)
	{
		this.quantity = quantity;
	}

	public Double getPrice()
	{
		return price;
	}

	public void setPrice(Double price)
	{
		this.price = price;
	}

	public Produto getProduto()
	{
		return produto;
	}

	public void setProduto(Produto produto)
	{
		this.produto = produto;
	}
	
	public Double subTotal()
	{
		return quantity * price;
	}
}
