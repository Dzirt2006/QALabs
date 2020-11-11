package theInternet.pages;

import org.openqa.selenium.WebDriver;

import frameworks.ChromeDownloader;

public class FileDownloader extends ChromeDownloader {
	String direction = "/download";
	String logoXPath = "//div[@id='content']//a[@href='download/logo.png']";// why logo? because logo always on the page
																			// even after restart server ,it's a base file;

	public FileDownloader(String url, WebDriver driver) {
		super(url, driver);
	}

	public FileDownloader navigateTo() {
		super.navigateTo(direction);
		return this;
	}

	public FileDownloader downloadLogo() {
		waitVisibility(driver, logoXPath).click();
		System.out.println("done");
		return this;
	}

	public boolean checkDownload() {
		return fileLoaded();
	}

}
