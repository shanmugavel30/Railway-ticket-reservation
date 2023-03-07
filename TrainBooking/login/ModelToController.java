package com.TrainBooking.login;

public interface ModelToController {

	void adminLogin(String adminName);

	void passengerFailure(String name, String password);

	void passengerLogin(String name, String password);

	void adminLoginFailure();

}
