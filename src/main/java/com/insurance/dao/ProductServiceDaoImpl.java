/**
 * 
 */
package com.insurance.dao;

import com.insurance.beans.Product;

/**
 * @author 210323
 *
 */
public class ProductServiceDaoImpl implements ProductServiceDao {

	Product product;
	
	public String getProoductName(String productId) {
		product = inflateProductWithData(productId);
		return product.getProductName();
	}

	public Product getProductInformation(String productId) {
				
		product = inflateProductWithData(productId);
		return product;
	}

	private Product inflateProductWithData(String productId){
		
		product = new Product();
		product.setProductId(productId);
		product.setProductName("Wellness Booster");
		product.setProductType("Health");
		product.setPrice("$1000");
		
		return product;
	}
}
