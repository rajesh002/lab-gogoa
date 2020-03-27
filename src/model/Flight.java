package model;

import java.time.LocalDate;

public class Flight{
	private int noOfPersons;
	private String classType;
	private int rates;
	private LocalDate from;
	private LocalDate to;
	private String triptype;
	public Flight(int noOfPersons, int rates, String classType,LocalDate from,LocalDate to,String triptype){
		this.noOfPersons=noOfPersons;
		this.classType=classType;
		this.rates=rates;
		this.from=from;
		this.to=to;
		this.triptype=triptype;
	}
	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons=noOfPersons;
	}
	public int getNoOfPersons() {
		return this.noOfPersons;
	}
	public void setRates(int rates) {
		this.rates=rates;
	}
	public int getRates() {
		return this.rates;
	}
	public void setClassType(String classType) {
		this.classType=classType;
	}
	public String getClassType() {
		return this.classType;
	}
	public String getTriptype() {  
		return this.triptype;
	}
	public void setFrom(LocalDate date) {
		this.from=from;
	}
	public LocalDate getFrom() {
		return this.from;
	}
	public void setTo(LocalDate dat) {
		this.to=dat;
	}
	public LocalDate getTo() {
		return this.to;
	}
	
	
}