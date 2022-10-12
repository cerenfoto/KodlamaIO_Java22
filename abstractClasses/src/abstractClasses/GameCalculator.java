package abstractClasses;

public abstract class GameCalculator {

	// inherit eden sınıflarda hesapla metodu olmak zorundadır. İnherit eden
	// sınıflarda hesaplayı imlement edip override etmelidir.
	// abstract sınıf içerisinde abstract metot olması zorunlu degıldır.
	public abstract void hesapla();

	// inherit eden sınıflar da bulunur ve override edilemez.
	public final void gameOver() {
		System.out.println("Oyun Bitti :(");
	}

}
