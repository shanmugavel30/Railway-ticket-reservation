package com.TrainBooking.cancel;

import java.util.Scanner;

import com.TrainBooking.passenger.PassengerView;

public class CancelView implements ControllerToView{
	private ViewToController cancelcontroller;
	private Scanner scan = new Scanner(System.in);
	
	public CancelView() {
		cancelcontroller=new CancelController(this);
	}
	
	public void cancelTicket() {
		System.out.println("Enter the trainId:");
		int trainId=scan.nextInt();
		System.out.println("Enter the PassengerId:");
		int passengerId=scan.nextInt();
		
		cancelcontroller.cancelTicket(passengerId,trainId);
	}

	public void cancelTicketSuccess() {
		System.out.println("Your ticket cancelled successfully...!");
		PassengerView ref=new PassengerView();
		ref.main();
	}

	public void cancelTicketFailure() {
		System.out.println("Your ticket cancellation failed...!");
		PassengerView ref=new PassengerView();
		ref.main();
	}
}
