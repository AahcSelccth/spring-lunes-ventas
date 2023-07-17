package pe.idat.model;

import java.util.Date;

public class Orden {
	
	private Integer ordenId;
	private String numero;
	private Date fechaCreacion;
	private Date fechaRecibida;
	
	private double total;
	
	
	public Orden() {
		// TODO Auto-generated constructor stub
	}


	public Orden(Integer ordenId, String numero, Date fechaCreacion, Date fechaRecibida, double total) {
		super();
		this.ordenId = ordenId;
		this.numero = numero;
		this.fechaCreacion = fechaCreacion;
		this.fechaRecibida = fechaRecibida;
		this.total = total;
	}


	public Integer getOrdenId() {
		return ordenId;
	}


	public void setOrdenId(Integer ordenId) {
		this.ordenId = ordenId;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public Date getFechaCreacion() {
		return fechaCreacion;
	}


	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	public Date getFechaRecibida() {
		return fechaRecibida;
	}


	public void setFechaRecibida(Date fechaRecibida) {
		this.fechaRecibida = fechaRecibida;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	@Override
	public String toString() {
		return "Orden [ordenId=" + ordenId + ", numero=" + numero + ", fechaCreacion=" + fechaCreacion
				+ ", fechaRecibida=" + fechaRecibida + ", total=" + total + "]";
	}
	
	
	
	
	

}
