package com.restassureddemo;

public class HealthPlanServiceArea_DTO {
	
	private int HealthPlanServiceAreaId;
	private int HealthPlanId;
	private int HealthSystemId;
	private String PlanYear;
	private String StateAbbreviation;
	private String County;
	private String ZipCode;
	private int CreatedDataSourceId;
	public int getHealthPlanServiceAreaId() {
		return HealthPlanServiceAreaId;
	}
	public void setHealthPlanServiceAreaId(int healthPlanServiceAreaId) {
		HealthPlanServiceAreaId = healthPlanServiceAreaId;
	}
	public int getHealthSystemId() {
		return HealthSystemId;
	}
	public void setHealthSystemId(int healthSystemId) {
		HealthSystemId = healthSystemId;
	}
	public String getPlanYear() {
		return PlanYear;
	}
	public int getHealthPlanId() {
		return HealthPlanId;
	}
	public void setHealthPlanId(int healthPlanId) {
		HealthPlanId = healthPlanId;
	}
	public void setPlanYear(String planYear) {
		PlanYear = planYear;
	}
	public String getStateAbbreviation() {
		return StateAbbreviation;
	}
	public void setStateAbbreviation(String stateAbbreviation) {
		StateAbbreviation = stateAbbreviation;
	}
	public String getCounty() {
		return County;
	}
	public void setCounty(String county) {
		County = county;
	}
	public String getZipCode() {
		return ZipCode;
	}
	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}
	
	
	
	

}
