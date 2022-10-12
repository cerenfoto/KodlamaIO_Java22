package polymorphismDemo;

public class CustomerManager {
	private BaseLogger baseLogger;

	public CustomerManager(BaseLogger logger) {
		this.baseLogger = logger;
	}

	public void add() {
		System.out.println("Müşteri Eklendi.");

		/*
		 * // Burada dbye bağımlı çalışmak zorunda kalıyoruz loglama yapabilmek için
		 * //bir gun db kapatılıp dosyaya loglama yapılması ıstendıgı zaman
		 * "DatabaseLogger logger = new DatabaseLogger();" yaptıgımızı butun
		 * //classlarda işlem yapmammız gerekecek. DatabaseLogger logger = new
		 * DatabaseLogger(); logger.Log("Log Mesajı");
		 */

		this.baseLogger.log("Log Mesajı");
	}

}
