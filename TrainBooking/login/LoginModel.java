package com.TrainBooking.login;

public class LoginModel implements ControllerToModel{
	
	private ModelToController logincontroller;
	
	public LoginModel(LoginController logincontroller) {
		this.logincontroller=logincontroller;
	}
	public void checkIsAdmin(String adminName, String pass) {
		if(adminName.equals("shanmugavel") &&  pass.equals("selvam@20")) {
				logincontroller.adminLogin(adminName);
			
		}
		else {
			logincontroller.adminLoginFailure();
		}
	}
	
	public void checkIsPassenger(String Name,String password) {
		if(Name.isEmpty()) {
			System.out.println("Please Enter the valid Passanger Name");
		}
		if(password.length()<8) {
			logincontroller.passengerFailure(Name,password);
		}
		
		logincontroller.passengerLogin(Name,password);
	}
	

}
