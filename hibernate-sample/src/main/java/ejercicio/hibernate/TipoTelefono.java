package ejercicio.hibernate;

public class TipoTelefono {

	private Long idTipoTelefono;
	private String tipoTelefono;

	public TipoTelefono() {

	}
	
	public TipoTelefono(String tipoTelefono) {
		this.tipoTelefono = tipoTelefono;
	}

	public Long getIdTipoTelefono() {
		return idTipoTelefono;
	}

	public void setIdTipoTelefono(Long idTipoTelefono) {
		this.idTipoTelefono = idTipoTelefono;
	}

	public String getTipoTelefono() {
		return tipoTelefono;
	}

	public void setTipoTelefono(String tipoTelefono) {
		this.tipoTelefono = tipoTelefono;
	}
}
