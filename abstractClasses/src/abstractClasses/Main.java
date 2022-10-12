package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();

		/* AŞAĞIDAKİ GİBİ KULLANILMAMALIDIR!!!!
		// abstract sınıflar asla new'lenemez. new kullanabilmek için metotlarını
		// override etmemiz gerekmektedir.

		GameCalculator gameCalculator = new GameCalculator() {

			@Override
			public void hesapla() {
				// TODO Auto-generated method stub

			}
		};*/
		
		
		GameCalculator gameCalculator = new WomanGameCalculator();
		gameCalculator.gameOver();

	}

}
