package Redbusproject;

public class RedBus {

	public static void main(String[] args) {
		
		Base.tearUp();
		
		RedBusSrc.boardingPlace("che", "Koyambedu");
		
		RedBusDes.destinationPlace("mdu","Madurai");
		
		RedBusDateSet.datepicker("Sep","8");
		
		RedBusDateSet.clickSearchBox();
		
		RedBusPrice.fairCheck();

	}

}
