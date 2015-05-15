package Crawling;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import dataUtil.Query;

import java.io.IOException;
import java.util.Arrays;

public class Mining {
	
	public String formSearchQuery(String url, String[] keyWords){
		String query = url + Arrays.toString(keyWords);
		System.out.print(query);
		return query;
	}
	
	public Document start(String town, String type) throws IOException{
		String query = Query.quickGen(town, type);
		Document doc = Jsoup.connect(query).get();
		Elements parts = doc.select("p");
		
		System.out.print(parts.size());
		
		for (Element part : parts){
			//System.out.println(part.text());
			Elements link = part.select("a[href]");
			String url = link.attr("abs:href");
			
			if ((url.indexOf(town)) == -1){
				break;
			}
			
			System.out.println(url);
			
			
			Document entry = Jsoup.connect(url).get();
			String title = entry.select("title").text();
			System.out.println(title);
			String price = entry.select("span.price").text();
			System.out.println(price);
			String desc = entry.select("#postingbody").text();
			System.out.println(desc);
			
			Elements postingInfo = entry.select("div.postinginfos");
			System.out.println(postingInfo.select("p.postinginfo").get(1).text());
			
			/*String posted = entry.select("time").first().text();
			System.out.println(posted);
			String updated = entry.select("time").get(1).text();
			System.out.println(updated);*/
			
			System.out.println();
		}
		
		return doc;
	}

}
