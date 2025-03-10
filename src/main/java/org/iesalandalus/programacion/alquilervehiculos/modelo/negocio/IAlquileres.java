package org.iesalandalus.programacion.alquilervehiculos.modelo.negocio;

import java.time.LocalDate;
import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Alquiler;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Cliente;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Vehiculo;

public interface IAlquileres {

	List<Alquiler> get();

	List<Alquiler> get(Cliente cliente);

	List<Alquiler> get(Vehiculo vehiculo);

	int getCantidad();

	void insertar(Alquiler alquiler) throws OperationNotSupportedException;

	void devolver(Cliente cliente, LocalDate fechaDevolucion) throws OperationNotSupportedException;

	void devolver(Vehiculo vehiculo, LocalDate fechaDevolucion) throws OperationNotSupportedException;

	void borrar(Alquiler alquiler) throws OperationNotSupportedException;

	Alquiler buscar(Alquiler alquiler);

}