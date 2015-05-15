package dataUtil;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Item {
	private String title;
	private String price;
	private String description;
	private String posted;
	private String updated;
	private String url;
	private String[] images;
	private String address;
	private String[] coordinates;
	private String phone;
	
	Item () {};
	
	Item(String _title) {
		title = _title;
	}
	
	Item(String _title, String _price){
		title = _title;
		price = _price;
	}
	
	public String getName(){
		return title;
	}
	public void setName(String _name){
		title = _name;
	}
	
	public String getPrice(){
		return price;
	}
	public void setPrice(String _price){
		price = _price;
	}
	
	public String getDescription(){
		return description;
	}
	public void setDescription(String _desc){
		description = _desc;
	}
	
	public String getPostedDate(){
		return posted;
	}
	public void setPostedDate(String _posted){
		posted = _posted;
	}
	
	public String getUpdatedDate(){
		return updated;
	}
	public void setUpdatedDate(String _updated){
		updated = _updated;
	}
	
	public String getUrl(){
		return url;
	}
	public void setUrl(String _url){
		url = _url;
	}
	
	public String[] getImages(){
		return images;
	}
	public void setImages(String[] _images){
		images = _images;
	}
	
	public String getAddress(){
		return address;
	}
	public void setAddress(String _address){
		address = _address;
	}
	
	public String[] getCoordinates(){
		return coordinates;
	}
	public void setCoordinates(String _coordinates){
		title = _coordinates;
	}
	
	public String getPhone(){
		return phone;
	}
	public void setPhone(String _phone){
		phone = _phone;
	}
	
	
	public void load(String itemUrl) throws IOException{
		Document entry = Jsoup.connect(url).get(); //request item
		
		Item item = new Item();
		
		item.setName(entry.select("title").text()); //item name
		item.setPrice(entry.select("span.price").text()); //item price
		item.setDescription(entry.select("#postingbody").text()); //item description
		
		Elements postingInfo = entry.select("div.postinginfos");
		item.setPostedDate(postingInfo.select("p.postinginfo").get(1).text());//item posted date
		
		item.setUrl(itemUrl); //item url
		
		printItem();
	}
	
	public void printItem(){
		if (this != null) {
			System.out.println(this.getName());
			System.out.print(this.getPrice());
			System.out.println(this.getDescription());
			System.out.println(this.getPostedDate());
			System.out.println();
		}
	}
	
}
