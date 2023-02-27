package com.TrainBooking.admin;

public interface ViewToController {

	void showAllTrains();

	void addTrain(int trainId, String source, String destination, String date, int numOfTickets, int amount,
			int thakkalamount);

	void removeTrain(int trainId);

}
