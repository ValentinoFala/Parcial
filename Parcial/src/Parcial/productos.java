package Parcial;

public class productos {
	protected int stock;
	protected double precio;
	protected String nombre;
	public productos(int stock, double precio, String nombre) {
		super();
		this.stock = stock;
		this.precio = precio;
		this.nombre = nombre;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
