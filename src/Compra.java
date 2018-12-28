import java.util.List;

public class Compra {
	private List<Producto> productos;
	

	public Compra(List<Producto> productos){
		this.productos=productos;
	}
	
	public String toString() {
		return "=============================";
	}
	
	public Producto masBarato() {
		return productos.stream().min(Producto::compareTo).get();
	}
		
	public Producto masCaro() {
		return productos.stream().max(Producto::compareTo).get();
	}
	
	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
}


