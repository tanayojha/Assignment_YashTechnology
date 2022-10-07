package org.yash.pms.main;
/**
 * @author tanay.ojha
 * 
 */
import org.yash.pms.controller.*;
import org.yash.pms.exception.*;

public class ProductApplication {

	public static void main(String[] args) throws ProductException{
		// TODO Auto-generated method stub
		ProductController controller = new ProductController();
		controller.showMenu();
	}

}
