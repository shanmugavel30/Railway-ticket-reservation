package com.TrainBooking.login;

public class LoginController implements ModelToController,ViewToController {
	
	private ControllerToView loginview;
	private ControllerToModel loginmodel;
	
	public LoginController(LoginView loginview) {
		this.loginview=loginview;
		this.loginmodel=new LoginModel(this);
	}
	public void checkAdmin(String adminName, String pass) {
		loginmodel.checkIsAdmin(adminName,pass);		
	}
	public void checkPass(String pname,String password) {
		loginmodel.checkIsPassenger(pname,password);
	}

	public void adminLogin(String adminName) {
		loginview.adminSuccess(adminName);
	}
	public void passengerFailure(String Name,String password) {
		loginview.passengerFailure(Name,password);
	}

	public void passengerLogin(String name,String password) {
		loginview.passengerSuccess(name,password);
	}
	public void adminLoginFailure() {
		loginview.adminLoginFailure();
	}
}
