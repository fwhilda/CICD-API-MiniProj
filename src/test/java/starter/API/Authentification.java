package starter.API;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Authentification {
    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoints register") public String setPostApiEndpointRegister() {return url + "auth/register";}
    @Step("I set POST api endpoints register2") public String setPostApiEndpointRegister2() {return url + "auth/regist";}
    @Step("I set GET api endpoints register")
    public String setGetApiEndpointRegister() {
        return url + "auth/register";
    }
    @Step("I set POST api endpoints login")
    public String setPostApiEndpointLogin() {return url + "auth/login";}
    @Step("I set POST api endpoints login2")
    public String setPostApiEndpointLogin2() {return url + "auth/log";}
    @Step("I set GET api endpoints login")
    public String setGetApiEndpointLogin() {
        return url + "auth/login";
    }
    @Step("I send POST HTTP request register")
    public void sendPostHttpRequestRegister() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "whilyy1@gmail.com");
        requestBody.put("password", "123456");
        requestBody.put("fullname", "Whilda Fauziah");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
    }

    @Step("I send POST HTTP request register2")
    public void sendPostHttpRequestRegister2() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", " ");
        requestBody.put("password", "123456");
        requestBody.put("fullname", "Whilda Fauziah");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());}

    @Step("I send POST HTTP request register3")
    public void sendPostHttpRequestRegister3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "whilyy@gmail.com");
        requestBody.put("password", "");
        requestBody.put("fullname", "Whilda Fauziah");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());}

    @Step("I send POST HTTP request register4")
    public void sendPostHttpRequestRegister4() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "fwhilda@students.unnes.ac.id");
        requestBody.put("password", "123456");
        requestBody.put("fullname", "Whilda Fauziah");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());}

    @Step("I send POST HTTP request register5")
    public void sendPostHttpRequestRegister5() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "wilyyy@gmail.com");
        requestBody.put("password", "123456");
        requestBody.put("fullname", "Whilda Fauziah");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister2());}
    @Step("I send GET HTTP request register")
    public void sendGetHttpRequestRegister() {SerenityRest.given().get(setGetApiEndpointRegister());}

    @Step("I send POST HTTP request login")
    public void sendPostHttpRequestLogin() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "whily@gmail.com");
        requestBody.put("password", "123456");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());}
    @Step("I send POST HTTP request login1")
    public void sendPostHttpRequestLogin1() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", " whily@gmail.com");
        requestBody.put("password", "123456");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());}
    @Step("I send POST HTTP request login2")
    public void sendPostHttpRequestLogin2() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "whily@gmail.com");
        requestBody.put("password", "123456**");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());}
    @Step("I send POST HTTP request login3")
    public void sendPostHttpRequestLogin3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "whily@gmail.com");
        requestBody.put("password", "12345");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());}
    @Step("I send POST HTTP request login4")
    public void sendPostHttpRequestLogin4() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "whily22@gmail.com");
        requestBody.put("password", "123456");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());}
    @Step("I send POST HTTP request login5")
    public void sendPostHttpRequestLogin5() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", " ");
        requestBody.put("password", " ");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin());}
    @Step("I send POST HTTP request login6")
    public void sendPostHttpRequestLogin6() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "whily@gmail.com");
        requestBody.put("password", "123456");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointLogin2());}
    @Step("I send GET HTTP request login")
    public void sendGetHttpRequestLogin() {SerenityRest.given().get(setGetApiEndpointLogin());}
    @Step("I receive valid HTTP response code 200 Authentification")
    public void receiveValidHttp200Authentification() {restAssuredThat(response -> response.statusCode(200));}
    @Step("I receive valid HTTP response code 400 login")
    public void receiveValidHttp400Authentification() {restAssuredThat(response -> response.statusCode(400));}
    @Step("I receive valid HTTP response code 404 login")
    public void receiveValidHttp404Authentification() {restAssuredThat(response -> response.statusCode(404));}
    @Step("I receive valid HTTP response code 405 login")
    public void receiveValidHttp405Authentification() {restAssuredThat(response -> response.statusCode(405));}
}
