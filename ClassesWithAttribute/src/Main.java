
public class Main {

	public static void main(String[] args) {
		
		//Product product=new Product(1,"Laptop","Asus Laptop",5000,2,);
		Product product=new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setdescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmound(2);
		
		ProductManager manager=new ProductManager();
		manager.Add(product);
		
System.out.println(product.getKod());
}
	
}