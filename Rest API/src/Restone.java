import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import body.bodyinfo;
import body.data;


public class Restone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Post Place	
		
	RestAssured.baseURI="https://rahulshettyacademy.com";
	String Response = given().queryParam("key", "qaclick123").header("Content-Type", "application/json")
	.body(data.info())
	.when().post("maps/api/place/add/json")
	
	.then().assertThat().statusCode(200).body("scope", equalTo("APP")).header("Server","Apache/2.4.18 (Ubuntu)")
	.extract().response().asString();
	
	System.out.println(Response);
	
	JsonPath js=new JsonPath(Response);
	String PlaceID= js.get("place_id");
	System.out.println(PlaceID);
	
	//update Place
	given().queryParam("key", "qaclick123").header("Content-Type", "application/json")
	.body("{\r\n" + 
			"\"place_id\":\""+PlaceID+"\",\r\n" + 
			"\"address\":\"80 Summer walk, SA\",\r\n" + 
			"\"key\":\"qaclick123\"\r\n" + 
			"}")
	.when().put("maps/api/place/update/json")
	.then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
	
	
	//Get place
	String newAdress="80 Summer walk, SA";
	
	String placeresponse = given().queryParam("key", "qaclick123").queryParam("place_id", PlaceID)
	.when().get("maps/api/place/get/json")
	.then().log().all().assertThat().statusCode(200).body("name", equalTo("Pooja house")).extract().response().asString();
		
	JsonPath nd=new JsonPath(placeresponse); 
	String addr= nd.get("address");
	System.out.println(addr);
	
	
		
	}

}
