import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.util.*;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Lab1TestNg {
	Lab1Main inst = new Lab1Main();
	static ArrayList<String> assets;

	/**
	 * Method for reading input from the console reads only 2 times
	 * 
	 * @return ArrayList<String>
	 */
	private ArrayList<String> input() {
		assets = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("type your data and press enter at ther end");
		String line = scan.nextLine();
		assets.add(line);
		int count = 0;
		while (count < 1) {
			line = scan.nextLine();
			assets.add(line);
			count++;
		}
		scan.close();
		System.out.println("Scanner closed" + assets);
		return assets;
	}

	/**
	 * Tests will pass or fail depends on input data if input String length less
	 * than 3(str.length<3) test will fail because mutator(setStr) in class Lab1Main
	 * will throws an error and won't initialize the variable
	 * 
	 * In examples below 2 approach
	 * - DataProvider
	 * 		we set up a data in object from the ArrayList without any impact on ArrayList
	 * 		and our test will be run through the all data in the DataProvider
	 * 
	 * - dependsOnMethod
	 * 		in this case we are creating 2 tests and second test will be waiting when first will be executed 
	 */

	/**
	 * testS using DataProvider
	 * @return
	 */

	@DataProvider
	public Object[][] sendData() {
		return new Object[][] { { assets.get(0) }, { assets.get(1) } };
	}

	@Test(dataProvider = "sendData")
	public void withProvider(String data) {
		try {
			inst.setStr(data);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		} finally {
			Assert.assertEquals(inst.getStr(), data);
		}
	}

	/**
	 * Same tests using dependsOnMethod
	 * if first test fail, second test(dependsOnMethods first) will be skipped
	 */
	@Test
	public void firstTest() {
		try {
			inst.setStr(assets.get(0));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		} finally {
			Assert.assertEquals(inst.getStr(), assets.get(0));
			assets.remove(0); // remove first element from List
		}
	}

	@Test(dependsOnMethods = "firstTest")
	public void secondtTest() {
		try {
			inst.setStr(assets.get(0));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		} finally {
			Assert.assertEquals(inst.getStr(), assets.get(0));
		}
	}

	@BeforeClass
	public void beforeTest() {
		assets = input();
	}

	@AfterTest
	public void afterTest() {

	}

}
