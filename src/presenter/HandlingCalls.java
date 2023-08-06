package presenter;
import java.time.*;
public class HandlingCalls {

	public HandlingCalls() {
		
	}
	
	public boolean addPhone(String imei, String number, LocalDate manufacturingDate, String description, int minutes) {
		return true;
	}
	//si esas no son las variables, cambailas o avisame
	public String findPhone(String find) {
		return "";
	}
	
	public int addMinutes(String description, int minutes) {
		return 0;
	}
	
	public boolean registryCalls(String imei, String number, int minutes) {
		return true;
	}
}
