package com.uca.capas.domain;

import java.util.Date;
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
@Table(schema = "public", name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue (generator = "producto_c_producto_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(allocationSize = 1, sequenceName = "producto_c_producto_seq", name = "public.producto_c_producto_seq")
	@Column(name="c_producto")
	private Integer cProducto;
	
	@Column(name="nombre")
	private String pNombre;
	
	@Column(name="descripcion")
	private String pDescripcion;
	
	@Column(name="inventario")
	private Integer pInventario;
	
	@Column(name="fecha_ingreso")
	private Date pFecha;
	
	@Column(name="b_activo")
	private Boolean pActivo;
	
	@Column(name="n_precio")
	private Integer pPrecio;
	
	@OneToMany(mappedBy = "producto", fetch = FetchType.EAGER)
	private List<Orden_Compra> oCompra;

	public Producto(Integer cProducto, String pNombre, String pDescripcion, Integer pInventario, Date pFecha,
			Boolean pActivo, Integer pPrecio, List<Orden_Compra> oCompra) {
		super();
		this.cProducto = cProducto;
		this.pNombre = pNombre;
		this.pDescripcion = pDescripcion;
		this.pInventario = pInventario;
		this.pFecha = pFecha;
		this.pActivo = pActivo;
		this.pPrecio = pPrecio;
		this.oCompra = oCompra;
	}

	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getcProducto() {
		return cProducto;
	}

	public void setcProducto(Integer cProducto) {
		this.cProducto = cProducto;
	}

	public String getpNombre() {
		return pNombre;
	}

	public void setpNombre(String pNombre) {
		this.pNombre = pNombre;
	}

	public String getpDescripcion() {
		return pDescripcion;
	}

	public void setpDescripcion(String pDescripcion) {
		this.pDescripcion = pDescripcion;
	}

	public Integer getpInventario() {
		return pInventario;
	}

	public void setpInventario(Integer pInventario) {
		this.pInventario = pInventario;
	}

	public Date getpFecha() {
		return pFecha;
	}

	public void setpFecha(Date pFecha) {
		this.pFecha = pFecha;
	}

	public Boolean getpActivo() {
		return pActivo;
	}

	public void setpActivo(Boolean pActivo) {
		this.pActivo = pActivo;
	}

	public Integer getpPrecio() {
		return pPrecio;
	}

	public void setpPrecio(Integer pPrecio) {
		this.pPrecio = pPrecio;
	}

	public List<Orden_Compra> getoCompra() {
		return oCompra;
	}

	public void setoCompra(List<Orden_Compra> oCompra) {
		this.oCompra = oCompra;
	}
	

}
