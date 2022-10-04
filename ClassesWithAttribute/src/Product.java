
public class Product {

	/*public Product(int id,String name,String description,double price,int stockAmound,String renk,String kod) {
		System.out.println("Yapıcı blok calıstı"); // Constructer
		
	}*/
	// attribute /Field
	
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmound;
	private String renk;
	private String kod;

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

	public String description() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;

	}

	public int getStockAmound() {
		return stockAmound;
	}

	public void setStockAmound(int stockAmound) {
		this.stockAmound = stockAmound;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0, 1) + id;
	}

}
