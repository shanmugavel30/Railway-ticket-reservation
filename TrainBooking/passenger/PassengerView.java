package com.TrainBooking.passenger;
import java.util.*;

import com.TrainBooking.TrainDetails.Train;
import com.TrainBooking.booking.BookingView;
import com.TrainBooking.cancel.CancelView;
import com.TrainBooking.login.LoginView;
public class PassengerView implements ControllerToView{
	private ViewToController passcontroller;
	private Scanner scan=new Scanner(System.in);
	public PassengerView() {
		this.passcontroller=new PassengerController(this);
		
	}
	public void main() {
		System.out.println("1.Book\n2.showTrains\n3.Cancel\n4.Exit");
		System.out.println("Enter the option:");
		int opt=scan.nextInt();
		if(opt==1) {
			searchTrains();
		}
		else if(opt==2) {
			passcontroller.showTrains();
		}
		else if(opt==3) {
			CancelView ref=new CancelView();
			ref.cancelTicket();
		}
		else if(opt==4) {
			LoginView ref=new LoginView();
			ref.loginWeb();
		}
		else {
			System.out.println("You are exitted...!");
			System.out.println("Don't forget to come again...<---Thank you");
		}
	}
	
	public void searchTrains() {
		System.out.println("Enter the Source:");
		String source=scan.next();
		System.out.println("Enter the Destination:");
		String destination=scan.next();
		System.out.println("Enter the Date:ex(Date/month/year)");
		String Date=scan.next();
		passcontroller.searchForTrains(source,destination,Date);
	}

	public void trainNotFound() {
		System.out.println("No trains available at  the time...");
		main();
	}

	public void trainFound(List<Train> trainsList) {
		System.out.printf("\n %10s %13s %13s %13s %13s %13s %13s %13s %13s %13s","TrainId","Source","Destination","Date","NoOfSheets","UpperSeats","MiddleSeats","LowerSeats","RAC","WaitingList");
		for(int i=0;i<trainsList.size();i++) {
			System.out.printf("\n %10s  %13s %13s %13s %13s %12s %12s %12s %13s %13s",trainsList.get(i).getTrainId(),trainsList.get(i).getsource(),trainsList.get(i).getdestination(),trainsList.get(i).getdate(),trainsList.get(i).getNoOfTicket(),
					trainsList.get(i).getUpperSeats(),trainsList.get(i).getMiddleSeats(),trainsList.get(i).getLowerSeats(),trainsList.get(i).getRac(),trainsList.get(i).getWaitingList());
		}
		System.out.println();
		System.out.println("");
		System.out.println("Enter TrainId:");
		int trainId=scan.nextInt();
		BookingView obj=new BookingView();
		obj.bookTicket(trainId);
	}
	public void allTrainsList(List<Train> allTrains) {
		System.out.printf("\n %10s %13s %13s %13s %13s %13s %13s %13s %13s %13s","TrainId","Source","Destination","Date","NoOfSheets","UpperSeats","MiddleSeats","LowerSeats","RAC","WaitingList");
		for(int i=0;i<allTrains.size();i++) {
			System.out.printf("\n %10s  %13s %13s %13s %13s %12s %12s %12s %13s %13s",allTrains.get(i).getTrainId(),allTrains.get(i).getsource(),allTrains.get(i).getdestination(),allTrains.get(i).getdate(),allTrains.get(i).getNoOfTicket(),
					allTrains.get(i).getUpperSeats(),allTrains.get(i).getMiddleSeats(),allTrains.get(i).getLowerSeats(),allTrains.get(i).getRac(),allTrains.get(i).getWaitingList());
		}
		System.out.println();
		main();
	}
}

