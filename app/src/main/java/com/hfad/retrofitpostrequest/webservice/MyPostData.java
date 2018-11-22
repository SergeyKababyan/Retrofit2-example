package com.hfad.retrofitpostrequest.webservice;

import java.io.Serializable;

public class MyPostData  implements Serializable {
    private String fname;
    private String lname;
    private String mobile;
    private String country;
    private String city;
    private String dob;
    private String email;
    private String address;

    public MyPostData(String fname, String lname, String mobile, String country, String city, String dob, String email, String address) {
        this.fname = fname;
        this.lname = lname;
        this.mobile = mobile;
        this.country = country;
        this.city = city;
        this.dob = dob;
        this.email = email;
        this.address = address;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
