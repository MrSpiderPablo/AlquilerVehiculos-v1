package org.iesalandalus.programacion.alquilervehiculos.modelo;

import java.rmi.server.RMIClientSocketFactory;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Alquiler;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Cliente;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Turismo;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Vehiculo;
import org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.Alquileres;
import org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.Clientes;
import org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.FuenteDatosMemoria;
import org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.IClientes;
import org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.IFuenteDatos;
import org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.IAlquileres;
import org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.IVehiculos;
import org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.Vehiculos;

public abstract class Modelo {
	private IClientes clientes;

	private IVehiculos vehiculos;

	private IAlquileres alquileres;
	
	private IFuenteDatos fuenteDatos;

//	protected Modelo() {
//		clientes = null;
//
//		vehiculos = null;
//
//		alquileres = null;
//		
//		fuenteDatos = null;
//	}
//	
	protected IClientes getClientes() {
		return clientes;
	}
	
	protected IVehiculos getVehiculos() {
		return vehiculos;
		
	}
	
	protected IAlquileres getAlquileres() {
		return alquileres;
		
	}
	
	protected void setFuenteDatos(IFuenteDatos fuenteDatos) {
		
		this.fuenteDatos = fuenteDatos;
	}

	public void comenzar() {
		clientes = new Clientes();

		vehiculos = new Vehiculos();

		alquileres = new Alquileres();
		
		fuenteDatos = new FuenteDatosMemoria();
	}

	public void terminar() {
		System.out.println("El modelo ha terminado.");
	}

	public abstract void insertar(Cliente cliente) throws OperationNotSupportedException;

	public abstract void insertar(Turismo turismo) throws OperationNotSupportedException;

	public abstract void insertar(Alquiler alquiler) throws OperationNotSupportedException;

	public abstract Cliente buscar(Cliente cliente);

	public abstract Vehiculo buscar(Turismo turismo);

	public abstract Alquiler buscar(Alquiler alquiler);

	public abstract void modificar(Cliente cliente, String nombre, String telefono) throws OperationNotSupportedException;

	public abstract void devolver(Alquiler alquiler, LocalDate fechaDevolucion) throws OperationNotSupportedException;

	public abstract void borrar(Cliente cliente) throws OperationNotSupportedException;

	public abstract void borrar(Vehiculo turismo) throws OperationNotSupportedException;

	public abstract void borrar(Alquiler alquiler) throws OperationNotSupportedException;

	public abstract Cliente getListaClientes();

	public abstract Turismo getListaVehiculos();

	public abstract Alquiler getListaAlquileres();

	public abstract Alquiler getListaAlquileres(Cliente cliente);

	public abstract Alquiler getListaAlquileres(Vehiculo turismo);
}