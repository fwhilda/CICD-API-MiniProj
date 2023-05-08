package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.API.Authentification;

public class AuthentificationSteps {
    @Steps
    Authentification authentification;
    @Given("I set POST api endpoints register")
    public void setPostApiEndpointsRegister() {
        authentification.setPostApiEndpointRegister();
    }
    @Given("I set POST api endpoints register2")
    public void setPostApiEndpointsRegister2() {
        authentification.setPostApiEndpointRegister2();
    }
    @Given("I set GET api endpoints register")
    public void setGetApiEndpointsRegister() {
        authentification.setGetApiEndpointRegister();
    }
    @Given("I set POST api endpoints login")
    public void setPostApiEndpointsLogin() {
        authentification.setPostApiEndpointLogin();
    }
    @Given("I set POST api endpoints login2")
    public void setPostApiEndpointsLogin2() {
        authentification.setPostApiEndpointLogin2();
    }
    @Given("I set GET api endpoints login")
    public void setGetApiEndpointsLogin() {
        authentification.setGetApiEndpointLogin();
    }

    @When("I send POST HTTP request register")
    public void sendPostHttpRequestRegister() {
        authentification.sendPostHttpRequestRegister();
    }

    @When("I send POST HTTP request register2")
    public void sendPostHttpRequestRegister2() {
        authentification.sendPostHttpRequestRegister2();
    }

    @When("I send POST HTTP request register3")
    public void sendPostHttpRequestRegister3() {
        authentification.sendPostHttpRequestRegister3();
    }

    @When("I send POST HTTP request register4")
    public void sendPostHttpRequest4() {
        authentification.sendPostHttpRequestRegister4();
    }

    @When("I send POST HTTP request register5")
    public void sendPostHttpRequest5() {
        authentification.sendPostHttpRequestRegister5();
    }
    @When("I send GET HTTP request register")
    public void sendGetHttpRequestRegister() {
        authentification.sendGetHttpRequestRegister();
    }
    @When("I send POST HTTP request login")
    public void sendPostHttpRequestLogin() {
        authentification.sendPostHttpRequestLogin();
    }

    @When("I send POST HTTP request login1")
    public void sendPostHttpRequestLogin1() {
        authentification.sendPostHttpRequestLogin1();
    }

    @When("I send POST HTTP request login2")
    public void sendPostHttpRequestLogin2() {
        authentification.sendPostHttpRequestLogin2();
    }
    @When("I send POST HTTP request login3")
    public void sendPostHttpRequestLogin3() {
        authentification.sendPostHttpRequestLogin3();
    }

    @When("I send POST HTTP request login4")
    public void sendPostHttpRequestLogin4() {
        authentification.sendPostHttpRequestLogin4();
    }

    @When("I send POST HTTP request login5")
    public void sendPostHttpRequestLogin5() {
        authentification.sendPostHttpRequestLogin5();
    }
    @When("I send POST HTTP request login6")
    public void sendPostHttpRequestLogin6() {
        authentification.sendPostHttpRequestLogin6();
    }
    @When("I send GET HTTP request login")
    public void sendGetHttpRequestLogin() {
        authentification.sendGetHttpRequestLogin();
    }
    @Then("I receive valid HTTP response code 200 Authentification")
    public void receiveValidHttpAuthentification() {authentification.receiveValidHttp200Authentification();
    }

    @Then("I receive valid HTTP response code 400 Authentification")
    public void receiveValidHttp400Authentification() {
        authentification.receiveValidHttp400Authentification();
    }
    @Then("I receive valid HTTP response code 404 Authentification")
    public void receiveValidHttp404Authentification() {
        authentification.receiveValidHttp404Authentification();
    }
    @Then("I receive valid HTTP response code 405 Authentification")
    public void receiveValidHttp405Authentification() {
        authentification.receiveValidHttp405Authentification();
    }
}
