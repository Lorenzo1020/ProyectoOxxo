
//Es una plantilla para organizar los atributos y metodos del objeto
public class Productos {

	// Atributos del objeto---
	// Constantes--Fijos
	// Variables---Dinamicos
	private String nombre;
	private float precio;
	private int stock;
	private boolean estatus;

	// Constructor vacio --- para realizar la instancia de clase -- ya se crea el
	// objeto
	public Productos() {
	}

	// Constructor con parametros o argumentos --- Sobrecarga de metodos
	public Productos(String nombre, float precio, int stock, boolean estatus) {
		// Se estan inicializando los atributos del objeto
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.estatus = estatus;
	}

	// toString te convierte un objeto a cadena
	@Override
	public String toString() {
		return "Productos [nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + ", estatus=" + estatus + "]";
	}

	//Encapsulamiento
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public boolean isEstatus() {
		return estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

}