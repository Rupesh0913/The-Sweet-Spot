package EntityDAO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;

@Entity
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int price;
	private String descr;

	@ManyToOne
	@JoinColumn(name ="category_id")
	Category category;
	
	@ManyToOne
	@JoinColumn(name ="cart_id")
	Cart cart;


	public Products() {
		super();
	}
	
	public Products(String name, int price, String desc,Category category) {
		super();
		this.name = name;
		this.price = price;
		this.descr = desc;
		this.category = category;
	}
	
	@Override
	public String toString() {
		return ("*******************************************************************************************************"+'\n'+"* id: " + id + ",      name: " + name + ",      price: " + price + ",     descr: " + descr + ",      category: "+ category.getName()) ;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDesc() {
		return descr;
	}
	public void setDesc(String desc) {
		this.descr = desc;
	}
	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
//	public Category getCategory() {
//		return category;
//	}
//	public void setCategory(Category category) {
//		this.category = category;
//	}
	
	
	
}
