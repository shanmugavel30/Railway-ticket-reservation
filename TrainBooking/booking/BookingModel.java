package com.TrainBooking.booking;
import com.TrainBooking.TrainDetailsRepository.TrainBookingDetailRepository;
import com.TrainBooking.dto.Passenger;

import java.util.*;

public class BookingModel implements ControllerToModel{
	private ModelToController bookcontroller;
	int count=0;
	
	public BookingModel(BookingController bookcontroller) {
		this.bookcontroller=bookcontroller;
	}

	public void bookTicket(int trainId,Passenger passenger,int numOfTickets) {
		List<String> resultList=new ArrayList<>();
		resultList=TrainBookingDetailRepository.getInstance().bookTickets(trainId,passenger,numOfTickets);
		if(resultList.size()==0) {
			bookcontroller.bookFailed();
		}
		else {
			bookcontroller.bookSuccess(resultList.get(0));
		}
	}

	public void bookThakkalTicket(int trainId, Passenger passenger,int numOfTickets) {
		boolean result=TrainBookingDetailRepository.getInstance().bookThakkalTicket(trainId, passenger,numOfTickets);
		if(result) {
			bookcontroller.thakkalBookedSuccess();
		}
		else {
			bookcontroller.thakkalBookedFailure();
		}
	}
}
