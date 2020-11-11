package theInternet.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import frameworks.ChromeDownloader;

public class FileDownloader extends ChromeDownloader {
	String direction = "/download";
	List<WebElement> anchors; // even after restart server ,it's a base file;

	public FileDownloader(String url, WebDriver driver) {
		super(url, driver);
	}

	public FileDownloader navigateTo() {
		super.navigateTo(direction);
		return this;
	}

	public FileDownloader getListofAnchors() {
		anchors = elementsByTag("a", driver);
		anchors.remove(0);//first <a> is empty
		return this;
	}

	public FileDownloader downloadElement(int index) {
		WebElement anchor = null;
		try {
			anchor = anchors.get(index);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Wrong index. Total amout of anchors is: " + anchors.size());
			super.disconnect();
			System.exit(0);
		}
		anchor.click();
		return this;
	}

	public boolean checkDownload() {
		return fileLoaded();
	}

}
