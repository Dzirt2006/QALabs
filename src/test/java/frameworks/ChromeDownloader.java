package frameworks;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChromeDownloader extends BasePage implements ElementSearchers, ShadowRootManipulation, ScroolActions {

	public ChromeDownloader(String url, WebDriver driver) {
		super(url, driver);
	}

	public void navigateToDownloads() {
		driver.get("chrome://downloads/");
	}

	/**
	 * In Chrome downloads manager we can check that file is loaded by the button
	 * "Show in folder" this button will exist only after download.
	 * 
	 * Also we can check process of loading through the "Download bar" is it
	 * displayed we are downloading the file
	 * 
	 * In case is "Show in Folder" not exist and "Download bar" is not displayed we
	 * have another buttons "Keep/Discard" or "Resume" in this case we have a
	 * problem with loading
	 * 
	 * @param expandedShadow
	 * @return 1/0
	 */
	private boolean check(WebElement expandedShadow) {
		WebElement downloadBar = getDonwloadBar(expandedShadow);
		while (downloadBar.isDisplayed()) {
			sleep(1000);
			downloadBar = getDonwloadBar(expandedShadow);
		}
		try {
			elementById("show", expandedShadow);
		} catch (NoSuchElementException e) {
			return false;
		}
		return true;
	}

	private WebElement getDonwloadBar(WebElement expandedShadow) {
		return elementById("description", expandedShadow);
	}

	public boolean fileLoaded() {
		navigateToDownloads();
		WebElement dmanager = elementByTag("downloads-manager", driver);
		WebElement dmanagerShadowRoot = expandShadowRoot(driver, dmanager);
		WebElement firstDownload = elementById("frb0", dmanagerShadowRoot); // id=frb0 - first element in the download
																			// list
		WebElement firstDownloadshadowRoot = expandShadowRoot(driver, firstDownload);

		return check(firstDownloadshadowRoot);
	}

}
