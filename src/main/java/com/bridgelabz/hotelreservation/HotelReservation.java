package com.bridgelabz.hotelreservation;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservation
{
    ArrayList<Hotel> hotelList=new ArrayList<Hotel>();

    public static void main(String args[])
    {
        HotelReservation hotelReservation=new HotelReservation();

        System.out.println("***** Welcome to hotel reservation system *****");
        hotelReservation.addHotel();
    }

    public void addHotel()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name of the Hotel");
        String hotelName=scanner.nextLine();

        System.out.println("Enter the rate for Regular customer");
        int rates=Integer.parseInt(scanner.nextLine());

        Hotel hotel=new Hotel(hotelName,rates);
        hotelList.add(hotel);
    }
}
