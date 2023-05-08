package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.API.Hello;
public class HelloSteps {
    @Steps
    Hello hello;

    @Given("I set GET api endpoints hello")
    public void setGetApiEndpointOrder2() {
        hello.setGetApiEndpointHello();
    }
    @Given("I set GET api endpoints hello2")
    public void setGetApiEndpointOrder3() {hello.setGetApiEndpointHello2();}
    @When("I send GET HTTP request hello")
    public void sendGetHttpRequestHello() {
        hello.sendGetHttpRequestHello();
    }
    @When("I send GET HTTP request hello2")
    public void sendGetHttpRequestHello2() {
        hello.sendGetHttpRequestHello2();
    }
    @Then("I receive valid HTTP response code 200 hello")
    public void receiveValidHttp200Hello() {
        hello.receiveValidHttp200Hello();
    }
    @Then("I receive valid HTTP response code 404 hello")
    public void receiveValidHttp401Hello() {
        hello.receiveValidHttp404Hello();
    }
}