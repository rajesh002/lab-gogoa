package services;

import java.time.Period;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;
public class FareCalculator{
	int days,months;
	
	
	public double book(Hotel hotel) {
		 Period diff=Period.between(hotel.getFromdate(), hotel.getTodate());
		 months=diff.getMonths();
		 days=diff.getDays();
		 return (hotel.getNoOfPersons()*hotel.getRates())+(months*30)+days;
		
	}
	public double book(Flight flight) {
		Period diff=Period.between(flight.getFrom(), flight.getTo());
		 months=diff.getMonths();
		 days=diff.getDays();
		return (flight.getNoOfPersons()*flight.getRates())+(months*30)+days;
	}
	public double book(Train train) {
		return train.getNoOfPersons()*train.getRates();
	}
	public double book(Bus bus) {
		return bus.getNoOfPersons()*bus.getRates();
	}
}