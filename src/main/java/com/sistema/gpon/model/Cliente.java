package com.sistema.gpon.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Cliente")
@Data
@NoArgsConstructor
public class Cliente {

	@Id
	@Column(name = "DniCliente")
	private String dniCliente;

	@Column(name = "Ruc")
	private String ruc;

	@Column(name = "Nombre")
	private String nombre;

	@Column(name = "Apellido")
	private String apellido;

	@Column(name = "Telefono")
	private String telefono;
}
