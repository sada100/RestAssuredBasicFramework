package com.restassureddemo;

import io.restassured.path.json.JsonPath;

public class JasonDemo {
	public static void main(String[] args) {
		
		String body="{\r\n"
				+ "    \"healthPlanServiceAreaId\": 0,\r\n"
				+ "    \"stateAbbreviation\": \"AK\",\r\n"
				+ "    \"healthPlanId\": 20222,\r\n"
				+ "    \"county\": \"DANE\",\r\n"
				+ "    \"zipCode\": \"57274\",\r\n"
				+ "    \"planYear\": \"2026\",\r\n"
				+ "    \"healthSystemId\": 106\r\n"
				+ "}";
		
		JsonPath jsonpath=new JsonPath(body);
		//here we are verifying the actual object string
		//i.e.if i want to check county is correct or not
		//will read the json path objet value & will compare it 
		//for e.g.:-
		String county=jsonpath.getString("county");
		if(county.equals("DANE")) {
			System.out.println("Json County is mathching with expected County");
		}
		//System.out.println(jsonpath.getString("county"));
		//System.out.println(jsonpath.getInt("healthSystemId"));
		
	}

}
