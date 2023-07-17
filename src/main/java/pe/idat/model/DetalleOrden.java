package pe.idat.model;

public class DetalleOrden {
	
	private Integer detalleOrdenId;
	private String nombre;
	private double cantidad;
	private double precio;
	
	private double total;
	
	
	public DetalleOrden() {
		// TODO Auto-generated constructor stub
	}


	public DetalleOrden(Integer detalleOrdenId, String nombre, double cantidad, double precio, double total) {
		super();
		this.detalleOrdenId = detalleOrdenId;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.total = total;
	}


	public Integer getDetalleOrdenId() {
		return detalleOrdenId;
	}


	public void setDetalleOrdenId(Integer detalleOrdenId) {
		this.detalleOrdenId = detalleOrdenId;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getCantidad() {
		return cantidad;
	}


	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	@Override
	public String toString() {
		return "DetalleOrden [detalleOrdenId=" + detalleOrdenId + ", nombre=" + nombre + ", cantidad=" + cantidad
				+ ", precio=" + precio + ", total=" + total + "]";
	}
	
	
	
	
	
	

}
