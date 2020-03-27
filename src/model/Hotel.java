package model;

import java.time.LocalDate;

// Type your code

public class Hotel{
	private int noOfPersons;
	private String roomType;
	private int rates;
	private String occupancy;
	private LocalDate fromdate;
	private LocalDate todate;
		public Hotel(int noOfPersons, String roomType, int rates,String occupancy,LocalDate fromdate,LocalDate todate) {
			this.noOfPersons=noOfPersons;
			this.roomType=roomType;
			this.rates=rates;
			this.occupancy=occupancy;
			this.fromdate=fromdate;
			this.todate=todate;
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
		public void setRoomType(String roomType) {
			this.roomType=roomType;
		}
		public String getRoomType() {
			return this.roomType;
		}
		public void setFromdate(LocalDate date) {
			this.fromdate=date;
		}
		public void setTodate(LocalDate date) {
			this.todate=date;
		}
		
		
		public LocalDate getFromdate() {
			return this.fromdate;
		}
		public LocalDate getTodate() {
			return this.todate;
		}
		
		
}