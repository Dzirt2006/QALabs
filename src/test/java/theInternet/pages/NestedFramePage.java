package theInternet.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import frameworks.BasePage;
import frameworks.ElementSearchers;
import frameworks.IFrameManipulations;

public class NestedFramePage extends BasePage implements IFrameManipulations, ElementSearchers {
	String direction = "/nested_frames";
	WebElement iframeInput;
	String tag = "frame";
	List<WebElement> mainPageFrames;

	public NestedFramePage(String url, WebDriver driver) {
		super(url, driver);
	}

	public NestedFramePage navigateTo() {
		super.navigateTo(direction);
		return this;
	}

//	@FindBy(how = How.TAG_NAME, tagName = "frame")
//	List<WebElement> mainPageFrames;;

	public NestedFramePage selectAllFrames() {
		mainPageFrames = elementsByTag(tag, driver);
		return this;
	}

	public int getToTalFramesAmount() {
		int count = 0;
		switchToIFrame(mainPageFrames.get(0), driver);// go to top frame
		count += elementsByTag(tag, driver).size();
		switchBackToParent(driver);// go to parent window
		count += mainPageFrames.size() - 1;
		return count;
	}

	public NestedFramePage switchToTopFrame() {
		switchToIFrame(mainPageFrames.get(0), driver);
		return this;
	}

	public NestedFramePage switchToMainPage() {
		switchBackToMainParent(driver);
		return this;
	}

	public NestedFramePage switchToBottomFrame() {
		switchToIFrame(mainPageFrames.get(0), driver);
		return this;
	}

}
