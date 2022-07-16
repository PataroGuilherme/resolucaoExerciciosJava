package entities;

public class Product {

	private String name;
	private double valor;
	
	public Product() {
	};
	
	public Product (String name, double valor) {
		this.name = name;
		this.valor = valor;
	};
	
	public void setName (String name) {
		this.name = name;
	}

	public String getName () {
		return name;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
}
