package hibernate.examples.model;
// Generated 11 sep. 2020 12:22:57 by Hibernate Tools 5.0.6.Final

/**
 * CatPhoneType generated by hbm2java
 */
public class CatPhoneType implements java.io.Serializable {

	private Integer id;
	private String name;

	public CatPhoneType() {
	}

	public CatPhoneType(String name) {
		this.name = name;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}