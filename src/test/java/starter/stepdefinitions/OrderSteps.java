package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.API.Order;
public class OrderSteps {
    @Steps
    Order order;

    @Given("I set POST api endpoints order")
    public void setPostApiEndpointOrder() {
        order.setPostApiEndpointOrder();
    }
    @Given("I set POST api endpoints order2")
    public void setPostApiEndpointOrder2() {
        order.setPostApiEndpointOrder2();
    }


    @Given("I set GET api endpoints order")
    public void setGetApiEndpointOrder() {order.setGetApiEndpointOrder();}
    @Given("I set GET api endpoints order1")
    public void setGetApiEndpointOrder1() {
        order.setGetApiEndpointOrder1();
    }
    @Given("I set GET api endpoints order2")
    public void setGetApiEndpointOrder2() {
        order.setGetApiEndpointOrder2();
    }
    @Given("I set GET api endpoints order3")
    public void setGetApiEndpointOrder3() {order.setGetApiEndpointOrder3();}

    @When("I send POST HTTP request order")
    public void sentPostHttpRequestOrder() {
        order.sendPostHTTPRequestOrder();
    }
    @When("I send POST HTTP request order2")
    public void sentPostHttpRequestOrder2() {
        order.sendPostHTTPRequestOrder2();
    }
    @When("I send GET HTTP request order")
    public void sendGetHttpRequestOrder() {
        order.sendGetHttpRequestOrder();
    }
    @When("I send GET HTTP request order2")
    public void sendGetHttpRequestOrder2() {
        order.sendGetHttpRequestOrder2();
    }
    @When("I send GET HTTP request order3")
    public void sendGetHttpRequestOrder3() {
        order.sendGetHttpRequestOrder3();
    }
    @When("I send GET HTTP request order4")
    public void sendGetHttpRequestOrder4() {
        order.sendGetHttpRequestOrder4();
    }
    @Then("I receive valid HTTP response code 200 order")
    public void receiveValidHttp200Order() {
        order.receiveValidHttp200Order();
    }
    @Then("I receive valid HTTP response code 404 order")
    public void receiveValidHttp401Order() {
        order.receiveValidHttp404Order();
    }
}