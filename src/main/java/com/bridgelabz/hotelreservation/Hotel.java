package com.bridgelabz.hotelreservation;

public class Hotel
{
    String hotelName;
    double rates;
    int rating;


    public Hotel(String hotelName,double rates,int rating)
    {
        this.hotelName=hotelName;
        this.rates=rates;
        this.rating=rating;
    }

    public Hotel(String hotelName,double rates)
    {
        this.hotelName=hotelName;
        this.rates=rates;
    }

    public double getRate()
    {
        return rates;
    }

    public String getName()
    {
        return hotelName;
    }

    @Override
    public String toString() {
        String str = "Hotel name : " + this.hotelName + " rates for regular customer : " + this.rates;
        return str;
    }

}
