package com.uca.capas.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue (generator = "cliente_c_cliente_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(allocationSize = 1, sequenceName = "cliente_c_cliente_seq", name = "public.cliente_c_cliente_seq")
	@Column(name="c_cliente")
	private Integer cCliente;
	
	@Column(name="s_nombres")
	private String cNombres;
	
	@Column(name="s_apellidos")
	private String cApellidos;
	
	@Column(name="b_activo")
	private Boolean cActivo;
	
	@OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
	private List<Orden_Compra> oCompra;

	public Cliente(Integer cCliente, String cNombres, String cApellidos, Boolean cActivo, List<Orden_Compra> oCompra) {
		super();
		this.cCliente = cCliente;
		this.cNombres = cNombres;
		this.cApellidos = cApellidos;
		this.cActivo = cActivo;
		this.oCompra = oCompra;
	}

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getcCliente() {
		return cCliente;
	}

	public void setcCliente(Integer cCliente) {
		this.cCliente = cCliente;
	}

	public String getcNombres() {
		return cNombres;
	}

	public void setcNombres(String cNombres) {
		this.cNombres = cNombres;
	}

	public String getcApellidos() {
		return cApellidos;
	}

	public void setcApellidos(String cApellidos) {
		this.cApellidos = cApellidos;
	}

	public Boolean getcActivo() {
		return cActivo;
	}

	public void setcActivo(Boolean cActivo) {
		this.cActivo = cActivo;
	}

	public List<Orden_Compra> getoCompra() {
		return oCompra;
	}

	public void setoCompra(List<Orden_Compra> oCompra) {
		this.oCompra = oCompra;
	}
	
	

}
