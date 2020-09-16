package EjercicioHibernate;

public class Contacto {

	private Long idContacto;
	private String nombreContacto;

	public Contacto() {

	}

	public Contacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	public Long getIdContacto() {
		return idContacto;
	}

	public void setIdContacto(Long idContacto) {
		this.idContacto = idContacto;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}
}
