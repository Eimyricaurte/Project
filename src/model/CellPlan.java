package model;

public class CellPlan {

	private String description;
	private int minutes;
	
	public CellPlan(){
		
	}

	public CellPlan(String description, int minutes) {
		super();
		this.description = description;
		this.minutes = minutes;
	}

	public String getDescription() {
		
		
		
		String descriptionPlan = "" ;
		
		switch(descriptionPlan) {
		case "1":
			descriptionPlan = "Limited plan 30 minutes";
			break;
		case "2":
			descriptionPlan ="Limited plan 50 minutes";
			break;
		case "3":
			descriptionPlan = "Limited plan 70 minutes";
			
			default :
				System.out.println("invalid plan");
		}
		 
		return descriptionPlan;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getMinutes() {
		CellPlan cellPlan = new CellPlan();
		int minutesPlan;
		
		
		switch(getDescription()) {
		case "1":
			minutesPlan = 30;
			break;
			
		case "2":
			minutesPlan = 50;
			break;
			
		case "3":
			minutesPlan = 70;
			break;
			
			default:
				minutesPlan = 0;
		}
			
		return minutesPlan;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	public String toString() {
		return "";
	}
}
