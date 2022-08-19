package com.idat.pe.EFVICTORCHUMACEROPIZERRIA.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "pizzeria_pizza")
@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PizzeriaDetalle {
	private PizzeriaPizzaFK fk =  new PizzeriaPizzaFK();
}
