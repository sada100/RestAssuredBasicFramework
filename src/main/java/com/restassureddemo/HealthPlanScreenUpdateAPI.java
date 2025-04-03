package com.restassureddemo;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class HealthPlanScreenUpdateAPI {
	
	public static void main(String[] args) {
		
		/*
		 * Http Method: Post
		 * URL : "https://healthplans-int-api.qat-phynd.com/HealthPlanServiceArea"
		 * Body:  {
		           "healthSystemId": 106,
                   "healthPlanId": 20210,
                   "planYear": "2024",
                   "stateAbbreviation": "GA",
                   "county": "Clayton",
                    "zipCode": "20014",
                   "createdDataSourceId": 78
                   }
		 * 
		 */
		
		/*
		 * Below Operation we used for the Crating the new Health plan Service 
		 * using API i.e. using POST method of an API
		 */
		
		//given()
		//.contentType(ContentType.JSON)
	   // .header("Authorization","b2k2MSwiZXhwIjoxNzM2MDI4NzYxLCJpc3MiOiJTeW1wbHJBdWRpZW5jZS1xYXQiLCJhdWQiOiJTeW1wbHJJc3N1ZXItcWF0In0.xYzzBeevMR8Aup4EAFSrN8tuoQ8rrugmA9R0L7M41bs")
		//.body("{\r\n"
		//		+ "		           \"healthSystemId\": 106,\r\n"
		//		+ "                   \"healthPlanId\": 20222,\r\n"
		//		+ "                   \"planYear\": \"2024\",\r\n"
		//		+ "                   \"stateAbbreviation\": \"GA\",\r\n"
		//		+ "                   \"county\": \"Clayton\",\r\n"
		//		+ "                    \"zipCode\": \"2014\",\r\n"
		//		+ "                   \"createdDataSourceId\": 78\r\n"
		//		+ "                   }")
		//.log().all()
		//.when()
		//.post("https://healthplans-int-api.qat-phynd.com/HealthPlanServiceArea/")
		//.then()
		//.log()
		//.all();
		
		HealthPlanServiceArea_DTO HealthPlanServiceAreaObj = new HealthPlanServiceArea_DTO();
		HealthPlanServiceAreaObj.setCounty("DANE");
		HealthPlanServiceAreaObj.setHealthSystemId(106);
		HealthPlanServiceAreaObj.setHealthPlanId(20222);
		HealthPlanServiceAreaObj.setPlanYear("2027");
		HealthPlanServiceAreaObj.setZipCode("57274");
		HealthPlanServiceAreaObj.setStateAbbreviation("AK");
		given().contentType(ContentType.JSON).header("Authorization","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InNzYXJ3YWRzeXNhZG1xYXQxMDYiLCJIZWFsdGhTeXN0ZW1JZHMiOiIxMDYiLCJVc2VySWQiOiIzNzc2Njg3Iiwic3ViIjoic3NhcndhZHN5c2FkbXFhdDEwNiIsImp0aSI6IjNlODlkZGMyLTlmYzEtNGUzYy1hNzY4LWRhNDVmMjYyODBkNSIsImlhdCI6MTczNzAxMTE5OCwiaXNpbnRlcm5hbHJlcXVlc3QiOiJmYWxzZSIsImh0dHA6Ly9zY2hlbWFzLm1pY3Jvc29mdC5jb20vd3MvMjAwOC8wNi9pZGVudGl0eS9jbGFpbXMvcm9sZSI6IlBTQSIsIm5iZiI6MTczNzAxMTE5OCwiZXhwIjoxNzM3MDM5OTk4LCJpc3MiOiJTeW1wbHJBdWRpZW5jZS1xYXQiLCJhdWQiOiJTeW1wbHJJc3N1ZXItcWF0In0._8GamQoO8Gcqa7x2us_fercT04DEGQ1Kedk2xINEsa8")
		.body(HealthPlanServiceAreaObj)
		.when().log().body()
        .post("https://healthplans-int-api.qat-phynd.com/HealthPlanServiceArea/")
        .then()
        .log()
        .all();

		/*
		 * Below things we used for Delete Operation
		 * 
		 */
		//174 is nothing but it is HealthPlanSericeAreaId from the Database Tabel 
		//Table NAme is : PRD_Phynd.HealthPlan_HealthPlanServiceArea
		//78 is a created Data Source ID
		//given().header("Authorization","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InNzYXJ3YWRzeXNhZG1xYXQxMDYiLCJIZWFsdGhTeXN0ZW1JZHMiOiIxMDYiLCJVc2VySWQiOiIzNzc2Njg3Iiwic3ViIjoic3NhcndhZHN5c2FkbXFhdDEwNiIsImp0aSI6ImFmY2YwZGU0LTU0YWItNDQ3YS1hZTZiLWQ4NjgxZTAyNzgwYSIsImlhdCI6MTczNTk5OTk2MSwiaXNpbnRlcm5hbHJlcXVlc3QiOiJmYWxzZSIsImh0dHA6Ly9zY2hlbWFzLm1pY3Jvc29mdC5jb20vd3MvMjAwOC8wNi9pZGVudGl0eS9jbGFpbXMvcm9sZSI6IlBTQSIsIm5iZiI6MTczNTk5OTk2MSwiZXhwIjoxNzM2MDI4NzYxLCJpc3MiOiJTeW1wbHJBdWRpZW5jZS1xYXQiLCJhdWQiOiJTeW1wbHJJc3N1ZXItcWF0In0.xYzzBeevMR8Aup4EAFSrN8tuoQ8rrugmA9R0L7M41bs")
		//.delete("https://healthplans-int-api.qat-phynd.com/HealthPlanServiceArea/174/78")
		//.then()
		//.log()
		//.all();
		
		
	}

}
