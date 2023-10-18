package by.it.academy.jd2.aeroplane.dao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Timestamp;
import java.util.Objects;
@Entity
@Table(schema = "bookings", name = "flight")
public class FlightEntity {

    private int flightId;
    private String flightNo;
    private Timestamp scheduledDeparture;
    private Timestamp scheduledDepartureLocal;
    private Timestamp scheduledArrival;
    private Timestamp getScheduledArrivalLocal;
    private String interval;
    private String departureAirport;
    private String departureAirportName;
    private String departureCity;
    private String arrivalAirport;
    private String arrivalAirportName;
    private String arrivalCity;
    private String status;
    private String aircraftCode;

    public FlightEntity(int flightId, String flightNo, Timestamp scheduledDeparture, Timestamp scheduledDepartureLocal,
                        Timestamp scheduledArrival, Timestamp getScheduledArrivalLocal, String interval, String departureAirport,
                        String departureAirportName, String departureCity, String arrivalAirport, String arrivalAirportName,
                        String arrivalCity, String status, String aircraftCode) {
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

    public Timestamp getScheduledDeparture() {
        return scheduledDeparture;
    }

    public void setScheduledDeparture(Timestamp scheduledDeparture) {
        this.scheduledDeparture = scheduledDeparture;
    }

    public Timestamp getScheduledDepartureLocal() {
        return scheduledDepartureLocal;
    }

    public void setScheduledDepartureLocal(Timestamp scheduledDepartureLocal) {
        this.scheduledDepartureLocal = scheduledDepartureLocal;
    }

    public Timestamp getScheduledArrival() {
        return scheduledArrival;
    }

    public void setScheduledArrival(Timestamp scheduledArrival) {
        this.scheduledArrival = scheduledArrival;
    }

    public Timestamp getGetScheduledArrivalLocal() {
        return getScheduledArrivalLocal;
    }

    public void setGetScheduledArrivalLocal(Timestamp getScheduledArrivalLocal) {
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

        FlightEntity that = (FlightEntity) o;

        if (flightId != that.flightId) return false;
        if (!Objects.equals(flightNo, that.flightNo)) return false;
        if (!Objects.equals(scheduledDeparture, that.scheduledDeparture))
            return false;
        if (!Objects.equals(scheduledDepartureLocal, that.scheduledDepartureLocal))
            return false;
        if (!Objects.equals(scheduledArrival, that.scheduledArrival))
            return false;
        if (!Objects.equals(getScheduledArrivalLocal, that.getScheduledArrivalLocal))
            return false;
        if (!Objects.equals(interval, that.interval)) return false;
        if (!Objects.equals(departureAirport, that.departureAirport))
            return false;
        if (!Objects.equals(departureAirportName, that.departureAirportName))
            return false;
        if (!Objects.equals(departureCity, that.departureCity))
            return false;
        if (!Objects.equals(arrivalAirport, that.arrivalAirport))
            return false;
        if (!Objects.equals(arrivalAirportName, that.arrivalAirportName))
            return false;
        if (!Objects.equals(arrivalCity, that.arrivalCity)) return false;
        if (!Objects.equals(status, that.status)) return false;
        return Objects.equals(aircraftCode, that.aircraftCode);
    }

    @Override
    public int hashCode() {
        int result = flightId;
        result = 31 * result + (flightNo != null ? flightNo.hashCode() : 0);
        result = 31 * result + (scheduledDeparture != null ? scheduledDeparture.hashCode() : 0);
        result = 31 * result + (scheduledDepartureLocal != null ? scheduledDepartureLocal.hashCode() : 0);
        result = 31 * result + (scheduledArrival != null ? scheduledArrival.hashCode() : 0);
        result = 31 * result + (getScheduledArrivalLocal != null ? getScheduledArrivalLocal.hashCode() : 0);
        result = 31 * result + (interval != null ? interval.hashCode() : 0);
        result = 31 * result + (departureAirport != null ? departureAirport.hashCode() : 0);
        result = 31 * result + (departureAirportName != null ? departureAirportName.hashCode() : 0);
        result = 31 * result + (departureCity != null ? departureCity.hashCode() : 0);
        result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
        result = 31 * result + (arrivalAirportName != null ? arrivalAirportName.hashCode() : 0);
        result = 31 * result + (arrivalCity != null ? arrivalCity.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (aircraftCode != null ? aircraftCode.hashCode() : 0);
        return result;
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
