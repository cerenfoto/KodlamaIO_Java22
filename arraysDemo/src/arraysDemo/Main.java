package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Ceren";
		String ogrenci2 = "Burak";
		String ogrenci3 = "Kadir";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);

		System.out.println("-------------------------------------------------");

		String[] ogrenciler = new String[3];

		ogrenciler[0] = "Burak";
		ogrenciler[1] = "Ceren";
		ogrenciler[2] = "Kadir";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}

		System.out.println("-------------------------------------------------");

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
