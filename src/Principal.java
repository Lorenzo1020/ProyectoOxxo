
public class Principal {

	// main -- es el motor de arranque de toda aplicacion
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Realizar la creacion de objetos
		// NombreClase nombreObjeto = new Constructores();

		// Realizar la instancia de clase utilizando el contructor vacio y Asignacion de
		// valores utilizando el encapsulamiento

		// Esta creado el objeto vacio --- ya tengo acceso a todo lo que contenga esa
		// clase aqui
		Productos producto = new Productos();

		System.out.println("Hola mundo");
		System.out.println("Tienes " + 10);

		// Pasar los datos al objeto --- Set(enviar)
		producto.setNombre("Barritas");
		producto.setPrecio(20.5f);
		producto.setStock(5);
		producto.setEstatus(true);

		// Mostrar en consola los atributos del objeto --- get(obtener)
		System.out.println("Datos del producto 1");
		System.out.println("Nombre " + producto.getNombre());
		System.out.println("Precio " + producto.getPrecio());
		System.out.println("Stock " + producto.getStock());
		System.out.println("Estatus " + producto.isEstatus());

		// Realizar la instancia de clase utilizando el costructor con todos los
		// parametros
		Productos producto2 = new Productos("Sabritas", 18, 3, true);

		// Mostrar los atributos del objeto --- toString
		System.out.println("Datos del producto 2");
		System.out.println(producto2);

	}

}
