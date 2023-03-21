package org.iesalandalus.programacion.alquilervehiculos.modelo;

import org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.IFuenteDatos;
import org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.memoria.FuenteDatosMemoria;
//import org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.IFuenteDatos;

public enum FactoriaFuenteDatos {
	
	MEMORIA
	{
		public IFuenteDatos crear() 
		{
			return new FuenteDatosMemoria();
		}
	};
	public abstract IFuenteDatos crear();
}
