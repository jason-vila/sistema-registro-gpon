package com.sistema.gpon.model;

import java.time.LocalDateTime;

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
	@JoinColumn(name = "IdUsuario", nullable = false)
	private Usuario usuario;

	@Column(name = "Asunto")
	private String asunto;

	@ManyToOne
	@JoinColumn(name = "DniCliente", nullable = false)
	private Cliente cliente;

	@Column(name = "FechaRegistro", nullable = false)
	private LocalDateTime fechaRegistro;

	@ManyToOne
	@JoinColumn(name = "IdPlan", nullable = false)
	private Plan plan;

	@ManyToOne
	@JoinColumn(name = "IdPromocion")
	private Promocion promocion;

	@ManyToOne
	@JoinColumn(name = "IdDistrito", nullable = false)
	private Distrito distrito;

	@ManyToOne
	@JoinColumn(name = "IdSector", nullable = false)
	private Sector sector;

	@Column(name = "IdSolicitud", nullable = false)
	private String idSolicitud;

	@Column(name = "IdInstalacion", nullable = false)
	private String idInstalacion;

	@ManyToOne
	@JoinColumn(name = "IdEstado", nullable = false)
	private EstadoRegistro estado;

	@Column(name = "IdCarrito", nullable = false)
	private String idCarrito;

	@Column(name = "FechaInstalacion", nullable = false)
	private LocalDateTime fechaInstalacion;

	@Column(name = "Observacion")
	private String observacion;
}

