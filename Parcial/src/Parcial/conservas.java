package Parcial;

public class conservas extends productos{
	private int id;

	public conservas(int stock, double precio, String nombre, int id) {
		super(stock, precio, nombre);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public double calculadescuentocc() {
		double descuento;
		descuento=(precio*0.15);
		if (precio>5000) {
			descuento=precio*0.20;
		}
		else{
			descuento=precio*0.15;
		}
		return descuento;
	}
}
