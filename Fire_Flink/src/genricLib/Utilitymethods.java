package genricLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * @author Apoorva
 * 
 */

public class Utilitymethods {
	/**
	 * 
	 * @param path you have pass path of the prop.. file
	 * @param key you have to pass key value of the URL
	 * @return String
	 * @throws IOException
	 */
	
	public String readingDataFromPropFile(String path,String key) throws IOException {
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}

}
