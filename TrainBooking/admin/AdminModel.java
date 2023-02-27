package com.TrainBooking.admin;

import java.util.List;

import com.TrainBooking.TrainDetails.Train;
import com.TrainBooking.TrainDetails.TrainBookingDetailRepository;

public class AdminModel implements ControllerToModel{
	private ModelToController admincontroller;
	
	public AdminModel(AdminController admincontroller) {
		this.admincontroller=admincontroller;
	}

	public void showAllTrains() {
		List<Train> allTrains = TrainBookingDetailRepository.getInstance().showAllTrains();
		admincontroller.allTrainsList(allTrains);
	}

	public void addTrain(int trainId, String source, String destination, String date, int numOfTickets, int amount,
			int thakkalamount) {
		TrainBookingDetailRepository.getInstance().addTrain(trainId,source,destination,date,numOfTickets,amount,thakkalamount);
		admincontroller.addTrainSuccess();
	}

	public void removeTrain(int trainId) {
		TrainBookingDetailRepository.getInstance().removeTrain(trainId);
		if(!TrainBookingDetailRepository.getInstance().flag) {
			admincontroller.removeTrainSuccess();

		}
		else {
			admincontroller.removeTrainFailure();
		}
	}
}
