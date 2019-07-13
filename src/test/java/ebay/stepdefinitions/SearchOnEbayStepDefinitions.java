package ebay.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ebay.navigation.NavigateTo;
import ebay.search.SearchFor;
import ebay.search.SearchResult;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import net.thucydides.core.annotations.Steps;

public class SearchOnEbayStepDefinitions {
	private AndroidDriver<MobileElement> webDriver;

    @Steps
    NavigateTo navigateTo;

    @Steps
    SearchFor searchFor;

    @Steps
    SearchResult searchResult;

    @Given("^(?:.*) is on Ebay home page")
    public void user_is_on_Ebay_home_page() {
        navigateTo.theEbayHomePage();
    }

    @When("s?he searches for \"(.*)\"")
    public void i_search_for(String term) {
        searchFor.term(term);
    }

    @Then("the amount of results is displayed")
    public void the_amount_of_results_is_displayed() {
		System.out.println("The amount of results is: "+searchResult.amountOfResults());}
}
