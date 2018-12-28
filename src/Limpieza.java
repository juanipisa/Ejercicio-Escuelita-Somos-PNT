
public class Limpieza extends Producto{
	
	private String contenido;
	
	public Limpieza(String nombre, String contenido, int precio) {
		super(nombre, precio);
		this.contenido = contenido;
		
	}
	public String toString() {
		return "Nombre: "+this.getNombre()+" /// Contenido: "+
				this.contenido+" /// Precio: $"+this.getPrecio();
		
	}
	
	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	
	
}
