package org.iesalandalus.programacion.alquilervehiculos.vista.texto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Cliente;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	private static final String PATRON_FECHA = "dd/MM/yyyy";
	private static final String PATRON_MES = "MM/yyyy";
	private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern(PATRON_FECHA);
	
	private Consola() {
		
	}
	
	public static void mostrarMenuAcciones() {
		System.out.println("Este menú sirve para el manejo de alquiler de diferentes tipos de coches."
				+"A continuación, te mostramos las siguientes opciones:"
	
					+ "0-. Salir"
					+ "1-. Insertar cliente"
					+ "2-. Insertar vehiculo"
					+ "3-. Insertar alquiler"
					+ "4-. Buscar cliente"
					+ "5-. Buscar vehiculo"
					+ "6-. Buscar alquiler"
					+ "7-. Modificar cliente"
					+ "8-. Devolver alquiler cliente"
					+ "9-. Devolver alquiler vehiculo"
					+ "10-. Borrar cliente"
					+ "11-. Borrar vehiculo"
					+ "12-. Borrar alquiler"
					+ "13-. Listar clientes"
					+ "14-. Listar vehiculos"
					+ "15-. Listar alquileres"
					+ "16-. Listar alquileres de cliente"
					+ "17-. Listar alquileres de vehiculo"
					+ "18-. Mostrar estadísticas mensuales");
	}
	
	public static Accion elegirAccion() {
		int accion;
		do {
			leerEntero("Elige una accion: ");
			accion = Entrada.entero();
		}while (accion < 0 || accion > 18);
		return Accion.values()[accion];
	}
	
	private static String leerCadena(String mensaje) {
		System.out.print(mensaje);
		
		String cadena = "";
		
		cadena = Entrada.cadena();
		
		return cadena;
		
	}
	
	private static int leerEntero(String mensaje) {
		System.out.print(mensaje);
		int numero = 0;
		numero = Entrada.entero();
		return numero;
	}
	
	private static LocalDate leerFecha(String mensaje, String patron) {
		System.out.print(mensaje);

		String fecha;
		

		LocalDate fechaDef = null;
		
		try {
			fecha = Entrada.cadena();

			fechaDef = LocalDate.parse(fecha, FORMATO_FECHA);
		}catch (DateTimeParseException e) {
			System.out.println("La fecha es nula.");
		}
		return fechaDef;
		
	}
	
	public static Cliente leerClienteDni() {
		return null;
		
	}
	
	public static String leerNombre() {
		return leerCadena("Introduce el nombre del cliente: ");
		
	}
	
	public static String leerTelefono() {
		return leerCadena("Introduce el teléfono del cliente: ");
	}
	
	private static void mostrarMenuTiposVehiculos() {
		System.out.println("Este menú sirve para la elección del tipo de coche."
				+"A continuación, te mostramos los modelos disponibles:"
	
					+ "0-. Turismo"
					+ "1-. Autobús"
					+ "2-. Furgoneta");
	}
	
	private static TipoVehiculo elegirTipoVehiculo() {
		int modelo;
		do {
			leerEntero("Elige el tipo de coche que prefieres: ");
			modelo = Entrada.entero();
		}while(modelo < 0 || modelo > 2);
		return TipoVehiculo.values()[modelo];
	}
	
	public static LocalDate leerFechaDevolucion() {
//		return leerFecha("Introduce la fecha de devolución: ");
		
	}
	
	public static LocalDate leerMes() {
		return null;
		
	}
}
