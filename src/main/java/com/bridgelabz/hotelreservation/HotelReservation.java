package com.bridgelabz.hotelreservation;

import java.util.*;
import java.util.Date;


public class HotelReservation
{
    ArrayList<Hotel> hotelList=new ArrayList<Hotel>();

    public boolean addHotel(String hotelName,int rates, int rating)
    {
        Hotel hotel=new Hotel(hotelName,rates,rating);
        hotelList.add(hotel);
        if(hotelList.isEmpty())
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean addHotel(String name, Double rates)
    {
        Hotel hotel = new Hotel(name, rates);
        hotelList.add(hotel);
        return !hotelList.isEmpty();
    }

    public String findCheapestHotel(Date [] dates)
    {
        ArrayList<Double> cheapRateHotels = new ArrayList<>();
        for (Hotel hotel : hotelList)
        {
            Double rate = 0.0;
            for ( Date date : dates)
            {
                rate = hotel.getRate();
            }
            cheapRateHotels.add(rate);
        }
        Double cheap = cheapRateHotels.stream().min(Comparator.comparing(Double::doubleValue)).orElse(null);
        int index = cheapRateHotels.indexOf(cheap);
        return hotelList.get(index).getName();
    }
    public boolean addHotelRates(String name, double weekday, double weekend ) {
        Hotel hotel = new Hotel(name, weekday, weekend);
        hotelList.add(hotel);
        return !hotelList.isEmpty();
    }
}
