package vehiculos;

public class Camioneta extends Vehiculo {
	
	private boolean volco;
	protected static int camionetas;
    
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa,puertas, 90,nombre, precio, peso, fabricante,  "4X4");
		this.volco = volco;
		cantidadVehiculos++;
		camionetas++;
	}
	
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
	public boolean isVolco() {
		return this.volco;
	}

}
