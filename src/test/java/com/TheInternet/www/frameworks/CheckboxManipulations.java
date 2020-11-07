package com.TheInternet.www.frameworks;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.TheInternet.www.pages.BasePage;

public class CheckboxManipulations extends BasePage implements ElementSearchers {
	

	public CheckboxManipulations(WebDriver driver, String url) {
		super(url, driver);
	}

	public CheckboxManipulations navigateTo(String url) {
		super.navigateTo(url);
		return this;
	}
	
	/**
	 * code for browser	
	const nodeElements=$x("//form")[0].childNodes 
	const func = (x) => {
	    for (const key in nodeElements) {
	        const data = nodeElements[key].data;
	        if (data) {
	            if(data.trim()===x)return nodeElements[key].previousSibling.checked     
	        }
	    }
	}
	func("checkbox 1")
	 */

	public boolean getCheckedByText(String text) {
		WebElement forms = elementByTag("form", driver);
		String script = "	const nodeElements=arguments[0].childNodes \n"
				+ "	const func = (x) => {\n"
				+ "	    for (const key in nodeElements) {\n"
				+ "	        const data = nodeElements[key].data;\n"
				+ "	        if (data) {\n"
				+ "	            if(data.trim()===x)return nodeElements[key].previousSibling.checked\n"
				+ "	        }\n"
				+ "	    }\n"
				+ "	};"
				+ "return func(`"+text+"`);";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		boolean checked = (boolean) js.executeScript(script, forms);	
		return checked;
	}
	
	public void clickByTextBelow(String text) {
		WebElement forms = elementByTag("form", driver);
		String script = "	const nodeElements=arguments[0].childNodes; \n"
				+ "const funcSwitch = (x) => {\n"
				+ "    for (const key in nodeElements) {\n"
				+ "        const data = nodeElements[key].data;\n"
				+ "        if (data) {\n"
				+ "            if (data.trim() === x) {\n"
				+ "                const node= nodeElements[key].previousSibling \n"
				+ "					node.checked=!node.checked;"
				+ "            }\n"
				+ "        }\n"
				+ "    }\n"
				+ "};"
				+ "return funcSwitch(`"+text+"`);";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script, forms);	
	}

}
