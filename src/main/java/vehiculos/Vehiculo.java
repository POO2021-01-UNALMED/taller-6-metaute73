package vehiculos;

public class Vehiculo {
	
	protected static int cantidadVehiculos;
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,  
			String traccion,Fabricante fabricante) {
		this.placa = placa;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = fabricante;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.traccion = traccion;
		this.fabricante.getPais().ventas++;
		this.fabricante.ventas++;
	}
	
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	
	public static void setCantidadVehiculos(int c) {
		cantidadVehiculos = c;
	}
	
	public static String vehiculosPorTipo() {
		return "Automoviles:" + Automovil.automoviles + "\nCamionetas: " + Camioneta.camionetas +
				"\nCamiones: " + Camion.camiones;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public int getPuertas() {
		return this.puertas;
	}
	
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public long getPrecio() {
		return this.precio;
	}
	
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public long getPeso() {
		return this.peso;
	}
	
	
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	
	public String getTraccion() {
		return this.traccion;
	}
	
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	public Fabricante getFabricante() {
		return this.fabricante;
	}
}
