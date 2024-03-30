package workingWithExternalDataRead;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromJsonFile {

	private static final String JSONObject = null;

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsp = new JSONParser();
		FileReader reader = new FileReader("./testData/data.json");

		Object obj = jsp.parse(reader);
		JSONObject jsonObject = (JSONObject) obj;

		String url = (String) jsonObject.get("url");
		// Object firstName = jsonObject.get("firstName");
		String FirstName = (String) jsonObject.get("firstName");
		String Lastname = (String) jsonObject.get("lastName");
		System.out.println(url);
		System.out.println(FirstName);
		System.out.println(Lastname);

		JSONArray addressArray = (JSONArray) jsonObject.get("address");
		for (int i = 0; i < addressArray.size(); i++) {
			JSONObject address = (JSONObject) addressArray.get(i);
			String street = (String) address.get("street");
			String city = (String) address.get("city");
			String state = (String) address.get("state");
			System.out.println(street + "\t" + city + "\t" + state);
		}

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.quit();

	}

}
