package com.TrainBooking.login;

public interface ControllerToView {

	void adminSuccess(String adminName);

	void passengerFailure(String name, String password);

	void passengerSuccess(String name, String password);

	void adminLoginFailure();

}
