package starter.API;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Hello {

    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set GET api endpoints hello")
    public String setGetApiEndpointHello() {
        return url + "hello";
    }
    @Step("I set GET api endpoints hello2")
    public String setGetApiEndpointHello2() {
        return url + "hell";
    }
    @Step("I send GET HTTP request hello")
    public void sendGetHttpRequestHello() {
        SerenityRest.given().get(setGetApiEndpointHello());
    }
    @Step("I send GET HTTP request hello2")
    public void sendGetHttpRequestHello2() {
        SerenityRest.given().get(setGetApiEndpointHello2());
    }

    @Step("Then I receive valid HTTP response code 404 hello")
    public void receiveValidHttp404Hello() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I receive valid HTTP response code 200 hello")
    public void receiveValidHttp200Hello() {
        restAssuredThat(response -> response.statusCode(200));
    }
}