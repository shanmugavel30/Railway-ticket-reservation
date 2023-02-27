package com.TrainBooking.booking;

public interface ControllerToView {

	void bookFailed();

	void bookSuccess(String result);

	void thakkalBookedSuccess();

	void thakkalBookedFailure();

}
