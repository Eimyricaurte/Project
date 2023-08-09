package model;
import java.time.LocalDate;
import java.time.chrono.IsoEra;

import presenter.HandlingCalls;
public class Phone {

	private String imei;
	private String number;
	private LocalDate manufacturingDate;
	
	private CellPlan cellPlan;

	public Phone() {
		
	}

	public Phone(String imei, String number, LocalDate manufacturingDate, CellPlan cellPlan) {
		super();

		this.imei = imei;
		this.number = number;
		this.manufacturingDate = manufacturingDate;
		this.cellPlan = cellPlan;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public LocalDate getManufacturingDate() {	
		
		LocalDate manufacturingDate = LocalDate.parse("2022-01-30");

		return manufacturingDate;
	}

	public void setManufacturingDate(LocalDate manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	
	public CellPlan getCellPlan() {
		return cellPlan;
	}

	public void setCellPlan(CellPlan cellPlan) {
		this.cellPlan = cellPlan;
	}
	public int getAge() {
		
		LocalDate currentDate = LocalDate.now();
	
		LocalDate manufacturingDate = LocalDate.parse("2022-01-30");
		
		int age = manufacturingDate.getYear() - currentDate.getYear(); 
		
		return age;
	}
	
	public String toString() {
		return "Phone [ imei=" + imei + ", number=" + number + ", manufacturing date=" + manufacturingDate + "]";
	}
}
