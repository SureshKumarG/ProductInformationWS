/**
 * 
 */
package com.insurance.service;

import com.insurance.beans.Product;

/**
 * @author 210323
 *
 */
public interface ProductService {

	public String getProductName(String productId);
	public Product getProductInformation(String productId);
}
