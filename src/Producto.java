import java.util.ArrayList;
import java.util.List;
public class Producto implements Comparable <Producto>{
	private String nombre;
	private int precio;
	
	public Producto(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	private static void cargarProductos() {
		List<Producto> compras = new ArrayList<>();
		compras.add(new Gaseosa("Coca-Cola Zero", 20, 1.5));
		compras.add(new Gaseosa("Coca-Cola", 18, 1.5));
		compras.add(new Limpieza("Shampoo Sedal", "500ml", 19));
		compras.add(new Fruta("Frutillas", 64, "kilo"));
		Compra compra=new Compra(compras);
		
		for (Producto p : compras) {
            System.out.println(p.toString());
            
        }
		System.out.println("=============================");
		
			
		System.out.println("Producto mas Barato: "+compra.masCaro().nombre);
		System.out.println("Producto mas Caro: "+ compra.masBarato().nombre);
	}

	public int compareTo(Producto o) {   
		return o.precio - this.precio;
    }

	public static void main(String[] args) {
		cargarProductos();
	}
}

