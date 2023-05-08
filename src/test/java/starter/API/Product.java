package starter.API;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Product {
    protected String url = "https://altashop-api.fly.dev/api/";


    @Step("I set POST api endpoints product")
    public String setPostApiEndpointProduct() {
        return url + "products";
    }

    @Step("I set GET api endpoints product")
    public String setGetApiEndpointProduct() {
        return url + "products/13680";
    }

    @Step("I set GET api endpoints product2")
    public String setGetApiEndpointProduct2() {
        return url + "products";
    }

    @Step("I set GET api endpoints product3")
    public String setGetApiEndpointProduct3() {
        return url + "products/11";
    }
    @Step("I set GET api endpoints product4")
    public String setGetApiEndpointProduct4() {
        return url + "produc";
    }
    @Step("I set DEL api endpoints product")
    public String setDelApiEndpointProduct() {
        return url + "products/1";
    }

    @Step("I set DEL api endpoints product2")
    public String setDelApiEndpointProduct2() {
        return url + "Products/-1";
    }
    @Step("I set POST api endpoints rating")
    public String setPostApiEndpointRating() {
        return url + "products/13680/ratings";
    }
    @Step("I set POST api endpoints rating2")
    public String setPostApiEndpointRating2() {
        return url + "products/11275/ratings";
    }
    @Step("I set GET api endpoints rating")
    public String setGetApiEndpointRating() {
        return url + "products/11275/ratings";
    }

    @Step("I set GET api endpoints rating2")
    public String setGetApiEndpointRating2() {
        return url + "products/-1111/ratings";
    }
    @Step("I set POST api endpoints comment")
    public String setPostApiEndpointComment() {
        return url + "products/2/comments";
    }
    @Step("I set POST api endpoints comment2")
    public String setPostApiEndpointComment2() {
        return url + "products/-1112/comments";
    }
    @Step("I set GET api endpoints comment")
    public String setGetApiEndpointComment() {
        return url + "products/2/comments";
    }

    @Step("I set GET api endpoints comment2")
    public String setGetApiEndpointComment2() {
        return url + "products/2/comment";
    }

    @Step("I send POST HTTP request product")
    public void sendPostHttpRequestProduct() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "XBOX1");
        requestBody.put("description", "For gaming");
        requestBody.put("price", 499);
        JSONArray categoriesArray = new JSONArray();
        categoriesArray.add(12541);
        requestBody.put("categories", categoriesArray);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointProduct());
    }
    @Step("I send POST HTTP request product2")
    public void sendPostHttpRequestProduct2() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "");
        requestBody.put("description", "");
        requestBody.put("price",11 );
        JSONArray categoriesArray = new JSONArray();
        categoriesArray.add(12541);
        requestBody.put("categories", categoriesArray);

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointProduct());
    }

    @Step("I send GET HTTP request product")
    public void sendGetHttpRequestProduct() {
        SerenityRest.given().get(setGetApiEndpointProduct());
    }

    @Step("I send GET HTTP request product2")
    public void sendGetHttpRequestProduct2() {
        SerenityRest.given().get(setGetApiEndpointProduct2());
    }

    @Step("I send GET HTTP request product3")
    public void sendGetHttpRequestProduct3() {
        SerenityRest.given().get(setGetApiEndpointProduct3());
    }
    @Step("I send GET HTTP request product4")
    public void sendGetHttpRequestProduct4() {
        SerenityRest.given().get(setGetApiEndpointProduct4());
    }
    @Step("I send DEL HTTP request product")
    public void sendDelHttpRequestProduct() {
        SerenityRest.given().delete(setDelApiEndpointProduct());
    }

    @Step("I send DEL HTTP request product2")
    public void sendDelHttpRequestProduct2() {
        SerenityRest.given().delete(setDelApiEndpointProduct2());
    }

    @Step("I send POST HTTP request rating")
    public void sendPostHTTPRequestRating() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("count", 5);

        SerenityRest.given().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFkaXR5YSBOdWdyYWhhIiwiRW1haWwiOiJhZGl0QGdtYWlsLmNvbSJ9.VM2lARkmmliu1pWtk1uhb8z5fGaElvH1jIoYM72Te3g").body(requestBody.toJSONString()).post(setPostApiEndpointRating()).then().statusCode(200);
    }


    @Step("I send POST HTTP request rating2")
    public void sendPostHttpRequestRating2() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("count", 10);

        SerenityRest.given().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFkaXR5YSBOdWdyYWhhIiwiRW1haWwiOiJhZGl0QGdtYWlsLmNvbSJ9.VM2lARkmmliu1pWtk1uhb8z5fGaElvH1jIoYM72Te3g").body(requestBody.toJSONString()).post(setPostApiEndpointRating2()).then().statusCode(500);
    }

    @Step("I send GET HTTP request rating")
    public void sendGetHttpRequestRating() {
        SerenityRest.given().get(setGetApiEndpointRating());
    }

    @Step("I send GET HTTP request rating2")
    public void sendGetHttpRequestRating2() {
        SerenityRest.given().get(setGetApiEndpointRating2());
    }
    @Step("I send POST HTTP request comment")
    public void sendPostHTTPRequestComment() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("content", "the games are great including Gran Turismo 7 but sadly GT4 is much better");

        SerenityRest.given().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFkaXR5YSBOdWdyYWhhIiwiRW1haWwiOiJhZGl0QGdtYWlsLmNvbSJ9.VM2lARkmmliu1pWtk1uhb8z5fGaElvH1jIoYM72Te3g").body(requestBody.toJSONString()).post(setPostApiEndpointComment()).then().statusCode(200);
    }
    @Step("I send POST HTTP request comment2")
    public void sendPostHTTPRequestComment2() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("content", "the games are great including Gran Turismo 7 but sadly GT4 is much better");

        SerenityRest.given().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkFkaXR5YSBOdWdyYWhhIiwiRW1haWwiOiJhZGl0QGdtYWlsLmNvbSJ9.VM2lARkmmliu1pWtk1uhb8z5fGaElvH1jIoYM72Te3g").body(requestBody.toJSONString()).post(setPostApiEndpointComment2()).then().statusCode(500);
    }

    @Step("I send GET HTTP request comment")
    public void sendGetHttpRequestComment() {
        SerenityRest.given().get(setGetApiEndpointComment());
    }

    @Step("I send GET HTTP request comment2")
    public void sendGetHttpRequestComment2() {
        SerenityRest.given().get(setGetApiEndpointComment2());
    }
    @Step("I receive valid HTTP response code 200 product")
    public void receiveValidHttp200Product() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid HTTP response code 500 product")
    public void receiveValidHttp500Product() {
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("I receive valid HTTP response code 404 product")
    public void receiveValidHttp400Product() {
        restAssuredThat(response -> response.statusCode(404));
    }
}