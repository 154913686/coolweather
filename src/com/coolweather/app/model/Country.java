package com.coolweather.app.model;

public class Country {
	private int id;
	private String countryName;
	private String countCode;
	private int cityId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountCode() {
		return countCode;
	}

	public void setCountCode(String countCode) {
		this.countCode = countCode;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

}
