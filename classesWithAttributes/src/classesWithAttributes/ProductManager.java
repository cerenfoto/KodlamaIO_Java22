package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		// JDBC ile db bağlantılarını yaparak ürünü db ye ekledik.
		System.out.println("Ürün eklendi. " + product.getName());
	}

	public void Add2(int id, String name, String description, int stockAmount, int price) {
	}

}
