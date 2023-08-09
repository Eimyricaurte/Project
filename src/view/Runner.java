package view;

import presenter.HandlingCalls;

import java.time.LocalDate;
import java.util.*;
import model.*;

public class Runner {

	private HandlingCalls handlingCalls;

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		}
	
	// Se establece el servicio que el usuario desea adquirir
	// Set the service that the user wants to purchase
	public static void mainMenu() {
		
		System.out.println("Menu \n" +
				"1. Add phone \n" +
				"2. Find phone \n" +
				"3. Add minutes \n" +
				"4. Registry call ");
		
		int option = sc.nextInt();
		
		switch(option){
		case 1:
			addPhone();
			break;
			
		case 2:
			findPhone();
			break;
			
		case 3:
			addMinutes();
			break;
			
		case 4:
			registryCall();
			
			default:
				System.out.println("Invalid Option");
		}
					
	}
	
	public static void addPhone() {
		
		HandlingCalls handling = new HandlingCalls();
		
		System.out.println("Enter the Imei");
		String imei = sc.next();
		
		System.out.println("Enter the number");
		String number = sc.next();
		
		System.out.println("Enter the date of manufacture of the phone (aaaa-mm-dd)");
		
		String date = sc.next();
		LocalDate manufacturingDate = LocalDate.parse(date);
		
		String plans = "Plans: \n " +
				"1. Limited plan 30 minutes \n " + 
				"2. Limited plan 50 minutes \n " +
				"3. Limited plan 70 munutes";
		
		int minutes = 0;
		
		int plan = sc.nextInt();
		
		switch(plan) {
		case 1:
			minutes = 30;
			break;
			
		case 2:
			minutes = 50;
			break;
			
		case 3:
			minutes = 70;
			
			default:
				System.out.println("Invalid plan");
		}
		handling.addPhone(imei, number, manufacturingDate, plans, minutes);
	}
	
	public static void findPhone(){
		
		HandlingCalls handling = new HandlingCalls();
				
		System.out.println("Enter the Imei");
		String imei = sc.next();
		
		handling.findPhone(imei);
		
	}
	
	public static void addMinutes(){
		
		Phone phone = new Phone();

		System.out.println("Enter the Imei");
		String imei = sc.next();
		
		System.out.println("Enter the number");
		String number = sc.next();
		
		System.out.println("Type the plan you want to add");
		
		String plans = "Plans: \n " +
				"1. Limited plan 30 minutes \n " + 
				"2. Limited plan 50 minutes \n " +
				"3. Limited plan 70 munutes";
		
		int result = 0;
		
		int plan = sc.nextInt();
		
		switch(plan) {
		case 1:
			result = phone.getCellPlan().getMinutes() + 30;
			break;
			
		case 2:
			result = phone.getCellPlan().getMinutes() + 50;
			break;
			
		case 3:
			result = phone.getCellPlan().getMinutes() + 70;
			
			default:
				System.err.println("Invalid plan");
		}
	}
	
	public static void registryCall(){
		
		System.out.println("Enter the Imei");
		String imei = sc.next();
		
		System.out.println("Enter the number");
		String number = sc.next();
				
		System.out.println("enter the call time in minutes");
		int timeCall = sc.nextInt();		
		
		HandlingCalls handlingCall = new HandlingCalls();
		
		handlingCall.registryCalls(imei, number, timeCall);
		
	}

}
