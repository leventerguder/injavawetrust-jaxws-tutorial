/**
 * AirportSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NET.webserviceX.www;

public interface AirportSoap extends java.rmi.Remote {

    /**
     * Get Airport Code, CityOrAirport Name, Country, Country Abbrv,
     * CountryCode,GMT Offset Runway Length in Feet, Runway Elevation in
     * Feet,Latitude in Degree,Latitude in Minute Latitude in Second,Latitude
     * in N/S, Longitude in Degree, Longitude in Minute, Longitude in Seconds
     * and longitude E/W by ISO country code
     */
    public java.lang.String getAirportInformationByISOCountryCode(java.lang.String countryAbbrviation) throws java.rmi.RemoteException;

    /**
     * Get Airport Code, CityOrAirport Name, Country, Country Abbrv,
     * CountryCode,GMT Offset Runway Length in Feet, Runway Elevation in
     * Feet,Latitude in Degree,Latitude in Minute Latitude in Second,Latitude
     * in N/S, Longitude in Degree, Longitude in Minute, Longitude in Seconds
     * and longitude E/W by city or airport name
     */
    public java.lang.String getAirportInformationByCityOrAirportName(java.lang.String cityOrAirportName) throws java.rmi.RemoteException;

    /**
     * Get Airport Code, CityOrAirport Name, Country, Country Abbrv,
     * CountryCode,GMT Offset Runway Length in Feet, Runway Elevation in
     * Feet,Latitude in Degree,Latitude in Minute Latitude in Second,Latitude
     * in N/S, Longitude in Degree, Longitude in Minute, Longitude in Seconds
     * and longitude E/W by country name
     */
    public java.lang.String getAirportInformationByCountry(java.lang.String country) throws java.rmi.RemoteException;

    /**
     * Get Airport Code, CityOrAirport Name, Country, Country Abbrv,
     * CountryCode,GMT Offset Runway Length in Feet, Runway Elevation in
     * Feet,Latitude in Degree,Latitude in Minute Latitude in Second,Latitude
     * in N/S, Longitude in Degree, Longitude in Minute, Longitude in Seconds
     * and longitude E/W by airport code
     */
    public java.lang.String getAirportInformationByAirportCode(java.lang.String airportCode) throws java.rmi.RemoteException;
}
