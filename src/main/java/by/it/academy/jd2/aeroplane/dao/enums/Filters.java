package by.it.academy.jd2.aeroplane.dao.enums;

public enum Filters {
    SORT_BY_DATE_DEPARTURE("scheduled_departure"),
    SORT_BY_DATE_ARRIVAL("scheduled_arrival"),
    SORT_BY_STATUS("status"),
    SORT_BY_ORIGIN("departure_airport"),
    SORT_BY_DESTINATION("arrival_airport");

    private final String filterValue;

    Filters(String filterValue) {
        this.filterValue = filterValue;
    }

    public String getFilterValue() {
        return filterValue;
    }
}
