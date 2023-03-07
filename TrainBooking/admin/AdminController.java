package com.TrainBooking.admin;

import java.util.List;

import com.TrainBooking.dto.Train;

public class AdminController implements ModelToController,ViewToController {
	private ControllerToView adminview;
	private ControllerToModel adminmodel;
	
	public AdminController(AdminView adminview) {
		adminmodel= new AdminModel(this);
		this.adminview=adminview;
	}
	
	public void showAllTrains() {
		adminmodel.showAllTrains();
	}

	public void allTrainsList(List<Train> allTrains) {
		adminview.allTrainsList(allTrains);
	}

	public void addTrain(int trainId, String source, String destination, String date, int numOfTickets, int amount,
			int thakkalamount) {
		adminmodel.addTrain(trainId,source,destination,date,numOfTickets,amount,thakkalamount);
	}

	public void addTrainSuccess() {
		adminview.addTrainSuccess();
	}

	public void removeTrain(int trainId) {
		adminmodel.removeTrain(trainId);
	}

	public void removeTrainSuccess() {
		adminview.removeTrainSuccess();
	}

	public void removeTrainFailure() {
		adminview.removeTrainFailure();
	}
}
