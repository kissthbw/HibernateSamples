package EjercicioHibernate;

public class Telefono {

	private Long idTelefono;
	private String telefono;
	private TipoTelefono tipoTelefono;

	public Telefono() {

	}

	public Telefono(String telefono) {
		this.telefono = telefono;
	}

	public Long getIdTelefono() {
		return idTelefono;
	}

	public void setIdTelefono(Long idTelefono) {
		this.idTelefono = idTelefono;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public TipoTelefono getTipoTelefono() {
		return tipoTelefono;
	}

	public void setTipoTelefono(TipoTelefono tipoTelefono) {
		this.tipoTelefono = tipoTelefono;
	}
}
