package com.idat.pe.EFVICTORCHUMACEROPIZERRIA.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PizzeriaPizzaFK {
	@Column(name= "id_pizzeria", nullable = false, unique = true)
	private Long idCliente;
	
	@Column(name= "id_pizza", nullable = false, unique = true)
	private Long idPizza;
}
