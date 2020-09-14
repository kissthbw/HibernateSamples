package hibernate.examples.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Client implements Serializable {

	public Client() {
	}

	private Integer id;
	private String name;
	private String lastName;
	private String email;
	private Set<Phone> phones = new HashSet<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Phone> getPhones() {
		return phones;
	}

	public void setPhones(Set<Phone> phones) {
		this.phones = phones;
	}
	
	public void addPhone( Phone phone ) {
		this.phones.add(phone);
	}

}
