/**
 * 
 */
package com.mycompany.basket_price;

import java.util.List;

import com.mycompany.basket_price.model.BasketItemStoreFactory;
import com.mycompany.basket_price.model.SpecialOffer;
import com.mycompany.basket_price.model.SpecialOfferBuy2Get1HalfPrice;
import com.mycompany.basket_price.model.SpecialOfferDiscount;

/**
 * This is a Singleton
 * 
 * A store entity. For this application there is only one store
 * 
 * @author colin
 *
 */
public class PriceBasketApplicationStore {

	private static PriceBasketApplicationStore INSTANCE;
	
	private BasketItemStoreFactory storeFactory;
	private List<SpecialOffer> specialOffersInStore; //this week
	
	private PriceBasketApplicationStore(){
		// Singleton Design Pattern implementation
		storeFactory = new BasketItemStoreFactory();
		configureSpecialOffersInStoreIntoSystem();
	}
	
	private void configureSpecialOffersInStoreIntoSystem(){
		
		//TODO: use a better way to associate items with SpecialOffers
		
		specialOffersInStore.add(new SpecialOfferDiscount(10.0, 
				storeFactory.getBasketItem("Apples")));
		
		specialOffersInStore.add(new SpecialOfferBuy2Get1HalfPrice(
				storeFactory.getBasketItem("Soup"),
				storeFactory.getBasketItem("Bread")));
		
	}
	
	/**
	 * 
	 * @return
	 */
	public static PriceBasketApplicationStore getInstance(){
		if(INSTANCE == null){
			INSTANCE = new PriceBasketApplicationStore();
		}
		return INSTANCE;
	}
	
	public BasketItemStoreFactory getFactory(){
		return storeFactory;
	}
	
	public List<SpecialOffer> getStoreSpecialOffers(){
		return specialOffersInStore;
	}
	
	
}
