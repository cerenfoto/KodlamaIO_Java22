package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
	
	// final kelimesi ile metodumuzu tanımlarsak eger bu metot override edilemez
	
	/*
	 *	public final double hesapla(double tutar) {
		return tutar * 1.18;
	}
	 */

}
