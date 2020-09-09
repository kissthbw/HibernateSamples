package simple.hibernate;

public class Libro {

	private Long id;
	private String nombrelibro;
	private String autor;

	public Libro() {

	}

	public Libro(String nombreLibro, String autor, String anio) {
		this.nombrelibro = nombreLibro;
		this.autor = autor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombrelibro() {
		return nombrelibro;
	}

	public void setNombrelibro(String nombrelibro) {
		this.nombrelibro = nombrelibro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}
