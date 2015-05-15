package Crawling;

import dataUtil.Item;

public class Net {
	private String name;
	private double minPrice;
	private double maxPrice;
	private String[] inclusiveKeys;
	private String[] exclusiveKeys;
	
	public void setName(String _what){
		name = _what;
	}
	
	public void setMinPrice(double min){
		minPrice = min;
	}
	
	public void setMacPrice(double max){
		maxPrice = max;
	}
	
	public void setInclusiveKeys(String[] keys){
		inclusiveKeys = keys;
	}
	
	public void setExclusiveKeys(String[] keys){
		exclusiveKeys = keys;
	}
	
	public boolean check (Item item){
		double price = Double.parseDouble(item.getPrice());
		if (( price < minPrice) || (price > maxPrice)){
			return false;
		}
		
		return true;
	}


}
