package com.incluctab.tddClasses.eStore;

public class Address {
    private String cityName;
    private String countryName;
    private String houseNumber;
    private String street;
    private State state;

    public Address(String cityName, String countryName, String houseNumber, String street, State state) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.houseNumber = houseNumber;
        this.street = street;
        this.state = state;
    }
}
