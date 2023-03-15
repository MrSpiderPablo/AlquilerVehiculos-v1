package org.iesalandalus.programacion.alquilervehiculos.vista.texto;

public enum Accion {
	SALIR("Salir") {
		@Override
		public void ejecutar() {
		
			
		}
	},
	INSERTAR_CLIENTE("Insertar cliente") {
		@Override
		public void ejecutar() {
			
			
		}
	},
	INSERTAR_VEHICULO("Insertar vehiculo") {
		@Override
		public void ejecutar() {
			
			
		}
	},
	INSERTAR_ALQUILER("Insertar alquiler") {
		@Override
		public void ejecutar() {
			
			
		}
	},
	BUSCAR_CLIENTE("Buscar cliente") {
		@Override
		public void ejecutar() {
			
			
		}
	},
	BUSCAR_VEHICULO("Buscar vehiculo") {
		@Override
		public void ejecutar() {
	
			
		}
	},
	BUSCAR_ALQUILER("Buscar alquiler") {
		@Override
		public void ejecutar() {
			
			
		}
	},
	MODIFICAR_CLIENTE("Modificar cliente") {
		@Override
		public void ejecutar() {
			
			
		}
	},
	DEVOLVER_ALQUILER_CLIENTE("Devolver alquiler cliente") {
		@Override
		public void ejecutar() {
			
			
		}
	},
	DEVOLVER_ALQUILER_VEHICULO("Devolver alquiler vehiculo") {
		@Override
		public void ejecutar() {
			
			
		}
	},
	BORRAR_CLIENTE("Borrar cliente") {
		@Override
		public void ejecutar() {
			
			
		}
	},
	BORRAR_VEHICULO("Borrar vehiculo") {
		@Override
		public void ejecutar() {
			
			
		}
	},
	BORRAR_ALQUILER("Borrar alquiler") {
		@Override
		public void ejecutar() {
			
			
		}
	},
	LISTAR_CLIENTES("Listar clientes") {
		@Override
		public void ejecutar() {
			
			
		}
	},
	LISTAR_VEHICULOS("Listar vehiculos") {
		@Override
		public void ejecutar() {
			
			
		}
	},
	LISTAR_ALQUILERES("Listar alquileres") {
		@Override
		public void ejecutar() {
			
			
		}
	},
	LISTAR_ALQUILERES_CLIENTE("Listar alquileres cliente") {
		@Override
		public void ejecutar() {
			
			
		}
	},
	LISTAR_ALQUILERES_VEHICULO("Listar alquileres vehiculo") {
		@Override
		public void ejecutar() {
			
			
		}
	},
	MOSTRAR_ESTADISTICAS_MENSUALES("Mostrar estadísticas mensuales") {
		@Override
		public void ejecutar() {
			
			
		}
	};
	
	private static VistaTexto vista;
	private String texto;
	
	
	private Accion(String texto) {
		this.texto = texto;
	}
	
	protected static void setVista(VistaTexto vistaTexto) {
		vista = vistaTexto;
			
	}
	
	public abstract void ejecutar();
	
	private static boolean esOrdinalValido(int ordinal) {
		return (ordinal < Accion.values().length || ordinal > Accion.values().length);
		
	}
	
	public static Accion get(int ordinal) {
		return Accion.values()[ordinal];
		
	}
	
	@Override
	public String toString() {
		int ordinal = 0;
		
		return String.format("%s (%d)", texto, ordinal);
		
	}
	
}
