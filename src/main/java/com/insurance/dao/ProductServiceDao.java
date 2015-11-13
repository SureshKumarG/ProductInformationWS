/**
 * 
 */
package com.insurance.dao;

import com.insurance.beans.Product;

/**
 * @author 210323
 *
 */
public interface ProductServiceDao {
	
	public String getProoductName(String productId);
	public Product getProductInformation(String productId);

}
