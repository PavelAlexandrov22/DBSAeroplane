package by.it.academy.jd2.aeroplane.dao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Timestamp;
import java.util.Objects;
@Entity
@Table(schema = "bookings", name = "flight")
public class FlightEntity {

    private String flightId;
    private String flightNo;
    private String scheduledDeparture;
    private String scheduledDepartureLocal;
    private String scheduledArrival;
    private String scheduledArrivalLocal;
    private String scheduledDuration;
    private String departureAirport;
    private String departureAirportName;
    private String departureCity;
    private String arrivalAirport;
    private String arrivalAirportName;
    private String arrivalCity;
    private String status;
    private String aircraftCode;
    private String actualDeparture;
    private String actualDepartureLocal;
    private String actualArrival;
    private String actualArrivalLocal;
    private String actualDuration;

    public FlightEntity() {
    }

    public FlightEntity(String flightId, String flightNo, String scheduledDeparture,
                        String scheduledDepartureLocal, String scheduledArrival, String scheduledArrivalLocal,
                        String scheduledDuration, String departureAirport, String departureAirportName,
                        String departureCity, String arrivalAirport, String arrivalAirportName,
                        String arrivalCity, String status, String aircraftCode,
                        String actualDeparture, String actualDepartureLocal, String actualArrival,
                        String actualArrivalLocal, String actualDuration) {
        this.flightId = flightId;
        this.flightNo = flightNo;
        this.scheduledDeparture = scheduledDeparture;
        this.scheduledDepartureLocal = scheduledDepartureLocal;
        this.scheduledArrival = scheduledArrival;
        this.scheduledArrivalLocal = scheduledArrivalLocal;
        this.scheduledDuration = scheduledDuration;
        this.departureAirport = departureAirport;
        this.departureAirportName = departureAirportName;
        this.departureCity = departureCity;
        this.arrivalAirport = arrivalAirport;
        this.arrivalAirportName = arrivalAirportName;
        this.arrivalCity = arrivalCity;
        this.status = status;
        this.aircraftCode = aircraftCode;
        this.actualDeparture = actualDeparture;
        this.actualDepartureLocal = actualDepartureLocal;
        this.actualArrival = actualArrival;
        this.actualArrivalLocal = actualArrivalLocal;
        this.actualDuration = actualDuration;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getScheduledDeparture() {
        return scheduledDeparture;
    }

    public void setScheduledDeparture(String scheduledDeparture) {
        this.scheduledDeparture = scheduledDeparture;
    }

    public String getScheduledDepartureLocal() {
        return scheduledDepartureLocal;
    }

    public void setScheduledDepartureLocal(String scheduledDepartureLocal) {
        this.scheduledDepartureLocal = scheduledDepartureLocal;
    }

    public String getScheduledArrival() {
        return scheduledArrival;
    }

    public void setScheduledArrival(String scheduledArrival) {
        this.scheduledArrival = scheduledArrival;
    }

    public String getScheduledArrivalLocal() {
        return scheduledArrivalLocal;
    }

    public void setScheduledArrivalLocal(String scheduledArrivalLocal) {
        this.scheduledArrivalLocal = scheduledArrivalLocal;
    }

    public String getScheduledDuration() {
        return scheduledDuration;
    }

    public void setScheduledDuration(String scheduledDuration) {
        this.scheduledDuration = scheduledDuration;
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

    public String getActualDeparture() {
        return actualDeparture;
    }

    public void setActualDeparture(String actualDeparture) {
        this.actualDeparture = actualDeparture;
    }

    public String getActualDepartureLocal() {
        return actualDepartureLocal;
    }

    public void setActualDepartureLocal(String actualDepartureLocal) {
        this.actualDepartureLocal = actualDepartureLocal;
    }

    public String getActualArrival() {
        return actualArrival;
    }

    public void setActualArrival(String actualArrival) {
        this.actualArrival = actualArrival;
    }

    public String getActualArrivalLocal() {
        return actualArrivalLocal;
    }

    public void setActualArrivalLocal(String actualArrivalLocal) {
        this.actualArrivalLocal = actualArrivalLocal;
    }

    public String getActualDuration() {
        return actualDuration;
    }

    public void setActualDuration(String actualDuration) {
        this.actualDuration = actualDuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightEntity that = (FlightEntity) o;

        if (!Objects.equals(flightId, that.flightId)) return false;
        if (!Objects.equals(flightNo, that.flightNo)) return false;
        if (!Objects.equals(scheduledDeparture, that.scheduledDeparture))
            return false;
        if (!Objects.equals(scheduledDepartureLocal, that.scheduledDepartureLocal))
            return false;
        if (!Objects.equals(scheduledArrival, that.scheduledArrival))
            return false;
        if (!Objects.equals(scheduledArrivalLocal, that.scheduledArrivalLocal))
            return false;
        if (!Objects.equals(scheduledDuration, that.scheduledDuration))
            return false;
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
        if (!Objects.equals(aircraftCode, that.aircraftCode)) return false;
        if (!Objects.equals(actualDeparture, that.actualDeparture))
            return false;
        if (!Objects.equals(actualDepartureLocal, that.actualDepartureLocal))
            return false;
        if (!Objects.equals(actualArrival, that.actualArrival))
            return false;
        if (!Objects.equals(actualArrivalLocal, that.actualArrivalLocal))
            return false;
        return Objects.equals(actualDuration, that.actualDuration);
    }

    @Override
    public int hashCode() {
        int result = flightId != null ? flightId.hashCode() : 0;
        result = 31 * result + (flightNo != null ? flightNo.hashCode() : 0);
        result = 31 * result + (scheduledDeparture != null ? scheduledDeparture.hashCode() : 0);
        result = 31 * result + (scheduledDepartureLocal != null ? scheduledDepartureLocal.hashCode() : 0);
        result = 31 * result + (scheduledArrival != null ? scheduledArrival.hashCode() : 0);
        result = 31 * result + (scheduledArrivalLocal != null ? scheduledArrivalLocal.hashCode() : 0);
        result = 31 * result + (scheduledDuration != null ? scheduledDuration.hashCode() : 0);
        result = 31 * result + (departureAirport != null ? departureAirport.hashCode() : 0);
        result = 31 * result + (departureAirportName != null ? departureAirportName.hashCode() : 0);
        result = 31 * result + (departureCity != null ? departureCity.hashCode() : 0);
        result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
        result = 31 * result + (arrivalAirportName != null ? arrivalAirportName.hashCode() : 0);
        result = 31 * result + (arrivalCity != null ? arrivalCity.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (aircraftCode != null ? aircraftCode.hashCode() : 0);
        result = 31 * result + (actualDeparture != null ? actualDeparture.hashCode() : 0);
        result = 31 * result + (actualDepartureLocal != null ? actualDepartureLocal.hashCode() : 0);
        result = 31 * result + (actualArrival != null ? actualArrival.hashCode() : 0);
        result = 31 * result + (actualArrivalLocal != null ? actualArrivalLocal.hashCode() : 0);
        result = 31 * result + (actualDuration != null ? actualDuration.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FlightEntity{" +
                "flightId='" + flightId + '\'' +
                ", flightNo='" + flightNo + '\'' +
                ", scheduledDeparture='" + scheduledDeparture + '\'' +
                ", scheduledDepartureLocal='" + scheduledDepartureLocal + '\'' +
                ", scheduledArrival='" + scheduledArrival + '\'' +
                ", scheduledArrivalLocal='" + scheduledArrivalLocal + '\'' +
                ", scheduledDuration='" + scheduledDuration + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", departureAirportName='" + departureAirportName + '\'' +
                ", departureCity='" + departureCity + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", arrivalAirportName='" + arrivalAirportName + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                ", status='" + status + '\'' +
                ", aircraftCode='" + aircraftCode + '\'' +
                ", actualDeparture='" + actualDeparture + '\'' +
                ", actualDepartureLocal='" + actualDepartureLocal + '\'' +
                ", actualArrival='" + actualArrival + '\'' +
                ", actualArrivalLocal='" + actualArrivalLocal + '\'' +
                ", actualDuration='" + actualDuration + '\'' +
                '}';
    }
}
