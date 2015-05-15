package Crawling;

import java.util.ArrayList;

public class SilkRoad {
	private ArrayList<String> towns;
	public void addTown(String town){
		if (towns == null){
			towns = new ArrayList<String>();
			towns.add(town);
		} else {
			towns.add(town);
		}
	}

}
