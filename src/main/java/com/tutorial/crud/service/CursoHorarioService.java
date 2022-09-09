/*Como en el paquete anterior tendremos una clase y una interface. 
 * El servicio será el que hará de interemediario entre el DAO y 
 * el controlador(La clase que gestionará las peticiones de la API que veremos más adelante).
 * La interfaz de service tendría esta estructura CursoHorarioService.java:
 *	@autor: Daniel García Velasco 
 * 			Abimael Rueda Galindo
 *	@version: 1
 *12/07/2021
*/
package com.tutorial.crud.service;

import java.util.List;

import com.tutorial.crud.entity.CursoHorario;

//Interfaz en el que manda a llamar los métodos creados en ...ServiceImpl.java
public interface CursoHorarioService 
{
	public List<CursoHorario> findAll();
	public CursoHorario findById(int id);
	public void save(CursoHorario cursoHorario);
}
