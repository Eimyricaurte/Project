package model;

public class ServicePhone {

	private Phone phoneOne;
	private Phone phoneTwo;
	private Phone phoneThree;
	
	//private Phone phone;
	//private ETypeCall eTypeCall;
	public Phone getPhoneOne() {
		return phoneOne;
	}
	public void setPhoneOne(Phone phoneOne) {
		Phone phone1 = new Phone();
		phone1.getImei();
		
		this.phoneOne = phoneOne;
	}
	public Phone getPhoneTwo() {
		return phoneTwo;
	}
	public void setPhoneTwo(Phone phoneTwo) {
		this.phoneTwo = phoneTwo;
	}
	public Phone getPhoneThree() {
		return phoneThree;
	}
	public void setPhoneThree(Phone phoneThree) {
		this.phoneThree = phoneThree;
	}
	
	public boolean registryCall(Phone phone,int minuts, ETypeCall eTypeCall) {	
	
		int timeCall = 0;
		int currentMinutes = phone.getCellPlan().getMinutes();
		
		int call = 0;
		
		int substractMinutes = 0;
		
		if(phone.getCellPlan().getMinutes() > 0) {
			switch(eTypeCall) {
			case FIXED:
				call = timeCall*2;
				if(call >= currentMinutes) {
					substractMinutes = currentMinutes - call;
				}else {
					System.err.println("there are not enough minutes");
				}
				break;
				
			case INTERNATIONAL:

				call = timeCall*3;
				
				if(call >= currentMinutes) {
					substractMinutes = currentMinutes - call;
				}else {
					System.err.println("there are not enough minutes");
				}
				break;
				
			case MOVIL:
				
				if(timeCall >= currentMinutes) {
					substractMinutes = currentMinutes - timeCall;
				}else {
					System.err.println("there are not enough minutes");
				}				
				default:
					System.out.println("invalid Call");
			}
		} else {
			System.out.println("There are no minutes");
		}
		
		return true;
	}
	
	public Phone findPhone(String imei) {
		//Phone findImei = new Phone();
		ServicePhone servicePhone = new ServicePhone();
		
		if(getPhoneOne().getImei() == imei) {
			
			return getPhoneOne();
			
		}else if(getPhoneTwo().getImei() == imei) {
			return getPhoneTwo();
		
		}else if(getPhoneThree().getImei() == imei) {
			return getPhoneThree();
					
		}else {
			System.err.println("Imei doesn't exist");
		}
		
		return null; 
	}
	
	public int addMinutes(Phone phone) {
		Phone minutes = new Phone();
		int addMinutes;
		int min = 0;
		//para sumar los minutos que  ingresa el usuario a los minutos que ya se tenian
		addMinutes = minutes.getCellPlan().getMinutes() + min;
		
		return addMinutes;
	}
}
