package com.TrainBooking.passenger;

import java.util.List;

import com.TrainBooking.TrainDetails.Train;

public interface ControllerToView {

	void trainNotFound();

	void trainFound(List<Train> trainsList);

	void allTrainsList(List<Train> allTrains);

}
