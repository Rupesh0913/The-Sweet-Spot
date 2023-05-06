package EntityDAO;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
//	
//	@OneToMany(mappedBy = "category" , cascade = CascadeType.ALL)
//	Set<Products> prodSet = new HashSet<>();

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}


	

//	public Set<Products> getProdSet() {
//		return prodSet;
//	}
//
//
//
//
//	public void setProdSet(Set<Products> prodSet) {
//		this.prodSet = prodSet;
//	}




	public Category(String name /*Set<Products> prodSet*/) {
		super();
		this.name = name;
//		this.prodSet = prodSet;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public Set<Products> getProdSet() {
//		return prodSet;
//	}
//
//	public void setProdSet(Set<Products> prodSet) {
//		this.prodSet = prodSet;
//	}

	@Override
	public String toString() {
		return " id: " + id + ", name: " + name ;
	}
	
	
}
