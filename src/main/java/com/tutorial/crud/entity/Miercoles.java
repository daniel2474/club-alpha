/*En este paquete tenemos nuestro clase Miercoles.java y utilizaremos las @anotaciones 
 * JPA para relacionarla con nuestra tabla Miercoles, quedaría de la siguiente forma:
 *	@autor: Daniel García Velasco 
 * 			Abimael Rueda Galindo
 *	@version: 1
 *12/07/2021
*/
package com.tutorial.crud.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Sirve únicamente para indicarle a JPA que esa clase es una Entity.
@Table(name="miercoles")  //se utiliza para poner el nombre real de la tabla en la base de datos
public class Miercoles {

	@Id //Define la llave primaria.
	@Column(name="idmiercoles") //Permite establecer el nombre de la columna de la tabla con la que el atributo debe de mapear.
	private int idMiercoles;
	
	@Column(name="horaentrada")
	private Date horaentrada;
	

	@Column(name="horasalida")
	private Date horasalida;
	
	@Column(name="activo")
	private boolean activo;
	
	@Column(name="fechacreacion")
	private Date fechacreacion;
	
	@Column(name="fechamodificacion")
	private Date fechamodificacion;

	//Se generó los gettes y setters de cada una de las variables 
	public Date getHoraentrada() {
		return horaentrada;
	}

	public void setHoraentrada(Date horaentrada) {
		this.horaentrada = horaentrada;
	}

	public Date getHorasalida() {
		return horasalida;
	}

	public void setHorasalida(Date horasalida) {
		this.horasalida = horasalida;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Date getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public Date getFechamodificacion() {
		return fechamodificacion;
	}

	public void setFechamodificacion(Date fechamodificacion) {
		this.fechamodificacion = fechamodificacion;
	}

	public int getIdMiercoles() {
		return idMiercoles;
	}

	public void setIdMiercoles(int idMiercoles) {
		this.idMiercoles = idMiercoles;
	}
	
}
