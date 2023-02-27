package com.TrainBooking.booking;

import com.TrainBooking.passengerDetails.Passenger;

public class BookingController implements ModelToController,ViewToController{
	private ControllerToView bookview;
	private ControllerToModel bookmodel;
	
	public BookingController(BookingView bookview) {
		this.bookview=bookview;
		bookmodel=new BookingModel(this);
	}

	public void bookTicket(int trainId,Passenger passenger,int numOfTickets) {
		bookmodel.bookTicket(trainId,passenger,numOfTickets);
	}

	public void bookFailed() {
		bookview.bookFailed();
	}

	public void bookSuccess(String result) {
		bookview.bookSuccess(result);
	}

	public void bookThakkalTicket(int trainId, Passenger passenger,int numOfTickets) {
		bookmodel.bookThakkalTicket(trainId,passenger,numOfTickets);
	}

	public void thakkalBookedSuccess() {
		bookview.thakkalBookedSuccess();
	}

	public void thakkalBookedFailure() {
		bookview.thakkalBookedFailure();
	}

}
