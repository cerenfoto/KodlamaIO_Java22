package abstractDemo;

public class CustomerManager {
	// ister oracle ister sql nesnesi gonderelim calısacaktır.
	BaseDatabaseManager databaseManager;

	public void getCustomer() {
		databaseManager.getData();

	}

}
