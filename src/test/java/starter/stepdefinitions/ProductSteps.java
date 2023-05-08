package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.API.Product;

public class ProductSteps {
    @Steps
    Product product;

    @Given("I set POST api endpoints product")
    public void setPostApiEndpointsProduct() {
        product.setPostApiEndpointProduct();
    }

    @Given("I set GET api endpoints product")
    public void setGetApiEndpointsProduct() {
        product.setGetApiEndpointProduct();
    }

    @Given("I set GET api endpoints product2")
    public void setGetApiEndpointsProduct2() {
        product.setGetApiEndpointProduct2();
    }

    @Given("I set GET api endpoints product3")
    public void setGetApiEndpointsProduct3() {
        product.setGetApiEndpointProduct3();
    }

    @Given("I set GET api endpoints product4")
    public void setGetApiEndpointsProduct4() {
        product.setGetApiEndpointProduct4();
    }

    @Given("I set DEL api endpoints product")
    public void setDelApiEndpointsProduct() {
        product.setDelApiEndpointProduct();
    }

    @Given("I set DEL api endpoints product2")
    public void setDelApiEndpointsProduct2() {
        product.setDelApiEndpointProduct2();
    }

    @Given("I set POST api endpoints rating")
    public void setPostApiEndpointRating() {
        product.setPostApiEndpointRating();
    }

    @Given("I set POST api endpoints rating2")
    public void setPostApiEndpointRating2() {
        product.setPostApiEndpointRating2();
    }

    @Given("I set GET api endpoints rating")
    public void setGetApiEndpointRating() {
        product.setGetApiEndpointRating();
    }

    @Given("I set GET api endpoints rating2")
    public void setGetApiEndpointRating2() {
        product.setGetApiEndpointRating2();
    }
    @Given("I set POST api endpoints comment")
    public void setPostApiEndpointComment() {
        product.setPostApiEndpointComment();
    }
    @Given("I set POST api endpoints comment2")
    public void setPostApiEndpointComment2() {
        product.setPostApiEndpointComment2();
    }
    @Given("I set GET api endpoints comment")
    public void setGetApiEndpointComment() {
        product.setGetApiEndpointComment();
    }

    @Given("I set GET api endpoints comment2")
    public void setGetApiEndpointComment2() {
        product.setGetApiEndpointComment2();
    }

    @When("I send POST HTTP request product")
    public void sendPostHttpRequestProduct() {
        product.sendPostHttpRequestProduct();
    }

    @When("I send POST HTTP request product2")
    public void sendPostHttpRequestProduct2() {
        product.sendPostHttpRequestProduct2();
    }
    @When("I send GET HTTP request product")
    public void sentGetHttpRequestProduct() {
        product.sendGetHttpRequestProduct();
    }
    @When("I send GET HTTP request product2")
    public void sendGetHttpRequestProduct2() {
        product.sendGetHttpRequestProduct2();
    }
    @When("I send GET HTTP request product3")
    public void sendGetHttpRequestProduct3() {
        product.sendGetHttpRequestProduct3();
    }
    @When("I send GET HTTP request product4")
    public void sendGetHttpRequestProduct4() {
        product.sendGetHttpRequestProduct4();
    }
    @When("I send DEL HTTP request product")
    public void sendDelHttpRequestProductDel() {
        product.sendDelHttpRequestProduct();
    }

    @When("I send DEL HTTP request product2")
    public void sendDelHttpRequestProductDel2() {
        product.sendDelHttpRequestProduct2();
    }
    @When("I send POST HTTP request rating")
    public void sentPostHttpRequestRating() {
        product.sendPostHTTPRequestRating();
    }
    @When("I send POST HTTP request rating2")
    public void sendPostHttpRequestRating2() {
        product.sendPostHttpRequestRating2();
    }
    @When("I send GET HTTP request rating")
    public void sendGetHttpRequestRating() {
        product.sendGetHttpRequestRating();
    }

    @When("I send GET HTTP request rating2")
    public void sendGetHttpRequestRating2() {
        product.sendGetHttpRequestRating2();
    }
    @When("I send POST HTTP request comment")
    public void sentPostHttpRequestComment() {
        product.sendPostHTTPRequestComment();
    }
    @When("I send POST HTTP request comment2")
    public void sentPostHttpRequestComment2() {
        product.sendPostHTTPRequestComment2();
    }
    @When("I send GET HTTP request comment")
    public void sendGetHttpRequestComment() {
        product.sendGetHttpRequestComment();
    }

    @When("I send GET HTTP request comment2")
    public void sendGetHttpRequestComment2() {
        product.sendGetHttpRequestComment2();
    }

    @Then("I receive valid HTTP response code 200 product")
    public void receiveValidHttp200Product() {
        product.receiveValidHttp200Product();
    }

    @Then("I receive valid HTTP response code 404 product")
    public void receiveValidHttp400Product() {
        product.receiveValidHttp400Product();
    }

    @Then("I receive valid HTTP response code 500 product")
    public void receiveValidHttp500Product() {
        product.receiveValidHttp500Product();
    }
}