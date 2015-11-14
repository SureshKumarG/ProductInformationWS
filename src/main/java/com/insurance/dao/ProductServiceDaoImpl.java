/**
 * 
 */
package com.insurance.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.insurance.beans.Product;

/**
 * @author 210323
 *
 */
@Component
public class ProductServiceDaoImpl implements ProductServiceDao {

	@Autowired
	public Product product;
	
	public String getProoductName(String productId) {
		product = inflateProductWithData(productId);
		return product.getProductName();
	}

	public Product getProductInformation(String productId) {
				
		product = inflateProductWithData(productId);
		return product;
	}

	private Product inflateProductWithData(String productId){
		
		//product = new Product();
		product.setProductId(productId);
		product.setProductName("Wellness Booster");
		product.setProductType("Health");
		product.setPrice("$1000");
		
		return product;
	}
}
