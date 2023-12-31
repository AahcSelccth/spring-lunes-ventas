package pe.idat.model;

public class Usuario {
	
	private Integer usuarioid;
	private String nombre;
	private String username;
	private String email;
	private String telefono;
	private String tipo;
	private String password;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(Integer usuarioid, String nombre, String username, String email, String telefono, String tipo,
			String password) {
		super();
		this.usuarioid = usuarioid;
		this.nombre = nombre;
		this.username = username;
		this.email = email;
		this.telefono = telefono;
		this.tipo = tipo;
		this.password = password;
	}

	public Integer getUsuarioid() {
		return usuarioid;
	}

	public void setUsuarioid(Integer usuarioid) {
		this.usuarioid = usuarioid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
