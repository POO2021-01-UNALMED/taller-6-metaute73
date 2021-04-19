package vehiculos;
import java.util.ArrayList;

public class Pais {
	
	public static ArrayList<Pais> paises = new ArrayList<>();
	private String nombre;
	public int ventas;
	
	public Pais() {
		
	}
	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public static Pais paisMasVendedor() {
		int v = 0;
		for (Pais p: paises) {
			if (p.ventas > v) {
				v = p.ventas;
			}
		}
		Pais great = new Pais();
		for (Pais p: paises) {
			if (p.ventas == v) {
				great = p;
			}
		}
		return great;	
	}
}
