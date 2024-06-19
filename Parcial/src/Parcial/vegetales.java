package Parcial;

public class vegetales extends productos{
	private boolean estacion;

	public vegetales(int stock, double precio, String nombre, boolean estacion) {
		super(stock, precio, nombre);
		this.estacion = estacion;
	}

	public boolean isEstacion() {
		return estacion;
	}

	public void setEstacion(boolean estacion) {
		this.estacion = estacion;
	}
	public double calculadescuentov() {
		double descuento;
		descuento=(precio*0.10);
		if (estacion && precio>5000) {
			descuento=precio*0.15;
		}
		else if (precio>5000){
			descuento=precio*0.10;
		}
		else if(estacion){
			descuento=precio*0.10;
		}
		else{
			descuento=precio*0.00;
		}
		return descuento;
	}
}
