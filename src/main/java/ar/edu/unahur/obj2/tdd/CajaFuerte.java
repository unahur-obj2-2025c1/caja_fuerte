package ar.edu.unahur.obj2.tdd;

import java.util.function.BooleanSupplier;

public class CajaFuerte {

	private Boolean abierta;
	private Integer clave;
	private Integer intentosFallidos = 0;

	public CajaFuerte() {
		this.abierta = true;
	}

	public Boolean estaAbierta() {
		return abierta;
	}

	public void cerrar(Integer clave) {
		if (this.abierta) {
			this.clave = clave;
			this.abierta = false;
		}
	}

	public void abrir(Integer clave) {
		if (this.clave.equals(clave) && !this.estaBloqueada()) {
			this.abierta = true;
			this.intentosFallidos=0;
		} else {
			this.intentosFallidos++;			
		}
	}

	public Boolean estaBloqueada() {
		return this.intentosFallidos >= 3;
	}
}
