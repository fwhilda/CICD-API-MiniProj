package starter.API;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class Categories {
    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoints categories")
    public String setPostApiEndpointCategories() {return url + "categories";}
    @Step("I set POST api endpoints categories2")
    public String setPostApiEndpointInvalid2() {return url + "categorie";}
    @Step("I set GET api endpoints categories")
    public String setGetApiEndpointCategories() {
        return url + "categories";
    }
    @Step("I set GET api endpoints categories2")
    public String setGetApiEndpointCategories2() {
        return url + "categories/11293";
    }
    @Step("I set GET api endpoints categories3")
    public String setGetApiEndpointCategories3() {
        return url + "categorie";
    }

    @Step("I set DEL api endpoints categories")
    public String setDelApiEndpointCategories() {
        return url + "categories/1";
    }

    @Step("I set DEL api endpoints categories2")
    public String setDelApiEndpointCategories2() {
        return url + "categories/-1";
    }

    @Step("I send POST HTTP request categories")
    public void sendPostHttpRequestCategories() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Gaming");
        requestBody.put("description", "For gaming purposes");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointCategories());
    }
    @Step("I send POST HTTP request categories2")
    public void sendPostHttpRequestCategories2() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Gaming");
        requestBody.put("description", "For gaming purposes");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointInvalid2());
    }

    @Step("I send GET HTTP request categories")
    public void sendGetHttpRequestCategories() {
        SerenityRest.given().get(setGetApiEndpointCategories());
    }

    @Step("I send GET HTTP request categories2")
    public void sendGetHttpRequestCategories2() {
        SerenityRest.given().get(setGetApiEndpointCategories());
    }
    @Step("I send GET HTTP request categories3")
    public void sendGetHttpRequestCategories3() {
        SerenityRest.given().get(setGetApiEndpointCategories2());
    }
    @Step("I send GET HTTP request categories4")
    public void sendGetHttpRequestCategories4() {
        SerenityRest.given().get(setGetApiEndpointCategories3());
    }

    @Step("I send DEL HTTP request categories")
    public void sendDelHttpRequestCategories() {
        SerenityRest.given().delete(setDelApiEndpointCategories());
    }

    @Step("I send DEL HTTP request categories2")
    public void sendDelHttpRequestCategories2() {
        SerenityRest.given().delete(setDelApiEndpointCategories2());
    }

    @Step("I receive valid HTTP response code 200 categories")
    public void receiveValidHttp200Categories() {
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid HTTP response code 404 categories")
    public void receiveValidHttp404Categories() {
        restAssuredThat(response -> response.statusCode(404));
    }
    @Step("I receive valid HTTP response code 500 categories")
    public void receiveValidHttp500Categories() {
        restAssuredThat(response -> response.statusCode(500));
    }
}
