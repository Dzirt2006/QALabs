import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.*;

import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Lab1TestNg {
	Lab1Main inst = new Lab1Main();
	ArrayList<String> assets;

	
	/**
	 * Method for reading input from the console
	 * reads only 2 times
	 * @return ArrayList<String>
	 */
	private ArrayList<String> input() {
		ArrayList<String> assets = new ArrayList<String>();
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
	 * Test will pass or fail depends on input data
	 * if input String length less than 3(str.length<3) test will fail 
	 * because mutator(setStr) in class Lab1Main will throws an error and won't initialize the variable 
	 */
	@Test
	public void firstTest() {
		try {
			inst.setStr(assets.get(0));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		} finally {
			Assert.assertEquals(inst.getStr(), assets.get(0));
			assets.remove(0);
		}
	}

	
	/**
	 * does the testNg run test parallel? 
	 */
//	@Test
//	public void secondtTest() {
//		try {
//			inst.setStr(assets.get(0));
//		} catch (StringIndexOutOfBoundsException e) {
//			System.out.println(e);
//		} finally {
//			Assert.assertEquals(inst.getStr(), assets.get(0));
//			assets.remove(0);
//		}
//	}

	@BeforeTest
	public void beforeTest() {
		assets = input();
	}

	@AfterTest
	public void afterTest() {
	}

}
