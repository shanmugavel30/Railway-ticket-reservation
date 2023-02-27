package com.TrainBooking.booking;

import com.TrainBooking.passengerDetails.Passenger;

public interface ControllerToModel {

	void bookThakkalTicket(int trainId, Passenger passenger, int numOfTickets);

	void bookTicket(int trainId, Passenger passenger, int numOfTickets);

}
