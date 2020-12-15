package test;

import java.util.HashMap;
import java.util.Map;

public class PriceQuantityCalculator {

	private static Map<String,Integer> itemQuantityMap = new HashMap<String,Integer>();
	private static Map<String,Double> itemPriceMap = new HashMap<String,Double>();
	
	// collects the number of units of each item
	public void getItemQuantity(String name, int quantity)
	{
		for(Map.Entry<String, Integer> map : itemQuantityMap.entrySet())
		{
			if(map.getKey().contains(name))
			{
				map.setValue(map.getValue()+quantity);
			}
			else
			{
				itemQuantityMap.put(map.getKey(), map.getValue());
			}
		}
	}
	// collects price of a single unit of each item 
	public void getItemPrice(String name, double price)
	{
		for(Map.Entry<String, Double> map : itemPriceMap.entrySet())
		{
			if(map.getKey().contains(name))
			{
				// do nothing
			}
			else
			{
				itemPriceMap.put(map.getKey(), map.getValue());
			}
		}
	}
	// calculates the price of basket
	public double getBasketPrice(Map<String,Integer> itemQuantityMap, Map<String,Double> itemPriceMap)
	{
		double finalPrice = 0;
		for(Map.Entry<String, Integer> map : itemQuantityMap.entrySet())
		{
			finalPrice = finalPrice + map.getValue() * itemPriceMap.get(map.getKey());
		}
		return finalPrice;
	}
}
