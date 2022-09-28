package classes;

public class Main {

	public static void main(String[] args) {
		// reference type
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;

		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

		// value type (değer tip)
		// değer tipler stackte oluşur. Heaple alakası yoktur.
		/*
		 * Stack sayı1=10 sayı=20
		 * 
		 * ==>> sayı2=sayi1 ==>> sayi2 =10 sayi1=30
		 */
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);

		//diziler reference tiplerdir. stackte sadece referasnlasrı tutulur
		//değerleri ise heapte tutulur. 
		/*stack
		 * sayilar1 ==>> 101 numaralı belleği tutsun (heap adresi gibi düşünülebilir)
		 * sayilar2 ==>> 102 yi tutsun.
		 * 
		 * sayilar2=sayilar1 dediğimiz zaman sayilar2 artık 101 i tutmaya başlar. 
		 * 
		 * bu yüzden sayilar1 içerisinde yapılan değişiklikler sayilar2yi de etkileyecektir. 
		 * */
		int[] sayilar1 = new int[] { 1, 2, 3 };
		int[] sayilar2 = new int[] { 4, 5, 6 };
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);

	}

}
