package by.it.academy.jd2.aeroplane.controller_servlets;

import by.it.academy.jd2.aeroplane.core.dto.Flight;
import by.it.academy.jd2.aeroplane.core.dto.FlightFilter;
import by.it.academy.jd2.aeroplane.core.dto.PageSize;
import by.it.academy.jd2.aeroplane.dao.enums.Filters;
import by.it.academy.jd2.aeroplane.services.api.IFlightServices;
import by.it.academy.jd2.aeroplane.dao.entity.FlightEntity;
import by.it.academy.jd2.aeroplane.services.factory.FlightServicesFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
@WebServlet(urlPatterns = "/flight")
public class FlightServlet extends HttpServlet {

    private static final String PAGE_PARAM = "page";
    private static final String SIZE_PARAM = "size";

    private static final String SCHEDULED_DEPARTURE_PARAM = "scheduled_departure";
    private static final String SCHEDULED_ARRIVAL_PARAM = "scheduled_arrival";
    private static final String DEPARTURE_AIRPORT_PARAM = "departure_airport";
    private static final String ARRIVAL_AIRPORT_PARAM = "arrival_airport";
    private static final String STATUS_PARAM = "status";

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");


    private IFlightServices flightService = FlightServicesFactory.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String scheduledDepartureRaw = req.getParameter(SCHEDULED_DEPARTURE_PARAM);
        LocalDate scheduledDeparture = null;
        if(scheduledDepartureRaw != null){
            scheduledDeparture = LocalDate.parse(scheduledDepartureRaw, formatter);
        }

        String scheduledArrivalRaw = req.getParameter(SCHEDULED_ARRIVAL_PARAM);
        LocalDate scheduledArrival = null;
        if(scheduledArrivalRaw != null){
            scheduledArrival = LocalDate.parse(scheduledArrivalRaw, formatter);
        }

        String departureAirport = req.getParameter(DEPARTURE_AIRPORT_PARAM);
        String arrivalAirport = req.getParameter(ARRIVAL_AIRPORT_PARAM);
        String status = req.getParameter(STATUS_PARAM);


        String pageRaw = req.getParameter(PAGE_PARAM);
        int page;
        if(pageRaw == null){
            page = 1;
        } else {
            page = Integer.parseInt(pageRaw);
        }
        String sizeRaw = req.getParameter(SIZE_PARAM);
        int size;
        if(sizeRaw == null){
            size = 25;
        } else {
            size = Integer.parseInt(sizeRaw);
        }

        FlightFilter filter = new FlightFilter(scheduledDeparture, scheduledArrival, departureAirport, arrivalAirport, status);
        PageSize pageSize = new PageSize(page, size);

        List<Flight> data = this.flightService.getFlights(filter, pageSize);
        req.setAttribute("flights", data);
        req.getRequestDispatcher("/ui/flight.jsp").forward(req, resp);


    }
}
