
/**
Ejercicio Onready
Imaginemos una concesionaria de autos y motos.
Crear un programa cuyo punto de entrada sea un main en donde, al ejecutarse, se
visualiza lo siguiente por consola y se termina la ejecuci�n:


Marca: Peugeot // Modelo: 206 // Puertas: 4 // Precio: $200.000,00
Marca: Honda // Modelo: Titan // Cilindrada: 125c // Precio: $60.000,00
Marca: Peugeot // Modelo: 208 // Puertas: 5 // Precio: $250.000,00
Marca: Yamaha // Modelo: YBR // Cilindrada: 160c // Precio: $80.500,50
=============================
Veh�culo m�s caro: Peugeot 208
Veh�culo m�s barato: Honda Titan
Veh�culo que contiene en el modelo la letra �Y�: Yamaha YBR $80.500,50
=============================
Veh�culos ordenados por precio de mayor a menor:
Peugeot 208
Peugeot 206
Yamaha YBR
Honda Titan


La soluci�n debe cumplir con los siguientes requisitos:
- Dise�ar una soluci�n orientada a objetos, creando por lo menos una clase abstracta
y una interface.
- La salida es por consola y exactamente como se requiere.
- Usar solamente las clases provistas por Java 8.
- Cargar la lista de autos en un �nico m�todo. No hay ingreso por pantalla de ning�n
tipo.
- El algoritmo usado para la impresi�n no tiene que depender de la cantidad, modelo
o tipo de autos
- El entregable deber� ser la URL de un repositorio Git p�blico para que podamos
descargar directamente.

Cualquier consulta no duden en preguntar a busquedas@onready.com.ar
 */
public class Programa {

	public static void main(String[] args) {
		
		Concesionaria concesionariaEjemplo = new Concesionaria();
		
		concesionariaEjemplo.cargarVehiculosIniciales();
		
		concesionariaEjemplo.mostrarInformesRequeridos();

	}

}
