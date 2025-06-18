package com.sistema.gpon.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Usuario")
@Data
@NoArgsConstructor
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdUsuario")
	private Integer idUsuario;

	@ManyToOne
	@JoinColumn(name = "IdRol")
	private Rol rol;

	@Column(name = "Nombre")
	private String nombre;

	@Column(name = "Apellido")
	private String apellido;

	@Column(name = "Correo")
	private String correo;

	@Column(name = "Contrasena")
	private String contrasena;
}
