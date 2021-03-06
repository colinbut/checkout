/*
 * |-------------------------------------------------
 * | Copyright © 2015 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.basket_price.model;

import com.mycompany.basket_price.exception.UnknownItemException;
import com.mycompany.basket_price.model.goods.Apples;
import com.mycompany.basket_price.model.goods.Bread;
import com.mycompany.basket_price.model.goods.Milk;
import com.mycompany.basket_price.model.goods.Soup;

/**
 * Using the simple factory pattern
 * 
 * A very naive attempt at the Factory Pattern for creating the 
 * objects of goods
 * 
 * TODO: will fix (if required) later but for now it's sufficient
 * 
 * @author colin
 *
 */
public class BasketItemStoreFactory {

	/**
	 * Simple Factory Pattern
	 * 
	 * TODO: need to enhance/fix later
	 * 
	 * @param itemName
	 * @return
	 */
	public BasketItem getBasketItem(String itemName) throws UnknownItemException{
		
		// maybe replace this with reflection -
		// troll xml file and parse items to build
		
		BasketItem item;
		
		switch(itemName){
			case "Apples" : 
				item = new Apples(); 
				break;
			case "Bread" : 
				item = new Bread();  
				break;
			case "Soup" : 
				item = new Soup(); 
				break;
			case "Milk" : 
				item = new Milk(); 
				break;
			default: 
				throw new UnknownItemException("Invalid item name supplied");
		}
		
		return item;
		
	}
}
