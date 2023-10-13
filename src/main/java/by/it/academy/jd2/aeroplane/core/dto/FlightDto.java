package by.it.academy.jd2.aeroplane.core.dto;


import java.util.Objects;
import java.util.TimeZone;

public class FlightDto {

    private int flightId;
    private String flightNo;
    private TimeZone scheduledDeparture;
    private TimeZone scheduledDepartureLocal;
    private TimeZone scheduledArrival;
    private TimeZone getScheduledArrivalLocal;
    private String interval;
    private String departureAirport;
    private String departureAirportName;
    private String departureCity;
    private String arrivalAirport;
    private String arrivalAirportName;
    private String arrivalCity;
    private String status;
    private String aircraftCode;


    public FlightDto() {
    }

    public FlightDto(int flightId, String flightNo, TimeZone scheduledDeparture, TimeZone scheduledDepartureLocal, TimeZone scheduledArrival, TimeZone getScheduledArrivalLocal, String interval, String departureAirport, String departureAirportName, String departureCity, String arrivalAirport, String arrivalAirportName, String arrivalCity, String status, String aircraftCode) {
        this.flightId = flightId;
        this.flightNo = flightNo;
        this.scheduledDeparture = scheduledDeparture;
        this.scheduledDepartureLocal = scheduledDepartureLocal;
        this.scheduledArrival = scheduledArrival;
        this.getScheduledArrivalLocal = getScheduledArrivalLocal;
        this.interval = interval;
        this.departureAirport = departureAirport;
        this.departureAirportName = departureAirportName;
        this.departureCity = departureCity;
        this.arrivalAirport = arrivalAirport;
        this.arrivalAirportName = arrivalAirportName;
        this.arrivalCity = arrivalCity;
        this.status = status;
        this.aircraftCode = aircraftCode;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public TimeZone getScheduledDeparture() {
        return scheduledDeparture;
    }

    public void setScheduledDeparture(TimeZone scheduledDeparture) {
        this.scheduledDeparture = scheduledDeparture;
    }

    public TimeZone getScheduledDepartureLocal() {
        return scheduledDepartureLocal;
    }

    public void setScheduledDepartureLocal(TimeZone scheduledDepartureLocal) {
        this.scheduledDepartureLocal = scheduledDepartureLocal;
    }

    public TimeZone getScheduledArrival() {
        return scheduledArrival;
    }

    public void setScheduledArrival(TimeZone scheduledArrival) {
        this.scheduledArrival = scheduledArrival;
    }

    public TimeZone getGetScheduledArrivalLocal() {
        return getScheduledArrivalLocal;
    }

    public void setGetScheduledArrivalLocal(TimeZone getScheduledArrivalLocal) {
        this.getScheduledArrivalLocal = getScheduledArrivalLocal;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureAirportName() {
        return departureAirportName;
    }

    public void setDepartureAirportName(String departureAirportName) {
        this.departureAirportName = departureAirportName;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getArrivalAirportName() {
        return arrivalAirportName;
    }

    public void setArrivalAirportName(String arrivalAirportName) {
        this.arrivalAirportName = arrivalAirportName;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAircraftCode() {
        return aircraftCode;
    }

    public void setAircraftCode(String aircraftCode) {
        this.aircraftCode = aircraftCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightDto flight = (FlightDto) o;
        return flightId == flight.flightId && Objects.equals(flightNo, flight.flightNo) && Objects.equals(scheduledDeparture, flight.scheduledDeparture) && Objects.equals(scheduledDepartureLocal, flight.scheduledDepartureLocal) && Objects.equals(scheduledArrival, flight.scheduledArrival) && Objects.equals(getScheduledArrivalLocal, flight.getScheduledArrivalLocal) && Objects.equals(interval, flight.interval) && Objects.equals(departureAirport, flight.departureAirport) && Objects.equals(departureAirportName, flight.departureAirportName) && Objects.equals(departureCity, flight.departureCity) && Objects.equals(arrivalAirport, flight.arrivalAirport) && Objects.equals(arrivalAirportName, flight.arrivalAirportName) && Objects.equals(arrivalCity, flight.arrivalCity) && Objects.equals(status, flight.status) && Objects.equals(aircraftCode, flight.aircraftCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightId, flightNo, scheduledDeparture, scheduledDepartureLocal, scheduledArrival, getScheduledArrivalLocal, interval, departureAirport, departureAirportName, departureCity, arrivalAirport, arrivalAirportName, arrivalCity, status, aircraftCode);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId=" + flightId +
                ", flightNo='" + flightNo + '\'' +
                ", scheduledDeparture=" + scheduledDeparture +
                ", scheduledDepartureLocal=" + scheduledDepartureLocal +
                ", scheduledArrival=" + scheduledArrival +
                ", getScheduledArrivalLocal=" + getScheduledArrivalLocal +
                ", interval='" + interval + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", departureAirportName='" + departureAirportName + '\'' +
                ", departureCity='" + departureCity + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", arrivalAirportName='" + arrivalAirportName + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                ", status='" + status + '\'' +
                ", aircraftCode='" + aircraftCode + '\'' +
                '}';
    }
}
