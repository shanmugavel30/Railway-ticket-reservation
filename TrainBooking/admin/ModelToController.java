package com.TrainBooking.admin;

import java.util.List;

import com.TrainBooking.dto.Train;

public interface ModelToController {

	void allTrainsList(List<Train> allTrains);

	void addTrainSuccess();

	void removeTrainSuccess();

	void removeTrainFailure();

}
