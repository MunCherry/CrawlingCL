package dataUtil;

import java.util.ArrayList;

public class Cart {
	private ArrayList<Item> items;
	
	public Cart(){};
	
	public void addItem(Item item){
		if (item == null) {
			items = new ArrayList<Item>();
			items.add(item);
		} else {
			items.add(item);
		}
	}

}
