package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 20;

		for (int sayi : sayilar) {
			if (aranacak == sayi) {
				mesajVer("Dizi içerisinde " + sayi + " vardır.");
			}

		}
		mesajVer("Dizi içerisinde " + aranacak + " yoktur.");
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
