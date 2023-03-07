package com.TrainBooking.passenger;

import java.util.List;

import com.TrainBooking.TrainDetailsRepository.TrainBookingDetailRepository;
import com.TrainBooking.dto.Train;


//import com.FlightTicketBooking.flight.Flight;

public class PassengerModel implements  ControllerToModel{
	private ModelToController passcontroller;
	
	public PassengerModel(PassengerController passcontroller) {
		this.passcontroller=passcontroller;
	}

	public void isTrainAvail(String source, String destination,String Date) {
		List<Train> trainsList = TrainBookingDetailRepository.getInstance().getTrains(source,destination,Date);
		if(trainsList.isEmpty()) {
			passcontroller.trainNotFound();
		}
		else {
			passcontroller.trainFound(trainsList);
		}
	}

	public void showTrains() {
		List<Train> allTrains = TrainBookingDetailRepository.getInstance().showAllTrains();
		passcontroller.allTrainsList(allTrains);
	}

}
