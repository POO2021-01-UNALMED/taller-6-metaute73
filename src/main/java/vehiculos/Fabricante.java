package vehiculos;
import java.util.ArrayList;

public class Fabricante {
	
	public static ArrayList<Fabricante> fabricantes = new ArrayList<>();
	private String nombre;
	private Pais pais;
	public int ventas;
	
	public Fabricante() {
		
	}
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		fabricantes.add(this);
	}
	public static Fabricante fabricaMayorVentas() {
		int ven = 0;
		for (Fabricante f: fabricantes) {
			if (f.ventas > ven) {
				ven = f.ventas;
			}
		}
		Fabricante great = new Fabricante();
		for (Fabricante f: fabricantes) {
			if (f.ventas == ven) {
				great = f;
			}
		}
		return great;	
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public Pais getPais() {
		return this.pais;
	}
}
