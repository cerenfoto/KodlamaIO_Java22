package interfaces;

public class Main {

	public static void main(String[] args) {

		/*
		 * //Interfaceler de abstractlar gibi newlenemez. ICustomerDal customerDal = new
		 * ICustomerDal() {
		 * 
		 * @Override public void add() { // TODO Auto-generated method stub
		 * 
		 * } };
		 */

		ICustomerDal custormerDal = new OracleCustomerDal();

		/*CustomerManager customerManager = new CustomerManager();
		customerManager.customerDal = new OracleCustomerDal();
		customerManager.add();*/
		
		CustomerManager customerManager = new CustomerManager(new SqlCustomerDal());
		customerManager.add();

	}

}
