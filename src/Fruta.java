
public class Fruta extends Producto{
	
	private String unidadDeVenta;
	
	public Fruta(String nombre, int precio, String unidadDeVenta) {
		super(nombre, precio);
		this.unidadDeVenta = unidadDeVenta;
	}
	
	public String toString() {
		return  "Nombre: "+this.getNombre()+" /// Precio: "+ 
				this.getPrecio()+" /// Unidad de Venta: "+this.unidadDeVenta;
	}
	
	public String getUnidadDeVenta() {
		return unidadDeVenta;
	}

	public void setUnidadDeVenta(String unidadDeVenta) {
		this.unidadDeVenta = unidadDeVenta;
	}

}
