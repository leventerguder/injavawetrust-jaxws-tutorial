package test;

import net.webservicex.Airport;
import net.webservicex.AirportSoap;

public class TestAirportWebService {

	private static String ISTANBUL = "IST";
	private static String ANKARA_ESENBOGA = "ANKARA ESENBOGA";
	private static String TURKEY ="TURKEY";

	public static void main(String[] args) {
		Airport airport = new Airport();
		AirportSoap airportSoap = airport.getAirportSoap();
		//

		System.out.println("getAirportInformationByAirportCode : ");
		System.out.println("--------------------------------------");
		String airportInformationByAirportCode = airportSoap.getAirportInformationByAirportCode(ISTANBUL);
		System.out.println(airportInformationByAirportCode);
		System.out.println("--------------------------------------");
		
		System.out.println("getAirportInformationByCityOrAirportName : ");
		System.out.println("--------------------------------------");
		String airportInformationByCity=airportSoap.getAirportInformationByCityOrAirportName(ANKARA_ESENBOGA);
		System.out.println(airportInformationByCity);
		System.out.println("--------------------------------------");
		
		System.out.println("getAirportInformationByCountry : ");
		System.out.println("--------------------------------------");
		String airportInformationByCountry=airportSoap.getAirportInformationByCountry(TURKEY);
		System.out.println(airportInformationByCountry);
		System.out.println("--------------------------------------");

	}
}
