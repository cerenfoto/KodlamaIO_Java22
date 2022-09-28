package methods2;

public class Main {

	public static void main(String[] args) {
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);

		int sayi = topla(5, 7);
		System.out.println(sayi);

		int toplam = topla2(2, 5, 6);
		System.out.println(toplam);

	}

	// void operasyonlar bir işlemi yapmak için kulllanılır. Geri dönüş yapmazlar.
	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi.");
	}

	public static void guncelle() {
		System.out.println("Güncellendi.");
		return; // fonksiyonu bitir anlamında kullanılır.
	}

	// integer degerinde bir sonuc dondurecek olan operasyon
	public static int topla(int sayi1, int sayi2) {
		// return 5; // geriye değer döndürmeye yarar.

		return sayi1 + sayi2;
	}

	// kaç tane değişken geleceğini bilmediğimiz zaman uygularız
	// sayilar adında bir dizi oluşturmuş oluruz.
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}

	public static String sehirVer() {
		return "Ankara";

	}

}
