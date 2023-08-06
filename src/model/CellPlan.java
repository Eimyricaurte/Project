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
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	//agregar tostring
}