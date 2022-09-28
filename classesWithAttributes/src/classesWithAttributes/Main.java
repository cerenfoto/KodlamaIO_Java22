package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		//Product product = new Product();
		
		Product product = new Product(2,"Laptop","Dell Laptop",6000,5,"pembe");

		/*
		 * product.setName("Laptop"); product.setId(1);
		 * product.setDescription("Asus Laptop"); product.setPrice(5000);
		 * product.setStockAmount(3);
		 */

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

		// System.out.println(product.name); (ProductManager sınıfında yazdırıldığı için
		// gerek kalmadı)
		
		System.out.println(product.getKod());

	}

}
