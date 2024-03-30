package workingWithExternalDataRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToReadDatafromPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		//Step1: Create obj file
		File file=new File("./testData/data.properties");
		
		//step2 :FIS obj
		FileInputStream fis=new FileInputStream(file);

		//step3: Prop obj
		Properties prop=new Properties();
		
		prop.load(fis);
		
		System.out.println(prop.get("url"));
		System.out.println(prop.get("company"));
		
	}

}
