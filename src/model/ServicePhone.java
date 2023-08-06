package model;

public class ServicePhone {

	private int PhoneOne;
	private int PhoneTwo;
	private int PhoneThree;
	
	private Phone phone;
	private ETypeCall eTypeCall;
	public int getPhoneOne() {
		return PhoneOne;
	}
	public void setPhoneOne(int phoneOne) {
		PhoneOne = phoneOne;
	}
	public int getPhoneTwo() {
		return PhoneTwo;
	}
	public void setPhoneTwo(int phoneTwo) {
		PhoneTwo = phoneTwo;
	}
	public int getPhoneThree() {
		return PhoneThree;
	}
	public void setPhoneThree(int phoneThree) {
		PhoneThree = phoneThree;
	}
	
	public boolean registryCall(Phone phone, int c, ETypeCall eTypeCall) {
		
		return true;
	}
	
	public Phone findPhone(String find) {
		this.phone= phone;
		return phone;
	}
	
	public int addMinutes(Phone phone) {
		return 0;
	}
}
