package Parcial;

public class carnes extends productos{
	private boolean feedlot;

	public carnes(int stock, double precio, String nombre, boolean feedlot) {
		super(stock, precio, nombre);
		this.feedlot = feedlot;
	}

	public boolean isFeedlot() {
		return feedlot;
	}

	public void setFeedlot(boolean feedlot) {
		this.feedlot = feedlot;
	}
	public double calculadescuentoc() {
		double descuento;
		descuento=(precio*0.05);
		if (feedlot && precio>5000) {
			descuento=precio*0.10;
		}
		else if (precio>5000){
			descuento=precio*0.05;
		}
		else if(feedlot){
			descuento=precio*0.05;
		}
		else{
			descuento=precio*0.00;
		}
		return descuento;
	}
}
