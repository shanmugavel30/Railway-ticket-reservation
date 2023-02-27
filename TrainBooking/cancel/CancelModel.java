package com.TrainBooking.cancel;

import com.TrainBooking.TrainDetails.TrainBookingDetailRepository;

public class CancelModel implements ControllerToModel{
	private ModelToController cancelcontroller;
	
	public CancelModel(CancelController cancelcontroller) {
		this.cancelcontroller=cancelcontroller;
	}

	public void cancelTicket(int passengerId, int trainId) {
		TrainBookingDetailRepository.getInstance().cancelTicket(passengerId, trainId);
		if(!TrainBookingDetailRepository.getInstance().flag) {
			cancelcontroller.cancelTicketSuccess();
		}
		else {
			cancelcontroller.cancelTicketfailure();
		}
	}

	
}
