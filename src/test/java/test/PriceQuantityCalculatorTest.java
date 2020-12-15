package test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class PriceQuantityCalculatorTest {
	
	Map<String,Integer> itemQuantityMap = new HashMap<String,Integer>();
	Map<String,Double> itemPriceMap = new HashMap<String,Double>();
	
	PriceQuantityCalculator priceQuantityCalculator = new PriceQuantityCalculator();
	
	@Before
	public void init()
	{
		itemQuantityMap.put("Apples", 3);
		itemQuantityMap.put("Oranges", 10);
		
		
		itemPriceMap.put("Apples", 0.5);
		itemPriceMap.put("Oranges", 0.25);

	}

	@Test
	public void testGetBasketPrice()
	{
		
		assertEquals(3.25, priceQuantityCalculator.getBasketPrice(itemQuantityMap, itemPriceMap),2);
		
	}
}
