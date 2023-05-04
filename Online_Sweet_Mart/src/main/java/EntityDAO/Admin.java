package EntityDAO;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username = "Admin";
	private String password = "Admin";
	@OneToMany(mappedBy ="add" , cascade = CascadeType.ALL)
	Set<Customer> setCust;
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(Set<Customer> setCust) {
		super();
		this.setCust = setCust;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Customer> getSetCust() {
		return setCust;
	}

	public void setSetCust(Set<Customer> setCust) {
		this.setCust = setCust;
	}
	
	
	
}
