/**
 * 
 */
package com.knowshare.entities.ludificacion;

import org.springframework.data.mongodb.core.mapping.DBRef;

import com.knowshare.entities.perfilusuario.Habilidad;

/**
 * Representa las habilidades que posee un usuario,
 * ademas, guarda la cantidad de avales que tiene por cada
 * habilidad.
 * @author Miguel Montañez
 *
 */
public class HabilidadAval {
	
	@DBRef
	private Habilidad habilidad;
	
	private String nombre;
	
	private Integer cantidad;

	/**
	 * @return the nombre
	 */
	public Habilidad getHabilidad() {
		return habilidad;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public HabilidadAval setHabilidad(Habilidad habilidad) {
		this.habilidad = habilidad;
		return this;
	}

	/**
	 * @return the cantidad
	 */
	public Integer getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public HabilidadAval setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
		return this;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public HabilidadAval setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
}
