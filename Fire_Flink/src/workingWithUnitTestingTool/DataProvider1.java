package workingWithUnitTestingTool;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	@DataProvider(name = "testData")
	public String[][] getData() {
		String[][] data = new String[2][5];
		data[0][0] = "Apoorva";
		data[0][1] = "Magalore";
		data[0][2] = "a123";
		data[0][3] = "a2334";
		data[0][4] = "987654321";

		data[1][0] = "Mangalore";
		data[1][1] = "Apoorva";
		data[1][2] = "a123";
		data[1][3] = "a2334";
		data[1][4] = "987654321";

		return data;
	}

	@Test(dataProvider = "testData")
	public void getDemo(String[] regdata) {
		System.out.println(regdata[0]);
		System.out.println(regdata[1]);
		System.out.println(regdata[2]);
		System.out.println(regdata[3]);
		System.out.println(regdata[4]);

	}
}
