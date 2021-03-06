package hibernate.examples.model;
// Generated 11 sep. 2020 12:22:57 by Hibernate Tools 5.0.6.Final

/**
 * PhoneDetails generated by hbm2java
 */
public class PhoneDetails implements java.io.Serializable {

	private Integer id;
	private String provider;
	private String technology;

	public PhoneDetails() {
	}

	public PhoneDetails(String provider, String technology) {
		this.provider = provider;
		this.technology = technology;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProvider() {
		return this.provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getTechnology() {
		return this.technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

}
