package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.API.Categories;

public class CategoriesSteps {

    @Steps
    Categories categories;

    @Given("I set POST api endpoints categories")
    public void setPostApiEndpointsCategories() {
        categories.setPostApiEndpointCategories();
    }
    @Given("I set POST api endpoints categories2")
    public void setPostApiEndpointsInvalid() {
        categories.setPostApiEndpointInvalid2();
    }

    @Given("I set GET api endpoints categories")
    public void setGetApiEndpoints() {
        categories.setGetApiEndpointCategories();
    }
    @Given("I set GET api endpoints categories2")
    public void setGetApiEndpoints2() {
        categories.setGetApiEndpointCategories2();
    }
    @Given("I set GET api endpoints categories3")
    public void setGetApiEndpoints3() {
        categories.setGetApiEndpointCategories3();
    }

    @Given("I set DEL api endpoints categories")
    public void setDelApiEndpoints() {
        categories.setDelApiEndpointCategories();
    }

    @Given("I set DEL api endpoints categories2")
    public void setDelApiEndpoints2() {
        categories.setDelApiEndpointCategories2();
    }

    @When("I send POST HTTP request categories")
    public void sendPostHttpRequestCategories() {
        categories.sendPostHttpRequestCategories();
    }
    @When("I send POST HTTP request categories2")
    public void sendPostHttpRequestCategories2() {
        categories.sendPostHttpRequestCategories2();
    }


    @When("I send GET HTTP request categories")
    public void sentGetHttpRequestCategories() {
        categories.sendGetHttpRequestCategories();
    }

    @When("I send GET HTTP request categories2")
    public void sendGetHttpRequestCategories2() {
        categories.sendGetHttpRequestCategories2();
    }
    @When("I send GET HTTP request categories3")
    public void sendGetHttpRequestCategories3() {
        categories.sendGetHttpRequestCategories3();
    }
    @When("I send GET HTTP request categories4")
    public void sendGetHttpRequestCategories4() {
        categories.sendGetHttpRequestCategories4();
    }

    @When("I send DEL HTTP request categories")
    public void sendDelHttpRequestCategoriesDel() {
        categories.sendDelHttpRequestCategories();
    }

    @When("I send DEL HTTP request categories2")
    public void sendDelHttpRequestCategoriesDel2() {
        categories.sendDelHttpRequestCategories2();
    }
    @Then("I receive valid HTTP response code 200 categories")
    public void receiveValidHttpCode200Categories() {
        categories.receiveValidHttp200Categories();
    }

    @Then("I receive valid HTTP response code 404 categories")
    public void receiveValidHttpCode404Categories() {
        categories.receiveValidHttp404Categories();
    }
    @Then("I receive valid HTTP response code 500 categories")
    public void receiveValidHttpCode500Categories() {
        categories.receiveValidHttp500Categories();
    }}