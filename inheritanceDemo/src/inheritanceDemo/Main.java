package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		/*OgretmenKrediManager ogrertmenKrediManager = new OgretmenKrediManager();
		ogrertmenKrediManager.Hesapla();*/
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new AskerKrediManager());

	}

}
