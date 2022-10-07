package org.yash.pms.controller;

/**
 * @author tanay.ojha
 * 
 */

import java.util.Scanner;

import org.yash.pms.exception.ProductException;
import org.yash.pms.impl.ProductServiceImpl;
import org.yash.pms.model.Product;
import org.yash.pms.utilities.Util;

public class ProductController extends ProductServiceImpl {

	Product[] productArray;

	public ProductController() {
		// TODO Auto-generated constructor stub
		Util util = new Util();
	}

	public void showMenu() throws ProductException {
		boolean falg = true;
		do {
			System.out.println("************************");
			System.out.println("- Welcome To Main Menu - ");
			System.out.println("************************");
			System.out.println("INSERT PRODUCT RECORD  -> Press 0");
			System.out.println("DISPLAY PRODUCT RECORD -> Press 1");
			System.out.println("UPDATE PRODUCT RECORD  -> Press 2");
			System.out.println("DELETE PRODUCT RECORD  -> Press 3");
			System.out.println("EXIT MENU              -> Press 4");

			switch (Util.userInputInInteger()) {

			case 0:
				insertData();
				break;
			case 1:
				getproductById();
				break;
			case 2:
				updatePriceById();
				break;
			case 3:
				deleteProuctById();
				break;
			case 4:
				System.out.println("EXIT DONE! \nplease rerun the program to execute main menu...");
				falg = false;
				break;

			default:
				System.out.println("--------------------");
				System.out.println("- Invalid Choice -");
				System.out.println("--------------------");
			}

		} while (falg);

	}

	@Override
	public Product[] insertData() throws ProductException {
		System.out.println("Enter number of Product you want to add in Product Record -: ");
		// Taking Input in Integer by User
		int n = Util.userInputInInteger();
		int i;
		// Creating Product Array for adding New Product by User
		productArray = new Product[n];

		for (i = 0; i < productArray.length; i++) {
			Product product = new Product();
			//
			System.out.println("Enter Product Id - ");
			product.setId(Util.userInputInString());
			//
			System.out.println("Enter Product Name - ");
			product.setName(Util.userInputInString());
			//
			System.out.println("Enter Product Prize - ");
			product.setPrice(Util.userInputInDouble());
			//
			productArray[i] = product;
			System.out.println("Your enter details are - \n" + productArray[i].toString());
		}

		return productArray;
	}

	@Override
	public Product getproductById() throws ProductException {
		Product product = null;
		boolean flag = false;
		if (productArray != null && productArray.length > 0) {
			System.out.println("Please Enter the Product Id of which record you want to display.");
			// Taking User Input in Integer
			String prodId = Util.userInputInString();
			System.out.println(prodId);

			for (int i = 0; i < productArray.length; i++) {
				if (prodId.equals(productArray[i].getId())) {
					flag = true;
					product = productArray[i];
					System.out.println(product.toString());
				}
			}

			if (!flag) {
				System.out.println("--------------------");
				System.out.println("Product Id does not found!");
				System.out.println("--------------------\n");
				//throw new ProductException("Invlaid Id!");

			}

		} else {
			System.out.println("--------------------");
			System.out.println("Record Not Found!");
			System.out.println("--------------------");
		}

		return product;
	}

	@Override
	public Product updatePriceById() {
		Product product = null;
		if (productArray != null && productArray.length > 0) {
			// TODO Auto-generated method stub
			System.out.println("Enter the Product Id  to update the Product -\n");
			// Taking User Input in Integer
			String prodId = Util.userInputInString();

			for (int i = 0; i < productArray.length; i++) {
				if (productArray[i].getId().equals(prodId)) {

					product = productArray[i];

					System.out.println(
							"Choose Option to update:\nProduct Name - > Press 1\nProduct Price -> Press 2\nBoth -> Press 3");
					String option = Util.userInputInString();
					switch (option) {
					case "1":
						System.out.println("Enter Name");
						String updatedName = Util.userInputInString();
						productArray[i].setName(updatedName);
						break;
					case "2":
						System.out.println("Enter Price");
						double updatedPrice = Util.userInputInDouble();
						productArray[i].setPrice(updatedPrice);
						break;
					case "3":
						String updateName = Util.userInputInString();
						productArray[i].setName(updateName);
						double updatePrice = Util.userInputInDouble();
						productArray[i].setPrice(updatePrice);
						break;

					default:
						System.out.println("Invalid Choice!");
						break;
					}
				} else {
					System.out.println("--------------------");
					System.out.println("Product Id does not found!");
					System.out.println("--------------------\n");
				}
			}
		} else {
			System.out.println("--------------------");
			System.out.println("Record Not Found!");
			System.out.println("--------------------");
		}

		return product;
	}

	@Override
	public String deleteProuctById() {
		boolean flag = false;

		if (productArray != null && productArray.length > 0) {
			try {
				// TODO Auto-generated method stub
				System.out.println("Enter the Product Id to delete");
				// String prodId = scanner.next();
				String prodId = Util.userInputInString();

				Product[] updatedArray = new Product[productArray.length - 1];

				for (int j = 0; j < updatedArray.length; j++) {
					if (prodId.equals(updatedArray[j].getId())) {
						updatedArray[0] = productArray[j];
					}
				}

				productArray = new Product[updatedArray.length];
				for (int j = 0; j < updatedArray.length; j++) {
					System.out.println(updatedArray[j].toString());
					productArray[j] = updatedArray[j];
				}
				
				if (!flag) {
					System.out.println("--------------------");
					System.out.println("Product Id does not found!");
					System.out.println("--------------------\n");
					//throw new ProductException("Invlaid Id!");

				}

			} catch (Exception e) {
				// TODO: handle exception
			}

		} else {
			System.out.println("--------------------");
			System.out.println("Record Not Found!");
			System.out.println("--------------------");
		}
		return "Product Deleted Successfully";
	}

}
