package org.iesalandalus.programacion.alquilervehiculos;

import org.iesalandalus.programacion.alquilervehiculos.controlador.Controlador;
import org.iesalandalus.programacion.alquilervehiculos.modelo.FactoriaFuenteDatos;
import org.iesalandalus.programacion.alquilervehiculos.modelo.Modelo;
import org.iesalandalus.programacion.alquilervehiculos.modelo.ModeloCascada;
import org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.IFuenteDatos;
import org.iesalandalus.programacion.alquilervehiculos.vista.FactoriaVista;
//import org.iesalandalus.programacion.alquilervehiculos.vista.Vista;
import org.iesalandalus.programacion.alquilervehiculos.vista.Vista;
import org.iesalandalus.programacion.alquilervehiculos.vista.texto.Consola;
import org.iesalandalus.programacion.alquilervehiculos.vista.texto.VistaTexto;

public class MainApp {

	public static void main(String[] args) 
	{
		// Ánimo!!!!
		FactoriaFuenteDatos.MEMORIA.crear();
		FactoriaVista.TEXTO.crear();
		IFuenteDatos fuenteDatos = null;
		ModeloCascada modelo = new ModeloCascada(fuenteDatos);
		VistaTexto vista = new VistaTexto();
		Controlador controlador = new Controlador(modelo, vista);
		controlador.comenzar();
		Consola.elegirAccion();
		
//		Consola.mostrarMenuAcciones();
	}

}
