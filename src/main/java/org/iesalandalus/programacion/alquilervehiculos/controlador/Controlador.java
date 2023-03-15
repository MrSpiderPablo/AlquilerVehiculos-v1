package org.iesalandalus.programacion.alquilervehiculos.controlador;

import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.alquilervehiculos.modelo.Modelo;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Alquiler;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Cliente;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Turismo;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Vehiculo;

import orh.iesalandalus.programacion.alquilervehiculos.vista.Vista;

public class Controlador {
	private Modelo modelo;
	private Vista vista;

	public Controlador(Modelo modelo) {
		if (modelo == null) {
			throw new NullPointerException("ERROR: El modelo no puede ser nulo.");
		}

		this.modelo = modelo;
	}

	public void comenzar() {
		modelo.comenzar();
	}

	public void terminar() {
		modelo.terminar();
		vista.terminar();
	}

	public void insertar(Cliente cliente) throws OperationNotSupportedException {
		modelo.insertar(cliente);
	}

	public void insertar(Turismo turismo) throws OperationNotSupportedException {
		modelo.insertar(turismo);
	}

	public void insertar(Alquiler alquiler) throws OperationNotSupportedException {
		modelo.insertar(alquiler);
	}

	public Cliente buscar(Cliente cliente) {
		return modelo.buscar(cliente);
	}

	public Vehiculo buscar(Turismo turismo) {
		return modelo.buscar(turismo);

	}

	public Alquiler buscar(Alquiler alquiler) {
		return modelo.buscar(alquiler);

	}

	public void modificar(Cliente cliente, String nombre, String telefono) throws OperationNotSupportedException {
		modelo.modificar(cliente, nombre, telefono);
	}

	public List<Vehiculo> getVehiculos() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Cliente> getClientes() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Alquiler> getAlquileres() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Alquiler> getAlquileres(Cliente cliente){
		return null;
	}
	
	public List<Alquiler> getAlquileres(Vehiculo vehiculo){
		return null;
	}

	
}
