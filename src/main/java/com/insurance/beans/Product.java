/**
 * 
 */
package com.insurance.beans;

import org.springframework.stereotype.Component;

/**
 * @author 210323
 *
 */
@Component
public class Product {
	
	private String productId;
	private String productName;
	private String productType;
	private String price;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}
