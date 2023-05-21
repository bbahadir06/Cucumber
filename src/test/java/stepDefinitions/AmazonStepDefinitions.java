package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {


    @Given("user goes to anazon webpage")
    public void user_goes_to_anazon_webpage() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));


    }
    @Then("user searches for Nutella in search box")
    public void user_searches_for_nutella_in_search_box() {

       AmazonPage  amazonPage = new AmazonPage();

    }
    @Then("tests that result text contains Nutella word")
    public void tests_that_result_text_contains_nutella_word() {

    }
    @Then("closes the page")
    public void closes_the_page() {

    }









}
