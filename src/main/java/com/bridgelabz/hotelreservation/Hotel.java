package com.bridgelabz.hotelreservation;

public class Hotel
{
    String hotelName;
    int rates;
    int rating;
    String weekday;
    String weekend;

    public Hotel(String hotelName,int rates, int rating)
    {
        this.hotelName=hotelName;
        this.rates=rates;
        this.rating=rating;
    }
    public Hotel(String hotelName,String weekday, String weekend)
    {
        this.hotelName=hotelName;
        this.weekday=weekday;
        this.weekend=weekend;
    }
}
