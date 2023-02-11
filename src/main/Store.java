package main;

import java.util.HashMap;
import java.util.Map;

public class Store {
    //create the map
    private Map<String, Integer> products =new HashMap<String, Integer>() ;
    public Store() {
		products.put("apple", 10);
		products.put("banana", 5);
		products.put("orange", 0);
	}


    public void purchase(String product, int quantity) throws OutOfStockException {
        // Check if the product is available in the store
        if (this.products.get(product)==0){
            // If not, throw an OutOfStockException with a message indicating the product is not available
            throw new OutOfStockException("Product " +product+" not available in store");
        }
        // Check if there is enough stock for the desired quantity
        if (this.products.get(product)<quantity){
        	throw new OutOfStockException("Product " +product+" out of stock");
            // If not, throw an OutOfStockException with a message indicating the product is out of stock
            
        }
    }
}
