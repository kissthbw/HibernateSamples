package EjercicioHibernate;

public class Direccion {

	private Long idDireccion;
	private String calle;
	private String numeroExt;
	private String numeroInt;
	private String colonia;
	private String munAlc;
	private String codigoPostal;
	private String estado;

	public Direccion() {

	}

	public Direccion(String calle, String numeroExt, String numeroInt, String colonia, String munAlc,
			String codigoPostal, String estado) {
		this.calle = calle;
		this.numeroExt = numeroExt;
		this.numeroInt = numeroInt;
		this.colonia = colonia;
		this.munAlc = munAlc;
		this.codigoPostal = codigoPostal;
		this.estado = estado;
	}

	public Long getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(Long idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumeroExt() {
		return numeroExt;
	}

	public void setNumeroExt(String numeroExt) {
		this.numeroExt = numeroExt;
	}

	public String getNumeroInt() {
		return numeroInt;
	}

	public void setNumeroInt(String numeroInt) {
		this.numeroInt = numeroInt;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getMunAlc() {
		return munAlc;
	}

	public void setMunAlc(String munAlc) {
		this.munAlc = munAlc;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
