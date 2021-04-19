package vehiculos;

public class Automovil extends Vehiculo{

	private int puestos;
	protected static int automoviles;
    
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, fabricante, "FWD");
		this.puestos = puestos;
		cantidadVehiculos++;
		automoviles++;
	}
	
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	public int getPuestos() {
		return this.puestos;
	}
}
