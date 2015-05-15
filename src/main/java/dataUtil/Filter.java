package dataUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Filter {
	public static ArrayList<String> readKeys(String config_file_path) throws IOException{
		ArrayList<String> list = new ArrayList<String>();
		
		for (String line : Files.readAllLines(Paths.get(config_file_path), null)) {
			list.add(line);
		}
		return list;
	}
	
	public static boolean contain(String text, String key){
		if (text.toUpperCase().indexOf(key.toUpperCase()) != -1)
			return true;
		return false;
	}
	
	

}
