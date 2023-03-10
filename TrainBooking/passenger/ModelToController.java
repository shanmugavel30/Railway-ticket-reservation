package com.TrainBooking.passenger;

import java.util.List;

import com.TrainBooking.dto.Train;

public interface ModelToController {

	void trainNotFound();

	void trainFound(List<Train> trainsList);

	void allTrainsList(List<Train> allTrains);

}
