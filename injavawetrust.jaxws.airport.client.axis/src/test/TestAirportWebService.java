package test;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import NET.webserviceX.www.AirportLocator;
import NET.webserviceX.www.AirportSoap;

public class TestAirportWebService {

	private static String ISTANBUL = "IST";
	private static String ANKARA_ESENBOGA = "ANKARA ESENBOGA";
	private static String TURKEY = "TURKEY";

	public static void main(String[] args) throws RemoteException, ServiceException {

		AirportLocator locator = new AirportLocator();
		AirportSoap airportSoap = locator.getairportSoap();

		System.out.println("getAirportInformationByAirportCode : ");
		System.out.println("--------------------------------------");
		String airportInformationByAirportCode = airportSoap.getAirportInformationByAirportCode(ISTANBUL);
		System.out.println(airportInformationByAirportCode);
		System.out.println("--------------------------------------");

		System.out.println("getAirportInformationByCityOrAirportName : ");
		System.out.println("--------------------------------------");
		String airportInformationByCity = airportSoap.getAirportInformationByCityOrAirportName(ANKARA_ESENBOGA);
		System.out.println(airportInformationByCity);
		System.out.println("--------------------------------------");

		System.out.println("getAirportInformationByCountry : ");
		System.out.println("--------------------------------------");
		String airportInformationByCountry = airportSoap.getAirportInformationByCountry(TURKEY);
		System.out.println(airportInformationByCountry);
		System.out.println("--------------------------------------");

	}
}
