package org.iesalandalus.programacion.alquilervehiculos.modelo;

import java.time.LocalDate;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Alquiler;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Cliente;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Turismo;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Vehiculo;
import org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.IFuenteDatos;

public class ModeloCascada extends Modelo{

	public ModeloCascada(IFuenteDatos fuenteDatos) {
		this.setFuenteDatos(fuenteDatos);
	}
	@Override
	public void insertar(Cliente cliente) throws OperationNotSupportedException {
		
		
	}

	@Override
	public void insertar(Turismo turismo) throws OperationNotSupportedException {
		
		
	}

	@Override
	public void insertar(Alquiler alquiler) throws OperationNotSupportedException {
		
		
	}

	@Override
	public Cliente buscar(Cliente cliente) {
		
		return null;
	}

	@Override
	public Vehiculo buscar(Turismo turismo) {
		
		return null;
	}

	@Override
	public Alquiler buscar(Alquiler alquiler) {
		
		return null;
	}

	@Override
	public void modificar(Cliente cliente, String nombre, String telefono) throws OperationNotSupportedException {
		
		
	}

	@Override
	public void devolver(Alquiler alquiler, LocalDate fechaDevolucion) throws OperationNotSupportedException {
		
		
	}

	@Override
	public void borrar(Cliente cliente) throws OperationNotSupportedException {
		
		
	}

	@Override
	public void borrar(Vehiculo turismo) throws OperationNotSupportedException {
		
		
	}

	@Override
	public void borrar(Alquiler alquiler) throws OperationNotSupportedException {
		
		
	}

	@Override
	public Cliente getListaClientes() {
		
		return null;
	}

	@Override
	public Turismo getListaVehiculos() {
		
		return null;
	}

	@Override
	public Alquiler getListaAlquileres() {
		
		return null;
	}

	@Override
	public Alquiler getListaAlquileres(Cliente cliente) {
		
		return null;
	}

	@Override
	public Alquiler getListaAlquileres(Vehiculo turismo) {
		
		return null;
	}

}
