package dataUtil;

import java.util.ArrayList;

public class Place {
	private ArrayList<String> visistingTowns = new ArrayList<String>();
	public static ArrayList<String> quickTowns(){
		ArrayList<String> towns =new  ArrayList<String>();
		towns.add("blacksburg");
		towns.add("roanoke");
		towns.add("lynchburg");
		//towns.add("winstonsalem");
		//towns.add("swv");
	    //towns.add("greensboro");
	    return towns;
	}

}
