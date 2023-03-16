package com.addressbookusingCsvanndJson;

public class Person {
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private long phoneNumber;
    private int zip;

    public Person(String firstName, String lastName, String city, String state, long phoneNumber, int zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.zip = zip;
    }

    public Person() {
        
    }

    public Person(String firstName, String lastName, Object address, String city, String state, int zip, long phoneNumber, Object email) {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", state=" + state
                + ", phoneNumber=" + phoneNumber + ", zip=" + zip + "]";
    }

    protected void setEmail(String nextLine) {
    }

    protected Object getAddress() {
        return null;
    }

    protected Object getEmail() {
        return null;
    }
}
