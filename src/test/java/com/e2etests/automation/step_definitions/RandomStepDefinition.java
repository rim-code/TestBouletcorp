package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.RandomPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RandomStepDefinition {

	private RandomPage randomPage;

	public RandomStepDefinition() {
		this.randomPage = new RandomPage();
	}

	@Given("Je me connect a l application  bouletcorp {string}")
	public void jeMeConnectALApplicationBouletcorp(String urlApplication) {
		randomPage.goToUrl(urlApplication);
	}

	@When("Je clique sur le menu aleatoire")
	public void jeCliqueSurLeMuniAleatoire() {
		randomPage.clickOnLinkAleatoire();
	}

	@Then("Je me redirige vers une page {string}")
	public void jeMeRedirigeVersUnePage(String textTitle) {
		String actualTitle = Setup.driver.getTitle();
		Assert.assertTrue(actualTitle.contains(textTitle));
	}

	@Then("Je verifie que Le widget facebook est affiche")
	public void jeVerifieQueLeWidgetFacebookEstAffiche() {
		randomPage.verifyWidget(RandomPage.imgFacebook);
	}

	@Then("Je verifie que Le widget twitter est affiche")
	public void jeVerifieQueLeWidgetTwitterEstAffiche() {
		randomPage.verifyWidget(RandomPage.imgTwitter);
	}

	@Then("Je verifie que Le widget Tumblr est affiche")
	public void jeVerifieQueLeWidgetTumblrEstAffiche() {
		randomPage.verifyWidget(RandomPage.imgTumblr);
	}

}
