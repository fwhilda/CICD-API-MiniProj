package starter.API;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Order {

    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoints order")
    public String setPostApiEndpointOrder() {return url + "orders";}
    @Step("I set POST api endpoints order2")
    public String setPostApiEndpointOrder2() {return url + "orde";}

    @Step("I set GET api endpoints order")
    public String setGetApiEndpointOrder() {
        return url + "orders";
    }
    @Step("I set GET api endpoints order1")
    public String setGetApiEndpointOrder1() {
        return url + "order";
    }
    @Step("I set GET api endpoints order2")
    public String setGetApiEndpointOrder2() {
        return url + "hello";
    }
    @Step("I set GET api endpoints order3")
    public String setGetApiEndpointOrder3() {
        return url + "hell";
    }

    @Step("I send POST HTTP request order")
    public void sendPostHTTPRequestOrder() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("product_id", 2);
        requestBody.put("quantity", 1);

        SerenityRest.given().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFkaXR5YSBOdWdyYWhhIiwiRW1haWwiOiJhZGl0QGdtYWlsLmNvbSJ9.VM2lARkmmliu1pWtk1uhb8z5fGaElvH1jIoYM72Te3g").get(setPostApiEndpointOrder()).then().statusCode(200);
    }
    @Step("I send POST HTTP request order2")
    public void sendPostHTTPRequestOrder2() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("product_id", 2);
        requestBody.put("quantity", 1);

        SerenityRest.given().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFkaXR5YSBOdWdyYWhhIiwiRW1haWwiOiJhZGl0QGdtYWlsLmNvbSJ9.VM2lARkmmliu1pWtk1uhb8z5fGaElvH1jIoYM72Te3g").get(setPostApiEndpointOrder2()).then().statusCode(404);
    }
    @Step("I send GET HTTP request order")
    public void sendGetHttpRequestOrder() {SerenityRest.given().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFkaXR5YSBOdWdyYWhhIiwiRW1haWwiOiJhZGl0QGdtYWlsLmNvbSJ9.VM2lARkmmliu1pWtk1uhb8z5fGaElvH1jIoYM72Te3g").get(setGetApiEndpointOrder()).then().statusCode(200);}

    @Step("I send GET HTTP request order2")
    public void sendGetHttpRequestOrder2() {
        SerenityRest.given().get(setGetApiEndpointOrder1());
    }
    @Step("I send GET HTTP request order3")
    public void sendGetHttpRequestOrder3() {
        SerenityRest.given().get(setGetApiEndpointOrder2());
    }
    @Step("I send GET HTTP request order4")
    public void sendGetHttpRequestOrder4() {
        SerenityRest.given().get(setGetApiEndpointOrder3());
    }

    @Step("Then I receive valid HTTP response code 404 order")
    public void receiveValidHttp404Order() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I receive valid HTTP response code 200 order")
    public void receiveValidHttp200Order() {
        restAssuredThat(response -> response.statusCode(200));
    }
}