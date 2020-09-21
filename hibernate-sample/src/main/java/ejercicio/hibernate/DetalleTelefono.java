package ejercicio.hibernate;

public class DetalleTelefono {

	private Long idDetalleTelefono;
	private Contacto contacto;
	private Telefono telefono;

	public DetalleTelefono() {

	}

	public Long getIdDetalleTelefono() {
		return idDetalleTelefono;
	}

	public void setIdDetalleTelefono(Long idDetalleTelefono) {
		this.idDetalleTelefono = idDetalleTelefono;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	public Telefono getTelefono() {
		return telefono;
	}

	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}
}
