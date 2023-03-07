package com.TrainBooking.cancel;

public class CancelController implements ModelToController,ViewToController{
	private ControllerToView  cancelview;
	private ControllerToModel cancelmodel;
	
	public CancelController(CancelView  cancelview) {
		this.cancelview=cancelview;
		this.cancelmodel=new CancelModel(this);
	}

	public void cancelTicket(int passengerId, int trainId) {
		cancelmodel.cancelTicket(passengerId,trainId);
	}

	public void cancelTicketSuccess() {
		cancelview.cancelTicketSuccess();
	}

	public void cancelTicketfailure() {
		cancelview.cancelTicketFailure();
	}
}
