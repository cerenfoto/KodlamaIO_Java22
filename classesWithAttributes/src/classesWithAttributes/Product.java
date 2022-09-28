package classesWithAttributes;

public class Product {

	// constraction
	// her sınıfın default bir constractionu vardır.
	// parametresizdir. Bunu yapıcı method olarak düşünebiliriz. Parametreli hale
	// getirebiliriz.
	public Product() {
		System.out.println("Yapıcı blok çalıştı.");
	}

	// 6 parametreli constraction
	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		System.out.println("burası da çalıştı.");
		// bu kısımları yazmazsak eğer programımız hata verir. cunku main sınıfında set
		// ettigimiz degerleri burada ki degerlere set etmedigimiz için hata veriyordu
		// bu satırları tanımladıgmız zaman hata almadan calısmaktadır.
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.renk = renk;
	}

	/*
	 * Public: halka açık Private: sadece tanımlandığı blokta geçerlidir. süslü
	 * parantez içinde geçerlidir.
	 */

	// attribute | field
	private int id;
	// private int _id; kurumsalda daha cok gorulebılır this anahtar sözcüğünün
	// unutulmasına karsılık bu sekılde kullanılır
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		// iki id karıştığı için this kullanırız. this bu class içerisindeki değişken
		// demek anlamına gelir.
		this.id = id;
		// this.id yerine _id = id; yapılır
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
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

	/*
	 * Kod kısmını sadece okunabilir olmasını istedigimiz için setKod 'u kaldırırız
	 * public void setKod(String kod) { this.kod = kod; }
	 */

	/*
	 * single responsibility principle bir sınıf bir metod bir operasyon sadece bir
	 * işi yapar. bu sınıfta productın özelliklerini ekledik. başka hiç bir işlem
	 * yapmamalıyız. ürün üzerinde işlem yapılabilmesi için ProductManager sınıfını
	 * oluşturduk.
	 */

}
