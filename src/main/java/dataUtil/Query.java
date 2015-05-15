package dataUtil;

public class Query {
	public static String quickGen(String town, String item){
		return "https://" + town + ".craigslist.org/search/sss?sort=date&postedToday=1&query=" + item;
	}

}
