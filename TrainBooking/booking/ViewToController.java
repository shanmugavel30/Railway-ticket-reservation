package com.TrainBooking.booking;

import com.TrainBooking.passengerDetails.Passenger;

public interface ViewToController {

	void bookTicket(int trainId, Passenger passenger, int numOfTickets);

	void bookThakkalTicket(int trainId, Passenger passenger, int numOfTickets);

}
