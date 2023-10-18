package by.it.academy.jd2.aeroplane.dao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;
@Entity
@Table(schema = "bookings", name = "aircrafts_data")
public class AirCraftEntity {


    private String aircraft_code;
    private String model;
    private int range;

    public AirCraftEntity(String aircraft_code, String model, int range) {
        this.aircraft_code = aircraft_code;
        this.model = model;
        this.range = range;
    }


    public String getAircraft_code() {
        return aircraft_code;
    }

    public void setAircraft_code(String aircraft_code) {
        this.aircraft_code = aircraft_code;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AirCraftEntity that = (AirCraftEntity) o;

        if (range != that.range) return false;
        if (!Objects.equals(aircraft_code, that.aircraft_code))
            return false;
        return Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        int result = aircraft_code != null ? aircraft_code.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + range;
        return result;
    }

    @Override
    public String toString() {
        return "AirCraftEntity{" +
                "aircraft_code='" + aircraft_code + '\'' +
                ", model='" + model + '\'' +
                ", range=" + range +
                '}';
    }
}
