package interfaces;

//Dal:Data access layer anlamında kullanılır.
public class MySqlCustomerDal implements ICustomerDal {

	@Override
	public void add() {
		System.out.println("MySql'e eklendi.");

	}

}
