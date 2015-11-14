/**
 * 
 */
package com.insurance.service;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.insurance.beans.Product;
import com.insurance.dao.ProductServiceDaoImpl;

/**
 * @author 210323
 *
 */
@WebService(targetNamespace = "http://service.insurance.com/", portName = "ProductServiceImplPort", serviceName = "ProductServiceImplService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	public ProductServiceDaoImpl productServiceDaoImpl;
	
	@Autowired
	public Product product;
	
	public String getProductName(String productId) {
		
		//ProductServiceDaoImpl productServiceDaoImpl = new ProductServiceDaoImpl();
		String productName = productServiceDaoImpl.getProoductName(productId);
		return productName;
	}

	public Product getProductInformation(String productId) {
		
		//ProductServiceDaoImpl productServiceDaoImpl = new ProductServiceDaoImpl();
		product = productServiceDaoImpl.getProductInformation(productId);
		return product;
	}

}
