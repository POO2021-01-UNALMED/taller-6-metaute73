package vehiculos;

public class Camion extends Vehiculo {
	
	private int ejes;
	protected static int camiones;
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		
		super(placa,2, nombre, precio, peso, fabricante,  80, "4x2");
		this.ejes = ejes;
		cantidadVehiculos++;
		camiones++;
	}
	
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	public int getEjes() {
		return this.ejes;
	}
}
