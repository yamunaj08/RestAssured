package com.Services;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Createuser {

	private String postURL = "https://petstore.swagger.io/v2/user/createWithList";
	Response response;

	@Test
	public void sendCreateUserRequest() {
		HashMap<String, String> JsonBody = new HashMap<String, String>();
		JsonBody.put("username", "Jemmimah12");
		JsonBody.put("firstName", "Jemmimah");
		JsonBody.put("lastName", "Rodirgues");
		JsonBody.put("email", "Jemmi@gamil.com");
		JsonBody.put("password", "Jemmimah12@$");
		JsonBody.put("phone", "9087654321");
		response = RestAssured.given().contentType("application/json").body(JsonBody).when().post(postURL);

		System.out.println(response.asPrettyString());
		System.out.println(response.statusCode());
		System.out.println(response.jsonPath().getString("message"));

	}

}
