

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import body.bodyinfo;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;



public class Post {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String RS=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(bodyinfo.bdata()).when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo("APP")).body("status",equalTo("OK"))
		.header("Server","Apache/2.4.18 (Ubuntu)").header("Access-Control-Max-Age", "3600").extract().response().asString();
		
		System.out.println(RS);
		
		JsonPath js=new JsonPath(RS);
		String placeid= js.get("place_id");
		System.out.println(placeid);
		
		
		
		
		
		
		
		
		
	}

	

}
