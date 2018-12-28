
public class Gaseosa extends Producto {
	private double litros;
	
	public Gaseosa(String nombre, int precio, double litros) {
		super(nombre, precio);
		
		this.litros = litros;
	}
	
	public String toString() {
		return "Nombre: "+this.getNombre()+" /// Litros: "+
				this.litros+" /// Precio: $"+this.getPrecio();
	}
	
	
	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	
	
}
