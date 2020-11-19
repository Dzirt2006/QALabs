package theInternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import frameworks.BasePage;
import frameworks.ElementSearchers;

public class FileUploadPage extends BasePage implements ElementSearchers {
	String direction = "/upload";
	String filePath = "/home/alex/eclipse-workspace/theInternel/src/test/resources/UploadSmile.jpg";

	public FileUploadPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public FileUploadPage navigateTo() {
		super.navigateTo(direction);
		return this;
	}

	public FileUploadPage chooseFile() {
		waitVisibilityId(driver, "file-upload").sendKeys(filePath);
		return this;
	}

	public FileUploadPage uploadFile() {
		elementById("file-submit", driver).click();
		return this;
	}

	public boolean checkForUpload() {
		WebElement element = waitVisibilityId(driver, "uploaded-files");
		return element == null ? false : true;
	}

}
