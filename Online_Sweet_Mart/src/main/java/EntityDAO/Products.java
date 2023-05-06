//package EntityDAO;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//
//@Entity
//public class Products {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int id;
//	private String name;
//	private double price;
//	private String desc;
//	@ManyToOne
//	@JoinColumn(name ="category_id")
//	Category category;
//	public Products() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Products(String name, double price, String desc, Category category) {
//		super();
//		this.name = name;
//		this.price = price;
//		this.desc = desc;
//		this.category = category;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public double getPrice() {
//		return price;
//	}
//	public void setPrice(double price) {
//		this.price = price;
//	}
//	public String getDesc() {
//		return desc;
//	}
//	public void setDesc(String desc) {
//		this.desc = desc;
//	}
//	public Category getCategory() {
//		return category;
//	}
//	public void setCategory(Category category) {
//		this.category = category;
//	}
//	
//	
//	
//}
