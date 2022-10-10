package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product=new Product(1,"Laptop2","Asus2 Laptop",3000,2,"");
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(500);
		product.setStockAmount(3);
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		
		productManager.Add2(1, "", "", 2, 200);
	}

}
