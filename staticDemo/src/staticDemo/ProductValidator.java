package staticDemo;

public class ProductValidator {

	static {
		System.out.println("Static Yapıcı blok çalıştı.");
	}

	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı.");
		// new anahtar kelimesi ile nesne olusturmadan calısmazlar.
	}

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else
			return false;
	}

	public void bisey() {
		// bu metod new anahtar kelimesi kullanılmadan cagırılmaz
	}
	
	//inner class
	public static class BaskaBirClass{
		public static void sil() {
			
		}
	}

}
