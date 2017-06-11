/**
 * 
 */
package com.knowshare.entities.perfilusuario;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.knowshare.enums.TipoCualidadEnum;

/**
 * Cualidad que un usuario ha seleccionado como parte de
 * la construccion de su perfil
 * @author miguel
 *
 */
@Document(collection = "cualidad")
public class Cualidad implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String nombre;
	
	private TipoCualidadEnum tipo;

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public Cualidad setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	/**
	 * @return the tipo
	 */
	public TipoCualidadEnum getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public Cualidad setTipo(TipoCualidadEnum tipo) {
		this.tipo = tipo;
		return this;
	}
}
