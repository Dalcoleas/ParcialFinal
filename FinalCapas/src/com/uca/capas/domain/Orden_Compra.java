package com.uca.capas.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "orden_compra")
public class Orden_Compra {
	
	@Id
	@GeneratedValue (generator = "orden_compra_c_orden_compra_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(allocationSize = 1, sequenceName = "orden_compra_c_orden_compra_seq", name = "public.orden_compra_c_orden_compra_seq")
	@Column(name="c_orden_compra")
	private Integer cCompra;
	
	@Column(name="n_cantidad")
	private Integer cantCompra;
	
	@Column(name="f_compra")
	private Date fCompra;
	
	@Column(name = "n_total")
	private Float tCompra;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "c_producto")
	private Producto producto;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "c_cliente")
	private Cliente cliente;

	public Orden_Compra(Integer cCompra, Integer cantCompra, Date fCompra, Float tCompra, Producto producto,
			Cliente cliente) {
		super();
		this.cCompra = cCompra;
		this.cantCompra = cantCompra;
		this.fCompra = fCompra;
		this.tCompra = tCompra;
		this.producto = producto;
		this.cliente = cliente;
	}

	public Orden_Compra() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getcCompra() {
		return cCompra;
	}

	public void setcCompra(Integer cCompra) {
		this.cCompra = cCompra;
	}

	public Integer getCantCompra() {
		return cantCompra;
	}

	public void setCantCompra(Integer cantCompra) {
		this.cantCompra = cantCompra;
	}

	public Date getfCompra() {
		return fCompra;
	}

	public void setfCompra(Date fCompra) {
		this.fCompra = fCompra;
	}

	public Float gettCompra() {
		return tCompra;
	}

	public void settCompra(Float tCompra) {
		this.tCompra = tCompra;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
