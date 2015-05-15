package munchery.mining.munchery_app;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import dataUtil.DiggingItem;
import dataUtil.Place;
import dataUtil.Query;
import Crawling.Mining;

public class CrawllingCL {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Document doc;
		Mining miningCl = new Mining();
		
		ArrayList<String> places = Place.quickTowns();
		ArrayList<String> searching = DiggingItem.quickItems();
		
		for (String place : places){
			System.out.print("----------Results from : ");
			System.out.print(place);
			System.out.println("   -------------------");
			for (String searchingType : searching) {
				System.out.println(searchingType);
				doc = miningCl.start(place, searchingType);
			}
		}
	}

}
