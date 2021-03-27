package com.bridgelabz.hotelreservationtest;

import com.bridgelabz.hotelreservation.HotelReservation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {
HotelReservation hotelReservation = new HotelReservation();
    @Test
    public void checkedGivenHotelNameandRateAreAdded_True()
    {
        boolean result = hotelReservation.addHotel("Lakewood",110,4);
        Assertions.assertTrue(result);
    }

    @Test
    public void checkedCheapestHotelBetweenTwoDates()
    {
        boolean result = hotelReservation.findCheapestHotel("10/09/2020","11/09/2020");
        Assertions.assertTrue(result);
    }

}
