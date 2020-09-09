package annotations.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "LIBROS")
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

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "LIBRO_NOMBRELIBRO")
	public String getNombrelibro() {
		return nombrelibro;
	}

	public void setNombrelibro(String nombrelibro) {
		this.nombrelibro = nombrelibro;
	}

	@Column(name = "LIBRO_AUTOR")
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}
