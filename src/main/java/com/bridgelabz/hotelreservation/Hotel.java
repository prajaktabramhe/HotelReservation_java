package com.bridgelabz.hotelreservation;

public class Hotel
{
    String hotelName;
    double rates;
    int rating;
    private Double weekendRates;

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

    public Hotel(String hotelName, double rates, Double weekendRates)
    {
        this.hotelName=hotelName;
        this.rates=rates;
        this.weekendRates = weekendRates;
    }

    public double getRate()
    {
        return rates;
    }

    public String getName()
    {
        return hotelName;
    }
    public Double getWeekendRates() {
        return weekendRates;
    }

    @Override
    public String toString() {
        String str = "Hotel name : " + this.hotelName + " rates for regular customer : " + this.rates;
        return str;
    }

}
