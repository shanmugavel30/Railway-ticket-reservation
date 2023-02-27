package com.TrainBooking.login;

public interface ControllerToModel {

	void checkIsAdmin(String adminName, String pass);

	void checkIsPassenger(String pname, String password);

}
