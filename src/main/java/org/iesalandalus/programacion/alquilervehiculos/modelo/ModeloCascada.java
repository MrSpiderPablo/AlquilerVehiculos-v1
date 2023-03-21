package org.iesalandalus.programacion.alquilervehiculos.modelo;

import java.time.LocalDate;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Alquiler;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Cliente;
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
		if (alquiler == null) {
			throw new NullPointerException("ERROR: No se puede insertar un alquiler nulo.");
		}
		
		buscar(alquiler.getCliente());
		buscar(alquiler.getVehiculo());
		
		getAlquileres().insertar(new Alquiler(alquiler));
		
	}

	@Override
	public Cliente buscar(Cliente cliente) {
		if (cliente == null) {
			throw new NullPointerException("ERROR: No se puede buscar un cliente nulo.");
		}
		

		return getClientes().buscar(new Cliente(cliente));
	}

	@Override
	public Vehiculo buscar(Vehiculo vehiculo) {
		if (vehiculo == null) {
			throw new NullPointerException("ERROR: No se puede buscar ");
		}
		return getVehiculos().buscar(Vehiculo.copiar(vehiculo));
	}

	@Override
	public Alquiler buscar(Alquiler alquiler) {
		if (alquiler == null) {
			throw new NullPointerException("ERROR: No se puede buscar un alquiler nulo.");
		}
		return getAlquileres().buscar(new Alquiler(alquiler));
	}

	@Override
	public void modificar(Cliente cliente, String nombre, String telefono) throws OperationNotSupportedException {
		
		getClientes().modificar(cliente, nombre, telefono);
	}

	@Override
	public void devolver(Cliente cliente, LocalDate fechaDevolucion) throws OperationNotSupportedException {
		if (cliente == null) {
			throw new NullPointerException("ERROR: No se puede devolver un cliente nulo.");
		}
		
		getAlquileres().devolver(cliente, fechaDevolucion);
	}
	
	@Override
	public void devolver(Vehiculo vehiculo, LocalDate fechaDevolucion) throws OperationNotSupportedException{
		if (vehiculo == null) {
			throw new NullPointerException("ERROR: No se puede devolver un vehículo nulo.");
		}
		
		getAlquileres().devolver(vehiculo, fechaDevolucion);
	}

	@Override
	public void borrar(Cliente cliente) throws OperationNotSupportedException {
		
		getAlquileres().get(getListaClientes());
		
		
	}

	@Override
	public void borrar(Vehiculo vehiculo) throws OperationNotSupportedException {
		
		getAlquileres().get(getListaVehiculos());
	}

	@Override
	public void borrar(Alquiler alquiler) throws OperationNotSupportedException {
		
		getAlquileres().borrar(alquiler);
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
