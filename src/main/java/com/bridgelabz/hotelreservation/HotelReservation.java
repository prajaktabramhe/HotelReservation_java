package com.bridgelabz.hotelreservation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;


public class HotelReservation
{
    ArrayList<Hotel> hotelList=new ArrayList<Hotel>();

    public boolean addHotel(String hotelName,int rates, int rating)
    {
        Hotel hotel=new Hotel(hotelName,rates,rating);
        hotelList.add(hotel);
        System.out.println(hotelList.isEmpty());
        if(hotelList.isEmpty())
        {
            return false;
        }
        else
        {
            return true;
        }
    }


}
