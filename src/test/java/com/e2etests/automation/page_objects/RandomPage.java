package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class RandomPage {

	/* Find Element */

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Aléatoire')]")
	public static WebElement linkAleatoire;

	@FindBy(how = How.XPATH, using = "//*[@id=\"social_network\"]/ul/li[3]/a")

	public static WebElement imgFacebook;

	@FindBy(how = How.XPATH, using = "//*[@id=\"social_network\"]/ul/li[4]/a/img")
	public static WebElement imgTwitter;

	@FindBy(how = How.XPATH, using = "//*[@id=\"social_network\"]/ul/li[5]/a")
	public static WebElement imgTumblr;

	public RandomPage() {
		PageFactory.initElements(Setup.driver, this);
	}

	/* Create Methods */
	public void goToUrl(String url) {
		Setup.driver.get(url);
	}

	public void clickOnLinkAleatoire() {
		linkAleatoire.click();
	}

	public void verifyWidget(WebElement elt) {
		boolean result = elt.isDisplayed();
		if (result) {
			System.out.println("Logo Widget is displayed");
		} else {
			System.out.println("Logo Widget is not  displayed");
		}
	}

	/*
	 * public void verifyWidgetFacebook() { boolean resultFacebook =
	 * imgFacebook.isDisplayed(); if (resultFacebook) {
	 * System.out.println("Logo Facebook is displayed"); } else {
	 * System.out.println("Logo Facebook is not  displayed"); } }
	 * 
	 * public void verifyWidgetTwitter() { boolean resultTwitter =
	 * imgTwitter.isDisplayed(); if (resultTwitter) {
	 * System.out.println("Logo Twitter is displayed"); } else {
	 * System.out.println("Logo Twitter  is not  displayed"); } }
	 * 
	 * public void verifyWidgetTumblr() { boolean resultTumblr =
	 * imgTumblr.isDisplayed(); if (resultTumblr) {
	 * System.out.println("Logo Tumblr is displayed"); } else {
	 * System.out.println("Logo Tumblr is not  displayed"); } }
	 */

}
