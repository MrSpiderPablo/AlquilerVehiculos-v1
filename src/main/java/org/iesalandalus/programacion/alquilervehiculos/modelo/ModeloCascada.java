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
		
		if (cliente == null) {
			throw new NullPointerException("ERROR: No se puede insertar un cliente nulo.");
		}
		
		getClientes().insertar(new Cliente(cliente));
		
	}

	@Override
	public void insertar(Vehiculo vehiculo) throws OperationNotSupportedException {
		
		if (vehiculo == null) {
			throw new NullPointerException("ERROR: No se puede insertar un turismo nulo.");
		}
		
		getVehiculos().insertar(Vehiculo.copiar(vehiculo));
		
	}

	@Override
	public void insertar(Alquiler alquiler) throws OperationNotSupportedException {
		
		
	}

	@Override
	public Cliente buscar(Cliente cliente) {
		
		return null;
	}

	@Override
	public Vehiculo buscar(Vehiculo vehiculo) {
		
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
	public void borrar(Vehiculo vehiculo) throws OperationNotSupportedException {
		
		
	}

	@Override
	public void borrar(Alquiler alquiler) throws OperationNotSupportedException {
		
		
	}

	@Override
	public Cliente getListaClientes() {
		
		return null;
	}

	@Override
	public Vehiculo getListaVehiculos() {
		
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
	public Alquiler getListaAlquileres(Vehiculo vehiculo) {
		
		return null;
	}

}
