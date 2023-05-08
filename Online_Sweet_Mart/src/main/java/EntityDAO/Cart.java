//package EntityDAO;
//
//import java.util.LinkedList;
//import java.util.List;
//
//import jakarta.persistence.Embeddable;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//
//@Entity
//@Embeddable
//public class Cart {
//	@Id
//	private int id;
//	private int total;
//	@OneToMany(mappedBy ="cart")
//	List <Products> prodList  = new LinkedList<>();
//	
//	public Cart() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Cart(int id, int total, List<Products> prodList) {
//		super();
//		this.id = id;
//		this.total = total;
//		this.prodList = prodList;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public int getTotal() {
//		return total;
//	}
//
//	public void setTotal(int total) {
//		this.total = total;
//	}
//
//	public List<Products> getProdList() {
//		return prodList;
//	}
//
//	public void setProdList(List<Products> prodList) {
//		this.prodList = prodList;
//	}
//
//	@Override
//	public String toString() {
//		return " id: " + id + ",       total: " + total + ",         prodList: " + prodList;
//	}
//	
//	
//}
