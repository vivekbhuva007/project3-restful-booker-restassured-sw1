package com.restful.booker.model;

import java.util.HashMap;

public class CustomerPojo {

    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private String additionalneeds;
    private HashMap<Object,Object> bookingdates;
    private String usrername;
    private String password;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public HashMap<Object, Object> getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(HashMap<Object, Object> bookingdates) {
        this.bookingdates = bookingdates;
    }

    public String getUsrername() {
        return usrername;
    }

    public void setUsrername(String usrername) {
        this.usrername = usrername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public boolean isDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }
}
