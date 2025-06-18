package com.sistema.gpon.model;

import java.time.LocalDate;

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
@Table(name = "RegistroRUC10")
@Data
@NoArgsConstructor
public class RegistroRUC10 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdRegistro")
	private Integer idRegistro;

	@ManyToOne
	@JoinColumn(name = "IdUsuario")
	private Usuario usuario;

	@Column(name = "Asunto")
	private String asunto;

	@ManyToOne
	@JoinColumn(name = "DniCliente")
	private Cliente cliente;

	@Column(name = "FechaRegistro")
	private LocalDate fechaRegistro;

	@ManyToOne
	@JoinColumn(name = "IdPlan")
	private Plan plan;

	@ManyToOne
	@JoinColumn(name = "IdPromocion")
	private Promocion promocion;

	@ManyToOne
	@JoinColumn(name = "IdDistrito")
	private Distrito distrito;

	@ManyToOne
	@JoinColumn(name = "IdSector")
	private Sector sector;

	@Column(name = "IdSolicitud")
	private Integer idSolicitud;

	@Column(name = "IdInstalacion")
	private Integer idInstalacion;

	@Column(name = "Estado")
	private String estado;

	@Column(name = "IdCarrito")
	private Integer idCarrito;

	@Column(name = "FechaInstalacion")
	private LocalDate fechaInstalacion;

	@Column(name = "Observacion")
	private String observacion;
}
