/*
 * |-------------------------------------------------
 * | Copyright © 2015 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.basket_price.model.goods;

import java.math.BigDecimal;

import com.mycompany.basket_price.model.PricedBasketItem;

/**
 * Soups
 * 
 * @author colin
 *
 */
public class Soup extends PricedBasketItem{

	/**
	 * Constructor
	 */
	public Soup() {
		setItemName(this.getClass().getSimpleName());
		setPrice(new BigDecimal(0.65));
	}

}
