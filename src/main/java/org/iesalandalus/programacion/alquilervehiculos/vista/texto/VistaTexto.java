package org.iesalandalus.programacion.alquilervehiculos.vista.texto;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Alquiler;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Cliente;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Vehiculo;
import org.iesalandalus.programacion.alquilervehiculos.vista.Vista;

public class VistaTexto extends Vista{

	@Override
	public void comenzar() {
		Consola.mostrarMenuAcciones();
	}

	@Override
	public void terminar() {
		
		System.out.println("Servicio cumplido. Hasta la vista, babe");
		
	}
	
	public void listarClientes() {
		List<Cliente>clientes = getControlador().getClientes();
		
		clientes.sort(Comparator.comparing(Cliente::getNombre).thenComparing(Cliente::getDni));
		if (!clientes.isEmpty()) {
			for (Cliente cliente : clientes) {
				System.out.print(cliente);
			}
		}else {
			System.out.println("No hay clientes que mostrar.");
		}
		
	}
	
	public void listarVehiculos() {
		List<Vehiculo>vehiculos = getControlador().getVehiculos();
		vehiculos.sort(Comparator.comparing(Vehiculo::getMarca).thenComparing(Vehiculo::getModelo).thenComparing(Vehiculo::getMatricula));
		if (!vehiculos.isEmpty()) {
			for (Vehiculo vehiculo : vehiculos) {
				System.out.print(vehiculo);
			}
		}else {
			System.out.println("No hay vehículos que mostrar.");
		}
	}
	
	public void listarAlquileres() {
		List<Alquiler>alquileres = getControlador().getAlquileres();
//		Comparator<Cliente>comparadorCliente = Comparator.comparing(Cliente::getNombre).thenComparing(Cliente::getDni);
		alquileres.sort(Comparator.comparing(Alquiler::getFechaAlquiler).thenComparing(Alquiler::getFechaDevolucion));
		if (!alquileres.isEmpty()) {
			for (Alquiler alquiler : alquileres) {
				System.out.print(alquiler);
			}
		}else {
			System.out.println("No hay alquileres que mostrar.");
		}
	}
	
	public void listarAlquileresCliente() {
		List<Alquiler>alquileresClientes = getControlador().getAlquileres();
		Comparator<Cliente>comparadorAlquiler = Comparator.comparing(Cliente::getNombre).thenComparing(Cliente::getDni);
		alquileresClientes.sort(Comparator.comparing(Alquiler::getFechaAlquiler).thenComparing(Alquiler::getCliente, comparadorAlquiler));
		if (!alquileresClientes.isEmpty()) {
			for (Alquiler alquilerCliente : alquileresClientes) {
				System.out.print(alquilerCliente);
			}
		}else {
			System.out.println("No hay alquileres de clientes que mostrar.");
		}
	}
	
	public void listarAlquileresVehiculos() {
		
	}
	
	

}
