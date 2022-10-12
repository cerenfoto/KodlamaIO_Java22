package staticDemo;

public class ProductManager {
	public void add(Product product) {
		// ProductValidator productValidator = new ProductValidator();
		// isValid metodu static metod oldugu için new ile nesne olusturup ıslem yapmaya
		// gerek kalmadı.
		// sınıfın ismi ile cagırabildik.
		
		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi.");
		} else
			System.out.println("Ürün bilgileri geçersizdir.");
	}

}
