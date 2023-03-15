package org.iesalandalus.programacion.alquilervehiculos.modelo.negocio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Alquiler;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Cliente;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Vehiculo;

public class Alquileres implements IAlquileres {
	private List<Alquiler> coleccionAlquileres;

	public Alquileres() {
		coleccionAlquileres = new ArrayList<>();
	}

	@Override
	public List<Alquiler> get() {
		return new ArrayList<>(coleccionAlquileres);
	}

	@Override
	public List<Alquiler> get(Cliente cliente) {
		List<Alquiler> clientes = new ArrayList<>();

		for (Alquiler coleccionAlquiler : coleccionAlquileres) {
			if (coleccionAlquiler.getCliente().equals(cliente)) {
				clientes.add(coleccionAlquiler);
			}
		}

//		return new ArrayList<>(clientes);
		
		return clientes;
	}

	@Override
	public List<Alquiler> get(Vehiculo vehiculo) {
		List<Alquiler> vehiculos = new ArrayList<>();

		for (Alquiler coleccionAlquiler : coleccionAlquileres) {
			if (coleccionAlquiler.getVehiculo().equals(vehiculo)) {
				vehiculos.add(coleccionAlquiler);
			}
		}

//		return new ArrayList<>(turismos);
		
		return vehiculos;
	}

	@Override
	public int getCantidad() {
		return coleccionAlquileres.size();

	}

	private void comprobarAlquiler(Cliente cliente, Vehiculo vehiculo, LocalDate fechaAlquiler)
			throws OperationNotSupportedException {
		for (Alquiler coleccionAlquiler : coleccionAlquileres) {
			if (coleccionAlquiler.getFechaDevolucion() == null) {
				if (coleccionAlquiler.getCliente().equals(cliente)) {
					throw new OperationNotSupportedException("ERROR: El cliente tiene otro alquiler sin devolver.");
				}

				if (coleccionAlquiler.getVehiculo().equals(vehiculo)) {
					throw new OperationNotSupportedException("ERROR: El turismo está actualmente alquilado.");
				}
			} else {
				if (fechaAlquiler.isBefore(coleccionAlquiler.getFechaDevolucion())
						|| fechaAlquiler.isEqual(coleccionAlquiler.getFechaDevolucion())) {
					if (coleccionAlquiler.getCliente().equals(cliente)) {
						throw new OperationNotSupportedException("ERROR: El cliente tiene un alquiler posterior.");
					}

					if (coleccionAlquiler.getVehiculo().equals(vehiculo)) {
						throw new OperationNotSupportedException("ERROR: El turismo tiene un alquiler posterior.");
					}
				}
			}
		}
	}

	@Override
	public void insertar(Alquiler alquiler) throws OperationNotSupportedException {
		if (alquiler == null) {
			throw new NullPointerException("ERROR: No se puede insertar un alquiler nulo.");
		}

		comprobarAlquiler(alquiler.getCliente(), alquiler.getVehiculo(), alquiler.getFechaAlquiler());

		coleccionAlquileres.add(alquiler);

	}

	@Override
	public void devolver(Cliente cliente, LocalDate fechaDevolucion) throws OperationNotSupportedException {
		if (fechaDevolucion == null) {
			throw new NullPointerException("ERROR: La fecha de devolución no puede ser nula.");
		}

		if (cliente == null) {
			throw new NullPointerException("ERROR: No se puede devolver un alquiler nulo.");
		}
		
//		if (coleccionAlquileres.contains(cliente)) {
//			alquiler.setFechaDevolucion(fechaDevolucion);
//		} else {
//			throw new OperationNotSupportedException("ERROR: No existe ningún alquiler igual.");
//		}
	}
	
	private Alquiler getAlquilerAbierto(Cliente cliente) {
		for(Alquiler coleccionAlquiler : coleccionAlquileres) {
			
		}
		
		return null;
		
	}
	
	@Override
	public void devolver(Vehiculo vehiculo, LocalDate fechaDevolucion) throws OperationNotSupportedException{
		if (vehiculo == null) {
			throw new NullPointerException("ERROR: No se puede devolver un vehículo nulo.");
		}
	}
	
	private Alquiler getAlquilerAbierto(Vehiculo vehiculo) {
		return null;
		
	}

	@Override
	public void borrar(Alquiler alquiler) throws OperationNotSupportedException {
		if (alquiler == null) {
			throw new NullPointerException("ERROR: No se puede borrar un alquiler nulo.");
		}

		if (coleccionAlquileres.contains(alquiler)) {
			coleccionAlquileres.remove(alquiler);
		} else {
			throw new OperationNotSupportedException("ERROR: No existe ningún alquiler igual.");
		}
	}

	@Override
	public Alquiler buscar(Alquiler alquiler) {
		if (alquiler == null) {
			throw new NullPointerException("ERROR: No se puede buscar un alquiler nulo.");
		}

//		if (!coleccionAlquileres.contains(alquiler)) {
//			return null;
//		}
//
//		return alquiler;
		
		if (coleccionAlquileres.indexOf(alquiler) > -1) {
			coleccionAlquileres.get(0);
		}else {
			alquiler = null;
		}
		
		return alquiler;
	}
}
