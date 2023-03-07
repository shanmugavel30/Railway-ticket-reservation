package com.TrainBooking.passenger;

import java.util.List;

import com.TrainBooking.dto.Train;

public class PassengerController implements ModelToController,ViewToController{
	private ControllerToView passview;
	private ControllerToModel passmodel;
	
	public PassengerController(PassengerView passview) {
		this.passview=passview;
		this.passmodel=new PassengerModel(this);
	}

	public void searchForTrains(String source, String destination,String Date) {
		passmodel.isTrainAvail(source,destination,Date);
	}

	public void trainNotFound() {
		passview.trainNotFound();
	}
	public void trainFound(List<Train> trainsList) {
		passview.trainFound(trainsList);
	}

	public void showTrains() {
		passmodel.showTrains();
	}

	public void allTrainsList(List<Train> allTrains) {
		passview.allTrainsList(allTrains);
	}

}
