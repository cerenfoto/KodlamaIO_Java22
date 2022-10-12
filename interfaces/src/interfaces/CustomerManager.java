package interfaces;

public class CustomerManager {
	private ICustomerDal customerDal;

	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		// iş Kodları yazılacak (müsterinin adı girilmiş mi soyadı var mı gibi )
		customerDal.add();

	}

}
