package by.it.academy.jd2.aeroplane.core.dto;

import java.util.Objects;

public class AirportDto {
    private String Id;
    private String airportName;
    private String city;
    private String coordinates;
    private String timeZone;


    public AirportDto() {
    }

    public AirportDto(String airportCode, String airportName, String city, String coordinates, String timezone) {
        this.Id = airportCode;
        this.airportName = airportName;
        this.city = city;
        this.coordinates = coordinates;
        this.timeZone = timezone;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getTimezone() {
        return timeZone;
    }

    public void setTimezone(String timezone) {
        this.timeZone = timezone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AirportDto airport = (AirportDto) o;

        if (!Objects.equals(Id, airport.Id)) return false;
        if (!Objects.equals(airportName, airport.airportName)) return false;
        if (!Objects.equals(city, airport.city)) return false;
        if (!Objects.equals(coordinates, airport.coordinates)) return false;
        return Objects.equals(timeZone, airport.timeZone);
    }

    @Override
    public int hashCode() {
        int result = Id != null ? Id.hashCode() : 0;
        result = 31 * result + (airportName != null ? airportName.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (coordinates != null ? coordinates.hashCode() : 0);
        result = 31 * result + (timeZone != null ? timeZone.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "airportCode='" + Id + '\'' +
                ", airportName='" + airportName + '\'' +
                ", city='" + city + '\'' +
                ", coordinates='" + coordinates + '\'' +
                ", timezone='" + timeZone + '\'' +
                '}';
    }
}
