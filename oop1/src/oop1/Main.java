package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oranı";

		// set Value islemi
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(4);
		product1.setImageUrl("image1.jpg");

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(8);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(4);
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(9);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(4);
		product3.setImageUrl("image3.jpg");
		/*
		 * get işlemi System.out.println(product1.name);
		 */

		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
			/*
			 * System.out.println("<li>" + product.unitPrice + "</li>");
			 * System.out.println("<li>" + product.discount + "</li>");
			 * System.out.println("<li>" + product.unitsInStock + "</li>");
			 * System.out.println("<li>" + product.imageUrl + "</li>");
			 */
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05069302589");
		individualCustomer.setCustomerNumber("123456");
		individualCustomer.setFirstName("Ceren");
		individualCustomer.setLastName("Özçamur");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("0509999999");
		corporateCustomer.setTaxNumber("11111111111111");
		corporateCustomer.setCustomerNumber("5555");
		
		Customer [] customers = {individualCustomer,corporateCustomer};

	}

}
