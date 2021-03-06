/*
 * |-------------------------------------------------
 * | Copyright © 2015 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.basket_price.model;

import java.util.HashMap;
import java.util.Map;

/**
 * A basket of items 
 * 
 * @author colin
 *
 */
public class PriceBasket {

	// map of items in basket and how many of each item
	private Map<BasketItem, Integer> basketItems = null;
	
	/**
	 * Constructor
	 */
	public PriceBasket(){
		basketItems = new HashMap<>();
	}
	
	/**
	 * Puts an item into the basket
	 * 
	 * If there is already the same item in basket then increment the 
	 * quantity number
	 * 
	 * @param item to put in basket
	 */
	public void putItemInBasket(BasketItem newItem){
		
		for(BasketItem item : basketItems.keySet()){
			if(item.getItemName().equals(newItem.getItemName())){
				basketItems.put(item, basketItems.get(item).intValue()+1);
				return;
			}
		}
		
		basketItems.put(newItem, 1); 
		
	}
	
	/**
	 * Gets all the items in basket with the quantity
	 * 
	 * @return a map of items and their quantity in basket 
	 */
	public Map<BasketItem, Integer> getBasketItems(){
		return basketItems;
	}
	
	/**
	 * Checks whether the basket contains a particular item
	 * 
	 * @param item the item to search for
	 * @return true if it does false otherwise
	 */
	public boolean basketContainItem(BasketItem item){
		
		for(BasketItem basketItem : basketItems.keySet()){
			if(basketItem.getItemName().equals(item.getItemName())){
				return true;
			}
		}
		
		return false;
		
	}
}
