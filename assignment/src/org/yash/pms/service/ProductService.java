package org.yash.pms.service;

import org.yash.pms.exception.ProductException;
import org.yash.pms.model.Product;

/**
 * 
 * @author tanay.ojha
 *
 */
public interface ProductService {
	
	 Product[] insertData() throws ProductException;
	
	 Product updatePriceById();
	
	 Product getproductById() throws Exception ;
	
	 String deleteProuctById();
	
}
