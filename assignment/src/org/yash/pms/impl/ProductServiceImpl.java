package org.yash.pms.impl;

import org.yash.pms.exception.ProductException;
import org.yash.pms.model.Product;
import org.yash.pms.service.ProductService;

/**
 * 
 * @author tanay.ojha
 *
 */
public class ProductServiceImpl implements ProductService {
	
	ProductService productService;
	
	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Product[] insertData() throws ProductException{
		// TODO Auto-generated method stub
		return productService.insertData();
	}
	
	@Override
	public Product getproductById() throws Exception  {
		// TODO Auto-generated method stub
		return productService.getproductById();
	}

	@Override
	public Product updatePriceById() {
		// TODO Auto-generated method stub
		return productService.updatePriceById();
	}

	@Override
	public String deleteProuctById() {
		// TODO Auto-generated method stub
		return "Product Deleted Successfully";
	}


}
