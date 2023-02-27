package com.TrainBooking.login;
import java.util.*;

import com.TrainBooking.admin.AdminView;
import com.TrainBooking.passenger.PassengerView;

public class LoginView implements ControllerToView{
	private ViewToController logincontroller;
	private Scanner scan= new Scanner(System.in);
	
	public LoginView() {
		logincontroller=new LoginController(this);
	}

	public static void main(String[] args) {
		LoginView obj=new LoginView();
		obj.loginWeb();
	}
	
	public void loginWeb() {
		System.out.println("..-->Welcome to easy Train ticket booking website..<--");
		System.out.println("---____There are Two Login____---");
		System.out.println("1.Passenger Login \n2.Admin Login\n3.Exit");
		System.out.println();
		System.out.println("Please Enter your choice:");
		int choice=scan.nextInt();
		if(choice==1) {
			System.out.println("Enter the Passanger Name:");
			String Pname=scan.next();
			System.out.println("Enter the password:");
			String password=scan.next();
			logincontroller.checkPass(Pname,password);
		}
		else if(choice==2) {
			System.out.println("Enter the Admin Name:");
			String AdminName=scan.next();
			System.out.println("Enter the password:");
			String pass=scan.next();
			logincontroller.checkAdmin(AdminName,pass);
		}
		else {
			System.out.println("!...Exitted...!");
			System.out.println("Don't forget to come again<----");
		}
	}
	public void passengerSuccess(String Name,String password) {
		System.out.println("Passenger Loggedin successfully with "+Name+" name.");
		PassengerView linktopass  =new PassengerView();
		linktopass.main();
	}
	public void passengerFailure(String Name,String password) {
		System.out.println("Please enter valid password...");
		System.out.println("Passord  length should be 8 characters...");
		loginWeb();
	}
	public void adminSuccess(String Name) {
		System.out.println("Admin Loggedin successfully with "+Name+" name.");
		AdminView ref= new  AdminView();
		ref.adminChoices();
		
	}
	public void adminLoginFailure() {
		System.out.println("Admin login failed...!");
		loginWeb();
	}

}
