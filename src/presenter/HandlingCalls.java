package presenter;
import java.time.*;
import model.*;

public class HandlingCalls {

	public HandlingCalls() {
		
	}
	//
	public boolean addPhone(String imei, String number, LocalDate manufacturingDate, String description, int minutes) {
		ServicePhone phone = new ServicePhone();
				
		if(phone.getPhoneOne() != null) {
			phone.setPhoneOne(new Phone(imei, number, manufacturingDate, new CellPlan(description, minutes)));
		
		}
		if(phone.getPhoneTwo() != null) {
			if(phone.getPhoneOne().getImei() != imei) {
				phone.setPhoneTwo(new Phone(imei, number, manufacturingDate, new CellPlan(description, minutes)));
			}
		}
		if(phone.getPhoneThree().getImei() != null) {
			if(phone.getPhoneTwo().getImei() != imei) {
				   phone.setPhoneThree(new Phone(imei, number, manufacturingDate, new CellPlan(description, minutes)));
			}
		}
			
			return true;
		
	}
	
	public String findPhone(String Imei) {
		
		ServicePhone phone = new ServicePhone();
		
		return phone.findPhone(Imei).toString();
				
	}
	
	public int addMinutes(String description, int minutes) {
		
		Phone phone = new Phone();
		
		ServicePhone service = new ServicePhone();

		
		phone.getCellPlan().getDescription();
		phone.getCellPlan().getMinutes();
		
		service.addMinutes(phone);		
		return 0;
	}
	
	public boolean registryCalls(String imei, String number, int minutes) {
		
		ServicePhone registry = new ServicePhone();
		
		if(registry.getPhoneOne().getImei() == imei) {
			registry.registryCall(registry.getPhoneOne(), minutes, ETypeCall.MOVIL);
			
		}else if(registry.getPhoneTwo().getImei() == imei) {
			registry.registryCall(registry.getPhoneTwo(), minutes, ETypeCall.FIXED);

		}else if(registry.getPhoneThree().getImei() == imei) {
			registry.registryCall(registry.getPhoneThree(), minutes, ETypeCall.INTERNATIONAL);
		}
		
		return true;
	}
}
