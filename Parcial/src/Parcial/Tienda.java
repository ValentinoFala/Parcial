package Parcial;

public class Tienda {

	public static void main(String[] args) {
		carnes c1=new carnes(50, 6000, "carne1", true);
		vegetales v1=new vegetales(20, 2000, "vegetal1", false);
		conservas cc1=new conservas(80, 7000, "conservas1", 80);
		System.out.println("Compras: Candidad en stock: " + c1.getStock() + " Precio: " + c1.getPrecio() + " Nombre: " + c1.getNombre() + " Feedlot: " + c1.isFeedlot() + " Descuento: " + c1.calculadescuentoc());
		System.out.println("Compras: Candidad en stock: " + v1.getStock() + " Precio: " + v1.getPrecio() + " Nombre: " + v1.getNombre() + " Estacion: " + v1.isEstacion() + " Descuento " + v1.calculadescuentov());
		System.out.println("Compras: Candidad en stock: " + cc1.getStock() + " Precio: " + cc1.getPrecio() + " Nombre: " + cc1.getNombre() + cc1.getId() + " Descuento: " + cc1.calculadescuentocc());
	}

}
